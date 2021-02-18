package com.example.tapisirisi.activities.Admin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tapisirisi.R;

public class Modifier extends AppCompatActivity {
    String libelles[] = {"l1","l2","l3"};
    String props[] = {"p1","p2,","p3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.getSupportActionBar().hide();
        setContentView(R.layout.admin_modif);
        ListView lv = findViewById(R.id.propModidlv);
        this.getSupportActionBar().hide();
        MyAdapter a = new MyAdapter(this, libelles, props);
        lv.setAdapter(a);

        /*Intent intent = new Intent(this, Register.class);
        startActivity(intent);*/
    }

    public class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String libelles[];
        String proprties[];

        public MyAdapter(Context c, String libs[], String props[]){
            super(c, R.layout.admin_row_list);
            this.context = c;
            this.libelles = libs;
            this.proprties = props;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.admin_row_prp_modif, parent, false);
            EditText lib = row.findViewById(R.id.libelle);
            EditText desc = row.findViewById(R.id.desc);

            lib.setText(libelles[position]);
            desc.setText(proprties[position]);
            return  row;
        }
    }


}
