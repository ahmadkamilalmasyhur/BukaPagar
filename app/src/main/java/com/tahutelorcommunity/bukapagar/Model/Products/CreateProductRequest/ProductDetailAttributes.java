package com.tahutelorcommunity.bukapagar.Model.Products.CreateProductRequest;

/**
 * Created by Fikry-PC on 5/26/2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductDetailAttributes {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("bahan")
    @Expose
    private String ukuran;
    @SerializedName("ukuran")
    @Expose
    private String bahan;
    @SerializedName("referer")
    @Expose
    private String referer;

    /**
     * No args constructor for use in serialization
     *
     */
    public ProductDetailAttributes() {
    }

    /**
     *
     * @param brand
     * @param referer
     * @param bahan
     * @param type
     */
    public ProductDetailAttributes(String type, String brand,String ukuran, String bahan, String referer) {
        super();
        this.type = type;
        this.brand = brand;
        this.bahan = bahan;
        this.referer = referer;
        this.ukuran = ukuran;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

}