
package com.tahutelorcommunity.bukapagar.Model.Products.ReadProduct;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("product")
    @Expose
    private Product_ product;
    @SerializedName("message")
    @Expose
    private Object message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param message
     * @param product
     * @param status
     */
    public Product(String status, Product_ product, Object message) {
        super();
        this.status = status;
        this.product = product;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Product_ getProduct() {
        return product;
    }

    public void setProduct(Product_ product) {
        this.product = product;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

}
