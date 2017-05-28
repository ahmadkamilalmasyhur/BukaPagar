package com.tahutelorcommunity.bukapagar.Model.Penginapan;

/**
 * Created by Fikry-PC on 5/26/2017.
 */

public class Penginapan {
    String id, name, address, description;
    int capacity;
    Boolean ac, hotwater, breakfast, tv, wifi;
    Double lat, lng, nightlyrate;
    long timeUploaded;
    String userId;

    public Penginapan(String id, String name, String address, String description, int capacity, Boolean ac, Boolean hotwater, Boolean breakfast, Boolean tv, Boolean wifi, Double lat, Double lng, Double nightlyrate, long timeUploaded, String userId) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.description = description;
        this.capacity = capacity;
        this.ac = ac;
        this.hotwater = hotwater;
        this.breakfast = breakfast;
        this.tv = tv;
        this.wifi = wifi;
        this.lat = lat;
        this.lng = lng;
        this.nightlyrate = nightlyrate;
        this.timeUploaded = timeUploaded;
        this.userId = userId;
    }

    public Penginapan() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Boolean getAc() {
        return ac;
    }

    public void setAc(Boolean ac) {
        this.ac = ac;
    }

    public Boolean getHotwater() {
        return hotwater;
    }

    public void setHotwater(Boolean hotwater) {
        this.hotwater = hotwater;
    }

    public Boolean getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Boolean breakfast) {
        this.breakfast = breakfast;
    }

    public Boolean getTv() {
        return tv;
    }

    public void setTv(Boolean tv) {
        this.tv = tv;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getNightlyrate() {
        return nightlyrate;
    }

    public void setNightlyrate(Double nightlyrate) {
        this.nightlyrate = nightlyrate;
    }

    public long getTimeUploaded() {
        return timeUploaded;
    }

    public void setTimeUploaded(long timeUploaded) {
        this.timeUploaded = timeUploaded;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
