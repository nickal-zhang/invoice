package com.invoice.Helper.ExceptionType;

public class UserException extends Exception {
    private  String  exceptionCode;

    public UserException(String exceptionCode) {
        this.exceptionCode =exceptionCode;
    }

}
