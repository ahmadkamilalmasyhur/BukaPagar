
package com.tahutelorcommunity.bukapagar.Model.Carts.Carts;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddToCart {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("cart_id")
    @Expose
    private Integer cartId;
    @SerializedName("cart")
    @Expose
    private List<Cart> cart = null;
    @SerializedName("message")
    @Expose
    private String message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AddToCart() {
    }

    /**
     * 
     * @param message
     * @param status
     * @param cart
     * @param cartId
     */
    public AddToCart(String status, Integer cartId, List<Cart> cart, String message) {
        super();
        this.status = status;
        this.cartId = cartId;
        this.cart = cart;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public List<Cart> getCart() {
        return cart;
    }

    public void setCart(List<Cart> cart) {
        this.cart = cart;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
