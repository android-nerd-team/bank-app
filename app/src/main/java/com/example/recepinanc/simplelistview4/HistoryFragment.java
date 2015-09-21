package com.example.recepinanc.simplelistview4;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Recepinanc on 14.09.2015.
 */
public class HistoryFragment extends Fragment {

    private TextView historyLabel;
    private ArrayList<Gelir> mGelirs;
    private ListView historyList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mGelirs = new ArrayList<>();
        mGelirs.add(new Gelir("Harclik", 450.00));
        mGelirs.add(new Gelir("Ziraat", 250.00));

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v;
        v = inflater.inflate(R.layout.history_fragment_layout, container, false);

        historyLabel = (TextView) v.findViewById(R.id.historyLabel_textView);

        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        historyList = (ListView) view.findViewById(R.id.history_listView);
        historyList.setAdapter(new CustomGelirAdapter(getActivity().getApplicationContext(), mGelirs));
    }
}
