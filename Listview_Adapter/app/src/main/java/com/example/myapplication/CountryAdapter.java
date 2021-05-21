package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CountryAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Country> countryList;

    public CountryAdapter(Context context, int layout, List<Country> countryList) {
        this.context = context;
        this.layout = layout;
        this.countryList = countryList;
    }

    @Override
    public int getCount() {
        return countryList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView =inflater.inflate(layout, null);
        TextView txtName =(TextView) convertView.findViewById(R.id.countryname);
        TextView txtPop =(TextView) convertView.findViewById(R.id.countrypop);
        ImageView imgCountry=(ImageView) convertView.findViewById(R.id.countryimage);
        Country country =countryList.get(position);
        txtName.setText(country.getCountryName());
        txtPop.setText(country.getPopulation());
        imgCountry.setImageResource(country.getFlagName());

        return convertView;
    }
}
