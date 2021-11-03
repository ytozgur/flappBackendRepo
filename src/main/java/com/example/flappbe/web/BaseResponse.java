package com.example.flappbe.web;

public class BaseResponse {
    private boolean success;

    private String message;

    private Object data;

    public BaseResponse() {
    }

    public BaseResponse(boolean success) { this(success, null); }

    public BaseResponse(boolean success, Object data) {this(success,data, "");}

    public BaseResponse(boolean success, Object data, String message) {
        super();
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}
