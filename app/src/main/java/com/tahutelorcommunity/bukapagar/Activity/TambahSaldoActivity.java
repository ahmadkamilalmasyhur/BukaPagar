package com.tahutelorcommunity.bukapagar.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.tahutelorcommunity.bukapagar.Generator.ServiceGenerator;
import com.tahutelorcommunity.bukapagar.Model.Dompet.TopUp;
import com.tahutelorcommunity.bukapagar.Model.Dompet.TopUpRequest;
import com.tahutelorcommunity.bukapagar.Model.Users.Info.Bank;
import com.tahutelorcommunity.bukapagar.R;
import com.tahutelorcommunity.bukapagar.Service.Request;
import com.tahutelorcommunity.bukapagar.Utils.DbManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TambahSaldoActivity extends AppCompatActivity {

    EditText editTextSaldo;
    Spinner saldoSpin;
    com.tahutelorcommunity.bukapagar.Model.Local.User user;
    Toolbar toolbar;
    int idBank = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_saldo);
        user = DbManager.getOneUser(this);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            toolbar.setTitle("Tambah Saldo");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }
        editTextSaldo = (EditText) findViewById(R.id.saldotambahan);
        saldoSpin = (Spinner) findViewById(R.id.saldospinner);
        getBankID();
    }

    public void getBankID() {
        final Request request = ServiceGenerator.createService(Request.class, user.getUserId(), user.getToken());
        Call<Bank> bankCall = request.getBankInfo();
        bankCall.enqueue(new Callback<Bank>() {
            @Override
            public void onResponse(Call<Bank> call, Response<Bank> response) {
                if (response.isSuccessful()) {
                    if (response.message().equals("OK")) {
                        if (response.body().getAccounts().size() != 0)
                            idBank = response.body().getAccounts().get(0).getId();
                    } else {

                    }
                }
            }

            @Override
            public void onFailure(Call<Bank> call, Throwable t) {

            }
        });
    }

    public void topUpSaldo(int nominal) {
        try {
            final Request request = ServiceGenerator.createService(Request.class, user.getUserId(), user.getToken());
            Call<TopUp> topUpCall = request.getTopUpReq(new TopUpRequest(String.valueOf(nominal), String.valueOf(idBank)));
            topUpCall.enqueue(new Callback<TopUp>() {
                @Override
                public void onResponse(Call<TopUp> call, Response<TopUp> response) {
                    if (response.isSuccessful()) {
                        if (response.message().equals("OK")) {
                            Toast.makeText(TambahSaldoActivity.this, response.body().getMessage(), Toast.LENGTH_LONG).show();
                        } else {
                            Toast.makeText(TambahSaldoActivity.this, "Transaksi gagal", Toast.LENGTH_LONG).show();
                        }
                    }
                }

                @Override
                public void onFailure(Call<TopUp> call, Throwable t) {
                    Toast.makeText(TambahSaldoActivity.this, "Transaksi gagal", Toast.LENGTH_LONG).show();
                }
            });
        } catch (Exception e){
            Toast.makeText(this, "Terjadi Error", Toast.LENGTH_SHORT).show();
        }
    }

    public void tambahSaldo(View view) {
        try {
            if (!editTextSaldo.getText().toString().trim().equals("")) {
                int nominal = Integer.parseInt(editTextSaldo.getText().toString());
                String bank = saldoSpin.getSelectedItem().toString();
                if (idBank == 0) {
                    Toast.makeText(this, "Masukan Bank pada account anda", Toast.LENGTH_LONG).show();
                } else {
                    topUpSaldo(nominal);
                }
            } else {
                Toast.makeText(this, "Masukan Nominal", Toast.LENGTH_LONG).show();
            }
        } catch (Exception e){
            Toast.makeText(this, "Terjadi Error", Toast.LENGTH_SHORT).show();
        }
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
