package com.tahutelorcommunity.bukapagar.Utils;

import android.content.Context;

import com.tahutelorcommunity.bukapagar.Model.Authenticate.Login.User;

/**
 * Created by Farizko on 27-May-17.
 */

public class DbManager {
    public static void insertUser(Context context, User user){
        final DbHandler dbHandler = new DbHandler(context);
        dbHandler.addUser(user);
    }

    public static void updateUser(Context context, User user){
        final DbHandler dbHandler = new DbHandler(context);
        dbHandler.updateUser(user);
    }

    public static void deleteUser(Context context, User user){
        final DbHandler dbHandler = new DbHandler(context);
        dbHandler.deleteUser(user.getUserId().toString());
    }

    public static void updateLocation(Context context, String lat, String lng){
        final DbHandler dbHandler = new DbHandler(context);
        com.tahutelorcommunity.bukapagar.Model.Local.User user = getOneUser(context);
        user.setLatitude(lat);
        user.setLongitude(lng);
        dbHandler.updateLocation(user);
    }

    public static com.tahutelorcommunity.bukapagar.Model.Local.User getOneUser(Context context){
        final DbHandler dbHandler = new DbHandler(context);
        try {
           return dbHandler.getAllUser().get(0);
        } catch (Exception e){
            return null;
        }
    }
}
