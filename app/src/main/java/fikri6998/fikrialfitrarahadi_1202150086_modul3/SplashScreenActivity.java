package fikri6998.fikrialfitrarahadi_1202150086_modul3;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //memungkinkan anda untuk mengirim atau memproses objek message disini kasusnya adalah menampilkan toast setelah muncul
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //melakukan intent ke menu selanjutnya setelah splash screen sudah muncul
                Intent mainIntent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                SplashScreenActivity.this.startActivity(mainIntent);
                //jeda selesai Splashscreen
                SplashScreenActivity.this.finish();

            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
