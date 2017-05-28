
package com.tahutelorcommunity.bukapagar.Model.Users.UserId.Products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Products {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("userProducts")
    @Expose
    private List<UserProduct> userProducts = null;
    @SerializedName("message")
    @Expose
    private Object message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Products() {
    }

    /**
     * 
     * @param message
     * @param status
     * @param userProducts
     */
    public Products(String status, List<UserProduct> userProducts, Object message) {
        super();
        this.status = status;
        this.userProducts = userProducts;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<UserProduct> getUserProducts() {
        return userProducts;
    }

    public void setUserProducts(List<UserProduct> userProducts) {
        this.userProducts = userProducts;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

}
