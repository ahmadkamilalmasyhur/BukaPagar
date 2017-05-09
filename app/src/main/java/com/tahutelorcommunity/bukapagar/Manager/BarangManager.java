package com.tahutelorcommunity.bukapagar.Manager;

import android.util.Base64;
import android.util.Log;

import com.tahutelorcommunity.bukapagar.GlobalData;
import com.tahutelorcommunity.bukapagar.Model.AllCategories;
import com.tahutelorcommunity.bukapagar.Utils.GsonHelper;
import com.tahutelorcommunity.bukapagar.Utils.HTTPRequest;

/**
 * Created by Farizko on 06-May-17.
 */

public class BarangManager {
    public String getBarangBarang(String username, String token) {
        String encoded = Base64.encodeToString((username + ":" + token).getBytes(), Base64.NO_WRAP);  //Java 8
        String jsonResponse = HTTPRequest.BaseAuthGet(GlobalData.service_path + GlobalData.all_categories, encoded);
        Log.d("UserManager", "jsonResponse : " + jsonResponse);
        AllCategories allCategories = GsonHelper.fromJson(jsonResponse, AllCategories.class);
        GlobalData.allCategories = allCategories;
        System.out.println(allCategories.toString());
        if (allCategories.getMessage()!=null) {
            return allCategories.getMessage();
        } else {
            return "success";
        }
    }
}
