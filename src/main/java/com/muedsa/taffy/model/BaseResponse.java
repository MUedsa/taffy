package com.muedsa.taffy.model;

import lombok.Data;

@Data
public class BaseResponse<T> {
    private int retCode;

    private String message;

    private T data;
}
