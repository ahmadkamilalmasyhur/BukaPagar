package com.tahutelorcommunity.bukapagar.Model;

/**
 * Created by Farizko on 06-May-17.
 */

public class Response {
    String status;
    String message;

    public Response() {
    }

    public Response(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
