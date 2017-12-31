package com.example.egi_fcb.applicationmtq.Package_Hijaiyah;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.example.egi_fcb.applicationmtq.MainActivity;
import com.example.egi_fcb.applicationmtq.R;

import java.util.ArrayList;
import java.util.List;

public class Activity_Menu_Utama_Harakat extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;

    RecyclerViewAdapter_AMUH recyclerViewAdapter_amuh;
    RecyclerView.LayoutManager recyclerViewLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Menu Utama Harakat");
        setContentView(R.layout.activity_menu_utama_harakat);

        context = getApplicationContext();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view1);

        //Change 2 to your choice because here 2 is the number of Grid layout Columns in each row.
        recyclerViewLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(recyclerViewLayoutManager);
        recyclerViewAdapter_amuh = new RecyclerViewAdapter_AMUH(context,getUserInformation());
        recyclerView.setAdapter(recyclerViewAdapter_amuh);
    }

    private List<User> getUserInformation() {

        List<User> userList = new ArrayList<User>();
        userList.add(new User("HARAKAT FATHAH","Suatu Huruf Yang Melambangkan Fonem /a/","ثَ","تَ","بَ"));
        userList.add(new User("HARAKAT KASRAH","Suatu Huruf Yang Melambangkan Fonem /i/","ثِ","تِ","بِ"));
        userList.add(new User("HARAKAT DAMMAH","Suatu Huruf Yang Melambangkan Fonem /u/","ثُ","تُ","بُ"));

        return userList;
    }

    public class User {
        private String judul;
        private String subjudul;
        private String ayat1;
        private String ayat2;
        private String ayat3;


        public String getJudul() {
            return judul;
        }

        public String getSubjudul() {
            return subjudul;
        }

        public String getAyat1() {
            return ayat1;
        }

        public String getAyat2() {
            return ayat2;
        }

        public String getAyat3() {
            return ayat3;
        }

        public User(String judul, String subjudul, String ayat1, String ayat2, String ayat3) {
            this.judul = judul;
            this.subjudul = subjudul;
            this.ayat1 = ayat1;
            this.ayat2 = ayat2;
            this.ayat3 = ayat3;
        }
    }

    //Tombol Kembali
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        finish();
        return super.onOptionsItemSelected(item);
    }
}
