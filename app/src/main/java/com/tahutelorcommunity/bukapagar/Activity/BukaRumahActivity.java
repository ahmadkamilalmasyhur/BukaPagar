package com.tahutelorcommunity.bukapagar.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.tahutelorcommunity.bukapagar.Adapter.AdapterBukaRumah;
import com.tahutelorcommunity.bukapagar.Generator.ServiceGenerator;
import com.tahutelorcommunity.bukapagar.Manager.SessionManager;
import com.tahutelorcommunity.bukapagar.Model.Local.User;
import com.tahutelorcommunity.bukapagar.Model.Products.Pelapak.Pelapak;
import com.tahutelorcommunity.bukapagar.Model.Products.Pelapak.Product;
import com.tahutelorcommunity.bukapagar.R;
import com.tahutelorcommunity.bukapagar.Service.Request;
import com.tahutelorcommunity.bukapagar.Utils.DbHandler;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BukaRumahActivity extends AppCompatActivity {
    private LinearLayoutManager lLayout;
    AdapterBukaRumah abr;
    RecyclerView rView;
    List<Product> rowListItem;
    Toolbar toolbar;
    FloatingActionButton fab;
    private final String TAG = "BukaRumahActivity";
    SessionManager session;
    User userLogin;

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buka_rumah);
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
            toolbar.setTitle("Buka Penyewaan");
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BukaRumahActivity.this, CreatePenginapanActivity.class);
                startActivity(intent);
            }
        });

        testAPIgetLapak();
    }

    public void testAPIgetLapak() {
        Request loginService =
                ServiceGenerator.createService(Request.class, userLogin.getUserId(), userLogin.getToken());
        Call<Pelapak> call = loginService.getPelapak();
        call.enqueue(new Callback<Pelapak>() {
            @Override
            public void onResponse(Call<Pelapak> call, Response<Pelapak> response) {
                if (response.isSuccessful()) {
                    if (response.body().getStatus().equalsIgnoreCase("ERROR")) {
                        Toast.makeText(BukaRumahActivity.this, "" + response.body().getMessage(), Toast.LENGTH_LONG).show();
                    } else {
                        try {
                            Pelapak pelapak = response.body();
                            lLayout = new LinearLayoutManager(BukaRumahActivity.this);
                            rView = (RecyclerView) findViewById(R.id.recycler_view);
                            rView.setLayoutManager(lLayout);
                            rowListItem = response.body().getProducts();
                            abr = new AdapterBukaRumah(BukaRumahActivity.this, rowListItem);
                            rView.setAdapter(abr);
                            for (Product i : pelapak.getProducts()) {
                                Log.d(TAG, "" + i.getName());
                                Log.d(TAG, "" + i.getId());
                            }
                            Log.d(TAG, "" + pelapak.getProducts());
                        } catch (Exception e) {
                        }
                    }
                } else {
                    Log.d(TAG, "" + response.toString());
                    Toast.makeText(BukaRumahActivity.this, response.message(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<Pelapak> call, Throwable t) {
                Log.d(TAG, t.getMessage());
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            this.finish();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
