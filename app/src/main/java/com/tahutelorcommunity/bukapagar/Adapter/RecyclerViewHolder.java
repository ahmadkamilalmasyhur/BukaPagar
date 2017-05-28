package com.tahutelorcommunity.bukapagar.Adapter;

/**
 * Created by QQ on 5/18/2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.tahutelorcommunity.bukapagar.R;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    public TextView countryName, countryAlamat,price;
    public ImageView countryPhoto;
    public String productId;
    public ImageView btnMenu;


    public RecyclerViewHolder(View itemView) {
        super(itemView);
        countryName = (TextView)itemView.findViewById(R.id.card_view_country_name);
        countryAlamat = (TextView)itemView.findViewById(R.id.card_view_country_alamat);
        countryPhoto = (ImageView)itemView.findViewById(R.id.card_view_country_photo);
        price = (TextView) itemView.findViewById(R.id.card_view_harga);
        btnMenu = (ImageView) itemView.findViewById(R.id.card_view_btnMenu);
    }

}