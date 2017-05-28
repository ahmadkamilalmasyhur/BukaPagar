
package com.tahutelorcommunity.bukapagar.Model.Messages.Inbox;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Message {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("unread")
    @Expose
    private Integer unread;
    @SerializedName("inbox")
    @Expose
    private List<Inbox> inbox = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Message() {
    }

    /**
     * 
     * @param status
     * @param inbox
     * @param unread
     */
    public Message(String status, Integer unread, List<Inbox> inbox) {
        super();
        this.status = status;
        this.unread = unread;
        this.inbox = inbox;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getUnread() {
        return unread;
    }

    public void setUnread(Integer unread) {
        this.unread = unread;
    }

    public List<Inbox> getInbox() {
        return inbox;
    }

    public void setInbox(List<Inbox> inbox) {
        this.inbox = inbox;
    }

}
