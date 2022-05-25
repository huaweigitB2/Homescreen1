package com.huawei.neelavardhan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.huawei.neelavardhan.homescreen1.R;

import java.util.Objects;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Settings");
        if(findViewById(R.id.idFrameLayout)!=null){
            if (savedInstanceState!=null){
                return;

            }
        }
        getFragmentManager().beginTransaction().add(R.id.idFrameLayout,new SettingsFragment()).commit();
    }
}