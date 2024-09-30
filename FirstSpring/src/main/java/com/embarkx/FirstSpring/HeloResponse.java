package com.embarkx.FirstSpring;

public class HeloResponse {
    private String message;


    public HeloResponse(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
