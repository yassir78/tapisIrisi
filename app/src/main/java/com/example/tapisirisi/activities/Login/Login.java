package com.example.tapisirisi.activities.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tapisirisi.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        // hide the action bar
        this.getSupportActionBar().hide();
        setTitle("Connexion");
   }
}