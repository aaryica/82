package com.example.registration;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class hobbies extends AppCompatActivity {

    Button btn;

    RadioGroup rg;
    CheckBox ch1,ch2,ch3;
    String str2="";
    String str="";
    int score=0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hobbies);
        btn=findViewById(R.id.button2);
        rg=findViewById(R.id.radioGroup3);
        ch1=findViewById(R.id.checkBox4);
        ch2=findViewById(R.id.checkBox5);
        ch3=findViewById(R.id.checkBox6);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ans1=rg.getCheckedRadioButtonId();
                if(ans1!=-1){
                    RadioButton rb=rg.findViewById(ans1);
                    str=String.valueOf(rb.getText().toString());
                }

                if(ch1.isChecked()){
                    str2=str2+String.valueOf(ch1.getText().toString());
                } else if (ch2.isChecked()) {
                    str2+=String.valueOf( ch2.getText().toString());

                }
                else
                    str2+=String.valueOf(ch3.getText().toString());
                String str7="football";
                String str8="dance";

                if(str.equals(str7) && str2.equals(str8)){
                    score=2;
                }else if (str2.equals(str8)) {
                    score=1;

                }
                else if(str.equals(str7)){
                    score=1;
                }
                else {
                    score=0;
                }
                new AlertDialog.Builder(hobbies.this)
                        .setTitle("title")
                        .setMessage("are you sure")
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent= new Intent(hobbies.this,quiz.class);
                                startActivity(intent);

                                intent.putExtra("hobby",str);
                            }
                        }
                        ).setNegativeButton("no", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(hobbies.this, "score is"+score, Toast.LENGTH_SHORT).show();
                            }
                        }).show();
            }
        });



    }
}