package com.muedsa.taffy.utils;

import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;

public class HttpClientUtils {

    public static CloseableHttpClient create(String userAgent){
        return HttpClientBuilder.create()
                .setUserAgent(userAgent)
                .build();
    }
}
