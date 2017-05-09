package com.tahutelorcommunity.bukapagar.Model;

import java.util.List;

/**
 * Created by Farizko on 06-May-17.
 */

public class Categories {
    int id;
    String name;
    String url;
    List<CategoryChildren> children;

    public Categories() {
    }

    public Categories(int id, String name, String url, List<CategoryChildren> children) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.children = children;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public List<CategoryChildren> getChildren() {
        return children;
    }

    public void setChildren(List<CategoryChildren> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", children=" + children.toString() +
                '}';
    }
}
