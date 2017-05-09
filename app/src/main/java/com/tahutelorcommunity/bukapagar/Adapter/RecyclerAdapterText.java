package com.tahutelorcommunity.bukapagar.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.tahutelorcommunity.bukapagar.Model.AllCategories;
import com.tahutelorcommunity.bukapagar.R;

/**
 * Created by Farizko on 07-May-17.
 */

public class RecyclerAdapterText extends RecyclerView.Adapter<RecyclerAdapterText.MyViewHolder> {

    AllCategories vertical;
    Context context;

    public RecyclerAdapterText(AllCategories horizontalList, Context context) {
        this.vertical = horizontalList;
        this.context = context;
    }




    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nama_category;
        TextView anak_category;

        public MyViewHolder(View view) {
            super(view);
            nama_category = (TextView) view.findViewById(R.id.nama_categori);
            anak_category = (TextView) view.findViewById(R.id.anak_categori);
        }
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_all_category, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        if (position < vertical.getCategories().size()) {
            holder.nama_category.setText(vertical.getCategories().get(position).getName());
        }
        if (position < vertical.getCategories().get(position).getChildren().size()) {
            holder.anak_category.setText(vertical.getCategories().get(position).getChildren().get(position).getName());
        }
    }


    @Override
    public int getItemCount() {
        return vertical.getCategories().size();
    }
}