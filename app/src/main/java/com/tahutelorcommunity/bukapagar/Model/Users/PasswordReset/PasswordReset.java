package com.tahutelorcommunity.bukapagar.Model.Users.PasswordReset;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PasswordReset {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PasswordReset() {
    }

    /**
     * 
     * @param message
     * @param status
     */
    public PasswordReset(String status, String message) {
        super();
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
