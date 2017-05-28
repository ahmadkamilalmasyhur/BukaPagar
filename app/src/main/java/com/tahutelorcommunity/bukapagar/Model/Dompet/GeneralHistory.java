package com.tahutelorcommunity.bukapagar.Model.Dompet;

/**
 * Created by devel on 28/05/2017.
 */

public class GeneralHistory {
    String saldotype;
    String saldoTanggal;
    int saldoHarga;
    int saldoID;

    public GeneralHistory(String saldotype, String saldoTanggal, int saldoHarga, int saldoID) {
        this.saldotype = saldotype;
        this.saldoTanggal = saldoTanggal;
        this.saldoHarga = saldoHarga;
        this.saldoID = saldoID;
    }

    public String getSaldotype() {
        return saldotype;
    }

    public void setSaldotype(String saldotype) {
        this.saldotype = saldotype;
    }

    public String getSaldoTanggal() {
        return saldoTanggal;
    }

    public void setSaldoTanggal(String saldoTanggal) {
        this.saldoTanggal = saldoTanggal;
    }

    public int getSaldoHarga() {
        return saldoHarga;
    }

    public void setSaldoHarga(int saldoHarga) {
        this.saldoHarga = saldoHarga;
    }

    public int getSaldoID() {
        return saldoID;
    }

    public void setSaldoID(int saldoID) {
        this.saldoID = saldoID;
    }
}
