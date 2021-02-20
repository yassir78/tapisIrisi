package com.example.tapisirisi.activities.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.tapisirisi.R;
import com.example.tapisirisi.Services.UserService;
import com.example.tapisirisi.activities.Admin.Admin;
import com.example.tapisirisi.activities.Login.Login;
import com.example.tapisirisi.activities.Register.Register;
import com.example.tapisirisi.activities.ui.HistoriqueListActivity;
import com.example.tapisirisi.logic.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getSupportActionBar().hide();
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

}
