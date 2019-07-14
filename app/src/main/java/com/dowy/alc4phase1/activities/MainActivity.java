package com.dowy.alc4phase1.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dowy.alc4phase1.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openAboutALC(View view) {
        startActivity(new Intent(this, AboutActivity.class));
    }

    public void openMyProfile(View view) {
        startActivity(new Intent(this, ProfileActivity.class));
    }
}
