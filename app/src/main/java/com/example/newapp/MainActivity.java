package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText inputLogin;
    private EditText inputPass;
    private Button buttonLogin;
    private Button buttonRegister;
    private ArrayList<Korisnik> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents() {
        inputLogin = findViewById(R.id.inputLogin);
        inputPass = findViewById(R.id.inputPass);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonRegister = findViewById(R.id.buttonRegister);

        buttonLogin.setOnClickListener(this);
        buttonRegister.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.buttonLogin) {
            if((inputLogin.getText().toString().equalsIgnoreCase("admin") &&
                    inputPass.getText().toString().equalsIgnoreCase("admin"))){
                Intent intent = new Intent(this, WelcomeActivity.class);
                //Bundle extras = new Bundle();
                //extras.putString("test", "test");
                //intent.putExtras(extras);
                startActivity(intent);
                } else {
                    // Username or password false, display and an error
                    AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

                    dlgAlert.setMessage("wrong password or username");
                    //dlgAlert.setTitle("Error Message...");
                    dlgAlert.setPositiveButton("OK", null);
                    dlgAlert.setCancelable(true);
                    dlgAlert.create().show();

                    dlgAlert.setPositiveButton("Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {

                            }
                        });
            }
        }
        if(v.getId() ==R.id.buttonRegister){
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        }
    }

}