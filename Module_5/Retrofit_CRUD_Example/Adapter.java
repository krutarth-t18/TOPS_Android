package com.example.retrofit_crud;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    List<Model> datalist;
    ApiInterface api;

    public Adapter(Context context, List<Model> datalist){
        this.context = context;
        this.datalist = datalist;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView1.setText(datalist.get(position).getProduct_name());
        holder.textView2.setText(datalist.get(position).getProduct_price());
        holder.textView3.setText(datalist.get(position).getProduct_description());
        holder.textView4.setText(datalist.get(position).getProduct_quantity());

        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(view.getContext());
                alert.setTitle("select?");
                alert.setPositiveButton("update", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Intent intent = new Intent(context,UpdateActivity.class);
                        intent.putExtra("id",datalist.get(position).getId());
                        intent.putExtra("name",datalist.get(position).getProduct_name());
                        intent.putExtra("price",datalist.get(position).getProduct_price());
                        intent.putExtra("desc",datalist.get(position).getProduct_description());
                        intent.putExtra("quantity",datalist.get(position).getProduct_quantity());
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        view.getContext().startActivity(intent);
                    }
                });
                alert.setNegativeButton("Delete", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        api = API_Clinte.getApiClient().create(ApiInterface.class);
                        Call<Model> call = api.deleteNote(datalist.get(position).getId()); //deleted one () brackets
                        call.enqueue(new Callback<Model>(){

                            @Override
                            public void onResponse(Call<Model> call, Response<Model> response) {
                                Toast.makeText(view.getContext(),"deleted", Toast.LENGTH_SHORT).show();
                                Intent i = new Intent();
                                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                            }

                            @Override
                            public void onFailure(Call<Model> call, Throwable t) {

                                Log.d("123456",t.getMessage());
                            }
                        });
                        view.getContext().startActivity(new Intent(view.getContext(),ViewActivity.class));
                    }
                });
                alert.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return datalist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView1,textView2,textView3, textView4;
        public ViewHolder(View itemView){
            super(itemView);
            textView1 = itemView.findViewById(R.id.txtvw1);
            textView2 = itemView.findViewById(R.id.txtvw2);
            textView3 = itemView.findViewById(R.id.txtvw3);
            textView4 = itemView.findViewById(R.id.txtvw4);
        }
    }
}
