package com.tahutelorcommunity.bukapagar.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.tahutelorcommunity.bukapagar.R;

import java.util.ArrayList;

/**
 * Created by Firmanda on 5/28/2017.
 */

public class CustomAdapterListRiwayat extends RecyclerView.Adapter<CustomAdapterListRiwayat.ViewHolder> {
    private ArrayList<String> tipe;
    private ArrayList<String> harga;
    private ArrayList<String> tanggal;
    private ArrayList<String> id;
    Context mContext;

    public CustomAdapterListRiwayat(Context context, ArrayList tipe, ArrayList harga, ArrayList tanggal, ArrayList id) {
        this.tipe = tipe;
        this.harga = harga;
        this.tanggal = tanggal;
        this.id = id;
        mContext = context;
    }

    @Override
    public CustomAdapterListRiwayat.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_saldo, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.saldotipe.setText(tipe.get(i));
        viewHolder.saldoharga.setText(harga.get(i));
        viewHolder.saldotanggal.setText(tanggal.get(i));
        viewHolder.saldoid.setText(id.get(i));

        viewHolder.saldotipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        viewHolder.saldoharga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        viewHolder.saldotanggal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        viewHolder.saldoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Clicked", Toast.LENGTH_SHORT).show();
            }
        });


    }

    public void addItem(String tipes, String hargas, String tanggals, String ids) {
        tipe.add(tipes);
        tanggal.add(tanggals);
        harga.add(hargas);
        id.add(ids);
        notifyItemInserted(id.size());
    }

    @Override
    public int getItemCount() {
        return tipe.size();
    }

    public void removeItem(int position) {

        tipe.remove(position);
        tanggal.remove(position);
        harga.remove(position);
        id.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, id.size());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView saldotipe;
        TextView saldotanggal;
        TextView saldoharga;
        TextView saldoid;

        public ViewHolder(View view) {
            super(view);

            saldotipe = (TextView) view.findViewById(R.id.saldotipe);
            saldotanggal = (TextView) view.findViewById(R.id.saldotanggal);
            saldoharga = (TextView) view.findViewById(R.id.saldoharga);
            saldoid = (TextView) view.findViewById(R.id.saldoid);
        }
    }
}
