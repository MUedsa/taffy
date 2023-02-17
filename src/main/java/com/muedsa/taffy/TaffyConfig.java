package com.muedsa.taffy;

import lombok.Data;

@Data
public class TaffyConfig {

    private String httpUserAgent;

    private String dispatchServerUrl;

    private String clientVersion;

    private Integer clientPlatform;

    private Integer clientChannelId;

    private Integer clientSubChannelId;

    private String region;

    private String authServerUrl;

    private String authToken;

    private String authUid; // not uid in game
}
