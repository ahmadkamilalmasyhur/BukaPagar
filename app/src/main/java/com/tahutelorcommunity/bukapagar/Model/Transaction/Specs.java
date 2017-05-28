
package com.tahutelorcommunity.bukapagar.Model.Transaction;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Specs {

    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("screen_size")
    @Expose
    private String screenSize;
    @SerializedName("kapasitas_memory")
    @Expose
    private String kapasitasMemory;
    @SerializedName("kapasitas_hardisk")
    @Expose
    private String kapasitasHardisk;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Specs() {
    }

    /**
     * 
     * @param screenSize
     * @param brand
     * @param kapasitasMemory
     * @param kapasitasHardisk
     */
    public Specs(String brand, String screenSize, String kapasitasMemory, String kapasitasHardisk) {
        super();
        this.brand = brand;
        this.screenSize = screenSize;
        this.kapasitasMemory = kapasitasMemory;
        this.kapasitasHardisk = kapasitasHardisk;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getKapasitasMemory() {
        return kapasitasMemory;
    }

    public void setKapasitasMemory(String kapasitasMemory) {
        this.kapasitasMemory = kapasitasMemory;
    }

    public String getKapasitasHardisk() {
        return kapasitasHardisk;
    }

    public void setKapasitasHardisk(String kapasitasHardisk) {
        this.kapasitasHardisk = kapasitasHardisk;
    }

}
