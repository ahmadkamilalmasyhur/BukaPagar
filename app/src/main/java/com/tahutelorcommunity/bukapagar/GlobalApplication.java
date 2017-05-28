package com.tahutelorcommunity.bukapagar;

import android.app.Application;

import com.tahutelorcommunity.bukapagar.Model.Local.User;
import com.tahutelorcommunity.bukapagar.Service.LocationTrackingManager;

/**
 * Created by Farizko on 27-May-17.
 */

public class GlobalApplication extends Application {
    private static GlobalApplication reference;
    public static LocationTrackingManager ltm;
    private User userLogin;
    @Override
    public void onCreate() {
        super.onCreate();
        if(null == userLogin){
            userLogin = new User();
        }
        if (null == ltm){
            ltm = new LocationTrackingManager(getApplicationContext());
        }
        reference = this;
    }

    public static GlobalApplication getReference() {
        return reference;
    }

    public User getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(User userLogin) {
        this.userLogin = userLogin;
    }

    public static LocationTrackingManager getLtm() {
        return ltm;
    }
}
