package com.example.tapisirisi.activities.Register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tapisirisi.R;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getSupportActionBar().hide();
        setContentView(R.layout.register);
    }
}