package com.tahutelorcommunity.bukapagar.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.tahutelorcommunity.bukapagar.Adapter.AdapterCart;
import com.tahutelorcommunity.bukapagar.Generator.ServiceGenerator;
import com.tahutelorcommunity.bukapagar.Manager.SessionManager;
import com.tahutelorcommunity.bukapagar.Model.Carts.CartResponse.Cart;
import com.tahutelorcommunity.bukapagar.Model.Carts.CartResponse.Carts;
import com.tahutelorcommunity.bukapagar.Model.Carts.CartResponse.Item;
import com.tahutelorcommunity.bukapagar.Model.Local.User;
import com.tahutelorcommunity.bukapagar.R;
import com.tahutelorcommunity.bukapagar.Service.Request;
import com.tahutelorcommunity.bukapagar.Utils.DbHandler;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Fikry-PC on 5/28/2017.
 */

public class CartActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
    RecyclerView recyclerSwipeUp;
    private LinearLayoutManager lLayout;
    List<Cart> cartResponse;
    List<Item> itemCart;
    AdapterCart abr;
    Toolbar toolbar;
    private final String TAG = "CartActivity";
    SessionManager session;
    User userLogin;

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaksi_penyewa_rumah);

        session = new SessionManager(this);
        final DbHandler dbHandler = new DbHandler(getApplicationContext());
        try {
            userLogin = dbHandler.getAllUser().get(0);
        } catch (Exception e) {
            session.checkLogin();
            e.printStackTrace();
        }
        recyclerSwipeUp = (RecyclerView) findViewById(R.id.recycler_view);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            toolbar.setTitle("Keranjang");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }
        testAPIgetLapak();
    }


    public void testAPIgetLapak() {
        Request loginService =
                ServiceGenerator.createService(Request.class, userLogin.getUserId(), userLogin.getToken());
        Call<Carts> call = loginService.getCarts();
        call.enqueue(new Callback<Carts>() {
            @Override
            public void onResponse(Call<Carts> call,
                                   Response<Carts> response) {
                if (response.isSuccessful()) { // seller sebagai UUID Login
                    if (response.body().getStatus().equalsIgnoreCase("ERROR")) {
                        Toast.makeText(CartActivity.this, "" + response.body().getMessage(), Toast.LENGTH_LONG).show();
                    } else {
                        try {
                            itemCart = new ArrayList<Item>();
                            lLayout = new LinearLayoutManager(CartActivity.this);
                            recyclerSwipeUp.setLayoutManager(lLayout);
                            cartResponse = response.body().getCart();
                            for (int i = 0; i < cartResponse.size(); i++) {
                                List<Item> list = cartResponse.get(i).getItems();
                                for (int j = 0; j < list.size(); j++) {
                                    itemCart.add(list.get(j));
                                }
                            }
                            abr = new AdapterCart(CartActivity.this, itemCart);
                            recyclerSwipeUp.setAdapter(abr);
                        } catch (Exception e) {
                        }
                    }
                } else {
                    Log.d(TAG, "" + response.toString());
                    Toast.makeText(CartActivity.this, response.message(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<Carts> call, Throwable t) {
                Log.d(TAG, t.getMessage());
                Toast.makeText(CartActivity.this, "" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public void pay(MenuItem menu) {
        //TODO do nothing
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_pay, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == android.R.id.home) {
            this.finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_cari_pagar) {
            startActivity(new Intent(CartActivity.this, PencarianRumahActivity.class));
        } else if (id == R.id.nav_buka_pagar) {
            startActivity(new Intent(CartActivity.this, BukaRumahActivity.class));
        } else if (id == R.id.nav_transaksi_tuan_rumah) {
            startActivity(new Intent(CartActivity.this, TransaksiTuanRumahActivity.class));
        } else if (id == R.id.nav_transaksi_penyewa) {
            startActivity(new Intent(CartActivity.this, TransaksiPenyewaActivity.class));
        } else if (id == R.id.nav_setting) {
            startActivity(new Intent(CartActivity.this, SettingActivity.class));
        } else if (id == R.id.nav_cart) {
            //TODO do nothing
        } else {
            drawer.closeDrawer(GravityCompat.START);
        }
        return true;
    }

}
