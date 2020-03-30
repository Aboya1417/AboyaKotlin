package com.startngproject.aboyakotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = "Udo Bassey Nkereuwem"
        val username: String = "Aboya1417"
        val email: String = "basseynk2@gmail.com"
        val tracks: String = "Mobile"
        val nameTv: TextView = findViewById(R.id.textViewName)
        val userNameTv: TextView = findViewById(R.id.textViewUsername)
        val emailTv: TextView = findViewById(R.id.textViewEmail)
        val trackTv: TextView = this.findViewById(R.id.textViewTracks)
        nameTv.text = "Name: $name"
        userNameTv.text = "Username: $username"
        emailTv.text = "Email: $email"
        trackTv.text = "Track(s): $tracks"
    }
}