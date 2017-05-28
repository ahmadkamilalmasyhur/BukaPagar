package com.tahutelorcommunity.bukapagar.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.tahutelorcommunity.bukapagar.Adapter.AdapterDetailTransaksi;
import com.tahutelorcommunity.bukapagar.Class.ItemObjek;
import com.tahutelorcommunity.bukapagar.R;

import java.util.ArrayList;
import java.util.List;

public class DetailTransaksi extends AppCompatActivity {
    private LinearLayoutManager lLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_transaksi);

        List<ItemObjek> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(this);


        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        AdapterDetailTransaksi rcAdapter = new AdapterDetailTransaksi(this, rowListItem);
        rView.setAdapter(rcAdapter);

    }

    private List<ItemObjek> getAllItemList(){

        List<ItemObjek> allItems = new ArrayList<ItemObjek>();
        allItems.add(new ItemObjek("Andi Rahmat", "Jln Raya Selatan No 123 Malang",R.drawable.ava));
        allItems.add(new ItemObjek("Budianto", "Jln Melati no 1 Malang",R.drawable.ava));
        allItems.add(new ItemObjek("Sri Wahyuni", "Jln Basuki no 34 Malang",R.drawable.ava));
        allItems.add(new ItemObjek("Dino A", "Jln Gajayana no 35 Malang",R.drawable.ava));
        allItems.add(new ItemObjek("Dwi Astuti","Jln Ismail Marzuki Malang", R.drawable.ava));

        return allItems;
    }

}
