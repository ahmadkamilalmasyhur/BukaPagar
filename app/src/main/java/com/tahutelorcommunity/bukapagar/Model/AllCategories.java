package com.tahutelorcommunity.bukapagar.Model;

import java.util.List;

/**
 * Created by Farizko on 06-May-17.
 */

public class AllCategories extends Response {
    List<Categories> categories;

    public AllCategories() {
    }

    public AllCategories(List<Categories> categories) {
        this.categories = categories;
    }

    public List<Categories> getCategories() {
        return categories;
    }

    public void setCategories(List<Categories> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return "AllCategories{" +
                "categories=" + categories.toString() +
                '}';
    }
}
