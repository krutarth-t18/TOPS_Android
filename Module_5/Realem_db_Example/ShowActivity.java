package com.example.realem_db_example;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class ShowActivity extends AppCompatActivity {

    ListView listView;
    List<Model_Class> list;
    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        listView = findViewById(R.id.list);
        list = new ArrayList();
        realm = Realm.getInstance(Realm.getDefaultConfiguration());
        realm.beginTransaction();
        RealmResults<Model_Class> realmResults = realm.where(Model_Class.class).findAll();
        for(int i=0;i<realmResults.size();i++){
            list.add(realmResults.get(i));
        }
        realm.commitTransaction();
        Custom_Adapter customAdapter = new Custom_Adapter(ShowActivity.this,list);
        listView.setAdapter(customAdapter);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ShowActivity.this);
                builder.setTitle("Select Option");
                builder.setPositiveButton("Update", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        LayoutInflater inflater = LayoutInflater.from(ShowActivity.this);
                        View view = inflater.inflate(R.layout.edit,null);

                        AlertDialog.Builder builder2 = new AlertDialog.Builder(ShowActivity.this);
                        builder2.setView(view);

                        EditText edt1 = findViewById(R.id.edt1);
                        EditText edt2 = findViewById(R.id.edt2);

                        edt1.setText(list.get(position).getName());
                        edt2.setText(list.get(position).getPass());

                        builder2.setPositiveButton("Update", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                RealmResults<Model_Class> realmResults = realm.where(Model_Class.class).findAll();
                                realm.beginTransaction();

                                realmResults.get(position).setName(edt1.getText().toString());
                                realmResults.get(position).setPass(edt2.getText().toString());

                                realm.commitTransaction();
                                startActivity(new Intent(ShowActivity.this,ShowActivity.class));

                            }
                        });

                        builder2.show();
                    }
                });

                builder.setNegativeButton("Delete", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        realm.beginTransaction();
                        RealmResults<Model_Class> realmResults = realm.where(Model_Class.class).findAll();
                        realmResults.deleteFromRealm(i);
                        realm.commitTransaction();
                        startActivity(new Intent(ShowActivity.this,ShowActivity.class));
                    }
                });
                builder.show();
                return false;
            }
        });

    }
    public void onBackPressed() {
        finishAffinity();
    }
}