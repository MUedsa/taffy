package com.muedsa.taffy.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TokenLoginResponse {

    @JsonProperty(value = "account_type")
    private int accountType;

    @JsonProperty(value = "combo_id")
    private String comboId;

    @JsonProperty(value = "combo_token")
    private String comboToken;

    @JsonProperty(value = "open_id")
    private String openId;
}
