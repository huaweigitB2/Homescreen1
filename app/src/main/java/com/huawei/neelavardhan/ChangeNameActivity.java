package com.huawei.neelavardhan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;

import com.huawei.neelavardhan.homescreen1.R;

import java.util.Objects;

@SuppressWarnings("ALL")
public class ChangeNameActivity extends AppCompatActivity {
    AutoCompleteTextView gender;
    String[] Gender = {"Male", "Female"};
    private final int RESULT_LOAD_IMAGE=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_name);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Change Name ");
        gender = findViewById(R.id.genderinput);
        ArrayAdapter a = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, Gender);
        gender.setAdapter(a);
        gender.setThreshold(1);

    }

    public void profile(View view) {
        Intent i = new Intent(Intent.ACTION_PICK,android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(i, RESULT_LOAD_IMAGE);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = { MediaStore.Images.Media.DATA };
            Cursor cursor = getContentResolver().query(selectedImage,filePathColumn, null, null, null);
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath = cursor.getString(columnIndex);
            cursor.close();
            ImageView imageView = findViewById(R.id.profileinput);
            imageView.setImageURI(selectedImage);
        }
    }
    public void save(View view){

    }

}