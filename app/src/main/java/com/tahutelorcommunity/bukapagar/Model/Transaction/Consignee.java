
package com.tahutelorcommunity.bukapagar.Model.Transaction;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Consignee {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("area")
    @Expose
    private String area;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("province")
    @Expose
    private String province;
    @SerializedName("post_code")
    @Expose
    private String postCode;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Consignee() {
    }

    /**
     * 
     * @param phone
     * @param area
     * @param address
     * @param name
     * @param postCode
     * @param province
     * @param city
     */
    public Consignee(String name, String phone, String address, String area, String city, String province, String postCode) {
        super();
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.area = area;
        this.city = city;
        this.province = province;
        this.postCode = postCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

}
