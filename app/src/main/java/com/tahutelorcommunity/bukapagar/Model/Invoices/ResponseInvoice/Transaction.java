
package com.tahutelorcommunity.bukapagar.Model.Invoices.ResponseInvoice;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Transaction {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("quick_trans")
    @Expose
    private Boolean quickTrans;
    @SerializedName("invoice_id")
    @Expose
    private String invoiceId;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("shipping_fee")
    @Expose
    private Integer shippingFee;
    @SerializedName("insurance_cost")
    @Expose
    private Integer insuranceCost;
    @SerializedName("total_amount")
    @Expose
    private Integer totalAmount;
    @SerializedName("subtotal_amount")
    @Expose
    private Integer subtotalAmount;
    @SerializedName("voucher_amount")
    @Expose
    private Integer voucherAmount;
    @SerializedName("voucher")
    @Expose
    private Object voucher;
    @SerializedName("promo_payment_amount")
    @Expose
    private Integer promoPaymentAmount;
    @SerializedName("retarget_discount_amount")
    @Expose
    private Integer retargetDiscountAmount;
    @SerializedName("deposit_reduction_amount")
    @Expose
    private Integer depositReductionAmount;
    @SerializedName("uniq_code")
    @Expose
    private Object uniqCode;
    @SerializedName("coded_amount")
    @Expose
    private Integer codedAmount;
    @SerializedName("payment_method")
    @Expose
    private String paymentMethod;
    @SerializedName("payment_method_name")
    @Expose
    private String paymentMethodName;
    @SerializedName("payment_amount")
    @Expose
    private Integer paymentAmount;
    @SerializedName("service_fee")
    @Expose
    private Integer serviceFee;
    @SerializedName("payment_chosen_at")
    @Expose
    private String paymentChosenAt;
    @SerializedName("expired_at")
    @Expose
    private Object expiredAt;
    @SerializedName("revived_at")
    @Expose
    private Object revivedAt;
    @SerializedName("paid_at")
    @Expose
    private String paidAt;
    @SerializedName("cancelled_at")
    @Expose
    private Object cancelledAt;
    @SerializedName("pay_before")
    @Expose
    private String payBefore;
    @SerializedName("payment_resumable")
    @Expose
    private Boolean paymentResumable;
    @SerializedName("payment_method_editable")
    @Expose
    private Boolean paymentMethodEditable;
    @SerializedName("pickup_time")
    @Expose
    private Object pickupTime;
    @SerializedName("amount_detail")
    @Expose
    private List<AmountDetail> amountDetail = null;
    @SerializedName("buyer")
    @Expose
    private Buyer buyer;
    @SerializedName("consignee")
    @Expose
    private Consignee consignee;
    @SerializedName("virtual")
    @Expose
    private Boolean virtual;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("transactions")
    @Expose
    private List<Transaction_> transactions = null;
    @SerializedName("product_description")
    @Expose
    private String productDescription;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Transaction() {
    }

    /**
     * 
     * @param virtual
     * @param transactions
     * @param codedAmount
     * @param paidAt
     * @param productDescription
     * @param consignee
     * @param pickupTime
     * @param state
     * @param payBefore
     * @param paymentMethodName
     * @param type
     * @param voucherAmount
     * @param insuranceCost
     * @param amount
     * @param id
     * @param paymentAmount
     * @param createdAt
     * @param buyer
     * @param paymentResumable
     * @param totalAmount
     * @param uniqCode
     * @param quickTrans
     * @param paymentChosenAt
     * @param revivedAt
     * @param promoPaymentAmount
     * @param serviceFee
     * @param subtotalAmount
     * @param invoiceId
     * @param retargetDiscountAmount
     * @param cancelledAt
     * @param depositReductionAmount
     * @param expiredAt
     * @param shippingFee
     * @param updatedAt
     * @param amountDetail
     * @param paymentMethodEditable
     * @param voucher
     * @param paymentMethod
     */
    public Transaction(Integer id, String state, String updatedAt, String createdAt, Boolean quickTrans, String invoiceId, Integer amount, Integer shippingFee, Integer insuranceCost, Integer totalAmount, Integer subtotalAmount, Integer voucherAmount, Object voucher, Integer promoPaymentAmount, Integer retargetDiscountAmount, Integer depositReductionAmount, Object uniqCode, Integer codedAmount, String paymentMethod, String paymentMethodName, Integer paymentAmount, Integer serviceFee, String paymentChosenAt, Object expiredAt, Object revivedAt, String paidAt, Object cancelledAt, String payBefore, Boolean paymentResumable, Boolean paymentMethodEditable, Object pickupTime, List<AmountDetail> amountDetail, Buyer buyer, Consignee consignee, Boolean virtual, String type, List<Transaction_> transactions, String productDescription) {
        super();
        this.id = id;
        this.state = state;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.quickTrans = quickTrans;
        this.invoiceId = invoiceId;
        this.amount = amount;
        this.shippingFee = shippingFee;
        this.insuranceCost = insuranceCost;
        this.totalAmount = totalAmount;
        this.subtotalAmount = subtotalAmount;
        this.voucherAmount = voucherAmount;
        this.voucher = voucher;
        this.promoPaymentAmount = promoPaymentAmount;
        this.retargetDiscountAmount = retargetDiscountAmount;
        this.depositReductionAmount = depositReductionAmount;
        this.uniqCode = uniqCode;
        this.codedAmount = codedAmount;
        this.paymentMethod = paymentMethod;
        this.paymentMethodName = paymentMethodName;
        this.paymentAmount = paymentAmount;
        this.serviceFee = serviceFee;
        this.paymentChosenAt = paymentChosenAt;
        this.expiredAt = expiredAt;
        this.revivedAt = revivedAt;
        this.paidAt = paidAt;
        this.cancelledAt = cancelledAt;
        this.payBefore = payBefore;
        this.paymentResumable = paymentResumable;
        this.paymentMethodEditable = paymentMethodEditable;
        this.pickupTime = pickupTime;
        this.amountDetail = amountDetail;
        this.buyer = buyer;
        this.consignee = consignee;
        this.virtual = virtual;
        this.type = type;
        this.transactions = transactions;
        this.productDescription = productDescription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getQuickTrans() {
        return quickTrans;
    }

    public void setQuickTrans(Boolean quickTrans) {
        this.quickTrans = quickTrans;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(Integer shippingFee) {
        this.shippingFee = shippingFee;
    }

    public Integer getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(Integer insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getSubtotalAmount() {
        return subtotalAmount;
    }

    public void setSubtotalAmount(Integer subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }

    public Integer getVoucherAmount() {
        return voucherAmount;
    }

    public void setVoucherAmount(Integer voucherAmount) {
        this.voucherAmount = voucherAmount;
    }

    public Object getVoucher() {
        return voucher;
    }

    public void setVoucher(Object voucher) {
        this.voucher = voucher;
    }

    public Integer getPromoPaymentAmount() {
        return promoPaymentAmount;
    }

    public void setPromoPaymentAmount(Integer promoPaymentAmount) {
        this.promoPaymentAmount = promoPaymentAmount;
    }

    public Integer getRetargetDiscountAmount() {
        return retargetDiscountAmount;
    }

    public void setRetargetDiscountAmount(Integer retargetDiscountAmount) {
        this.retargetDiscountAmount = retargetDiscountAmount;
    }

    public Integer getDepositReductionAmount() {
        return depositReductionAmount;
    }

    public void setDepositReductionAmount(Integer depositReductionAmount) {
        this.depositReductionAmount = depositReductionAmount;
    }

    public Object getUniqCode() {
        return uniqCode;
    }

    public void setUniqCode(Object uniqCode) {
        this.uniqCode = uniqCode;
    }

    public Integer getCodedAmount() {
        return codedAmount;
    }

    public void setCodedAmount(Integer codedAmount) {
        this.codedAmount = codedAmount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    public void setPaymentMethodName(String paymentMethodName) {
        this.paymentMethodName = paymentMethodName;
    }

    public Integer getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Integer paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Integer getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(Integer serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getPaymentChosenAt() {
        return paymentChosenAt;
    }

    public void setPaymentChosenAt(String paymentChosenAt) {
        this.paymentChosenAt = paymentChosenAt;
    }

    public Object getExpiredAt() {
        return expiredAt;
    }

    public void setExpiredAt(Object expiredAt) {
        this.expiredAt = expiredAt;
    }

    public Object getRevivedAt() {
        return revivedAt;
    }

    public void setRevivedAt(Object revivedAt) {
        this.revivedAt = revivedAt;
    }

    public String getPaidAt() {
        return paidAt;
    }

    public void setPaidAt(String paidAt) {
        this.paidAt = paidAt;
    }

    public Object getCancelledAt() {
        return cancelledAt;
    }

    public void setCancelledAt(Object cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    public String getPayBefore() {
        return payBefore;
    }

    public void setPayBefore(String payBefore) {
        this.payBefore = payBefore;
    }

    public Boolean getPaymentResumable() {
        return paymentResumable;
    }

    public void setPaymentResumable(Boolean paymentResumable) {
        this.paymentResumable = paymentResumable;
    }

    public Boolean getPaymentMethodEditable() {
        return paymentMethodEditable;
    }

    public void setPaymentMethodEditable(Boolean paymentMethodEditable) {
        this.paymentMethodEditable = paymentMethodEditable;
    }

    public Object getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(Object pickupTime) {
        this.pickupTime = pickupTime;
    }

    public List<AmountDetail> getAmountDetail() {
        return amountDetail;
    }

    public void setAmountDetail(List<AmountDetail> amountDetail) {
        this.amountDetail = amountDetail;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Consignee getConsignee() {
        return consignee;
    }

    public void setConsignee(Consignee consignee) {
        this.consignee = consignee;
    }

    public Boolean getVirtual() {
        return virtual;
    }

    public void setVirtual(Boolean virtual) {
        this.virtual = virtual;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Transaction_> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction_> transactions) {
        this.transactions = transactions;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

}
