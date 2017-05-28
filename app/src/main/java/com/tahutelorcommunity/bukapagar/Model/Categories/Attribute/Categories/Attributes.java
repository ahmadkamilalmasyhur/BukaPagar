
package com.tahutelorcommunity.bukapagar.Model.Categories.Attribute.Categories;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Attributes {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("attributes")
    @Expose
    private List<Attribute> attributes = null;
    @SerializedName("variants")
    @Expose
    private List<Variant> variants = null;
    @SerializedName("message")
    @Expose
    private Object message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attributes() {
    }

    /**
     * 
     * @param message
     * @param status
     * @param variants
     * @param attributes
     */
    public Attributes(String status, List<Attribute> attributes, List<Variant> variants, Object message) {
        super();
        this.status = status;
        this.attributes = attributes;
        this.variants = variants;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public void setVariants(List<Variant> variants) {
        this.variants = variants;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

}
