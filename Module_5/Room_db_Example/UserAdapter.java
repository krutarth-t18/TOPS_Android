package com.example.room_db_example.adapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.room_db_example.R;
import com.example.room_db_example.activity.AddUserActivity;
import com.example.room_db_example.database.Database_class;
import com.example.room_db_example.entity.User;
import com.example.room_db_example.globalvariables.Global_variables;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder>{

    public List<User> userList;
    Database_class db;
    private Context mContext;

    public UserAdapter(List<User> userList){
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        db = Room.databaseBuilder(mContext,Database_class.class,"myDatabase").allowMainThreadQueries().build();
        View v = LayoutInflater.from(mContext).inflate(R.layout.activity_user_adapter,parent,false);
        UserHolder userAdapter = new UserHolder(v);
        return userAdapter;
    }

    @Override
    public void onBindViewHolder(@NonNull final UserAdapter.UserHolder userHolder, final int position) {

        userHolder.name.setText(userList.get(position).getName().toString());
        userHolder.email.setText(userList.get(position).getEmail().toString());
        userHolder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(mContext).create();
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL,"Edit",new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();

                        Global_variables.id = userList.get(position).getId();
                        Global_variables.name = userList.get(position).getName();
                        Global_variables.email = userList.get(position).getEmail();
                        Global_variables.updateflag = "update";

                        Intent intent = new Intent(mContext, AddUserActivity.class);
                        mContext.startActivity(intent);
                    }
                });

                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE,"Delete",new DialogInterface.OnClickListener(){

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        deleteUser(userList.get(position).getId());
                        dialogInterface.dismiss();
                        userList.remove(position);
                        notifyItemRemoved(position);
                        notifyItemRangeChanged(position,userList.size());
                    }
                });
                alertDialog.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    private void deleteUser(int id) {
        User user = new User();
        user.setId(id);
        db.daoInterface().deleteuser(user);
        Toast.makeText(mContext,"Deleted!", Toast.LENGTH_SHORT).show();
    }

    public class UserHolder extends RecyclerView.ViewHolder {
        private TextView name, email;

        public UserHolder(@NonNull View v) {
            super(v);
            name = itemView.findViewById(R.id.txtname);
            email = itemView.findViewById(R.id.txtmail);
        }
    }
}