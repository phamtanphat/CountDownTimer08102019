package com.example.countdowntimer08102019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mImgBanner;
    int[] arrayImage = new int[4];
    int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        mapview();
    }

    private void mapview() {

        CountDownTimer countDownTimer = new CountDownTimer(2000,2000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mImgBanner.setImageResource(arrayImage[count++]);
                if (count >= arrayImage.length){
                    count = 0;
                }

            }
            @Override
            public void onFinish() {
                this.start();
            }
        };
        countDownTimer.start();
    }

    private void init() {
        mImgBanner = findViewById(R.id.imageviewBanner);

        arrayImage[0] = R.drawable.banner1;
        arrayImage[1] = R.drawable.banner2;
        arrayImage[2] = R.drawable.banner3;
        arrayImage[3] = R.drawable.banner4;
    }
}
