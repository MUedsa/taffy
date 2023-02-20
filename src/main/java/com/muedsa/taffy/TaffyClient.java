package com.muedsa.taffy;

import com.muedsa.taffy.exception.*;
import com.muedsa.taffy.http.JsonResponseHandler;
import com.muedsa.taffy.model.*;
import com.muedsa.taffy.utils.*;
import emu.grasscutter.net.proto.QueryRegionListHttpRspOuterClass;
import emu.grasscutter.net.proto.RegionSimpleInfoOuterClass;
import kcp.highway.KcpClient;
import kcp.highway.KcpListener;
import kcp.highway.Ukcp;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class TaffyClient {

    private TaffyConfig config;

    private TaffyState state;

    private CloseableHttpClient httpClient;

    private InetSocketAddress regionServerAddress;

    private Ukcp ukcp;

    public TaffyClient(TaffyConfig config){
        this.config = config;
        httpClient = HttpClientUtils.create(config.getHttpUserAgent());
        state = TaffyState.NOT_AUTH;
    }

    private String getDispatchUrl()
            throws IOException {
        String base64RegionListResponse = TaffyAuthRequestFactory.queryRegionList(config.getDispatchServerUrl(),
                        config.getClientVersion(), config.getClientPlatform(), config.getClientChannelId(),
                        config.getClientSubChannelId())
                .execute(httpClient)
                .returnContent().asString(StandardCharsets.UTF_8);
        QueryRegionListHttpRspOuterClass.QueryRegionListHttpRsp queryRegionListHttpRsp = QueryRegionListHttpRspOuterClass
                .QueryRegionListHttpRsp
                .parseFrom(Base64.getDecoder().decode(base64RegionListResponse.getBytes(StandardCharsets.UTF_8)));
        byte[] seedSecretKeyBytes = queryRegionListHttpRsp.getClientSecretKey().toByteArray();
        System.out.println(HexFormatUtils.beautify(seedSecretKeyBytes));
        byte[] key = MhyCrypto.generateKey(HexFormat.fromHexDigitsToLong("c36eb21c18558efa")); //todo how to get long seed from clientSecretKey
        byte[] clientCustomConfigBytes = queryRegionListHttpRsp.getClientCustomConfigEncrypted().toByteArray();
        MhyCrypto.xor(clientCustomConfigBytes, key);
        System.out.println(new String(clientCustomConfigBytes, StandardCharsets.UTF_8));
        ResponseValidator.valid(queryRegionListHttpRsp.getRetcode());
        Optional<RegionSimpleInfoOuterClass.RegionSimpleInfo> first = queryRegionListHttpRsp.getRegionListList().stream()
                .filter(i -> i.getName().equals(config.getRegion()))
                .findFirst();
        if(first.isEmpty()){
            throw new ReginNotFoundException();
        }
        return first.get().getDispatchUrl();
    }

    private void tokenVerify()
            throws IOException{
        AuthToken request = new AuthToken(config.getAuthUid(), config.getAuthToken(), null);
        BaseResponse<TokenVerifyResponse> response = TaffyAuthRequestFactory
                .tokenVerify(config.getAuthServerUrl(), request)
                .execute(httpClient)
                .handleResponse(JsonResponseHandler.cache());
        ResponseValidator.validNonNull(response);
        config.setAuthToken(response.getData().getAccount().getToken());
    }

    private void tokenLogin()
            throws IOException{
        AuthToken authToken = new AuthToken(config.getAuthUid(), config.getAuthToken(), Boolean.FALSE);
        TokenLoginRequest request = new TokenLoginRequest();
        request.setChannelId(config.getClientChannelId());
        String data = JsonUtils.toJsonString(authToken);
        request.setData(data);
        request.setDevice("");
        request.setAppId(4);
        request.setSign(SignUtils.sign(request, new byte[]{})); // todo need key for hmac sha256
        BaseResponse<TokenLoginResponse> response = TaffyAuthRequestFactory
                .tokenLogin(config.getAuthServerUrl(), request)
                .execute(httpClient)
                .handleResponse(JsonResponseHandler.cache());
        ResponseValidator.validNonNull(response);
    }

    private InetSocketAddress queryRegionServerAddress(){

        return new InetSocketAddress("", 0);
    }

    private void auth() {
        try{
            // query region server list and get dispatch server url
            String dispatchUrl = getDispatchUrl();

            // token verify
            //tokenVerify();

            // token login
            //tokenLogin();

            // query region server info and get address
            //regionServerAddress = queryRegionServerAddress();

            // go kcp start
            //kcpInit();
        }catch (URISyntaxException | RequestFailedException | IOException e) {
            throw new AccountAuthException(e);
        }
    }

    private void kcpInit() {
        if(ukcp != null){
            ukcp.close();
        }
        KcpClient kcpClient = new KcpClient();
        kcpClient.init(KcpChannelConfig.newConfig(0), new KcpListener() {
            @Override
            public void onConnected(Ukcp ukcp) {

            }

            @Override
            public void handleReceive(io.netty.buffer.ByteBuf byteBuf, Ukcp ukcp) {

            }

            @Override
            public void handleException(Throwable ex, Ukcp ukcp) {

            }

            @Override
            public void handleClose(Ukcp ukcp) {

            }
        });
        ukcp = kcpClient.connect(regionServerAddress, KcpChannelConfig.newConfig(0));
    }

    public void close(){

    }

    public void loop() {
        switch (state) {
            case NOT_AUTH -> {
                auth();
            }
            case NOT_GAME_LOGIN -> {
                kcpInit();
            }
            case PREPARED -> {

            }
            default -> {

            }
        }
    }
}
