package com.example.countdowntimer08102019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mImgBanner;
    int[] arrayImage = new int[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        mapview();
    }

    private void mapview() {
        CountDownTimer countDownTimer = new CountDownTimer(10000,5000 ) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.d("BBB",millisUntilFinished + "");
            }

            @Override
            public void onFinish() {

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
