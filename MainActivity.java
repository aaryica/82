package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    EditText et3;
    EditText et4;

    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editTextText);
        et2=findViewById(R.id.editTextText2);
        et3=findViewById(R.id.editTextText3);
        et4=findViewById(R.id.editTextText4);
        bt=findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n,p,e,ph;
                n=String.valueOf(et1.getText());
                p=String.valueOf(et2.getText());
                e=String.valueOf(et3.getText());
                ph=String.valueOf(et4.getText());
                String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                String MobilePattern = "[0-9]+";
                int flag=0;
                if(e.matches(emailPattern)&& ph.matches(MobilePattern) && ph.length()==10){
                    flag=1;
                }
                if(flag==0){
                    Toast.makeText(MainActivity.this, "enter correct format", Toast.LENGTH_SHORT).show();
                } else if (flag==1 && n.equals("raiyan") && p.equals("123")) {
                    Intent intent=new Intent(MainActivity.this,hobbies.class);
                    startActivity(intent);
                }
            }
        });
    }
}