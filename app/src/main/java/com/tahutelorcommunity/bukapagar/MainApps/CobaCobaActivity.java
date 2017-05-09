package com.tahutelorcommunity.bukapagar.MainApps;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.tahutelorcommunity.bukapagar.Adapter.RecyclerAdapterText;
import com.tahutelorcommunity.bukapagar.GlobalData;
import com.tahutelorcommunity.bukapagar.Manager.BarangManager;
import com.tahutelorcommunity.bukapagar.R;

public class CobaCobaActivity extends AppCompatActivity {

    RecyclerView listBarang;
    RecyclerAdapterText adapter;

    Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coba_coba);
        listBarang = (RecyclerView) findViewById(R.id.rvw_list_barang);
        search = (Button) findViewById(R.id.coba_coba_btn_search);
        new getData(getApplicationContext()).execute();

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new getData(getBaseContext()).execute();
            }
        });

    }

    class getData extends AsyncTask<String, String, String> {

        Context context;
        getData (Context context){
            this.context = context;
        }

        @Override
        protected String doInBackground(String... params) {
            return new BarangManager().getBarangBarang("99999999", GlobalData.userLogin.getToken());
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            Log.d("CobaCobaActivity", "" + s);
            if (s != null && GlobalData.userLogin != null) {
                if (s.equalsIgnoreCase("success")) {
                    Toast.makeText(CobaCobaActivity.this, "Sukses Mengambil Data", Toast.LENGTH_SHORT).show();
                    //Then Intent to Main Activity
                    LinearLayoutManager horizontalLayoutManagerBreakfast = new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false);
                    adapter = new RecyclerAdapterText(GlobalData.allCategories, context);
                    listBarang.setLayoutManager(horizontalLayoutManagerBreakfast);
                    listBarang.setAdapter(adapter);

                } else {
                    Toast.makeText(CobaCobaActivity.this, s, Toast.LENGTH_SHORT).show();
                }
            }
        }

    }
}
