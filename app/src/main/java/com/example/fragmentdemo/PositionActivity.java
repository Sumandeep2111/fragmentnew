package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.view.View;

public class PositionActivity extends AppCompatActivity implements Listener {
    public void showDescription(View view) {
        Intent intent = new Intent(this,DescriptionActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
 public void onItemClick(long id){
        Intent intent = new Intent(this,DescriptionActivity.class);
        intent.putExtra(DescriptionActivity.TAG,id);
        startActivity(intent);
 }

}
