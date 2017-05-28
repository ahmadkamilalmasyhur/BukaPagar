
package com.tahutelorcommunity.bukapagar.Model.Messages.Conversation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class InstantMessage {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("inbox_id")
    @Expose
    private String inboxId;
    @SerializedName("read")
    @Expose
    private Boolean read;
    @SerializedName("receiver_id")
    @Expose
    private String receiverId;
    @SerializedName("receiver_name")
    @Expose
    private String receiverName;
    @SerializedName("receiver_avatar")
    @Expose
    private String receiverAvatar;
    @SerializedName("sender_id")
    @Expose
    private String senderId;
    @SerializedName("sender_name")
    @Expose
    private String senderName;
    @SerializedName("sender_avatar")
    @Expose
    private String senderAvatar;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    /**
     * No args constructor for use in serialization
     * 
     */
    public InstantMessage() {
    }

    /**
     * 
     * @param updatedAt
     * @param id
     * @param body
     * @param senderAvatar
     * @param senderName
     * @param receiverAvatar
     * @param receiverId
     * @param inboxId
     * @param createdAt
     * @param receiverName
     * @param read
     * @param senderId
     */
    public InstantMessage(String id, String body, String createdAt, String inboxId, Boolean read, String receiverId, String receiverName, String receiverAvatar, String senderId, String senderName, String senderAvatar, String updatedAt) {
        super();
        this.id = id;
        this.body = body;
        this.createdAt = createdAt;
        this.inboxId = inboxId;
        this.read = read;
        this.receiverId = receiverId;
        this.receiverName = receiverName;
        this.receiverAvatar = receiverAvatar;
        this.senderId = senderId;
        this.senderName = senderName;
        this.senderAvatar = senderAvatar;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getInboxId() {
        return inboxId;
    }

    public void setInboxId(String inboxId) {
        this.inboxId = inboxId;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAvatar() {
        return receiverAvatar;
    }

    public void setReceiverAvatar(String receiverAvatar) {
        this.receiverAvatar = receiverAvatar;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderAvatar() {
        return senderAvatar;
    }

    public void setSenderAvatar(String senderAvatar) {
        this.senderAvatar = senderAvatar;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}
