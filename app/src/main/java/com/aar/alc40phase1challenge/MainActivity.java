package com.aar.alc40phase1challenge;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonAbout;
    private Button buttonProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("ALC 4.0 - Phase 1");

        buttonAbout = findViewById(R.id.button_about);
        buttonAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutALC();

            }
        });


    }

    public void openAboutALC() {
        Intent intent = new Intent(this, AboutALC.class);
        startActivity(intent);


        buttonProfile = findViewById(R.id.button_profile);

        buttonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMyProfile();

            }
        });
    }

    public void openMyProfile() {
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);

    }
}
