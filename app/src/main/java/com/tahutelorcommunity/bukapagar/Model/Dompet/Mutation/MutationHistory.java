
package com.tahutelorcommunity.bukapagar.Model.Dompet.Mutation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MutationHistory {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("action")
    @Expose
    private String action;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("initial_balance")
    @Expose
    private Integer initialBalance;
    @SerializedName("final_balance")
    @Expose
    private Integer finalBalance;
    @SerializedName("transaction_id")
    @Expose
    private Integer transactionId;
    @SerializedName("transaction_no")
    @Expose
    private String transactionNo;
    @SerializedName("note")
    @Expose
    private String note;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MutationHistory() {
    }

    /**
     * 
     * @param updatedAt
     * @param amount
     * @param id
     * @param transactionId
     * @param createdAt
     * @param action
     * @param initialBalance
     * @param transactionNo
     * @param type
     * @param note
     * @param finalBalance
     */
    public  MutationHistory(Integer id, String type, String action, Integer amount, Integer initialBalance, Integer finalBalance, Integer transactionId, String transactionNo, String note, String createdAt, String updatedAt) {
        super();
        this.id = id;
        this.type = type;
        this.action = action;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
        this.transactionId = transactionId;
        this.transactionNo = transactionNo;
        this.note = note;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(Integer initialBalance) {
        this.initialBalance = initialBalance;
    }

    public Integer getFinalBalance() {
        return finalBalance;
    }

    public void setFinalBalance(Integer finalBalance) {
        this.finalBalance = finalBalance;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}
