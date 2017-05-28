
package com.tahutelorcommunity.bukapagar.Model.Categories;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Child_ {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Child_() {
    }

    /**
     * 
     * @param id
     * @param name
     * @param url
     */
    public Child_(Integer id, String name, String url) {
        super();
        this.id = id;
        this.name = name;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
