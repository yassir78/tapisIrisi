package com.example.tapisirisi.activities.Admin;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.tapisirisi.activities.ui.HistoriqueListActivity;
import com.example.tapisirisi.activities.ui.HistoriqueMotifDetailsActivity;
import com.example.tapisirisi.logic.adapter.admin_list_adapter;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tapisirisi.R;

import com.example.tapisirisi.logic.model.Motif;

import java.io.ByteArrayOutputStream;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

public class Admin extends AppCompatActivity {
    private ListView lv;
int itest = R.drawable.user_img;



//Blob b = "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";
  /* private static List<Motif> motifs = new ArrayList<Motif>() {{
        add(new Motif(1, R.drawable.user_img, "test1"));
        add(new Motif(2, R.drawable.ic_launcher_background, "test2"));
        add(new Motif(2, R.drawable.ic_launcher_background, "test3"));
    }};*/

   // int images[] = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        this.getSupportActionBar().hide();
        setContentView(R.layout.admin_list);
        this.getSupportActionBar().hide();

       /* admin_list_adapter al = new admin_list_adapter(this,motifs);
        ListView lv = findViewById(R.id.adminlv);
        lv.setAdapter(al);*/



    }

    /*public class MyAdapter extends BaseAdapter {
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
    }*/
}
