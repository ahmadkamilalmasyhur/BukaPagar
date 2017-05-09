package com.tahutelorcommunity.bukapagar.Utils;

import android.util.Log;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by bradhawk on 7/1/2016.
 */
public class HTTPRequest {

    public static String POSTRequest(String... params) throws IOException {
        HttpURLConnection conn = null;
        BufferedReader reader = null;
        StringBuffer stringBuffer = new StringBuffer();

        String line = "";
        String finalJSON = "";

        try {
            URL url = new URL(params[0]);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setConnectTimeout(30000);
            conn.setReadTimeout(30000);
            conn.connect();

            if (params.length > 1) {
                String json = params[1];
                OutputStream outputStream = new BufferedOutputStream(conn.getOutputStream());
                outputStream.write(json.getBytes());
                outputStream.flush();
            }

            InputStream inputStream = conn.getInputStream();
            reader = new BufferedReader(new InputStreamReader(inputStream));
            while ((line = reader.readLine()) != null) {
                stringBuffer.append(line);
            }
            finalJSON = stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return finalJSON;
    }

    public static String BaseAuthPost(String... params) {
        HttpURLConnection conn = null;
        BufferedReader reader = null;
        StringBuffer stringBuffer = new StringBuffer();

        String line = "";
        String finalJSON = "";

        String encoded = params[1];  //Java 8

        try {
            URL url = new URL(params[0]);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.addRequestProperty("Authorization", "Basic " + encoded);
            conn.setConnectTimeout(30000);
            conn.setReadTimeout(30000);

            conn.connect();

            if (params.length > 1) {
                String json = params[1];
                OutputStream outputStream = new BufferedOutputStream(conn.getOutputStream());
                outputStream.write(json.getBytes());
                outputStream.flush();
            }

            Log.d("HTTPRequest", "" + conn.getResponseCode());
            Log.d("HTTPRequest", "" + conn.getResponseMessage());

            InputStream inputStream = conn.getInputStream();
            reader = new BufferedReader(new InputStreamReader(inputStream));
            while ((line = reader.readLine()) != null) {
                stringBuffer.append(line);
            }
            finalJSON = stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                throw e;
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return finalJSON;
    }


    public static String BaseAuthGet(String... params) {
        HttpURLConnection conn = null;
        BufferedReader reader = null;
        StringBuffer stringBuffer = new StringBuffer();

        String line = "";
        String finalJSON = "";

        String encoded = params[1];  //Java 8

        try {
            URL url = new URL(params[0]);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.addRequestProperty("Authorization", "Basic " + encoded);
            conn.setConnectTimeout(30000);
            conn.setReadTimeout(30000);

            conn.connect();

            Log.d("HTTPRequest", "" + conn.getResponseCode());
            Log.d("HTTPRequest", "" + conn.getResponseMessage());

            InputStream inputStream = conn.getInputStream();
            reader = new BufferedReader(new InputStreamReader(inputStream));
            while ((line = reader.readLine()) != null) {
                stringBuffer.append(line);
            }
            finalJSON = stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                throw e;
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return finalJSON;
    }

}
