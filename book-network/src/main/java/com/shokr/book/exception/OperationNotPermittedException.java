package com.shokr.book.exception;



public class OperationNotPermittedException extends RuntimeException {

    public OperationNotPermittedException(String msg){
        super(msg);
    }

}
