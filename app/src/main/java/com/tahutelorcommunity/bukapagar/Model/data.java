package com.tahutelorcommunity.bukapagar.Model;

/**
 * Created by Farizko on 06-May-17.
 */

public class data {
    boolean tfa_status;

    public data() {
    }

    public data(boolean tfa_status) {
        this.tfa_status = tfa_status;
    }

    public boolean isTfa_status() {
        return tfa_status;
    }

    public void setTfa_status(boolean tfa_status) {
        this.tfa_status = tfa_status;
    }
}
