
package com.tahutelorcommunity.bukapagar.Model.Products.Pelapak;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pelapak {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("products")
    @Expose
    private List<Product> products = null;
    @SerializedName("can_push")
    @Expose
    private Boolean canPush;
    @SerializedName("remaining_push")
    @Expose
    private Integer remainingPush;
    @SerializedName("message")
    @Expose
    private Object message;
    @SerializedName("labels")
    @Expose
    private List<Object> labels = null;
    @SerializedName("push_price")
    @Expose
    private Integer pushPrice;
    @SerializedName("deposit")
    @Expose
    private Integer deposit;
    @SerializedName("push_status")
    @Expose
    private String pushStatus;
    @SerializedName("active_until")
    @Expose
    private String activeUntil;
    @SerializedName("grace_period_until")
    @Expose
    private String gracePeriodUntil;
    @SerializedName("loan_info")
    @Expose
    private LoanInfo loanInfo;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pelapak() {
    }

    /**
     * 
     * @param message
     * @param activeUntil
     * @param deposit
     * @param status
     * @param gracePeriodUntil
     * @param pushPrice
     * @param loanInfo
     * @param labels
     * @param pushStatus
     * @param remainingPush
     * @param canPush
     * @param products
     */
    public Pelapak(String status, List<Product> products, Boolean canPush, Integer remainingPush, Object message, List<Object> labels, Integer pushPrice, Integer deposit, String pushStatus, String activeUntil, String gracePeriodUntil, LoanInfo loanInfo) {
        super();
        this.status = status;
        this.products = products;
        this.canPush = canPush;
        this.remainingPush = remainingPush;
        this.message = message;
        this.labels = labels;
        this.pushPrice = pushPrice;
        this.deposit = deposit;
        this.pushStatus = pushStatus;
        this.activeUntil = activeUntil;
        this.gracePeriodUntil = gracePeriodUntil;
        this.loanInfo = loanInfo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Boolean getCanPush() {
        return canPush;
    }

    public void setCanPush(Boolean canPush) {
        this.canPush = canPush;
    }

    public Integer getRemainingPush() {
        return remainingPush;
    }

    public void setRemainingPush(Integer remainingPush) {
        this.remainingPush = remainingPush;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public List<Object> getLabels() {
        return labels;
    }

    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    public Integer getPushPrice() {
        return pushPrice;
    }

    public void setPushPrice(Integer pushPrice) {
        this.pushPrice = pushPrice;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public String getPushStatus() {
        return pushStatus;
    }

    public void setPushStatus(String pushStatus) {
        this.pushStatus = pushStatus;
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

    public LoanInfo getLoanInfo() {
        return loanInfo;
    }

    public void setLoanInfo(LoanInfo loanInfo) {
        this.loanInfo = loanInfo;
    }

}
