package com.example.realem_db_example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Custom_Adapter extends BaseAdapter {

    Context context;
    List<Model_Class> list;

    Custom_Adapter(Context context, List<Model_Class> list){
        this.context=context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.design,viewGroup,false);

        TextView textView1 = view.findViewById(R.id.t1);
        TextView textView2 = view.findViewById(R.id.t2);

        textView1.setText(list.get(i).getName());
        textView2.setText(list.get(i).getPass());
        return view;
    }
}
