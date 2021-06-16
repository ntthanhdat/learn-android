package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class ContactAdapter  extends BaseAdapter {
        private Context context;
        private int layout;
        private List<Contact> countryList;

        public ContactAdapter(Context context, int layout, List<Contact> countryList) {
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
            TextView txtName =(TextView) convertView.findViewById(R.id.lvname);
            TextView txtPop =(TextView) convertView.findViewById(R.id.lvphone);
            TextView txtmail =(TextView) convertView.findViewById(R.id.lvemail);
            ImageView imgCountry=(ImageView) convertView.findViewById(R.id.lvimage);
            Contact contact =countryList.get(position);
            txtName.setText(contact.getName());
            txtPop.setText(contact.getPhone());
            txtmail.setText(contact.getMail());
           imgCountry.setImageResource(contact.getImage());

            return convertView;
        }
    }
