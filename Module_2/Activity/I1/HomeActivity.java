package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    CheckBox chk1,chk2,chk3;
    RadioGroup rdgp;
    RadioButton rdb1,rdb2;
    TextView text;
    SeekBar seekBar;
    Switch sWitch;
    LinearLayout linearLayout;
    RatingBar ratingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splesh2nd);

        chk1 = findViewById(R.id.chkbox1);
        chk2 = findViewById(R.id.chkbox2);
        chk3 = findViewById(R.id.chkbox3);

        rdgp = findViewById(R.id.gender_select);

        rdb1 = findViewById(R.id.male_gender);
        rdb2 = findViewById(R.id.female_gender);

        text = findViewById(R.id.txtvw);

        seekBar = findViewById(R.id.sikbar);

        sWitch = findViewById(R.id.sit);

        linearLayout = findViewById(R.id.layout);

        ratingBar = findViewById(R.id.rate);

//        ratingBar.setRating(3.0f);

        chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {

                    Toast.makeText(HomeActivity.this,"First Checked", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(HomeActivity.this,"First Unchecked", Toast.LENGTH_SHORT).show();
                }

            }
        });

        chk2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                if(isChecked){
                    Toast.makeText(HomeActivity.this,"Second Checked",Toast.LENGTH_SHORT).show();
                }

                else{
                    Toast.makeText(HomeActivity.this,"Second Unchecked",Toast.LENGTH_SHORT).show();
                }

            }
        });

        chk3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                if(isChecked){
                    Toast.makeText(HomeActivity.this,"Third Checked",Toast.LENGTH_SHORT).show();
                }

                else{
                    Toast.makeText(HomeActivity.this,"Third Unchecked",Toast.LENGTH_SHORT).show();
                }

            }
        });

        rdgp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId){
                    case R.id.male_gender:
                        Toast.makeText(HomeActivity.this,"Male",Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.female_gender:
                        Toast.makeText(HomeActivity.this,"Female",Toast.LENGTH_SHORT).show();
                }
            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                text.setText("Percentage: "+ String.valueOf(progress) +"%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sWitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    linearLayout.setBackgroundColor(Color.WHITE);
                    chk1.setTextColor(Color.BLACK);
                    chk2.setTextColor(Color.BLACK);
                    chk3.setTextColor(Color.BLACK);
                    rdb1.setTextColor(Color.BLACK);
                    rdb2.setTextColor(Color.BLACK);
                    text.setTextColor(Color.BLACK);
                    sWitch.setTextColor(Color.BLACK);
                    sWitch.setText("Light Mode");


                }
                else{
                    linearLayout.setBackgroundColor(Color.BLACK);
                    chk1.setTextColor(Color.WHITE);
                    chk2.setTextColor(Color.WHITE);
                    chk3.setTextColor(Color.WHITE);
                    rdb1.setTextColor(Color.WHITE);
                    rdb2.setTextColor(Color.WHITE);
                    text.setTextColor(Color.WHITE);
                    sWitch.setTextColor(Color.WHITE);
                    sWitch.setText("Dark Mode");
                    
                }
            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                text.setText("Rating "+String.valueOf(rating));
            }
        });

    }
}