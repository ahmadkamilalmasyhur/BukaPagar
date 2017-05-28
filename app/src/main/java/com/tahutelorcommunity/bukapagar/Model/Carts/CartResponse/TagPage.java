
package com.tahutelorcommunity.bukapagar.Model.Carts.CartResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TagPage {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("has_landing_page")
    @Expose
    private Boolean hasLandingPage;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TagPage() {
    }

    /**
     * 
     * @param id
     * @param name
     * @param hasLandingPage
     */
    public TagPage(Integer id, String name, Boolean hasLandingPage) {
        super();
        this.id = id;
        this.name = name;
        this.hasLandingPage = hasLandingPage;
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

    public Boolean getHasLandingPage() {
        return hasLandingPage;
    }

    public void setHasLandingPage(Boolean hasLandingPage) {
        this.hasLandingPage = hasLandingPage;
    }

}
