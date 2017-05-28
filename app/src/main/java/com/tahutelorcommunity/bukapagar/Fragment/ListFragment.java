package com.tahutelorcommunity.bukapagar.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tahutelorcommunity.bukapagar.Adapter.RecyclerViewAdapter;
import com.tahutelorcommunity.bukapagar.Class.ItemObjek;
import com.tahutelorcommunity.bukapagar.R;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    private LinearLayoutManager lLayout;

    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_list, container, false);


        List<ItemObjek> rowListItem = getAllItemList();
        lLayout = new LinearLayoutManager(getContext());


        RecyclerView rView = (RecyclerView)v.findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(getContext(), rowListItem);
        rView.setAdapter(rcAdapter);
        return v;
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
