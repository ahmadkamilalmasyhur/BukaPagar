
package com.tahutelorcommunity.bukapagar.Model.Dompet.Mutation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Mutation {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("balance")
    @Expose
    private Integer balance;
    @SerializedName("history")
    @Expose
    private List<MutationHistory> history = null;
    @SerializedName("message")
    @Expose
    private Object message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Mutation() {
    }

    /**
     * 
     * @param message
     * @param history
     * @param balance
     * @param status
     */
    public Mutation(String status, Integer balance, List< MutationHistory> history, Object message) {
        super();
        this.status = status;
        this.balance = balance;
        this.history = history;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public List< MutationHistory> getHistory() {
        return history;
    }

    public void setHistory(List< MutationHistory> history) {
        this.history = history;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

}
