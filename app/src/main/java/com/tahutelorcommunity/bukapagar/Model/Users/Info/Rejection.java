
package com.tahutelorcommunity.bukapagar.Model.Users.Info;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rejection {

    @SerializedName("rejected")
    @Expose
    private Integer rejected;
    @SerializedName("recent_trans")
    @Expose
    private Integer recentTrans;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Rejection() {
    }

    /**
     * 
     * @param recentTrans
     * @param rejected
     */
    public Rejection(Integer rejected, Integer recentTrans) {
        super();
        this.rejected = rejected;
        this.recentTrans = recentTrans;
    }

    public Integer getRejected() {
        return rejected;
    }

    public void setRejected(Integer rejected) {
        this.rejected = rejected;
    }

    public Integer getRecentTrans() {
        return recentTrans;
    }

    public void setRecentTrans(Integer recentTrans) {
        this.recentTrans = recentTrans;
    }

}
