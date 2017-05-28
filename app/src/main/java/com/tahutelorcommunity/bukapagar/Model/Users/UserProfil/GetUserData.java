
package com.tahutelorcommunity.bukapagar.Model.Users.UserProfil;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetUserData {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("userProfil")
    @Expose
    private UserProfil userProfil;
    @SerializedName("message")
    @Expose
    private Object message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public GetUserData() {
    }

    /**
     * 
     * @param message
     * @param status
     * @param userProfil
     */
    public GetUserData(String status, UserProfil userProfil, Object message) {
        super();
        this.status = status;
        this.userProfil = userProfil;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserProfil getUserProfil() {
        return userProfil;
    }

    public void setUserProfil(UserProfil userProfil) {
        this.userProfil = userProfil;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

}
