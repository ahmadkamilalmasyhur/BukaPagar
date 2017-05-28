package com.tahutelorcommunity.bukapagar.Utils;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

import com.tahutelorcommunity.bukapagar.Model.Authenticate.Login.User;

import java.util.ArrayList;
import java.util.List;

import static com.tahutelorcommunity.bukapagar.Utils.DbContract.PAPBL._CONFIRMED;
import static com.tahutelorcommunity.bukapagar.Utils.DbContract.PAPBL._DATABASE_VERSION;
import static com.tahutelorcommunity.bukapagar.Utils.DbContract.PAPBL._EMAIL;
import static com.tahutelorcommunity.bukapagar.Utils.DbContract.PAPBL._LAT;
import static com.tahutelorcommunity.bukapagar.Utils.DbContract.PAPBL._LNG;
import static com.tahutelorcommunity.bukapagar.Utils.DbContract.PAPBL._TABLE_USER;
import static com.tahutelorcommunity.bukapagar.Utils.DbContract.PAPBL._TOKEN;
import static com.tahutelorcommunity.bukapagar.Utils.DbContract.PAPBL._USERNAME;
import static com.tahutelorcommunity.bukapagar.Utils.DbContract.PAPBL._USER_ID;

/**
 * Created by MuhammadAminul on 3/6/2017.
 */

public class DbHandler extends SQLiteOpenHelper {

    private Context context;
    private static final String CREATE_TABLE_MAHASISWA = "CREATE TABLE " + _TABLE_USER +
            "(" + _EMAIL + " VARCHAR(255) , "
            + _TOKEN + " VARCHAR(255) , "
            + _USER_ID + " VARCHAR(255) , "
            + _USERNAME + " VARCHAR(255) , "
            + _CONFIRMED + " INTEGER DEFAULT 0 , "
            + _LAT + " VARCHAR DEFAULT 0 , "
            + _LNG + " VARCHAR DEFAULT 0)";
    private static final String DROP_TABLE_MAHASISWA = "DROP TABLE  IF EXISTS " + _TABLE_USER;
    private static final String selectMahasiswaQuery = "SELECT * FROM " + _TABLE_USER;
    private static final String updateMahasiswaQuery = "UPDATE " + _TABLE_USER + " SET ";


    public DbHandler(Context context) {
        super(context, _TABLE_USER, null, _DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(CREATE_TABLE_MAHASISWA);
        } catch (SQLiteException e) {
        }
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try {
            db.execSQL(DROP_TABLE_MAHASISWA);
            onCreate(db);
        } catch (SQLiteException e) {
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try {
            db.execSQL(DROP_TABLE_MAHASISWA);
            onCreate(db);
        } catch (SQLiteException e) {
        }
    }

    public void addUser(User user) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(_EMAIL, user.getEmail()); // Shop Name
        values.put(_TOKEN, user.getToken());// Shop Phone Number
        values.put(_USER_ID, user.getUserId());
        values.put(_USERNAME, user.getUserName());
        values.put(_CONFIRMED, (user.getConfirmed() == true ? 1 : 0));
        values.put(_LAT, 0);
        values.put(_LNG, 0);
// Inserting Row
        db.insert(_TABLE_USER, null, values);
        db.close(); // Closing database connection
    }

    public void updateUser(User user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(_EMAIL, user.getEmail()); // Shop Name
        values.put(_TOKEN, user.getToken());// Shop Phone Number
        values.put(_USER_ID, user.getUserId());
        values.put(_USERNAME, user.getUserName());
        values.put(_CONFIRMED, (user.getConfirmed() == true ? 1 : 0));
        values.put(_LAT, 0);
        values.put(_LNG, 0);
        db.update(_TABLE_USER, values, _USER_ID + " =?", new String[]{String.valueOf(user.getUserId())});
        db.close();
    }

    public void updateLocation(com.tahutelorcommunity.bukapagar.Model.Local.User user){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(_EMAIL, user.getEmail()); // Shop Name
        values.put(_TOKEN, user.getToken());// Shop Phone Number
        values.put(_USER_ID, user.getUserId());
        values.put(_USERNAME, user.getUserName());
        values.put(_CONFIRMED, user.getConfirmed());
        values.put(_LAT, user.getLatitude());
        values.put(_LNG, user.getLongitude());
        db.update(_TABLE_USER, values, _USER_ID + " =?", new String[]{String.valueOf(user.getUserId())});
        db.close();
    }

    // Deleting a siswa
    public void deleteUser(String userId) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(_TABLE_USER, _USER_ID + "=?",
                new String[]{String.valueOf(userId)}
        );
        db.close();
    }

    public List<com.tahutelorcommunity.bukapagar.Model.Local.User> getAllUser() {
        List<com.tahutelorcommunity.bukapagar.Model.Local.User> userList = new ArrayList<>();

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectMahasiswaQuery, null);
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                com.tahutelorcommunity.bukapagar.Model.Local.User user = new com.tahutelorcommunity.bukapagar.Model.Local.User();

                user.setEmail(cursor.getString(0));
                user.setToken(cursor.getString(1));
                user.setUserId(cursor.getString(2));
                user.setUserName(cursor.getString(3));
                user.setConfirmed(cursor.getString(4));
                user.setLatitude(cursor.getString(5));
                user.setLongitude(cursor.getString(6));
                // Adding siswa to list
                userList.add(user);
            } while (cursor.moveToNext());
        }
// return contact list
        return userList;
    }

}
