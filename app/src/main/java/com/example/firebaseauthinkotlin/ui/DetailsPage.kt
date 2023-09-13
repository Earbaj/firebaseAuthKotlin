package com.example.firebaseauthinkotlin.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firebaseauthinkotlin.MainActivity
import com.example.firebaseauthinkotlin.R
import com.example.firebaseauthinkotlin.databinding.ActivityDetailsPageBinding

class DetailsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailsPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSignOut.setOnClickListener {
            MainActivity.auth.signOut()
            startActivity(Intent(this, MainActivity:: class.java))
            finish()
        }
    }
}