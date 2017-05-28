package com.tahutelorcommunity.bukapagar.Model.Products.CreateProductRequest;

/**
 * Created by Fikry-PC on 5/26/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Product {

    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("new")
    @Expose
    private String _new;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("negotiable")
    @Expose
    private String negotiable;
    @SerializedName("weight")
    @Expose
    private String weight;
    @SerializedName("stock")
    @Expose
    private String stock;
    @SerializedName("description_bb")
    @Expose
    private String descriptionBb;
    @SerializedName("free_shipping")
    @Expose
    private List<Integer> freeShipping = null;
    @SerializedName("product_detail_attributes")
    @Expose
    private ProductDetailAttributes productDetailAttributes;

    /**
     * No args constructor for use in serialization
     *
     */
    public Product() {
    }

    /**
     *
     * @param stock
     * @param weight
     * @param price
     * @param freeShipping
     * @param descriptionBb
     * @param negotiable
     * @param name
     * @param categoryId
     * @param _new
     * @param productDetailAttributes
     */
    public Product(String categoryId, String name, String _new, String price, String negotiable, String weight, String stock, String descriptionBb, List<Integer> freeShipping, ProductDetailAttributes productDetailAttributes) {
        super();
        this.categoryId = categoryId;
        this.name = name;
        this._new = _new;
        this.price = price;
        this.negotiable = negotiable;
        this.weight = weight;
        this.stock = stock;
        this.descriptionBb = descriptionBb;
        this.freeShipping = freeShipping;
        this.productDetailAttributes = productDetailAttributes;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNew() {
        return _new;
    }

    public void setNew(String _new) {
        this._new = _new;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNegotiable() {
        return negotiable;
    }

    public void setNegotiable(String negotiable) {
        this.negotiable = negotiable;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getDescriptionBb() {
        return descriptionBb;
    }

    public void setDescriptionBb(String descriptionBb) {
        this.descriptionBb = descriptionBb;
    }

    public List<Integer> getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(List<Integer> freeShipping) {
        this.freeShipping = freeShipping;
    }

    public ProductDetailAttributes getProductDetailAttributes() {
        return productDetailAttributes;
    }

    public void setProductDetailAttributes(ProductDetailAttributes productDetailAttributes) {
        this.productDetailAttributes = productDetailAttributes;
    }

}