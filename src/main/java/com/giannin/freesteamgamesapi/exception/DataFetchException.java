package com.giannin.freesteamgamesapi.exception;

public class DataFetchException extends RuntimeException {
    private String message;

    public DataFetchException(String message){
        super(message);
        this.message = message;
    }

    public DataFetchException(String message, Exception e){
        super(message, e);
        this.message = message;
    }
}
