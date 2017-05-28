package com.tahutelorcommunity.bukapagar.Model.ImageRequest;

/**
 * Created by Fikry-PC on 5/26/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreateImage {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("message")
    @Expose
    private Object message;

    /**
     * No args constructor for use in serialization
     *
     */
    public CreateImage() {
    }

    /**
     *
     * @param message
     * @param id
     * @param status
     */
    public CreateImage(String status, String id, Object message) {
        super();
        this.status = status;
        this.id = id;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

}