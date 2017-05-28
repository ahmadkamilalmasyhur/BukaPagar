package com.tahutelorcommunity.bukapagar.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;
import com.tahutelorcommunity.bukapagar.Activity.DetailPenginapanActivity;
import com.tahutelorcommunity.bukapagar.Model.Transaction.Product;
import com.tahutelorcommunity.bukapagar.Model.Transaction.Transaction;
import com.tahutelorcommunity.bukapagar.R;

import java.util.List;

/**
 * Created by QQ on 5/18/2017.
 */

public class AdapterTransaksiTuanRumah extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<Product> itemList;
    private Context context;

    public AdapterTransaksiTuanRumah(Context context, List<Product> itemList) {
        super();
        this.itemList = itemList;
        this.context = context;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_buka_rumah, parent, false);
        RecyclerViewHolder rcv = new RecyclerViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, final int position) {
        try{
            holder.countryName.setText(itemList.get(position).getName().substring(12));
        }
        catch (Exception e){
            holder.countryName.setText(itemList.get(position).getName());
        }
        holder.price.setText(String.valueOf(itemList.get(position).getPrice()));
        holder.countryAlamat.setText(itemList.get(position).getCity());
        holder.productId = itemList.get(position).getId();
        Picasso.with(context).load(itemList.get(position).getImages().get(0)).placeholder(ContextCompat.getDrawable(context, R.drawable.noimage))
                .into(holder.countryPhoto);
        holder.btnMenu.setVisibility(View.GONE);
//        holder.btnMenu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                PopupMenu popup = new PopupMenu(context, v);
//                MenuInflater inflater = popup.getMenuInflater();
//                inflater.inflate(R.menu.menu, popup.getMenu());
//                popup.show();
//                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                    @Override
//                    public boolean onMenuItemClick(MenuItem item) {
//                        switch (item.getItemId()) {
//                            //Fungsi On Click nya menu
//                        }
//                        return false;
//                    }
//                });
//            }
//        });
        holder.price.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, DetailPenginapanActivity.class);
                intent.putExtra("productId",itemList.get(position).getId());
                context.startActivity(intent);
            }
        });
        holder.countryName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, DetailPenginapanActivity.class);
                intent.putExtra("productId",itemList.get(position).getId());
                context.startActivity(intent);
            }
        });
        holder.countryAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, DetailPenginapanActivity.class);
                intent.putExtra("productId",itemList.get(position).getId());
                context.startActivity(intent);
            }
        });
        holder.countryPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, DetailPenginapanActivity.class);
                intent.putExtra("productId",itemList.get(position).getId());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

}