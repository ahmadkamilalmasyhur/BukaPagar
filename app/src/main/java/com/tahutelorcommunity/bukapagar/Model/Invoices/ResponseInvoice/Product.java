
package com.tahutelorcommunity.bukapagar.Model.Invoices.ResponseInvoice;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image_ids")
    @Expose
    private List<Integer> imageIds = null;
    @SerializedName("images")
    @Expose
    private List<String> images = null;
    @SerializedName("small_images")
    @Expose
    private List<String> smallImages = null;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("order_quantity")
    @Expose
    private Integer orderQuantity;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    /**
     * 
     * @param id
     * @param price
     * @param smallImages
     * @param name
     * @param images
     * @param orderQuantity
     * @param url
     * @param imageIds
     */
    public Product(String id, String url, String name, List<Integer> imageIds, List<String> images, List<String> smallImages, Integer price, Integer orderQuantity) {
        super();
        this.id = id;
        this.url = url;
        this.name = name;
        this.imageIds = imageIds;
        this.images = images;
        this.smallImages = smallImages;
        this.price = price;
        this.orderQuantity = orderQuantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getImageIds() {
        return imageIds;
    }

    public void setImageIds(List<Integer> imageIds) {
        this.imageIds = imageIds;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<String> getSmallImages() {
        return smallImages;
    }

    public void setSmallImages(List<String> smallImages) {
        this.smallImages = smallImages;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Integer orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

}
