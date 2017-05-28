
package com.tahutelorcommunity.bukapagar.Model.Messages.Inbox;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Inbox {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("partner_id")
    @Expose
    private String partnerId;
    @SerializedName("partner_name")
    @Expose
    private String partnerName;
    @SerializedName("partner_avatar")
    @Expose
    private String partnerAvatar;
    @SerializedName("partner_verified")
    @Expose
    private Boolean partnerVerified;
    @SerializedName("partner_official")
    @Expose
    private Boolean partnerOfficial;
    @SerializedName("user_id")
    @Expose
    private String userId;
    @SerializedName("user_name")
    @Expose
    private String userName;
    @SerializedName("last_message")
    @Expose
    private String lastMessage;
    @SerializedName("last_message_read")
    @Expose
    private Boolean lastMessageRead;
    @SerializedName("last_message_sent")
    @Expose
    private String lastMessageSent;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Inbox() {
    }

    /**
     * 
     * @param partnerName
     * @param updatedAt
     * @param id
     * @param lastMessageSent
     * @param partnerOfficial
     * @param userId
     * @param partnerAvatar
     * @param partnerId
     * @param lastMessageRead
     * @param lastMessage
     * @param userName
     * @param partnerVerified
     */
    public Inbox(String id, String updatedAt, String partnerId, String partnerName, String partnerAvatar, Boolean partnerVerified, Boolean partnerOfficial, String userId, String userName, String lastMessage, Boolean lastMessageRead, String lastMessageSent) {
        super();
        this.id = id;
        this.updatedAt = updatedAt;
        this.partnerId = partnerId;
        this.partnerName = partnerName;
        this.partnerAvatar = partnerAvatar;
        this.partnerVerified = partnerVerified;
        this.partnerOfficial = partnerOfficial;
        this.userId = userId;
        this.userName = userName;
        this.lastMessage = lastMessage;
        this.lastMessageRead = lastMessageRead;
        this.lastMessageSent = lastMessageSent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    public String getPartnerAvatar() {
        return partnerAvatar;
    }

    public void setPartnerAvatar(String partnerAvatar) {
        this.partnerAvatar = partnerAvatar;
    }

    public Boolean getPartnerVerified() {
        return partnerVerified;
    }

    public void setPartnerVerified(Boolean partnerVerified) {
        this.partnerVerified = partnerVerified;
    }

    public Boolean getPartnerOfficial() {
        return partnerOfficial;
    }

    public void setPartnerOfficial(Boolean partnerOfficial) {
        this.partnerOfficial = partnerOfficial;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public Boolean getLastMessageRead() {
        return lastMessageRead;
    }

    public void setLastMessageRead(Boolean lastMessageRead) {
        this.lastMessageRead = lastMessageRead;
    }

    public String getLastMessageSent() {
        return lastMessageSent;
    }

    public void setLastMessageSent(String lastMessageSent) {
        this.lastMessageSent = lastMessageSent;
    }

}
