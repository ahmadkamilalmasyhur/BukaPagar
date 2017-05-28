
package com.tahutelorcommunity.bukapagar.Model.Users.UserAccountSetting;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("confirmed")
    @Expose
    private Boolean confirmed;
    @SerializedName("birthday")
    @Expose
    private Object birthday;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("avatar_id")
    @Expose
    private Object avatarId;
    @SerializedName("lapak_name")
    @Expose
    private Object lapakName;
    @SerializedName("lapak_desc")
    @Expose
    private Object lapakDesc;
    @SerializedName("lapak_header")
    @Expose
    private String lapakHeader;
    @SerializedName("header_id")
    @Expose
    private Object headerId;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("seller_term_condition")
    @Expose
    private String sellerTermCondition;
    @SerializedName("last_updated_password")
    @Expose
    private String lastUpdatedPassword;
    @SerializedName("instagram_token")
    @Expose
    private Object instagramToken;
    @SerializedName("phone_confirmed")
    @Expose
    private Object phoneConfirmed;
    @SerializedName("last_order_schedule")
    @Expose
    private Object lastOrderSchedule;
    @SerializedName("onboarding_steps_done")
    @Expose
    private List<OnboardingStepsDone> onboardingStepsDone = null;
    @SerializedName("o2o_agent")
    @Expose
    private Object o2oAgent;

    /**
     * No args constructor for use in serialization
     * 
     */
    public User() {
    }

    /**
     * 
     * @param lapakDesc
     * @param birthday
     * @param phone
     * @param avatarId
     * @param sellerTermCondition
     * @param phoneConfirmed
     * @param avatar
     * @param lastUpdatedPassword
     * @param id
     * @param onboardingStepsDone
     * @param confirmed
     * @param address
     * @param email
     * @param lapakHeader
     * @param name
     * @param o2oAgent
     * @param gender
     * @param instagramToken
     * @param headerId
     * @param lapakName
     * @param lastOrderSchedule
     */
    public User(Integer id, String email, String phone, String name, Boolean confirmed, Object birthday, String gender, String avatar, Object avatarId, Object lapakName, Object lapakDesc, String lapakHeader, Object headerId, Address address, String sellerTermCondition, String lastUpdatedPassword, Object instagramToken, Object phoneConfirmed, Object lastOrderSchedule, List<OnboardingStepsDone> onboardingStepsDone, Object o2oAgent) {
        super();
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.confirmed = confirmed;
        this.birthday = birthday;
        this.gender = gender;
        this.avatar = avatar;
        this.avatarId = avatarId;
        this.lapakName = lapakName;
        this.lapakDesc = lapakDesc;
        this.lapakHeader = lapakHeader;
        this.headerId = headerId;
        this.address = address;
        this.sellerTermCondition = sellerTermCondition;
        this.lastUpdatedPassword = lastUpdatedPassword;
        this.instagramToken = instagramToken;
        this.phoneConfirmed = phoneConfirmed;
        this.lastOrderSchedule = lastOrderSchedule;
        this.onboardingStepsDone = onboardingStepsDone;
        this.o2oAgent = o2oAgent;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public Object getBirthday() {
        return birthday;
    }

    public void setBirthday(Object birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public Object getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Object headerId) {
        this.headerId = headerId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getSellerTermCondition() {
        return sellerTermCondition;
    }

    public void setSellerTermCondition(String sellerTermCondition) {
        this.sellerTermCondition = sellerTermCondition;
    }

    public String getLastUpdatedPassword() {
        return lastUpdatedPassword;
    }

    public void setLastUpdatedPassword(String lastUpdatedPassword) {
        this.lastUpdatedPassword = lastUpdatedPassword;
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

    public Object getLastOrderSchedule() {
        return lastOrderSchedule;
    }

    public void setLastOrderSchedule(Object lastOrderSchedule) {
        this.lastOrderSchedule = lastOrderSchedule;
    }

    public List<OnboardingStepsDone> getOnboardingStepsDone() {
        return onboardingStepsDone;
    }

    public void setOnboardingStepsDone(List<OnboardingStepsDone> onboardingStepsDone) {
        this.onboardingStepsDone = onboardingStepsDone;
    }

    public Object getO2oAgent() {
        return o2oAgent;
    }

    public void setO2oAgent(Object o2oAgent) {
        this.o2oAgent = o2oAgent;
    }

}
