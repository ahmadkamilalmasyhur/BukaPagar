package com.tahutelorcommunity.bukapagar.Utils;


import android.util.Base64;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;


/**
 * Created by Kevin on 6/22/2016.
 */
public class GsonHelper {

    private static Gson gson = new GsonBuilder().setDateFormat("ddMMyyyyHHmmss").registerTypeHierarchyAdapter(byte[].class,
            new GsonHelper.ByteArrayToBase64TypeAdapter()).create();

    public static class ByteArrayToBase64TypeAdapter implements JsonSerializer<byte[]>, JsonDeserializer<byte[]> {
        public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            return Base64.decode(json.getAsString(), Base64.DEFAULT);
        }

        public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
            return new JsonPrimitive(new String(Base64.encode(src, Base64.DEFAULT)));
        }
    }

    public static <T> T fromJson(String json, Class<T> classOfT) {
        if (gson == null) {
            gson = new GsonBuilder().setDateFormat("ddMMyyyyHHmmss").registerTypeHierarchyAdapter(byte[].class,
                    new GsonHelper.ByteArrayToBase64TypeAdapter()).create();
        }
        return gson.fromJson(json, classOfT);
    }


    public static String toJson(Object src) {
        if (gson == null) {
            gson = new GsonBuilder().setDateFormat("ddMMyyyyHHmmss").registerTypeHierarchyAdapter(byte[].class,
                    new GsonHelper.ByteArrayToBase64TypeAdapter()).create();
        }
        return gson.toJson(src);
    }


}
