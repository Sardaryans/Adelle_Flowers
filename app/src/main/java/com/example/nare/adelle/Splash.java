package com.example.nare.adelle;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    TextView splash1, splash0, splash2, splash3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        splash1 = (TextView) findViewById(R.id.txsplash1);
        splash2 = (TextView) findViewById(R.id.txsplash2);
        splash0 = (TextView) findViewById(R.id.txsplash0);
        splash3 = (TextView) findViewById(R.id.txsplash3);

        AlphaAnimation animation = new AlphaAnimation(0f, 1.0f);
        animation.setDuration(1500);
        animation.setStartOffset(0);
        animation.setFillAfter(true);
        splash1.startAnimation(animation);
        splash0.startAnimation(animation);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                splash2.setAlpha(0);
                splash3.setAlpha(0);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                splash2.setAlpha(1);
                splash3.setAlpha(1);
                AlphaAnimation animation2 = new AlphaAnimation(0, 1);
                animation2.setDuration(1500);
                animation2.setStartOffset(0);
                animation2.setFillAfter(true);
                splash2.startAnimation(animation2);
                splash3.startAnimation(animation2);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000);

    }
}
