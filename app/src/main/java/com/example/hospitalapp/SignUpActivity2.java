package com.example.hospitalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpActivity2 extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4;
    Button bu1,bu2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up2);

        ed1=(EditText) findViewById(R.id.name);
        ed2=(EditText) findViewById(R.id.uname);
        ed3=(EditText) findViewById(R.id.pass);
        ed4=(EditText) findViewById(R.id.conpass);
        bu1=(Button) findViewById(R.id.signup);
        bu2=(Button) findViewById(R.id.backtologin);


        bu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob1=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ob1);
            }
        });


    }
}