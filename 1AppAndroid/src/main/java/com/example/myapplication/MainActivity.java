package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private  EditText edtUser;

    private  EditText edtPassword;

    private  Button btnSignin;

   /*CLICO DE VIDA:ONLOAD JAVASCRIPT */
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //document.getElementById("idUser");
         edtUser = findViewById(R.id.edtUser);
         edtPassword = findViewById(R.id.edtPassword);
         btnSignin = findViewById(R.id.btnSignin);

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}