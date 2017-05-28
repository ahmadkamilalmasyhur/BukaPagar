
package com.tahutelorcommunity.bukapagar.Model.Carts.CartResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Carts {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("cart_id")
    @Expose
    private Integer cartId;
    @SerializedName("cart")
    @Expose
    private List<Cart> cart = null;
    @SerializedName("accepted_nego")
    @Expose
    private AcceptedNego acceptedNego;
    @SerializedName("message")
    @Expose
    private String message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Carts() {
    }

    /**
     * 
     * @param message
     * @param status
     * @param cart
     * @param cartId
     * @param acceptedNego
     */
    public Carts(String status, Integer cartId, List<Cart> cart, AcceptedNego acceptedNego, String message) {
        super();
        this.status = status;
        this.cartId = cartId;
        this.cart = cart;
        this.acceptedNego = acceptedNego;
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

    public AcceptedNego getAcceptedNego() {
        return acceptedNego;
    }

    public void setAcceptedNego(AcceptedNego acceptedNego) {
        this.acceptedNego = acceptedNego;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
