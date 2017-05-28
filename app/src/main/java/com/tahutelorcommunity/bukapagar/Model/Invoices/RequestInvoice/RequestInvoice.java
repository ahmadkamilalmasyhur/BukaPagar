
package com.tahutelorcommunity.bukapagar.Model.Invoices.RequestInvoice;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestInvoice {

    @SerializedName("payment_invoice")
    @Expose
    private PaymentInvoice paymentInvoice;
    @SerializedName("payment_method")
    @Expose
    private String paymentMethod;
    @SerializedName("deposit_password")
    @Expose
    private String depositPassword;
    @SerializedName("cart_id")
    @Expose
    private Integer cartId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestInvoice() {
    }

    /**
     * 
     * @param paymentInvoice
     * @param depositPassword
     * @param cartId
     * @param paymentMethod
     */
    public RequestInvoice(PaymentInvoice paymentInvoice, String paymentMethod, String depositPassword, Integer cartId) {
        super();
        this.paymentInvoice = paymentInvoice;
        this.paymentMethod = paymentMethod;
        this.depositPassword = depositPassword;
        this.cartId = cartId;
    }

    public PaymentInvoice getPaymentInvoice() {
        return paymentInvoice;
    }

    public void setPaymentInvoice(PaymentInvoice paymentInvoice) {
        this.paymentInvoice = paymentInvoice;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getDepositPassword() {
        return depositPassword;
    }

    public void setDepositPassword(String depositPassword) {
        this.depositPassword = depositPassword;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

}
