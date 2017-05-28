package com.tahutelorcommunity.bukapagar.Model.Products.CreateProductRequest;

/**
 * Created by Fikry-PC on 5/26/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreateRequest {

    @SerializedName("product")
    @Expose
    private Product product;
    @SerializedName("images")
    @Expose
    private String images;
    @SerializedName("force_insurance")
    @Expose
    private String forceInsurance;

    /**
     * No args constructor for use in serialization
     *
     */
    public CreateRequest() {
    }

    /**
     *
     * @param product
     * @param forceInsurance
     * @param images
     */
    public CreateRequest(Product product, String images, String forceInsurance) {
        super();
        this.product = product;
        this.images = images;
        this.forceInsurance = forceInsurance;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getForceInsurance() {
        return forceInsurance;
    }

    public void setForceInsurance(String forceInsurance) {
        this.forceInsurance = forceInsurance;
    }

}