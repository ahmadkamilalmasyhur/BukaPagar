
package com.tahutelorcommunity.bukapagar.Model.Users.Info;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("confirmed")
    @Expose
    private Boolean confirmed;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("avatar_id")
    @Expose
    private Object avatarId;
    @SerializedName("bank")
    @Expose
    private Bank bank;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("instagram_token")
    @Expose
    private Object instagramToken;
    @SerializedName("phone_confirmed")
    @Expose
    private Object phoneConfirmed;
    @SerializedName("username")
    @Expose
    private String username;
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
    private Object lapakDesc;
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
    @SerializedName("delivery_time")
    @Expose
    private Object deliveryTime;
    @SerializedName("rejection")
    @Expose
    private Rejection rejection;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("subscriber_amount")
    @Expose
    private Integer subscriberAmount;
    @SerializedName("last_order_schedule")
    @Expose
    private Object lastOrderSchedule;
    @SerializedName("premium_user")
    @Expose
    private Boolean premiumUser;
    @SerializedName("top_merchant")
    @Expose
    private Boolean topMerchant;
    @SerializedName("seller_voucher")
    @Expose
    private SellerVoucher sellerVoucher;
    @SerializedName("is_seller")
    @Expose
    private Boolean isSeller;
    @SerializedName("feedbacks")
    @Expose
    private Feedbacks feedbacks;

    /**
     * No args constructor for use in serialization
     * 
     */
    public User() {
    }

    /**
     * 
     * @param lapakDesc
     * @param phone
     * @param avatarId
     * @param topMerchant
     * @param rejection
     * @param premiumUser
     * @param id
     * @param username
     * @param confirmed
     * @param level
     * @param lapakHeader
     * @param name
     * @param levelBadgeUrl
     * @param subscriberAmount
     * @param reopenDate
     * @param gender
     * @param official
     * @param instagramToken
     * @param bank
     * @param lapakName
     * @param scheduleCloseStore
     * @param closeDate
     * @param feedbacks
     * @param phoneConfirmed
     * @param joinedAt
     * @param avatar
     * @param lastLogin
     * @param deliveryTime
     * @param verifiedUser
     * @param address
     * @param email
     * @param storeClosed
     * @param sellerVoucher
     * @param isSeller
     * @param lastOrderSchedule
     * @param closeReason
     */
    public User(Integer id, String name, String email, Boolean confirmed, String phone, String avatar, Object avatarId, Bank bank, String gender, Object instagramToken, Object phoneConfirmed, String username, String level, String levelBadgeUrl, Object lapakName, Object lapakDesc, String lapakHeader, String lastLogin, String joinedAt, Boolean verifiedUser, Boolean official, Boolean storeClosed, Object scheduleCloseStore, Object closeDate, Object reopenDate, Object closeReason, Object deliveryTime, Rejection rejection, Address address, Integer subscriberAmount, Object lastOrderSchedule, Boolean premiumUser, Boolean topMerchant, SellerVoucher sellerVoucher, Boolean isSeller, Feedbacks feedbacks) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.confirmed = confirmed;
        this.phone = phone;
        this.avatar = avatar;
        this.avatarId = avatarId;
        this.bank = bank;
        this.gender = gender;
        this.instagramToken = instagramToken;
        this.phoneConfirmed = phoneConfirmed;
        this.username = username;
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
        this.deliveryTime = deliveryTime;
        this.rejection = rejection;
        this.address = address;
        this.subscriberAmount = subscriberAmount;
        this.lastOrderSchedule = lastOrderSchedule;
        this.premiumUser = premiumUser;
        this.topMerchant = topMerchant;
        this.sellerVoucher = sellerVoucher;
        this.isSeller = isSeller;
        this.feedbacks = feedbacks;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Object getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(Object avatarId) {
        this.avatarId = avatarId;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Object getInstagramToken() {
        return instagramToken;
    }

    public void setInstagramToken(Object instagramToken) {
        this.instagramToken = instagramToken;
    }

    public Object getPhoneConfirmed() {
        return phoneConfirmed;
    }

    public void setPhoneConfirmed(Object phoneConfirmed) {
        this.phoneConfirmed = phoneConfirmed;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Object getLapakDesc() {
        return lapakDesc;
    }

    public void setLapakDesc(Object lapakDesc) {
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

    public Object getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Object deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Rejection getRejection() {
        return rejection;
    }

    public void setRejection(Rejection rejection) {
        this.rejection = rejection;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getSubscriberAmount() {
        return subscriberAmount;
    }

    public void setSubscriberAmount(Integer subscriberAmount) {
        this.subscriberAmount = subscriberAmount;
    }

    public Object getLastOrderSchedule() {
        return lastOrderSchedule;
    }

    public void setLastOrderSchedule(Object lastOrderSchedule) {
        this.lastOrderSchedule = lastOrderSchedule;
    }

    public Boolean getPremiumUser() {
        return premiumUser;
    }

    public void setPremiumUser(Boolean premiumUser) {
        this.premiumUser = premiumUser;
    }

    public Boolean getTopMerchant() {
        return topMerchant;
    }

    public void setTopMerchant(Boolean topMerchant) {
        this.topMerchant = topMerchant;
    }

    public SellerVoucher getSellerVoucher() {
        return sellerVoucher;
    }

    public void setSellerVoucher(SellerVoucher sellerVoucher) {
        this.sellerVoucher = sellerVoucher;
    }

    public Boolean getIsSeller() {
        return isSeller;
    }

    public void setIsSeller(Boolean isSeller) {
        this.isSeller = isSeller;
    }

    public Feedbacks getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(Feedbacks feedbacks) {
        this.feedbacks = feedbacks;
    }

}
