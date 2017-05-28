
package com.tahutelorcommunity.bukapagar.Model.Invoices.ResponseInvoice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResponseInvoice {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("transaction")
    @Expose
    private Transaction transaction;
    @SerializedName("message")
    @Expose
    private Object message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponseInvoice() {
    }

    /**
     * 
     * @param message
     * @param transaction
     * @param status
     */
    public ResponseInvoice(String status, Transaction transaction, Object message) {
        super();
        this.status = status;
        this.transaction = transaction;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

}
