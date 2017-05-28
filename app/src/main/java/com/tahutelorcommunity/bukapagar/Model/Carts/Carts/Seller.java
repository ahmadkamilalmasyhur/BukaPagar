
package com.tahutelorcommunity.bukapagar.Model.Carts.Carts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Seller {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("gender")
    @Expose
    private Object gender;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("level")
    @Expose
    private String level;
    @SerializedName("level_badge_url")
    @Expose
    private String levelBadgeUrl;
    @SerializedName("lapak_name")
    @Expose
    private Object lapakName;
    @SerializedName("lapak_desc")
    @Expose
    private String lapakDesc;
    @SerializedName("lapak_header")
    @Expose
    private String lapakHeader;
    @SerializedName("last_login")
    @Expose
    private String lastLogin;
    @SerializedName("joined_at")
    @Expose
    private String joinedAt;
    @SerializedName("verified_user")
    @Expose
    private Boolean verifiedUser;
    @SerializedName("official")
    @Expose
    private Boolean official;
    @SerializedName("store_closed")
    @Expose
    private Boolean storeClosed;
    @SerializedName("schedule_close_store")
    @Expose
    private Object scheduleCloseStore;
    @SerializedName("close_date")
    @Expose
    private Object closeDate;
    @SerializedName("reopen_date")
    @Expose
    private Object reopenDate;
    @SerializedName("close_reason")
    @Expose
    private Object closeReason;
    @SerializedName("rejection")
    @Expose
    private Rejection rejection;
    @SerializedName("feedbacks")
    @Expose
    private Feedbacks feedbacks;
    @SerializedName("address")
    @Expose
    private Address address;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Seller() {
    }

    /**
     * 
     * @param lapakDesc
     * @param scheduleCloseStore
     * @param closeDate
     * @param rejection
     * @param feedbacks
     * @param joinedAt
     * @param avatar
     * @param id
     * @param username
     * @param lastLogin
     * @param level
     * @param verifiedUser
     * @param address
     * @param lapakHeader
     * @param name
     * @param levelBadgeUrl
     * @param reopenDate
     * @param storeClosed
     * @param official
     * @param gender
     * @param lapakName
     * @param closeReason
     */
    public Seller(Integer id, String username, String name, Object gender, String avatar, String level, String levelBadgeUrl, Object lapakName, String lapakDesc, String lapakHeader, String lastLogin, String joinedAt, Boolean verifiedUser, Boolean official, Boolean storeClosed, Object scheduleCloseStore, Object closeDate, Object reopenDate, Object closeReason, Rejection rejection, Feedbacks feedbacks, Address address) {
        super();
        this.id = id;
        this.username = username;
        this.name = name;
        this.gender = gender;
        this.avatar = avatar;
        this.level = level;
        this.levelBadgeUrl = levelBadgeUrl;
        this.lapakName = lapakName;
        this.lapakDesc = lapakDesc;
        this.lapakHeader = lapakHeader;
        this.lastLogin = lastLogin;
        this.joinedAt = joinedAt;
        this.verifiedUser = verifiedUser;
        this.official = official;
        this.storeClosed = storeClosed;
        this.scheduleCloseStore = scheduleCloseStore;
        this.closeDate = closeDate;
        this.reopenDate = reopenDate;
        this.closeReason = closeReason;
        this.rejection = rejection;
        this.feedbacks = feedbacks;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevelBadgeUrl() {
        return levelBadgeUrl;
    }

    public void setLevelBadgeUrl(String levelBadgeUrl) {
        this.levelBadgeUrl = levelBadgeUrl;
    }

    public Object getLapakName() {
        return lapakName;
    }

    public void setLapakName(Object lapakName) {
        this.lapakName = lapakName;
    }

    public String getLapakDesc() {
        return lapakDesc;
    }

    public void setLapakDesc(String lapakDesc) {
        this.lapakDesc = lapakDesc;
    }

    public String getLapakHeader() {
        return lapakHeader;
    }

    public void setLapakHeader(String lapakHeader) {
        this.lapakHeader = lapakHeader;
    }

    public String getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    public String getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(String joinedAt) {
        this.joinedAt = joinedAt;
    }

    public Boolean getVerifiedUser() {
        return verifiedUser;
    }

    public void setVerifiedUser(Boolean verifiedUser) {
        this.verifiedUser = verifiedUser;
    }

    public Boolean getOfficial() {
        return official;
    }

    public void setOfficial(Boolean official) {
        this.official = official;
    }

    public Boolean getStoreClosed() {
        return storeClosed;
    }

    public void setStoreClosed(Boolean storeClosed) {
        this.storeClosed = storeClosed;
    }

    public Object getScheduleCloseStore() {
        return scheduleCloseStore;
    }

    public void setScheduleCloseStore(Object scheduleCloseStore) {
        this.scheduleCloseStore = scheduleCloseStore;
    }

    public Object getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Object closeDate) {
        this.closeDate = closeDate;
    }

    public Object getReopenDate() {
        return reopenDate;
    }

    public void setReopenDate(Object reopenDate) {
        this.reopenDate = reopenDate;
    }

    public Object getCloseReason() {
        return closeReason;
    }

    public void setCloseReason(Object closeReason) {
        this.closeReason = closeReason;
    }

    public Rejection getRejection() {
        return rejection;
    }

    public void setRejection(Rejection rejection) {
        this.rejection = rejection;
    }

    public Feedbacks getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(Feedbacks feedbacks) {
        this.feedbacks = feedbacks;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
