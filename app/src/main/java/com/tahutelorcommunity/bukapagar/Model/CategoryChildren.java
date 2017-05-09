package com.tahutelorcommunity.bukapagar.Model;

import java.util.List;

/**
 * Created by Farizko on 06-May-17.
 */

public class CategoryChildren {
    String id;
    String name;
    String url;
    List<CategoryChildrenChildren> categoryChildrenChildrens;

    public CategoryChildren() {
    }

    public CategoryChildren(String id, String name, String url, List<CategoryChildrenChildren> categoryChildrenChildrens) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.categoryChildrenChildrens = categoryChildrenChildrens;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<CategoryChildrenChildren> getCategoryChildrenChildrens() {
        return categoryChildrenChildrens;
    }

    public void setCategoryChildrenChildrens(List<CategoryChildrenChildren> categoryChildrenChildrens) {
        this.categoryChildrenChildrens = categoryChildrenChildrens;
    }

    @Override
    public String toString() {
        return "CategoryChildren{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", categoryChildrenChildrens=" + categoryChildrenChildrens +
                '}';
    }
}
