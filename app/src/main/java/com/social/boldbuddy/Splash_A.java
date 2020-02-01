package com.social.boldbuddy;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.social.boldbuddy.Main_Menu.MainMenuActivity;
import com.social.boldbuddy.SimpleClasses.Variables;
import com.squareup.picasso.Picasso;

public class Splash_A extends AppCompatActivity {


    CountDownTimer countDownTimer;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        Variables.sharedPreferences=getSharedPreferences(Variables.pref_name,MODE_PRIVATE);
        imageView = findViewById(R.id.splash_screen);
        Picasso.with(this).load(R.drawable.splash_screen).into(imageView);

        countDownTimer= new CountDownTimer(2500, 500) {

            public void onTick(long millisUntilFinished) {

            }
            public void onFinish() {

                    startActivity(new Intent(Splash_A.this, MainMenuActivity.class));
                    overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                    finish();

            }
        }.start();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        countDownTimer.cancel();
    }

}
