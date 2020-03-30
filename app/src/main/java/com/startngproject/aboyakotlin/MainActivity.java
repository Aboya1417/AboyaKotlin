package com.startngproject.aboyakotlin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameTv, userNameTv, emailTv, trackTv;

        String name, username, email, tracks;

        name = "Udo Bassey Nkereuwem";
        username = "Aboya";
        email = "basseynk2@gmail.com";
        tracks = "Mobile";


        nameTv = findViewById(R.id.textViewName);
        userNameTv = findViewById(R.id.textViewUsername);
        emailTv = findViewById(R.id.textViewEmail);
        trackTv = findViewById(R.id.textViewTracks);

        nameTv.setText("Name: " + name);
        userNameTv.setText("Username: " + username);
        emailTv.setText("Email: " + email);
        trackTv.setText("Track(s): " + tracks);
    }
}
