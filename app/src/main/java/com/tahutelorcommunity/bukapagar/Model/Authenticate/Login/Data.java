
package com.tahutelorcommunity.bukapagar.Model.Authenticate.Login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("tfa_status")
    @Expose
    private Boolean tfaStatus;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Data() {
    }

    /**
     * 
     * @param tfaStatus
     */
    public Data(Boolean tfaStatus) {
        super();
        this.tfaStatus = tfaStatus;
    }

    public Boolean getTfaStatus() {
        return tfaStatus;
    }

    public void setTfaStatus(Boolean tfaStatus) {
        this.tfaStatus = tfaStatus;
    }

}
