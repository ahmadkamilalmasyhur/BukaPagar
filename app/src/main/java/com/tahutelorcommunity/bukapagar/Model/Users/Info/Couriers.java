
package com.tahutelorcommunity.bukapagar.Model.Users.Info;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Couriers {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("message")
    @Expose
    private Object message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Couriers() {
    }

    /**
     * 
     * @param message
     * @param status
     * @param user
     */
    public Couriers(String status, User user, Object message) {
        super();
        this.status = status;
        this.user = user;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

}
