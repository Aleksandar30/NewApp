package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterActivity extends AppCompatActivity implements  View.OnClickListener {

    private EditText inputIme;
    private EditText inputPrezime;
    private EditText inputMail;
    private Button buttonSave;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initComponents();
    }

    private void initComponents() {
        inputIme = findViewById(R.id.inputIme);
        inputPrezime = findViewById(R.id.inputLogin);
        inputMail = findViewById(R.id.inputMail);
        buttonSave = findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        String ime = inputIme.getText().toString();
        String password = inputPrezime.getText().toString();
        String mail = inputMail.getText().toString();
        //Korisnik user = new Korisnik(ime, password, mail);
        startActivity(intent);
    }
}