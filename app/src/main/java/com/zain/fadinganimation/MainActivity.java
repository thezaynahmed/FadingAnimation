package com.zain.fadinganimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable cartoonAnimation;
    ImageView cartoonImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cartoonImage = findViewById(R.id.cartoon_image);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein_animation);
                cartoonImage.startAnimation(animation);
            }
        },50);
        return super.onTouchEvent(event);
    }
}