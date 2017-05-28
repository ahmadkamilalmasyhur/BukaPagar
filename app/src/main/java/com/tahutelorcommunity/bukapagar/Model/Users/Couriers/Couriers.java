
package com.tahutelorcommunity.bukapagar.Model.Users.Couriers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Couriers {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private Object message;
    @SerializedName("couriers")
    @Expose
    private List<String> couriers = null;

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
     * @param couriers
     */
    public Couriers(String status, Object message, List<String> couriers) {
        super();
        this.status = status;
        this.message = message;
        this.couriers = couriers;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public List<String> getCouriers() {
        return couriers;
    }

    public void setCouriers(List<String> couriers) {
        this.couriers = couriers;
    }

}
