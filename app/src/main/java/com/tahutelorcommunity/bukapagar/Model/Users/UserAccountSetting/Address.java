
package com.tahutelorcommunity.bukapagar.Model.Users.UserAccountSetting;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("province")
    @Expose
    private Object province;
    @SerializedName("city")
    @Expose
    private Object city;
    @SerializedName("area")
    @Expose
    private Object area;
    @SerializedName("address")
    @Expose
    private Object address;
    @SerializedName("postal_code")
    @Expose
    private Object postalCode;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Address() {
    }

    /**
     * 
     * @param postalCode
     * @param area
     * @param address
     * @param province
     * @param city
     */
    public Address(Object province, Object city, Object area, Object address, Object postalCode) {
        super();
        this.province = province;
        this.city = city;
        this.area = area;
        this.address = address;
        this.postalCode = postalCode;
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

    public Object getArea() {
        return area;
    }

    public void setArea(Object area) {
        this.area = area;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Object getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Object postalCode) {
        this.postalCode = postalCode;
    }

}
