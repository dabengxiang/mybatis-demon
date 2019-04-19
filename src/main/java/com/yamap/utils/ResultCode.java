package com.yamap.utils;


public enum  ResultCode {
    SUCCESS(200),
    FAIL(500),
    SYSTEM_ERROR(999);

    private int code ;

    ResultCode(int code) {
        this.code = code;
    }

    public int getCode(){
        return code;
    }







}
