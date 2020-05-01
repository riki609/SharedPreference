package com.rikiahmad.latihansharedpreference;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.rikiahmad.latihansharedpreference.utils.Preferences;

public class HomeActivity extends AppCompatActivity {

    private TextView txtKeluar;
    private TextView txtName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        declareView();
        txtKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Clear Set Preferences
                Preferences.setLogout(getBaseContext());

                //Pindah Halaman ke Login
                startActivity(new Intent(getBaseContext(), LoginActivity.class));
                finish();
            }
        });

    }

    private void declareView() {
        txtKeluar = findViewById(R.id.txt_logout);
        txtName = findViewById(R.id.txtName);

        txtName.setText(Preferences.getRegisteredUser(getBaseContext()));
    }
}

/*
Tanggal Pengerjaan : 1-Mei-2020
Deskripsi Pengerjaan : Mengerjakan class dan package semua yang terdiri dari package model, package utils
class HomeActivity,LoginActivity dan RegisterActivity
Nim : 10117153
Nama : Riki Ahmad Fauzi
Kelas : IF-4
 */
