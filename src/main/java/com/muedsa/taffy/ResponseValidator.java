package com.muedsa.taffy;

import com.muedsa.taffy.exception.RequestFailedException;
import com.muedsa.taffy.model.BaseResponse;

public class ResponseValidator {

    public static void valid(int retCode) {
        if(retCode != 0){
            throw new RequestFailedException();
        }
    }

    public static void valid(BaseResponse<?> baseResponse) {
        if(baseResponse == null){
            throw new RequestFailedException("response body is empty");
        }
        if(baseResponse.getRetCode() != 0){
            throw new RequestFailedException("retCode: " + baseResponse.getRetCode() + ", message: " + baseResponse.getMessage());
        }
    }

    public static void validNonNull(BaseResponse<?> baseResponse) {
        valid(baseResponse);
        if(baseResponse.getData() == null){
            throw new RequestFailedException("response data is null");
        }
    }
}
