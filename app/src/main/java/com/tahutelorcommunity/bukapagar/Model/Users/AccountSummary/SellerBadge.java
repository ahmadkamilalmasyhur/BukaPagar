
package com.tahutelorcommunity.bukapagar.Model.Users.AccountSummary;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SellerBadge {

    @SerializedName("current_badge")
    @Expose
    private String currentBadge;
    @SerializedName("icon")
    @Expose
    private String icon;
    @SerializedName("n_feedback")
    @Expose
    private Integer nFeedback;
    @SerializedName("next_badge")
    @Expose
    private String nextBadge;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SellerBadge() {
    }

    /**
     * 
     * @param nFeedback
     * @param icon
     * @param currentBadge
     * @param nextBadge
     */
    public SellerBadge(String currentBadge, String icon, Integer nFeedback, String nextBadge) {
        super();
        this.currentBadge = currentBadge;
        this.icon = icon;
        this.nFeedback = nFeedback;
        this.nextBadge = nextBadge;
    }

    public String getCurrentBadge() {
        return currentBadge;
    }

    public void setCurrentBadge(String currentBadge) {
        this.currentBadge = currentBadge;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getNFeedback() {
        return nFeedback;
    }

    public void setNFeedback(Integer nFeedback) {
        this.nFeedback = nFeedback;
    }

    public String getNextBadge() {
        return nextBadge;
    }

    public void setNextBadge(String nextBadge) {
        this.nextBadge = nextBadge;
    }

}
