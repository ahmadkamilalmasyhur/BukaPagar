
package com.tahutelorcommunity.bukapagar.Model.Invoices.RequestInvoice;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PaymentInvoice {

    @SerializedName("shipping_name")
    @Expose
    private String shippingName;
    @SerializedName("deposit_reduction_amount")
    @Expose
    private Integer depositReductionAmount;
    @SerializedName("dropshipper_name")
    @Expose
    private String dropshipperName;
    @SerializedName("dropshipper_note")
    @Expose
    private String dropshipperNote;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("transactions_attributes")
    @Expose
    private List<TransactionsAttribute> transactionsAttributes = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PaymentInvoice() {
    }

    /**
     * 
     * @param dropshipperNote
     * @param phone
     * @param address
     * @param transactionsAttributes
     * @param dropshipperName
     * @param depositReductionAmount
     * @param shippingName
     */
    public PaymentInvoice(String shippingName, Integer depositReductionAmount, String dropshipperName, String dropshipperNote, String phone, Address address, List<TransactionsAttribute> transactionsAttributes) {
        super();
        this.shippingName = shippingName;
        this.depositReductionAmount = depositReductionAmount;
        this.dropshipperName = dropshipperName;
        this.dropshipperNote = dropshipperNote;
        this.phone = phone;
        this.address = address;
        this.transactionsAttributes = transactionsAttributes;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    public Integer getDepositReductionAmount() {
        return depositReductionAmount;
    }

    public void setDepositReductionAmount(Integer depositReductionAmount) {
        this.depositReductionAmount = depositReductionAmount;
    }

    public String getDropshipperName() {
        return dropshipperName;
    }

    public void setDropshipperName(String dropshipperName) {
        this.dropshipperName = dropshipperName;
    }

    public String getDropshipperNote() {
        return dropshipperNote;
    }

    public void setDropshipperNote(String dropshipperNote) {
        this.dropshipperNote = dropshipperNote;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<TransactionsAttribute> getTransactionsAttributes() {
        return transactionsAttributes;
    }

    public void setTransactionsAttributes(List<TransactionsAttribute> transactionsAttributes) {
        this.transactionsAttributes = transactionsAttributes;
    }

}
