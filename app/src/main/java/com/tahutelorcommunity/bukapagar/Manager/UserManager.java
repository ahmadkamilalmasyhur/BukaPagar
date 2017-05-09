package com.tahutelorcommunity.bukapagar.Manager;

import android.util.Base64;
import android.util.Log;

import com.tahutelorcommunity.bukapagar.GlobalData;
import com.tahutelorcommunity.bukapagar.Model.User;
import com.tahutelorcommunity.bukapagar.Utils.GsonHelper;
import com.tahutelorcommunity.bukapagar.Utils.HTTPRequest;

/**
 * Created by Farizko on 06-May-17.
 */

public class UserManager {
    public String doBasicAuth(String username, String password) {
        String encoded = Base64.encodeToString((username + ":" + password).getBytes(), Base64.NO_WRAP);  //Java 8
        String jsonResponse = HTTPRequest.BaseAuthPost(GlobalData.service_path + GlobalData.auth, encoded);
        Log.d("UserManager", "jsonResponse : " + jsonResponse);
        User user = GsonHelper.fromJson(jsonResponse, User.class);
        GlobalData.userLogin = user;
        System.out.println(user.toString());
        if (user.getStatus().equalsIgnoreCase("ERROR")) {
            return user.getMessage();
        } else {
            return "success";
        }
    }
}
