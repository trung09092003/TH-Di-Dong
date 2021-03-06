package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class tab3 extends Fragment {
    private View view05;
    private orderScreen orderScreen;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public tab3() {
    }
    public static tab3 newInstance(String param1, String param2) {
        tab3 fragment = new tab3();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view05 = inflater.inflate(R.layout.fragment_tab3,container,false);
        recycle_list();
        return view05;
    }
    public void recycle_list(){
        RecyclerView order_recycle=view05.findViewById(R.id.doan_recycle);
        order_recycle.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new GridLayoutManager(orderScreen,2);
        order_recycle.setLayoutManager(linearLayoutManager);
        List<orderItem> orderItems = new ArrayList<>();
        orderItems.add(new orderItem("TRÀ OOLONG BƯỞI MẬT ONG","50,000 đ",R.drawable.monan1));
        orderItems.add(new orderItem("TRÀ SỮA MẮC CA TRÂN CHÂU TRẮNG","45,000 đ",R.drawable.monan3));
        orderItems.add(new orderItem("TRÀ ĐÀO CAM SẢ","45,000 đ",R.drawable.product_3));
        orderItems.add(new orderItem("CARAMEL MACCHIATO","55,000 đ",R.drawable.product_4));
        orderItems.add(new orderItem("MOCHA","49,000 đ",R.drawable.product_5));
        orderItems.add(new orderItem("CAPPUCCINO","45,000 đ",R.drawable.product_6));
        orderItems.add(new orderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_7));
        orderItems.add(new orderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_1));
        orderItems.add(new orderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_5));
        orderItems.add(new orderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_2));
        orderItems.add(new orderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_10));
        orderItems.add(new orderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.coffee_2));
        orderItems.add(new orderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.coffee_1));
        orderItems.add(new orderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.coffee_2));
        orderItems.add(new orderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.coffee_2));
        orderItems.add(new orderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.coffee_1));
        orderItems.add(new orderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_10));
        orderItems.add(new orderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_10));
        orderItems.add(new orderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_10));
        orderItems.add(new orderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_11));
        orderItems.add(new orderItem("Socola Lúa Mạch Nóng","69.000đ",R.drawable.product_10));
        orderAdapter orderAdapter=new orderAdapter(orderScreen,orderItems,R.layout.row_grid);
        order_recycle.setAdapter(orderAdapter);
    }
}