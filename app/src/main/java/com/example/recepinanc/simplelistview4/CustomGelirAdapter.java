package com.example.recepinanc.simplelistview4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Recepinanc on 10.09.2015.
 */
public class CustomGelirAdapter extends BaseAdapter {

    private Context mContext;
    private ArrayList<Gelir> mGelirs;

    public CustomGelirAdapter(Context applicationContext, ArrayList<Gelir> gelirArrayList) {
        this.mContext = applicationContext;
        this.mGelirs = gelirArrayList;
    }

    @Override
    public int getCount() {
        return mGelirs.size();
    }

    @Override
    public Object getItem(int position) {
        return mGelirs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {

            LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(R.layout.gelir_list_item, parent, false);

            holder = new ViewHolder();
            holder.mName = (TextView) convertView.findViewById(R.id.name_textView);
            holder.mValue = (TextView) convertView.findViewById(R.id.value_textView);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Gelir gelir = mGelirs.get(position);

        holder.mName.setText(gelir.getName());
        holder.mValue.setText(gelir.getValue() + "");

        return convertView;
    }

    public class ViewHolder {
        TextView mName;
        TextView mValue;
    }
}
