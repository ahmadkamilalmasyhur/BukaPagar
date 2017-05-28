
package com.tahutelorcommunity.bukapagar.Model.Transaction;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StateChanges {

    @SerializedName("addressed_at")
    @Expose
    private String addressedAt;
    @SerializedName("payment_chosen_at")
    @Expose
    private String paymentChosenAt;
    @SerializedName("confirm_payment_at")
    @Expose
    private String confirmPaymentAt;
    @SerializedName("paid_at")
    @Expose
    private String paidAt;
    @SerializedName("delivered_at")
    @Expose
    private String deliveredAt;
    @SerializedName("received_at")
    @Expose
    private String receivedAt;
    @SerializedName("remitted_at")
    @Expose
    private String remittedAt;

    /**
     * No args constructor for use in serialization
     * 
     */
    public StateChanges() {
    }

    /**
     * 
     * @param receivedAt
     * @param paidAt
     * @param confirmPaymentAt
     * @param addressedAt
     * @param remittedAt
     * @param deliveredAt
     * @param paymentChosenAt
     */
    public StateChanges(String addressedAt, String paymentChosenAt, String confirmPaymentAt, String paidAt, String deliveredAt, String receivedAt, String remittedAt) {
        super();
        this.addressedAt = addressedAt;
        this.paymentChosenAt = paymentChosenAt;
        this.confirmPaymentAt = confirmPaymentAt;
        this.paidAt = paidAt;
        this.deliveredAt = deliveredAt;
        this.receivedAt = receivedAt;
        this.remittedAt = remittedAt;
    }

    public String getAddressedAt() {
        return addressedAt;
    }

    public void setAddressedAt(String addressedAt) {
        this.addressedAt = addressedAt;
    }

    public String getPaymentChosenAt() {
        return paymentChosenAt;
    }

    public void setPaymentChosenAt(String paymentChosenAt) {
        this.paymentChosenAt = paymentChosenAt;
    }

    public String getConfirmPaymentAt() {
        return confirmPaymentAt;
    }

    public void setConfirmPaymentAt(String confirmPaymentAt) {
        this.confirmPaymentAt = confirmPaymentAt;
    }

    public String getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(String paidAt) {
        this.paidAt = paidAt;
    }

    public String getDeliveredAt() {
        return deliveredAt;
    }

    public void setDeliveredAt(String deliveredAt) {
        this.deliveredAt = deliveredAt;
    }

    public String getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
    }

    public String getRemittedAt() {
        return remittedAt;
    }

    public void setRemittedAt(String remittedAt) {
        this.remittedAt = remittedAt;
    }

}
