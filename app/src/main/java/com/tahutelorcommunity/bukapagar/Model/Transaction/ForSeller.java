
package com.tahutelorcommunity.bukapagar.Model.Transaction;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ForSeller {

    @SerializedName("positive")
    @Expose
    private Boolean positive;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("is_editable")
    @Expose
    private Boolean isEditable;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ForSeller() {
    }

    /**
     * 
     * @param body
     * @param positive
     * @param isEditable
     */
    public ForSeller(Boolean positive, String body, Boolean isEditable) {
        super();
        this.positive = positive;
        this.body = body;
        this.isEditable = isEditable;
    }

    public Boolean getPositive() {
        return positive;
    }

    public void setPositive(Boolean positive) {
        this.positive = positive;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Boolean getIsEditable() {
        return isEditable;
    }

    public void setIsEditable(Boolean isEditable) {
        this.isEditable = isEditable;
    }

}
