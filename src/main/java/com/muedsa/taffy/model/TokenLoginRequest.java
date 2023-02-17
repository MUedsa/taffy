package com.muedsa.taffy.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TokenLoginRequest {

    @JsonProperty(value = "channel_id")
    private int channelId;

    private String data;

    private String device;

    @JsonProperty(value = "app_id")
    private int appId;

    private String sign;
}
