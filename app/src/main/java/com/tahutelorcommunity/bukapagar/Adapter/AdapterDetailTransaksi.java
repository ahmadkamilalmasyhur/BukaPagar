package com.tahutelorcommunity.bukapagar.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tahutelorcommunity.bukapagar.Class.ItemObjek;
import com.tahutelorcommunity.bukapagar.Class.RecyclerViewHolder;
import com.tahutelorcommunity.bukapagar.R;

import java.util.List;

/**
 * Created by QQ on 5/26/2017.
 */

public class AdapterDetailTransaksi extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<ItemObjek> itemList;
    private Context context;

    public AdapterDetailTransaksi(Context context, List<ItemObjek> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_detail_transaksi, parent, false);
        RecyclerViewHolder rcv = new RecyclerViewHolder(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.countryName.setText(itemList.get(position).getName());
        holder.countryAlamat.setText(itemList.get(position).getAlamat());
//        holder.countryPhoto.setImageResource(itemList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
