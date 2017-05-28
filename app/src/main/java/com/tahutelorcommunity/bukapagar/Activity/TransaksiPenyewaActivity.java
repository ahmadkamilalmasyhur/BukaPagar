package com.tahutelorcommunity.bukapagar.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.tahutelorcommunity.bukapagar.Adapter.AdapterTransaksiPenyewa;
import com.tahutelorcommunity.bukapagar.Generator.ServiceGenerator;
import com.tahutelorcommunity.bukapagar.Manager.SessionManager;
import com.tahutelorcommunity.bukapagar.Model.Local.User;
import com.tahutelorcommunity.bukapagar.Model.Transaction.Product;
import com.tahutelorcommunity.bukapagar.Model.Transaction.Transaction;
import com.tahutelorcommunity.bukapagar.Model.Transaction.TransactionList;
import com.tahutelorcommunity.bukapagar.R;
import com.tahutelorcommunity.bukapagar.Service.Request;
import com.tahutelorcommunity.bukapagar.Utils.DbHandler;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Farizko on 28-May-17.
 */

public class TransaksiPenyewaActivity extends AppCompatActivity {
    private LinearLayoutManager lLayout;
    AdapterTransaksiPenyewa abr;
    RecyclerView rView;
    List<Transaction> rowListItem;
    Toolbar toolbar;
    private final String TAG = "TransaksiPenyewa";
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
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            toolbar.setTitle("Penyewa");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }
        testAPIgetLapak();
    }

    public void testAPIgetLapak() {
        Request loginService =
                ServiceGenerator.createService(Request.class, userLogin.getUserId(), userLogin.getToken());
        Call<TransactionList> call = loginService.getTransactionList("transactions.json?page=1&per_page=10");
        call.enqueue(new Callback<TransactionList>() {
            @Override
            public void onResponse(Call<TransactionList> call, Response<TransactionList> response) {
                if (response.isSuccessful()) { // Buyer sebagai UUID Login
                    if (response.body().getStatus().equalsIgnoreCase("ERROR")) {
                        Toast.makeText(TransaksiPenyewaActivity.this, "" + response.body().getMessage(), Toast.LENGTH_LONG).show();
                    } else {
                        try {
                            lLayout = new LinearLayoutManager(TransaksiPenyewaActivity.this);
                            rView = (RecyclerView) findViewById(R.id.recycler_view);
                            rView.setLayoutManager(lLayout);
                            rowListItem = response.body().getTransactions();
                            List<Product> allProductBuyer = new ArrayList<>();
                            for (int i = 0; i < rowListItem.size(); i++) {
                                List<Product> productList = rowListItem.get(i).getProducts();
                                for (int j = 0; j < productList.size(); j++) {
                                    if (String.valueOf(rowListItem.get(i).getBuyer().getId()).equals(userLogin.getUserId())) {
                                        allProductBuyer.add(productList.get(j));
                                    }
                                }
                            }
                            abr = new AdapterTransaksiPenyewa(TransaksiPenyewaActivity.this, allProductBuyer);
                            rView.setAdapter(abr);
                        } catch (Exception e){
                            Toast.makeText(TransaksiPenyewaActivity.this, "Telah Terjadi Error", Toast.LENGTH_SHORT).show();
                        }
                    }
                } else {
                    Log.d(TAG, "" + response.toString());
                    Toast.makeText(TransaksiPenyewaActivity.this, response.message(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<TransactionList> call, Throwable t) {
                // something went completely south (like no internet connection)
                Toast.makeText(TransaksiPenyewaActivity.this, ""+t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.d(TAG, t.getMessage());
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

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
