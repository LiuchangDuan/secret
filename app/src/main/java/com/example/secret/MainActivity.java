package com.example.secret;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.secret.atys.AtyTimeline;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        String token = Config.getCachedToken(this);
        startActivity(new Intent(this, AtyTimeline.class));
//        if (token != null) {
//            Intent i = new Intent(this, AtyTimeline.class);
//            i.putExtra(Config.KEY_TOKEN, token);
//            startActivity(i);
//        } else {
//            startActivity(new Intent(this, AtyLogin.class));
//        }
        finish();
    }
}
