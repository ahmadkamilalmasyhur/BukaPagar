
package com.tahutelorcommunity.bukapagar.Model.Users.AccountSummary;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountSummary {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private Object message;
    @SerializedName("summary")
    @Expose
    private Summary summary;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AccountSummary() {
    }

    /**
     * 
     * @param summary
     * @param message
     * @param status
     */
    public AccountSummary(String status, Object message, Summary summary) {
        super();
        this.status = status;
        this.message = message;
        this.summary = summary;
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

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

}
