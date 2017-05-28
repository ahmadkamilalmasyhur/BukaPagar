package com.tahutelorcommunity.bukapagar.Model.Dompet;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by devel on 28/05/2017.
 */

public class TopUpRequest {
    @SerializedName("amount")
    @Expose
    private String amount;
    @SerializedName("bank_account_id")
    @Expose
    private String bankAccountId;
    @SerializedName("bca")
    @Expose
    private String bca;
    @SerializedName("mandiri")
    @Expose
    private String mandiri;
    @SerializedName("bni")
    @Expose
    private String bni;
    @SerializedName("bri")
    @Expose
    private String bri;

    public TopUpRequest(String amount, String bankAccountId) {
        this.amount = amount;
        this.bankAccountId = bankAccountId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public String getBca() {
        return bca;
    }

    public void setBca(String bca) {
        this.bca = bca;
    }

    public String getMandiri() {
        return mandiri;
    }

    public void setMandiri(String mandiri) {
        this.mandiri = mandiri;
    }

    public String getBni() {
        return bni;
    }

    public void setBni(String bni) {
        this.bni = bni;
    }

    public String getBri() {
        return bri;
    }

    public void setBri(String bri) {
        this.bri = bri;
    }

}
