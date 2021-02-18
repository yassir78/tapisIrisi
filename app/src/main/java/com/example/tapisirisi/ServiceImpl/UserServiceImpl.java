package com.example.tapisirisi.ServiceImpl;

import android.util.Log;
import android.widget.Toast;

import com.example.tapisirisi.Services.UserService;
import com.example.tapisirisi.activities.Main.MainActivity;
import com.example.tapisirisi.logic.model.User;
import com.example.tapisirisi.utils.Consts;

import java.lang.reflect.Constructor;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserServiceImpl {
    static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Consts.API)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
    static private UserService userService = retrofit.create(UserService.class);

    public static void getUsers() {
        Call<List> call = userService.getUsers();
        call.enqueue(new Callback<List>() {
            @Override
            public void onResponse(Call<List> call, Response<List> response) {
                if (response.isSuccessful()) {
                    List users = response.body();
                    Log.i("info", users.get(0).toString());
                } else {
                    Log.d("Yo", "Boo!");
                    return;
                }
            }

            @Override
            public void onFailure(Call<List> call, Throwable t) {
                Log.i("info", t.getMessage());

            }
        });
    }
}
