package com.example.tapisirisi.activities.Admin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tapisirisi.R;

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
import com.example.tapisirisi.activities.Login.Login;
import com.example.tapisirisi.activities.Register.Register;

import com.example.tapisirisi.activities.Main.MainActivity;

public class Admin extends AppCompatActivity {

    int images[] = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.getSupportActionBar().hide();
        setContentView(R.layout.admin_list);
        this.getSupportActionBar().hide();

        MyAdapter a = new MyAdapter(this, images);
        ListView lv = findViewById(R.id.adminlv);
        lv.setAdapter(a);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){
                    Toast.makeText(Admin.this, "Fist item", Toast.LENGTH_LONG);
                }
            }
        });
        /*Intent intent = new Intent(this, Register.class);
        startActivity(intent);*/
    }

    public class MyAdapter extends BaseAdapter {
        private  Context context;
        private int rImgs[];

        public MyAdapter(Context c, int imgs[]){
            //super(c, R.layout.admin_row_list);
            this.context = c;
            this.rImgs = imgs;
        }


        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }


        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if (convertView == null) {
                convertView = LayoutInflater.from(context).
                        inflate(R.layout.admin_row_list, parent, false);
            }

            //LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
          //  View row = layoutInflater.inflate(R.layout.admin_row_list, parent, false);
            ImageView imageView = convertView.findViewById(R.id.image);
            imageView.setImageResource(rImgs[position]);
            return  convertView;
        }
    }
}
