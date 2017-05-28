
package com.tahutelorcommunity.bukapagar.Model.Users.Info;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("province")
    @Expose
    private Object province;
    @SerializedName("city")
    @Expose
    private Object city;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Address() {
    }

    /**
     * 
     * @param province
     * @param city
     */
    public Address(Object province, Object city) {
        super();
        this.province = province;
        this.city = city;
    }

    public Object getProvince() {
        return province;
    }

    public void setProvince(Object province) {
        this.province = province;
    }

    public Object getCity() {
        return city;
    }

    public void setCity(Object city) {
        this.city = city;
    }

}
