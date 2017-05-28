package com.tahutelorcommunity.bukapagar.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.tahutelorcommunity.bukapagar.Adapter.CustomAdapterListRiwayat;
import com.tahutelorcommunity.bukapagar.Generator.ServiceGenerator;
import com.tahutelorcommunity.bukapagar.Model.Dompet.GeneralHistory;
import com.tahutelorcommunity.bukapagar.Model.Dompet.History.DompetHistory;
import com.tahutelorcommunity.bukapagar.Model.Dompet.Mutation.MutationHistory;
import com.tahutelorcommunity.bukapagar.Model.Dompet.WithdrawalsHistory.History;
import com.tahutelorcommunity.bukapagar.R;
import com.tahutelorcommunity.bukapagar.Service.Request;
import com.tahutelorcommunity.bukapagar.Utils.DbManager;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SaldoActivity extends AppCompatActivity {

    private ArrayList<String> tipe = new ArrayList<>();
    private ArrayList<String> tanggal = new ArrayList<>();
    private ArrayList<String> harga = new ArrayList<>();
    private ArrayList<String> id = new ArrayList<>();
    private CustomAdapterListRiwayat adapter;
    Button btn_tambahsaldo;
    private TextView saldojml;
    private com.tahutelorcommunity.bukapagar.Model.Local.User user;
    private boolean loading = true;
    int pastVisiblesItems, visibleItemCount, totalItemCount;
    private int currentPage = 1;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saldo);
        setTitle("Saldo Anda");
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            toolbar.setTitle("Saldo Anda");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }
        user = DbManager.getOneUser(this);
        btn_tambahsaldo = (Button) findViewById(R.id.btn_tambahsaldo);
        saldojml = (TextView) findViewById(R.id.saldojml);
        btn_tambahsaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(SaldoActivity.this, TambahSaldoActivity.class);
                startActivity(x);
            }
        });
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_saldo);
        recyclerView.setHasFixedSize(true);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new CustomAdapterListRiwayat(getApplicationContext(), tipe, harga, tanggal, id);
        recyclerView.setAdapter(adapter);
        getHistorySaldo(currentPage);


        adapter.notifyDataSetChanged();


        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                if (dy > 0) //check for scroll down
                {
                    visibleItemCount = layoutManager.getChildCount();
                    totalItemCount = layoutManager.getItemCount();
                    pastVisiblesItems = layoutManager.findFirstVisibleItemPosition();

                    if (loading) {
                        if ((visibleItemCount + pastVisiblesItems) >= totalItemCount) {
                            loading = false;
                            currentPage++;
                            getHistorySaldo(currentPage);
                        }
                    }
                }
            }
        });
    }

    private void getHistorySaldo(int page) {
        final Request request = ServiceGenerator.createService(Request.class, user.getUserId(), user.getToken());
        Call<DompetHistory> call = request.getDompetHistory("dompet/history.json?page=" + page + "&per_page=10");
        call.enqueue(new Callback<DompetHistory>() {
            @Override
            public void onResponse(Call<DompetHistory> call, Response<DompetHistory> response) {

                if (response.isSuccessful()) {
                    if (response.message().equals("OK")) {
                        saldojml.setText("Rp." + response.body().getBalance());
                        DompetHistory dompet = response.body();
                        List<MutationHistory> muHistories = dompet.getMutationHistory();
                        List<History> withdrawalHistory = dompet.getWithdrawalHistory();
                        List<GeneralHistory> generalHistories = new ArrayList<GeneralHistory>();
                        if (muHistories != null) {
                            for (int i = 0; i < muHistories.size(); i++) {
                                assert generalHistories != null;
                                generalHistories.add(new GeneralHistory(muHistories.get(i).getType(), muHistories.get(i).getUpdatedAt(), muHistories.get(i).getAmount(), muHistories.get(i).getId()));
                            }
                        }
                        if (withdrawalHistory != null) {
                            for (int i = 0; i < withdrawalHistory.size(); i++) {
                                assert generalHistories != null;
                                generalHistories.add(new GeneralHistory("Withdrawals", withdrawalHistory.get(i).getUpdatedAt(), withdrawalHistory.get(i).getAmount(), withdrawalHistory.get(i).getId()));
                            }
                        }
                        if (generalHistories != null) {
                            for (int i = 0; i < generalHistories.size(); i++) {
                                tipe.add(generalHistories.get(i).getSaldotype());
                                tanggal.add(generalHistories.get(i).getSaldoTanggal());
                                harga.add("Rp." + String.valueOf(generalHistories.get(i).getSaldoHarga()));
                                id.add(String.valueOf(generalHistories.get(i).getSaldoID()));
                            }
                        }
                        adapter.notifyDataSetChanged();
                    } else {
                        Toast.makeText(SaldoActivity.this, response.message(), Toast.LENGTH_LONG).show();
                    }

                }
            }

            @Override
            public void onFailure(Call<DompetHistory> call, Throwable t) {

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
