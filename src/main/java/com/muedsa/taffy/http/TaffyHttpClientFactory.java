package com.muedsa.taffy.http;

import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManagerBuilder;
import org.apache.hc.client5.http.io.HttpClientConnectionManager;
import org.apache.hc.client5.http.ssl.SSLConnectionSocketFactory;
import org.apache.hc.client5.http.ssl.SSLConnectionSocketFactoryBuilder;
import org.apache.hc.client5.http.ssl.TrustAllStrategy;
import org.apache.hc.core5.ssl.SSLContexts;

import javax.net.ssl.SSLContext;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;

public class TaffyHttpClientFactory {

    public static CloseableHttpClient create(String userAgent, boolean disableSSLVerify){
        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create()
                .setUserAgent(userAgent);
        if(disableSSLVerify){
            try {
                SSLContext sslcontext = SSLContexts.custom()
                       .loadTrustMaterial(null, new TrustAllStrategy())
                       .build();
                SSLConnectionSocketFactory sslSocketFactory = SSLConnectionSocketFactoryBuilder.create()
                        .setSslContext(sslcontext)
                        .build();
                HttpClientConnectionManager cm = PoolingHttpClientConnectionManagerBuilder.create()
                        .setSSLSocketFactory(sslSocketFactory)
                        .build();
                httpClientBuilder.setConnectionManager(cm);
            } catch (NoSuchAlgorithmException | KeyManagementException | KeyStoreException e) {
                throw new RuntimeException(e);
            }
        }
        return httpClientBuilder.build();
    }
}
