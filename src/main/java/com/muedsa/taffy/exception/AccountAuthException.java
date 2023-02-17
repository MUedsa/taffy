package com.muedsa.taffy.exception;

public class AccountAuthException extends TaffyException {

    public AccountAuthException() {
    }

    public AccountAuthException(String message) {
        super(message);
    }

    public AccountAuthException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountAuthException(Throwable cause) {
        super(cause);
    }
}
