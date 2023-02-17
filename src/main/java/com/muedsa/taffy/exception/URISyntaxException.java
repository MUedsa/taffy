package com.muedsa.taffy.exception;

public class URISyntaxException extends TaffyException{
    public URISyntaxException() {
    }

    public URISyntaxException(String message) {
        super(message);
    }

    public URISyntaxException(String message, Throwable cause) {
        super(message, cause);
    }

    public URISyntaxException(Throwable cause) {
        super(cause);
    }

    public URISyntaxException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
