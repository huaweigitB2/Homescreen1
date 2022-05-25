package com.huawei.neelavardhan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.huawei.neelavardhan.homescreen1.R;

import java.util.Objects;

public class EditSurveyActivity extends AppCompatActivity {
    AutoCompleteTextView text;
    String[] Disability={"Mild","Moderate","Severe","Blindness"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editsurvey);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Edit Survey");
        text=(AutoCompleteTextView) findViewById(R.id.disability_type);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,Disability);
        text.setAdapter(adapter);
        text.setThreshold(1);


    }
}