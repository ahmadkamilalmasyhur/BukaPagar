
package com.tahutelorcommunity.bukapagar.Model.Products.CreateProductResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductsCreate {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("product_detail")
    @Expose
    private ProductDetail productDetail;
    @SerializedName("message")
    @Expose
    private String message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ProductsCreate() {
    }

    /**
     * 
     * @param message
     * @param id
     * @param productDetail
     * @param status
     */
    public ProductsCreate(String status, String id, ProductDetail productDetail, String message) {
        super();
        this.status = status;
        this.id = id;
        this.productDetail = productDetail;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProductDetail getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(ProductDetail productDetail) {
        this.productDetail = productDetail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
