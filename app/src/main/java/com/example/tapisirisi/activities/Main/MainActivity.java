package com.example.tapisirisi.activities.Main;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.tapisirisi.R;
import com.example.tapisirisi.activities.Admin.Admin;
import com.example.tapisirisi.activities.Admin.Modifier;
import com.example.tapisirisi.activities.Login.Login;
import com.example.tapisirisi.activities.Register.Register;

public class MainActivity extends AppCompatActivity {

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getSupportActionBar().hide();
       Intent intent = new Intent(this, Login.class);
       startActivity(intent);
    }


}