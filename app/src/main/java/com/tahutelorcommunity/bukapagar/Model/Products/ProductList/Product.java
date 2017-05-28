
package com.tahutelorcommunity.bukapagar.Model.Products.ProductList;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Product {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("promo_due")
    @Expose
    private Object promoDue;
    @SerializedName("banner")
    @Expose
    private Object banner;
    @SerializedName("products")
    @Expose
    private List<Product_> products = null;
    @SerializedName("categories")
    @Expose
    private List<Object> categories = null;
    @SerializedName("message")
    @Expose
    private Object message;
    @SerializedName("facets")
    @Expose
    private List<Object> facets = null;
    @SerializedName("labels")
    @Expose
    private Object labels;
    @SerializedName("related_keywords")
    @Expose
    private Object relatedKeywords;
    @SerializedName("recommended_products")
    @Expose
    private List<Object> recommendedProducts = null;
    @SerializedName("product_deeplink")
    @Expose
    private Object productDeeplink;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param message
     * @param recommendedProducts
     * @param status
     * @param labels
     * @param facets
     * @param relatedKeywords
     * @param categories
     * @param products
     * @param promoDue
     * @param productDeeplink
     * @param banner
     */
    public Product(String status, Object promoDue, Object banner, List<Product_> products, List<Object> categories, Object message, List<Object> facets, Object labels, Object relatedKeywords, List<Object> recommendedProducts, Object productDeeplink) {
        super();
        this.status = status;
        this.promoDue = promoDue;
        this.banner = banner;
        this.products = products;
        this.categories = categories;
        this.message = message;
        this.facets = facets;
        this.labels = labels;
        this.relatedKeywords = relatedKeywords;
        this.recommendedProducts = recommendedProducts;
        this.productDeeplink = productDeeplink;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getPromoDue() {
        return promoDue;
    }

    public void setPromoDue(Object promoDue) {
        this.promoDue = promoDue;
    }

    public Object getBanner() {
        return banner;
    }

    public void setBanner(Object banner) {
        this.banner = banner;
    }

    public List<Product_> getProducts() {
        return products;
    }

    public void setProducts(List<Product_> products) {
        this.products = products;
    }

    public List<Object> getCategories() {
        return categories;
    }

    public void setCategories(List<Object> categories) {
        this.categories = categories;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public List<Object> getFacets() {
        return facets;
    }

    public void setFacets(List<Object> facets) {
        this.facets = facets;
    }

    public Object getLabels() {
        return labels;
    }

    public void setLabels(Object labels) {
        this.labels = labels;
    }

    public Object getRelatedKeywords() {
        return relatedKeywords;
    }

    public void setRelatedKeywords(Object relatedKeywords) {
        this.relatedKeywords = relatedKeywords;
    }

    public List<Object> getRecommendedProducts() {
        return recommendedProducts;
    }

    public void setRecommendedProducts(List<Object> recommendedProducts) {
        this.recommendedProducts = recommendedProducts;
    }

    public Object getProductDeeplink() {
        return productDeeplink;
    }

    public void setProductDeeplink(Object productDeeplink) {
        this.productDeeplink = productDeeplink;
    }

}
