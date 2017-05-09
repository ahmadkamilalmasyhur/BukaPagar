package com.tahutelorcommunity.bukapagar.Model;

/**
 * Created by Farizko on 06-May-17.
 */

public class User extends Response{
    data data;
    int user_id;
    String user_name;
    boolean confirmed;
    String token;
    String email;
    String omnikey;

    public User() {

    }

    public User(data data, int user_id, String user_name, boolean confirmed, String token, String email, String omnikey) {
        this.data = data;
        this.user_id = user_id;
        this.user_name = user_name;
        this.confirmed = confirmed;
        this.token = token;
        this.email = email;
        this.omnikey = omnikey;
    }

    public data getData() {
        return data;
    }

    public void setData(data data) {
        this.data = data;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOmnikey() {
        return omnikey;
    }

    public void setOmnikey(String omnikey) {
        this.omnikey = omnikey;
    }

    @Override
    public String toString() {
        return "User{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", confirmed=" + confirmed +
                ", token='" + token + '\'' +
                ", email='" + email + '\'' +
                ", omnikey='" + omnikey + '\'' +
                '}';
    }
}
