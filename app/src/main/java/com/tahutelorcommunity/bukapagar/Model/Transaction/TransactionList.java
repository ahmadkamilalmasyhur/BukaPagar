
package com.tahutelorcommunity.bukapagar.Model.Transaction;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TransactionList {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("transactions")
    @Expose
    private List<Transaction> transactions = null;
    @SerializedName("message")
    @Expose
    private Object message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TransactionList() {
    }

    /**
     * 
     * @param message
     * @param transactions
     * @param status
     */
    public TransactionList(String status, List<Transaction> transactions, Object message) {
        super();
        this.status = status;
        this.transactions = transactions;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

}
