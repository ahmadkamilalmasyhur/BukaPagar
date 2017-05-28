
package com.tahutelorcommunity.bukapagar.Model.Users.AccountSummary;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Summary {

    @SerializedName("products_for_sale")
    @Expose
    private Integer productsForSale;
    @SerializedName("products_not_for_sale")
    @Expose
    private Integer productsNotForSale;
    @SerializedName("balance")
    @Expose
    private Integer balance;
    @SerializedName("pending_topups")
    @Expose
    private Integer pendingTopups;
    @SerializedName("pending_withdrawals")
    @Expose
    private Integer pendingWithdrawals;
    @SerializedName("need_action_seller")
    @Expose
    private Integer needActionSeller;
    @SerializedName("need_action_buyer")
    @Expose
    private Integer needActionBuyer;
    @SerializedName("dispute_count")
    @Expose
    private Integer disputeCount;
    @SerializedName("invoices_need_action_count")
    @Expose
    private Integer invoicesNeedActionCount;
    @SerializedName("seller_delivered")
    @Expose
    private Integer sellerDelivered;
    @SerializedName("remitted_transaction_seller_weekly")
    @Expose
    private Integer remittedTransactionSellerWeekly;
    @SerializedName("remitted_transaction_seller_monthly")
    @Expose
    private Integer remittedTransactionSellerMonthly;
    @SerializedName("remitted_transaction_seller_gmv_weekly")
    @Expose
    private Integer remittedTransactionSellerGmvWeekly;
    @SerializedName("remitted_transaction_seller_gmv_monthly")
    @Expose
    private Integer remittedTransactionSellerGmvMonthly;
    @SerializedName("remitted_today")
    @Expose
    private Integer remittedToday;
    @SerializedName("amount_remitted_today")
    @Expose
    private Integer amountRemittedToday;
    @SerializedName("remaining_pushes")
    @Expose
    private Integer remainingPushes;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("active_until")
    @Expose
    private String activeUntil;
    @SerializedName("grace_period_until")
    @Expose
    private String gracePeriodUntil;
    @SerializedName("remaining_sem_budget")
    @Expose
    private Integer remainingSemBudget;
    @SerializedName("seller_positive")
    @Expose
    private Integer sellerPositive;
    @SerializedName("seller_negative")
    @Expose
    private Integer sellerNegative;
    @SerializedName("buyer_positive")
    @Expose
    private Integer buyerPositive;
    @SerializedName("buyer_negative")
    @Expose
    private Integer buyerNegative;
    @SerializedName("accepted_orders")
    @Expose
    private Integer acceptedOrders;
    @SerializedName("rejected_orders")
    @Expose
    private Integer rejectedOrders;
    @SerializedName("acceptance_orders")
    @Expose
    private Integer acceptanceOrders;
    @SerializedName("couriers")
    @Expose
    private List<String> couriers = null;
    @SerializedName("facebook")
    @Expose
    private Boolean facebook;
    @SerializedName("twitter")
    @Expose
    private Boolean twitter;
    @SerializedName("newsletter")
    @Expose
    private Boolean newsletter;
    @SerializedName("komunitas_email_replies")
    @Expose
    private Boolean komunitasEmailReplies;
    @SerializedName("seller_badge")
    @Expose
    private SellerBadge sellerBadge;
    @SerializedName("bookmarks")
    @Expose
    private Integer bookmarks;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Summary() {
    }

    /**
     * 
     * @param remittedTransactionSellerMonthly
     * @param gracePeriodUntil
     * @param invoicesNeedActionCount
     * @param komunitasEmailReplies
     * @param sellerDelivered
     * @param buyerPositive
     * @param needActionSeller
     * @param productsForSale
     * @param acceptedOrders
     * @param bookmarks
     * @param twitter
     * @param disputeCount
     * @param balance
     * @param remittedTransactionSellerGmvMonthly
     * @param sellerPositive
     * @param facebook
     * @param remittedTransactionSellerWeekly
     * @param pendingWithdrawals
     * @param activeUntil
     * @param rejectedOrders
     * @param amountRemittedToday
     * @param status
     * @param newsletter
     * @param sellerNegative
     * @param couriers
     * @param remainingPushes
     * @param needActionBuyer
     * @param acceptanceOrders
     * @param remainingSemBudget
     * @param buyerNegative
     * @param productsNotForSale
     * @param sellerBadge
     * @param pendingTopups
     * @param remittedToday
     * @param remittedTransactionSellerGmvWeekly
     */
    public Summary(Integer productsForSale, Integer productsNotForSale, Integer balance, Integer pendingTopups, Integer pendingWithdrawals, Integer needActionSeller, Integer needActionBuyer, Integer disputeCount, Integer invoicesNeedActionCount, Integer sellerDelivered, Integer remittedTransactionSellerWeekly, Integer remittedTransactionSellerMonthly, Integer remittedTransactionSellerGmvWeekly, Integer remittedTransactionSellerGmvMonthly, Integer remittedToday, Integer amountRemittedToday, Integer remainingPushes, String status, String activeUntil, String gracePeriodUntil, Integer remainingSemBudget, Integer sellerPositive, Integer sellerNegative, Integer buyerPositive, Integer buyerNegative, Integer acceptedOrders, Integer rejectedOrders, Integer acceptanceOrders, List<String> couriers, Boolean facebook, Boolean twitter, Boolean newsletter, Boolean komunitasEmailReplies, SellerBadge sellerBadge, Integer bookmarks) {
        super();
        this.productsForSale = productsForSale;
        this.productsNotForSale = productsNotForSale;
        this.balance = balance;
        this.pendingTopups = pendingTopups;
        this.pendingWithdrawals = pendingWithdrawals;
        this.needActionSeller = needActionSeller;
        this.needActionBuyer = needActionBuyer;
        this.disputeCount = disputeCount;
        this.invoicesNeedActionCount = invoicesNeedActionCount;
        this.sellerDelivered = sellerDelivered;
        this.remittedTransactionSellerWeekly = remittedTransactionSellerWeekly;
        this.remittedTransactionSellerMonthly = remittedTransactionSellerMonthly;
        this.remittedTransactionSellerGmvWeekly = remittedTransactionSellerGmvWeekly;
        this.remittedTransactionSellerGmvMonthly = remittedTransactionSellerGmvMonthly;
        this.remittedToday = remittedToday;
        this.amountRemittedToday = amountRemittedToday;
        this.remainingPushes = remainingPushes;
        this.status = status;
        this.activeUntil = activeUntil;
        this.gracePeriodUntil = gracePeriodUntil;
        this.remainingSemBudget = remainingSemBudget;
        this.sellerPositive = sellerPositive;
        this.sellerNegative = sellerNegative;
        this.buyerPositive = buyerPositive;
        this.buyerNegative = buyerNegative;
        this.acceptedOrders = acceptedOrders;
        this.rejectedOrders = rejectedOrders;
        this.acceptanceOrders = acceptanceOrders;
        this.couriers = couriers;
        this.facebook = facebook;
        this.twitter = twitter;
        this.newsletter = newsletter;
        this.komunitasEmailReplies = komunitasEmailReplies;
        this.sellerBadge = sellerBadge;
        this.bookmarks = bookmarks;
    }

    public Integer getProductsForSale() {
        return productsForSale;
    }

    public void setProductsForSale(Integer productsForSale) {
        this.productsForSale = productsForSale;
    }

    public Integer getProductsNotForSale() {
        return productsNotForSale;
    }

    public void setProductsNotForSale(Integer productsNotForSale) {
        this.productsNotForSale = productsNotForSale;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getPendingTopups() {
        return pendingTopups;
    }

    public void setPendingTopups(Integer pendingTopups) {
        this.pendingTopups = pendingTopups;
    }

    public Integer getPendingWithdrawals() {
        return pendingWithdrawals;
    }

    public void setPendingWithdrawals(Integer pendingWithdrawals) {
        this.pendingWithdrawals = pendingWithdrawals;
    }

    public Integer getNeedActionSeller() {
        return needActionSeller;
    }

    public void setNeedActionSeller(Integer needActionSeller) {
        this.needActionSeller = needActionSeller;
    }

    public Integer getNeedActionBuyer() {
        return needActionBuyer;
    }

    public void setNeedActionBuyer(Integer needActionBuyer) {
        this.needActionBuyer = needActionBuyer;
    }

    public Integer getDisputeCount() {
        return disputeCount;
    }

    public void setDisputeCount(Integer disputeCount) {
        this.disputeCount = disputeCount;
    }

    public Integer getInvoicesNeedActionCount() {
        return invoicesNeedActionCount;
    }

    public void setInvoicesNeedActionCount(Integer invoicesNeedActionCount) {
        this.invoicesNeedActionCount = invoicesNeedActionCount;
    }

    public Integer getSellerDelivered() {
        return sellerDelivered;
    }

    public void setSellerDelivered(Integer sellerDelivered) {
        this.sellerDelivered = sellerDelivered;
    }

    public Integer getRemittedTransactionSellerWeekly() {
        return remittedTransactionSellerWeekly;
    }

    public void setRemittedTransactionSellerWeekly(Integer remittedTransactionSellerWeekly) {
        this.remittedTransactionSellerWeekly = remittedTransactionSellerWeekly;
    }

    public Integer getRemittedTransactionSellerMonthly() {
        return remittedTransactionSellerMonthly;
    }

    public void setRemittedTransactionSellerMonthly(Integer remittedTransactionSellerMonthly) {
        this.remittedTransactionSellerMonthly = remittedTransactionSellerMonthly;
    }

    public Integer getRemittedTransactionSellerGmvWeekly() {
        return remittedTransactionSellerGmvWeekly;
    }

    public void setRemittedTransactionSellerGmvWeekly(Integer remittedTransactionSellerGmvWeekly) {
        this.remittedTransactionSellerGmvWeekly = remittedTransactionSellerGmvWeekly;
    }

    public Integer getRemittedTransactionSellerGmvMonthly() {
        return remittedTransactionSellerGmvMonthly;
    }

    public void setRemittedTransactionSellerGmvMonthly(Integer remittedTransactionSellerGmvMonthly) {
        this.remittedTransactionSellerGmvMonthly = remittedTransactionSellerGmvMonthly;
    }

    public Integer getRemittedToday() {
        return remittedToday;
    }

    public void setRemittedToday(Integer remittedToday) {
        this.remittedToday = remittedToday;
    }

    public Integer getAmountRemittedToday() {
        return amountRemittedToday;
    }

    public void setAmountRemittedToday(Integer amountRemittedToday) {
        this.amountRemittedToday = amountRemittedToday;
    }

    public Integer getRemainingPushes() {
        return remainingPushes;
    }

    public void setRemainingPushes(Integer remainingPushes) {
        this.remainingPushes = remainingPushes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getActiveUntil() {
        return activeUntil;
    }

    public void setActiveUntil(String activeUntil) {
        this.activeUntil = activeUntil;
    }

    public String getGracePeriodUntil() {
        return gracePeriodUntil;
    }

    public void setGracePeriodUntil(String gracePeriodUntil) {
        this.gracePeriodUntil = gracePeriodUntil;
    }

    public Integer getRemainingSemBudget() {
        return remainingSemBudget;
    }

    public void setRemainingSemBudget(Integer remainingSemBudget) {
        this.remainingSemBudget = remainingSemBudget;
    }

    public Integer getSellerPositive() {
        return sellerPositive;
    }

    public void setSellerPositive(Integer sellerPositive) {
        this.sellerPositive = sellerPositive;
    }

    public Integer getSellerNegative() {
        return sellerNegative;
    }

    public void setSellerNegative(Integer sellerNegative) {
        this.sellerNegative = sellerNegative;
    }

    public Integer getBuyerPositive() {
        return buyerPositive;
    }

    public void setBuyerPositive(Integer buyerPositive) {
        this.buyerPositive = buyerPositive;
    }

    public Integer getBuyerNegative() {
        return buyerNegative;
    }

    public void setBuyerNegative(Integer buyerNegative) {
        this.buyerNegative = buyerNegative;
    }

    public Integer getAcceptedOrders() {
        return acceptedOrders;
    }

    public void setAcceptedOrders(Integer acceptedOrders) {
        this.acceptedOrders = acceptedOrders;
    }

    public Integer getRejectedOrders() {
        return rejectedOrders;
    }

    public void setRejectedOrders(Integer rejectedOrders) {
        this.rejectedOrders = rejectedOrders;
    }

    public Integer getAcceptanceOrders() {
        return acceptanceOrders;
    }

    public void setAcceptanceOrders(Integer acceptanceOrders) {
        this.acceptanceOrders = acceptanceOrders;
    }

    public List<String> getCouriers() {
        return couriers;
    }

    public void setCouriers(List<String> couriers) {
        this.couriers = couriers;
    }

    public Boolean getFacebook() {
        return facebook;
    }

    public void setFacebook(Boolean facebook) {
        this.facebook = facebook;
    }

    public Boolean getTwitter() {
        return twitter;
    }

    public void setTwitter(Boolean twitter) {
        this.twitter = twitter;
    }

    public Boolean getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(Boolean newsletter) {
        this.newsletter = newsletter;
    }

    public Boolean getKomunitasEmailReplies() {
        return komunitasEmailReplies;
    }

    public void setKomunitasEmailReplies(Boolean komunitasEmailReplies) {
        this.komunitasEmailReplies = komunitasEmailReplies;
    }

    public SellerBadge getSellerBadge() {
        return sellerBadge;
    }

    public void setSellerBadge(SellerBadge sellerBadge) {
        this.sellerBadge = sellerBadge;
    }

    public Integer getBookmarks() {
        return bookmarks;
    }

    public void setBookmarks(Integer bookmarks) {
        this.bookmarks = bookmarks;
    }

}
