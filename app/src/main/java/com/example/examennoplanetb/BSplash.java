package com.example.examennoplanetb;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class BSplash extends AppCompatActivity {
    private TextView titulo;
    private TextView frase;
    private ImageView cohete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsplash);
        getSupportActionBar().hide();
        titulo = findViewById(R.id.tvtitulo);
         frase = findViewById(R.id.tvfrase);
         cohete = findViewById(R.id.rocketIMG);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.anim);

        titulo.startAnimation(myanim);
        frase.startAnimation(myanim);
        cohete.startAnimation(myanim);
        openApp(true);
    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BSplash
                        .this, BLogin.class);
                startActivity(intent);
                finish();
            }
        }
        , 3000);
    }
}
