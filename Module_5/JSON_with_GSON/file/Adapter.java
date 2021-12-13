package com.example.json_with_gson;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.example.json_with_gson.R.layout.item_recyclerview;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder>{

    ArrayList<ModelClass> List;

    public Adapter(ArrayList<ModelClass>List){
        this.List = List;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview,null);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        holder.txt1.setText("Name: "+List.get(position).getName());
        holder.txt2.setText("Street: "+List.get(position).getAddress().getStreet());
    }

    @Override
    public int getItemCount() {
        return List.size();
    }

    class Holder extends RecyclerView.ViewHolder{

        TextView txt1,txt2;
        public Holder(@NonNull View itemView) {
            super(itemView);
            txt1 = itemView.findViewById(R.id.txtvw1);
            txt2 = itemView.findViewById(R.id.txtvw2);
        }
    }
}
