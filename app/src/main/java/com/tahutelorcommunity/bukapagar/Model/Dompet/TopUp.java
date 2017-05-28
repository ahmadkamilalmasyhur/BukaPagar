package com.tahutelorcommunity.bukapagar.Model.Dompet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TopUp {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("unique_code")
    @Expose
    private Integer uniqueCode;
    @SerializedName("message")
    @Expose
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(Integer uniqueCode) {
        this.uniqueCode = uniqueCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}