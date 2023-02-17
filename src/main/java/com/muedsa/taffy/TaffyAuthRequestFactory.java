package com.muedsa.taffy;


import com.muedsa.taffy.exception.URISyntaxException;
import com.muedsa.taffy.model.AuthToken;
import com.muedsa.taffy.model.TokenLoginRequest;
import com.muedsa.taffy.utils.JsonUtils;
import org.apache.hc.client5.http.fluent.Request;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.NameValuePair;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.apache.hc.core5.net.URIBuilder;

import java.net.URI;
import java.nio.charset.StandardCharsets;

public class TaffyAuthRequestFactory {

    public static Request queryRegionList(String baseUrl,
                                          String version,
                                          Integer platform,
                                          Integer channelId,
                                          Integer subChannelId){
        URI uri = buildURI(baseUrl + "/query_region_list",
                new BasicNameValuePair("version", version),
                new BasicNameValuePair("lang", "2"),
                new BasicNameValuePair("platform", platform.toString()),
                new BasicNameValuePair("binary", "1"),
                new BasicNameValuePair("time", "233"),
                new BasicNameValuePair("channel_id", channelId.toString()),
                new BasicNameValuePair("sub_channel_id", subChannelId.toString()));
        return Request.get(uri);
    }

    public static Request tokenVerify(String baseUrl, AuthToken requestBody){
        URI uri = buildURI(baseUrl + "/mdk/shield/api/verify");
        return Request.post(uri)
                .bodyByteArray(JsonUtils.toJsonString(requestBody)
                        .getBytes(StandardCharsets.UTF_8), ContentType.APPLICATION_JSON);
    }

    public static Request tokenLogin(String baseUrl, TokenLoginRequest requestBody){
        URI uri = buildURI(baseUrl + "/combo/granter/login/v2/login");
        return Request.post(uri)
                .bodyByteArray(JsonUtils.toJsonString(requestBody)
                        .getBytes(StandardCharsets.UTF_8), ContentType.APPLICATION_JSON);
    }

    private static URI buildURI(String url, NameValuePair... nameValuePairs) {
        try {
            return new URIBuilder(url)
                    .setParameters(nameValuePairs)
                    .build();
        } catch (java.net.URISyntaxException e) {
            throw new URISyntaxException(e);
        }
    }
}
