package com.example.recepinanc.simplelistview4;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Recepinanc on 10.09.2015.
 */
public class ListAppFragment extends Fragment {

    private ListView mListView;
    private ArrayList<Gelir> mGelirArrayList;
    private TextView totalLabel;
    private TextView totalValue;
    private double temp;
    private int listType;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        temp = 0.00;

        listType = getArguments().getInt(ListFragmentActivity.LIST_TYPE);

        mGelirArrayList = new ArrayList<Gelir>();

        switch (listType) {

            case 1:

                mGelirArrayList.add(new Gelir("Ziraat Bankasi", 300.00));
                mGelirArrayList.add(new Gelir("Turkiye Bankasi", 100.00));
                mGelirArrayList.add(new Gelir("Ziraat Genc Bankasi", 200.00));
                mGelirArrayList.add(new Gelir("Harclik", 450.00));
                mGelirArrayList.add(new Gelir("Gunluk Is", 300.00));
                mGelirArrayList.add(new Gelir("Ziraat Bankasi", 300.00));
                mGelirArrayList.add(new Gelir("Turkiye Bankasi", 100.00));
                mGelirArrayList.add(new Gelir("Ziraat Genc Bankasi", 200.00));
                mGelirArrayList.add(new Gelir("Harclik", 450.00));
                mGelirArrayList.add(new Gelir("Gunluk Is", 300.00));
                mGelirArrayList.add(new Gelir("Ziraat Bankasi", 300.00));
                mGelirArrayList.add(new Gelir("Turkiye Bankasi", 100.00));
                mGelirArrayList.add(new Gelir("Ziraat Genc Bankasi", 200.00));
                mGelirArrayList.add(new Gelir("Harclik", 450.00));
                mGelirArrayList.add(new Gelir("Gunluk Is", 300.00));
                break;

            case 2:

                mGelirArrayList.add(new Gelir("Kira", 300.00));
                mGelirArrayList.add(new Gelir("Su", 100.00));
                mGelirArrayList.add(new Gelir("Elektrik", 200.00));
                mGelirArrayList.add(new Gelir("Yemek", 450.00));
                mGelirArrayList.add(new Gelir("DogalGaz", 100.00));
                mGelirArrayList.add(new Gelir("Kira", 300.00));
                mGelirArrayList.add(new Gelir("Su", 100.00));
                mGelirArrayList.add(new Gelir("Elektrik", 200.00));
                mGelirArrayList.add(new Gelir("Yemek", 400.00));
                mGelirArrayList.add(new Gelir("DogalGaz", 300.00));
                mGelirArrayList.add(new Gelir("Kira", 300.00));
                mGelirArrayList.add(new Gelir("Su", 100.00));
                mGelirArrayList.add(new Gelir("Elektrik", 200.00));
                mGelirArrayList.add(new Gelir("Yemek", 450.00));
                mGelirArrayList.add(new Gelir("DogalGaz", 300.00));

        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v;
        v = inflater.inflate(R.layout.list_fragment_layout, container, false);

        totalLabel = (TextView) v.findViewById(R.id.total_textView);
        totalValue = (TextView) v.findViewById(R.id.result_textView);

        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mListView = (ListView) view.findViewById(R.id.gelir_listView);
        mListView.setAdapter(new CustomGelirAdapter(getActivity().getApplicationContext(), mGelirArrayList));
        mListView.setDivider(null);


        for (int i = 0; i < mGelirArrayList.size(); i++) {
            temp += mGelirArrayList.get(i).getValue();
        }

        totalValue.setText(temp + "");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

}
