
package com.tahutelorcommunity.bukapagar.Model.Carts.Carts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("stock")
    @Expose
    private Integer stock;
    @SerializedName("message")
    @Expose
    private Object message;
    @SerializedName("product")
    @Expose
    private Product product;
    @SerializedName("original_price")
    @Expose
    private Integer originalPrice;
    @SerializedName("discount_price")
    @Expose
    private Object discountPrice;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Item() {
    }

    /**
     * 
     * @param product
     * @param message
     * @param id
     * @param stock
     * @param price
     * @param originalPrice
     * @param name
     * @param discountPrice
     * @param quantity
     */
    public Item(Integer id, String name, Integer quantity, Integer price, Integer stock, Object message, Product product, Integer originalPrice, Object discountPrice) {
        super();
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.stock = stock;
        this.message = message;
        this.product = product;
        this.originalPrice = originalPrice;
        this.discountPrice = discountPrice;
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Object getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Object discountPrice) {
        this.discountPrice = discountPrice;
    }

}
