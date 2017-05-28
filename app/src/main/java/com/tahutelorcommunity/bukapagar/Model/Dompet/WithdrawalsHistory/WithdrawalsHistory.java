
package com.tahutelorcommunity.bukapagar.Model.Dompet.WithdrawalsHistory;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WithdrawalsHistory {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("balance")
    @Expose
    private Integer balance;
    @SerializedName("history")
    @Expose
    private List<History> history = null;
    @SerializedName("message")
    @Expose
    private Object message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public WithdrawalsHistory() {
    }

    /**
     * 
     * @param message
     * @param history
     * @param balance
     * @param status
     */
    public WithdrawalsHistory(String status, Integer balance, List<History> history, Object message) {
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

    public List<History> getHistory() {
        return history;
    }

    public void setHistory(List<History> history) {
        this.history = history;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

}
