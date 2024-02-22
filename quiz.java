package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class quiz extends AppCompatActivity {
    TextView tv;
    ListView lv;
    String[] items={"pen","pencil","eraser","laptop","sharpner","mobile","helmet"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        tv=findViewById(R.id.textView7);
        lv=findViewById(R.id.listview);

        String str= getIntent().getStringExtra("hobby");
        tv.setText(str);
        ArrayAdapter arr =new ArrayAdapter<String>(quiz.this, android.R.layout.simple_list_item_1,items );
        lv.setAdapter(arr);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(quiz.this, "bsdk"+ items[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}