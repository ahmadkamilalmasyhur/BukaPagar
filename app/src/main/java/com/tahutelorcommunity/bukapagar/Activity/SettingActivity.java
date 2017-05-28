package com.tahutelorcommunity.bukapagar.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.tahutelorcommunity.bukapagar.Manager.SessionManager;
import com.tahutelorcommunity.bukapagar.Model.Local.User;
import com.tahutelorcommunity.bukapagar.R;
import com.tahutelorcommunity.bukapagar.Utils.DbHandler;

/**
 * Created by Farizko on 27-May-17.
 */

public class SettingActivity extends AppCompatActivity {
    LinearLayout logout, ubahProfil, akun, privasi, saldo, isiUlang, riwayat;

    Toolbar toolbar;
    private final String TAG = "SaldoActivity";
    SessionManager session;
    User userLogin;

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        session = new SessionManager(this);
        final DbHandler dbHandler = new DbHandler(getApplicationContext());
        try {
            userLogin = dbHandler.getAllUser().get(0);
        } catch (Exception e) {
            session.checkLogin();
            e.printStackTrace();
        }

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            toolbar.setTitle("Setting");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }
        session = new SessionManager(this);
        ubahProfil = (LinearLayout) findViewById(R.id.setting_layout_ubah_profil);
        ubahProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SettingActivity.this, "Segera Tersedia", Toast.LENGTH_SHORT).show();
            }
        });
        akun = (LinearLayout) findViewById(R.id.setting_layout_akun);
        akun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SettingActivity.this, ProfileActivity.class));
            }
        });
        privasi = (LinearLayout) findViewById(R.id.setting_layout_privasi);
        privasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SettingActivity.this, "Segera Tersedia", Toast.LENGTH_SHORT).show();
            }
        });
        saldo = (LinearLayout) findViewById(R.id.setting_layout_saldo);
        saldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, SaldoActivity.class);
                startActivity(intent);
            }
        });
        isiUlang = (LinearLayout) findViewById(R.id.setting_layout_isi_ulang);
        isiUlang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, TambahSaldoActivity.class);
                startActivity(intent);
            }
        });
        riwayat = (LinearLayout) findViewById(R.id.setting_layout_riwayat);
        riwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingActivity.this, SaldoActivity.class);
                startActivity(intent);
            }
        });
        logout = (LinearLayout) findViewById(R.id.setting_layout_logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    final DbHandler dbHandler = new DbHandler(getApplicationContext());
                    dbHandler.deleteUser(userLogin.getUserId());
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    session.logoutUser();
                    finish();
                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            this.finish();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
