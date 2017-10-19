package com.example.u2.simplecalculator;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mp;
    private EditText nilai;
    private float bil1;
    private float bil2;
    private boolean perkalian, penjumlahan, pengurangan, pembagian;
    String temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nilai = (EditText) findViewById(R.id.editText);
    }

    public void tekanNol(View view){
        mp = MediaPlayer.create(getApplicationContext(),R.raw.nol);
        mp.start();
        nilai.setText(nilai.getText().toString()+"0");
}
    public void tekanSatu(View view){
        mp = MediaPlayer.create(getApplicationContext(),R.raw.satu);
        mp.start();
        nilai.setText(nilai.getText().toString()+"1");
    }
    public void tekanDua(View view){
        mp = MediaPlayer.create(getApplicationContext(),R.raw.dua);
        mp.start();
        nilai.setText(nilai.getText().toString()+"2");
    }
    public void tekanTiga(View view){
        mp = MediaPlayer.create(getApplicationContext(),R.raw.tiga);
        mp.start();
        nilai.setText(nilai.getText().toString()+"3");
    }
    public void tekanEmpat (View view){
        mp = MediaPlayer.create(getApplicationContext(),R.raw.empat);
        mp.start();
        nilai.setText(nilai.getText().toString()+"4");
    }
    public void tekanLima(View view){
        mp = MediaPlayer.create(getApplicationContext(),R.raw.lima);
        mp.start();
        nilai.setText(nilai.getText().toString()+"5");
    }
    public void tekanEnam(View view){
        mp = MediaPlayer.create(getApplicationContext(),R.raw.enam);
        mp.start();
        nilai.setText(nilai.getText().toString()+"6");
    }
    public void tekanTujuh(View view){
        mp = MediaPlayer.create(getApplicationContext(),R.raw.tujuh);
        mp.start();
        nilai.setText(nilai.getText().toString()+"7");
    }
    public void tekanDelapan(View view){
        mp = MediaPlayer.create(getApplicationContext(),R.raw.delapan);
        mp.start();
        nilai.setText(nilai.getText().toString()+"8");
    }
    public void tekanSembilan(View view){
        mp = MediaPlayer.create(getApplicationContext(),R.raw.sembilan);
        mp.start();
        nilai.setText(nilai.getText().toString()+"9");
    }
    public void tekanKoma(View view){
        mp = MediaPlayer.create(getApplicationContext(),R.raw.sembilan);
        mp.start();
        nilai.setText(nilai.getText().toString()+".");
    }
    public void tekanTambah(View view){
        mp = MediaPlayer.create(getApplicationContext(),R.raw.sembilan);
        mp.start();

        temp = nilai.getText().toString();

        if(TextUtils.isEmpty(temp)) {
            Toast.makeText(this, "Please Press a Number! ", Toast.LENGTH_SHORT).show();
            return;
        } else {
            penjumlahan = true;
            bil1 = Float.parseFloat(temp);
            nilai.setText(null);
        }
    }

    public void tekanKurang(View view){
        mp = MediaPlayer.create(getApplicationContext(),R.raw.sembilan);
        mp.start();
        temp = nilai.getText().toString();

        if(TextUtils.isEmpty(temp)) {
            Toast.makeText(this, "Please Press a Number! ", Toast.LENGTH_SHORT).show();
            return;
        } else {
            pengurangan = true;
            bil1 = Float.parseFloat(temp);
            nilai.setText(null);
        }
    }

    public void tekanKali(View view){
        mp = MediaPlayer.create(getApplicationContext(),R.raw.sembilan);
        mp.start();
        temp = nilai.getText().toString();

        if(TextUtils.isEmpty(temp)) {
            Toast.makeText(this, "Please Press a Number! ", Toast.LENGTH_SHORT).show();
            return;
        } else {
            perkalian = true;
            bil1 = Float.parseFloat(temp);
            nilai.setText(null);
        }
    }

    public void tekanBagi(View view){
        mp = MediaPlayer.create(getApplicationContext(),R.raw.sembilan);
        mp.start();
        temp = nilai.getText().toString();

        if(TextUtils.isEmpty(temp)) {
            Toast.makeText(this, "Please Press a Number! ", Toast.LENGTH_SHORT).show();
            return;
        } else {
            pembagian = true;
            bil1 = Float.parseFloat(temp);
            nilai.setText(null);
        }
    }

    public void tekanC(View view){
        mp = MediaPlayer.create(getApplicationContext(),R.raw.nol);
        mp.start();

        nilai.setText(null);
        penjumlahan = false;
        perkalian = false;
        pengurangan =false;
        pembagian =false;
    }

    public void tekanEqual(View view){
        mp = MediaPlayer.create(getApplicationContext(),R.raw.sembilan);
        mp.start();
        temp = nilai.getText().toString();

        if(TextUtils.isEmpty(temp)) {
            Toast.makeText(this, "Please Press a Number! ", Toast.LENGTH_SHORT).show();
            return;
        } else {
            bil2 = Float.parseFloat(temp);

            if (penjumlahan == true){
                nilai.setText(bil1+bil2+"");
                penjumlahan = false;
            } else if (pengurangan == true){
                nilai.setText(bil1-bil2+"");
                pengurangan = false;
            } else if (perkalian == true){
                nilai.setText(bil1*bil2+"");
                perkalian = false;
            } else if (pembagian == true){
                nilai.setText(bil1/bil2+"");
                pembagian = false;
            }
        }
    }
}
