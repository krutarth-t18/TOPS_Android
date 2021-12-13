package com.example.phpcurd.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.phpcurd.Model.View_Model;
import com.example.phpcurd.R;

import java.util.List;

public class MyAdapter extends BaseAdapter {
    Context context;
    List<View_Model> list;

    public MyAdapter(Context context, List<View_Model>list){
        this.context = context;
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

        LayoutInflater in = LayoutInflater.from(context);
        view = in.inflate(R.layout.design_view,viewGroup,false);
        TextView txtname = view.findViewById(R.id.txtview1);
        TextView txtprice = view.findViewById(R.id.txtview2);
        TextView txtdes = view.findViewById(R.id.txtview3);

        View_Model model = list.get(i);

        txtname.setText(model.getName());
        txtprice.setText(model.getPrice());
        txtdes.setText(model.getDescription());

        return view;
    }
}
