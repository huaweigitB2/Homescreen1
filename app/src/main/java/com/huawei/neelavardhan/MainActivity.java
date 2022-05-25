package com.huawei.neelavardhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.huawei.neelavardhan.homescreen1.R;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Trinetra");
    }
    public void settings(View v){
        Intent intent=new Intent(this,SettingsActivity.class);
        startActivity(intent);

    }
    public void profile(View v){
        Intent intent=new Intent(this,ProfileActivity.class);
        startActivity(intent);
    }


}