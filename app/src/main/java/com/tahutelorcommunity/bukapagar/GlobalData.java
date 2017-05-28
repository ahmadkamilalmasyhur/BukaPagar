package com.tahutelorcommunity.bukapagar;

import com.tahutelorcommunity.bukapagar.Model.Authenticate.Login.User;
import com.tahutelorcommunity.bukapagar.Model.Categories.Categories;

/**
 * Created by Farizko on 06-May-17.
 */

public class GlobalData {
    public static final String service_path = "https://api.bukalapak.com/v2/";
    public static final String auth = "authenticate.json";
    public static final String google_login = "google_login.json";
    public static final String facebook_login = "facebook_loginv2.json";
    public static final String all_categories = "categories.json";
    public static User userLogin;
    public static Categories allCategories;
}
