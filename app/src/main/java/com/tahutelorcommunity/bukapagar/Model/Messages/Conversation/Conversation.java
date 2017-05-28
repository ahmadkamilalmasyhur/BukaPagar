
package com.tahutelorcommunity.bukapagar.Model.Messages.Conversation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Conversation {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("instant_messages")
    @Expose
    private List<InstantMessage> instantMessages = null;
    @SerializedName("message")
    @Expose
    private Object message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Conversation() {
    }

    /**
     * 
     * @param message
     * @param status
     * @param instantMessages
     */
    public Conversation(String status, List<InstantMessage> instantMessages, Object message) {
        super();
        this.status = status;
        this.instantMessages = instantMessages;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<InstantMessage> getInstantMessages() {
        return instantMessages;
    }

    public void setInstantMessages(List<InstantMessage> instantMessages) {
        this.instantMessages = instantMessages;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

}
