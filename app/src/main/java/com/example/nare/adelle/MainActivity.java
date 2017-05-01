package com.example.nare.adelle;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "tag";


    TextView btnTesakani, btnInfo, btnkap, btncar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        btnTesakani = (TextView) findViewById(R.id.btntesak);
        btnInfo = (TextView) findViewById(R.id.btnmermasin);
        btncar = (TextView) findViewById(R.id.btncarayutyun);
        btnkap = (TextView) findViewById(R.id.btnkap);

        btnTesakani.setOnClickListener(this);
        btnInfo.setOnClickListener(this);
        btncar.setOnClickListener(this);
        btnkap.setOnClickListener(this);


        // MediaPlayer player = MediaPlayer.create(this,R.raw.mus);
        // player.start();

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btntesak:
                startActivity(new Intent(MainActivity.this, Tesakani_Activity.class));
                break;
            case R.id.btnmermasin:
                startActivity(new Intent(MainActivity.this, Info_Activity.class));
                break;
            case R.id.btncarayutyun:
                startActivity(new Intent(MainActivity.this, Service_Activity.class));
                break;
            case R.id.btnkap:
                startActivity(new Intent(MainActivity.this, Kap_Activity.class));
                break;
        }
    }
}
