
package com.tahutelorcommunity.bukapagar.Model.Categories;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Child {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("children")
    @Expose
    private List<Child_> children = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Child() {
    }

    /**
     * 
     * @param id
     * @param name
     * @param children
     * @param url
     */
    public Child(Integer id, String name, String url, List<Child_> children) {
        super();
        this.id = id;
        this.name = name;
        this.url = url;
        this.children = children;
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

    public List<Child_> getChildren() {
        return children;
    }

    public void setChildren(List<Child_> children) {
        this.children = children;
    }

}
