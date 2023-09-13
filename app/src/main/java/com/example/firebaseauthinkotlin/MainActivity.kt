package com.example.firebaseauthinkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firebaseauthinkotlin.databinding.ActivityMainBinding
import com.example.firebaseauthinkotlin.ui.LoginPage
import com.example.firebaseauthinkotlin.ui.RegisterPage
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSignIn.setOnClickListener {
            startActivity(Intent(this, LoginPage::class.java))
        }

        binding.btnRegistration.setOnClickListener {
            startActivity(Intent(this, RegisterPage::class.java))
        }

    }
}