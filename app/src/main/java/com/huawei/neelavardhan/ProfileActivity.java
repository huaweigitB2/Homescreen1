package com.huawei.neelavardhan;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

import com.huawei.neelavardhan.homescreen1.R;

import java.util.Objects;

public class ProfileActivity extends AppCompatActivity {

    private static final int RESULT_LOAD_IMAGE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Profile");


    }


    public void editsurvey(View view) {
        Intent intent=new Intent(this,EditSurveyActivity.class);
        startActivity(intent);
    }

    public void ApplyChanges(View view) {
    }

    public void changename(View view) {
        Intent intent=new Intent(this,ChangeNameActivity.class);
        startActivity(intent);
    }



}