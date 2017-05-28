
package com.tahutelorcommunity.bukapagar.Model.Dompet.WithdrawalsHistory;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class History {

    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("bank_account_id")
    @Expose
    private Integer bankAccountId;
    @SerializedName("cancelled_at")
    @Expose
    private Object cancelledAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("deposit_id")
    @Expose
    private Integer depositId;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("processed_at")
    @Expose
    private Object processedAt;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    /**
     * No args constructor for use in serialization
     * 
     */
    public History() {
    }

    /**
     * 
     * @param updatedAt
     * @param id
     * @param amount
     * @param createdAt
     * @param cancelledAt
     * @param state
     * @param depositId
     * @param bankAccountId
     * @param processedAt
     */
    public History(Integer amount, Integer bankAccountId, Object cancelledAt, String createdAt, Integer depositId, Integer id, Object processedAt, String state, String updatedAt) {
        super();
        this.amount = amount;
        this.bankAccountId = bankAccountId;
        this.cancelledAt = cancelledAt;
        this.createdAt = createdAt;
        this.depositId = depositId;
        this.id = id;
        this.processedAt = processedAt;
        this.state = state;
        this.updatedAt = updatedAt;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(Integer bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public Object getCancelledAt() {
        return cancelledAt;
    }

    public void setCancelledAt(Object cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getDepositId() {
        return depositId;
    }

    public void setDepositId(Integer depositId) {
        this.depositId = depositId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getProcessedAt() {
        return processedAt;
    }

    public void setProcessedAt(Object processedAt) {
        this.processedAt = processedAt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}
