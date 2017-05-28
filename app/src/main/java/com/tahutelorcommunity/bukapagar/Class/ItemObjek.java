package com.tahutelorcommunity.bukapagar.Class;

/**
 * Created by QQ on 5/18/2017.
 */

public class ItemObjek {
    private String name, alamat;
    private int photo;

    public ItemObjek(String name, String alamat, int photo) {
        this.name = name;
        this.photo = photo;
        this.alamat=alamat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}