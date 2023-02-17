package com.muedsa.taffy.exception;

public class TaffyException extends RuntimeException {
    public TaffyException() {
    }

    public TaffyException(String message) {
        super(message);
    }

    public TaffyException(String message, Throwable cause) {
        super(message, cause);
    }

    public TaffyException(Throwable cause) {
        super(cause);
    }

    public TaffyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
