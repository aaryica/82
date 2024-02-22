package com.example.gridviewnewnew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
GridView gd;
    int[] images = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.photograph
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gd=findViewById(R.id.gridview);
        gd.setAdapter(new ImageAdapter(this,images));
    }
}