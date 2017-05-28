
package com.tahutelorcommunity.bukapagar.Model.Transaction;

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
    @SerializedName("unread")
    @Expose
    private Boolean unread;
    @SerializedName("quick_trans")
    @Expose
    private Boolean quickTrans;
    @SerializedName("transaction_id")
    @Expose
    private String transactionId;
    @SerializedName("amount")
    @Expose
    private Integer amount;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    @SerializedName("courier")
    @Expose
    private String courier;
    @SerializedName("buyer_notes")
    @Expose
    private String buyerNotes;
    @SerializedName("shipping_fee")
    @Expose
    private Integer shippingFee;
    @SerializedName("shipping_id")
    @Expose
    private Integer shippingId;
    @SerializedName("shipping_code")
    @Expose
    private String shippingCode;
    @SerializedName("shipping_history")
    @Expose
    private List<Object> shippingHistory = null;
    @SerializedName("shipping_service")
    @Expose
    private String shippingService;
    @SerializedName("shipping_cost")
    @Expose
    private Integer shippingCost;
    @SerializedName("insurance_cost")
    @Expose
    private Integer insuranceCost;
    @SerializedName("subtotal_amount")
    @Expose
    private Integer subtotalAmount;
    @SerializedName("total_amount")
    @Expose
    private Integer totalAmount;
    @SerializedName("coded_amount")
    @Expose
    private Integer codedAmount;
    @SerializedName("uniq_code")
    @Expose
    private Integer uniqCode;
    @SerializedName("payment_method")
    @Expose
    private String paymentMethod;
    @SerializedName("feedback")
    @Expose
    private Feedback feedback;
    @SerializedName("products")
    @Expose
    private List<Product> products = null;
    @SerializedName("consignee")
    @Expose
    private Consignee consignee;
    @SerializedName("buyer")
    @Expose
    private Buyer buyer;
    @SerializedName("seller")
    @Expose
    private Seller seller;
    @SerializedName("actions")
    @Expose
    private List<String> actions = null;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("deliver_before")
    @Expose
    private String deliverBefore;
    @SerializedName("pay_before")
    @Expose
    private String payBefore;
    @SerializedName("reject_reason")
    @Expose
    private Object rejectReason;
    @SerializedName("state_changes")
    @Expose
    private StateChanges stateChanges;
    @SerializedName("has_deal_product")
    @Expose
    private Boolean hasDealProduct;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Transaction() {
    }

    /**
     * 
     * @param deliverBefore
     * @param transactionId
     * @param codedAmount
     * @param consignee
     * @param unread
     * @param state
     * @param payBefore
     * @param shippingCost
     * @param buyerNotes
     * @param insuranceCost
     * @param stateChanges
     * @param shippingCode
     * @param amount
     * @param id
     * @param feedback
     * @param createdAt
     * @param shippingHistory
     * @param buyer
     * @param totalAmount
     * @param quantity
     * @param hasDealProduct
     * @param uniqCode
     * @param products
     * @param quickTrans
     * @param rejectReason
     * @param subtotalAmount
     * @param courier
     * @param seller
     * @param shippingService
     * @param shippingFee
     * @param updatedAt
     * @param shippingId
     * @param actions
     * @param paymentMethod
     */
    public Transaction(Integer id, String state, String updatedAt, Boolean unread, Boolean quickTrans, String transactionId, Integer amount, Integer quantity, String courier, String buyerNotes, Integer shippingFee, Integer shippingId, String shippingCode, List<Object> shippingHistory, String shippingService, Integer shippingCost, Integer insuranceCost, Integer subtotalAmount, Integer totalAmount, Integer codedAmount, Integer uniqCode, String paymentMethod, Feedback feedback, List<Product> products, Consignee consignee, Buyer buyer, Seller seller, List<String> actions, String createdAt, String deliverBefore, String payBefore, Object rejectReason, StateChanges stateChanges, Boolean hasDealProduct) {
        super();
        this.id = id;
        this.state = state;
        this.updatedAt = updatedAt;
        this.unread = unread;
        this.quickTrans = quickTrans;
        this.transactionId = transactionId;
        this.amount = amount;
        this.quantity = quantity;
        this.courier = courier;
        this.buyerNotes = buyerNotes;
        this.shippingFee = shippingFee;
        this.shippingId = shippingId;
        this.shippingCode = shippingCode;
        this.shippingHistory = shippingHistory;
        this.shippingService = shippingService;
        this.shippingCost = shippingCost;
        this.insuranceCost = insuranceCost;
        this.subtotalAmount = subtotalAmount;
        this.totalAmount = totalAmount;
        this.codedAmount = codedAmount;
        this.uniqCode = uniqCode;
        this.paymentMethod = paymentMethod;
        this.feedback = feedback;
        this.products = products;
        this.consignee = consignee;
        this.buyer = buyer;
        this.seller = seller;
        this.actions = actions;
        this.createdAt = createdAt;
        this.deliverBefore = deliverBefore;
        this.payBefore = payBefore;
        this.rejectReason = rejectReason;
        this.stateChanges = stateChanges;
        this.hasDealProduct = hasDealProduct;
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

    public Boolean getUnread() {
        return unread;
    }

    public void setUnread(Boolean unread) {
        this.unread = unread;
    }

    public Boolean getQuickTrans() {
        return quickTrans;
    }

    public void setQuickTrans(Boolean quickTrans) {
        this.quickTrans = quickTrans;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public String getBuyerNotes() {
        return buyerNotes;
    }

    public void setBuyerNotes(String buyerNotes) {
        this.buyerNotes = buyerNotes;
    }

    public Integer getShippingFee() {
        return shippingFee;
    }

    public void setShippingFee(Integer shippingFee) {
        this.shippingFee = shippingFee;
    }

    public Integer getShippingId() {
        return shippingId;
    }

    public void setShippingId(Integer shippingId) {
        this.shippingId = shippingId;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    public List<Object> getShippingHistory() {
        return shippingHistory;
    }

    public void setShippingHistory(List<Object> shippingHistory) {
        this.shippingHistory = shippingHistory;
    }

    public String getShippingService() {
        return shippingService;
    }

    public void setShippingService(String shippingService) {
        this.shippingService = shippingService;
    }

    public Integer getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(Integer shippingCost) {
        this.shippingCost = shippingCost;
    }

    public Integer getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(Integer insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public Integer getSubtotalAmount() {
        return subtotalAmount;
    }

    public void setSubtotalAmount(Integer subtotalAmount) {
        this.subtotalAmount = subtotalAmount;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getCodedAmount() {
        return codedAmount;
    }

    public void setCodedAmount(Integer codedAmount) {
        this.codedAmount = codedAmount;
    }

    public Integer getUniqCode() {
        return uniqCode;
    }

    public void setUniqCode(Integer uniqCode) {
        this.uniqCode = uniqCode;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Feedback getFeedback() {
        return feedback;
    }

    public void setFeedback(Feedback feedback) {
        this.feedback = feedback;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Consignee getConsignee() {
        return consignee;
    }

    public void setConsignee(Consignee consignee) {
        this.consignee = consignee;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public List<String> getActions() {
        return actions;
    }

    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDeliverBefore() {
        return deliverBefore;
    }

    public void setDeliverBefore(String deliverBefore) {
        this.deliverBefore = deliverBefore;
    }

    public String getPayBefore() {
        return payBefore;
    }

    public void setPayBefore(String payBefore) {
        this.payBefore = payBefore;
    }

    public Object getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(Object rejectReason) {
        this.rejectReason = rejectReason;
    }

    public StateChanges getStateChanges() {
        return stateChanges;
    }

    public void setStateChanges(StateChanges stateChanges) {
        this.stateChanges = stateChanges;
    }

    public Boolean getHasDealProduct() {
        return hasDealProduct;
    }

    public void setHasDealProduct(Boolean hasDealProduct) {
        this.hasDealProduct = hasDealProduct;
    }

}
