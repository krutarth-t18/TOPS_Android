package com.example.json_parsing_example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.List;

public class LIistViewAdapter extends ArrayAdapter<Heros> {

    private List<Heros> herosList; //hero list

    private Context context;

    public LIistViewAdapter(List<Heros> herosList, Context context) {
        super(context,R.layout.listitem,herosList);
        this.herosList = herosList;
        this.context = context;
    }

    public View getView(int position, View convertView, ViewGroup parent ){
        LayoutInflater inflater = LayoutInflater.from(context); //getting layout inflater

        View listViewItem = inflater.inflate(R.layout.listitem,null,true); //creating view with our xl layout

        TextView textViewname = listViewItem.findViewById(R.id.txtVw1);
        TextView textViewimg = listViewItem.findViewById(R.id.txtVw2);

        Heros hero = herosList.get(position); //getting hero for specified position

        textViewname.setText(hero.getName()); // setting name
        textViewimg.setText(hero.getImgurl()); // setting imageurl

        return listViewItem;
    }
}
