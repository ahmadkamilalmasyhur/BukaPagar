
package com.tahutelorcommunity.bukapagar.Model.Invoices.RequestInvoice;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TransactionsAttribute {

    @SerializedName("seller_id")
    @Expose
    private Integer sellerId;
    @SerializedName("courier")
    @Expose
    private String courier;
    @SerializedName("buyer_notes")
    @Expose
    private String buyerNotes;
    @SerializedName("item_ids")
    @Expose
    private List<Integer> itemIds = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TransactionsAttribute() {
    }

    /**
     * 
     * @param itemIds
     * @param sellerId
     * @param courier
     * @param buyerNotes
     */
    public TransactionsAttribute(Integer sellerId, String courier, String buyerNotes, List<Integer> itemIds) {
        super();
        this.sellerId = sellerId;
        this.courier = courier;
        this.buyerNotes = buyerNotes;
        this.itemIds = itemIds;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getCourier() {
        return courier;
    }

    public void setCourier(String courier) {
        this.courier = courier;
    }

    public String getBuyerNotes() {
        return buyerNotes;
    }

    public void setBuyerNotes(String buyerNotes) {
        this.buyerNotes = buyerNotes;
    }

    public List<Integer> getItemIds() {
        return itemIds;
    }

    public void setItemIds(List<Integer> itemIds) {
        this.itemIds = itemIds;
    }

}
