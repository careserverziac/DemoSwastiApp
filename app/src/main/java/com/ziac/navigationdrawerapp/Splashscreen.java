package com.ziac.navigationdrawerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SplashScreen;

import java.util.concurrent.ExecutionException;

public class Splashscreen extends AppCompatActivity {


    private Context context;

    ImageView  logo;
    TextView Versionname;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        handlermethod();

//        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce_interpolator);
//        logo.startAnimation(animation1);

        Versionname=findViewById(R.id.versionname);
        String vname=BuildConfig.VERSION_NAME;
        Versionname.setText(vname);

        logo = findViewById(R.id.logo);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce_interpolator);
        logo.startAnimation(animation1);


    }

    private void handlermethod() {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splashscreen.this, SliderActivity.class));
                finish();
            }
        } ,3000);
    }


}

