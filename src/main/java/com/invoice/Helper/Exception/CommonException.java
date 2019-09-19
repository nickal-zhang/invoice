package com.invoice.Helper.Exception;

public class CommonException extends Exception {
    private String message;

    public CommonException(String message) {
        super(message);
    }

}
