package com.example.firebaseauthinkotlin.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firebaseauthinkotlin.MainActivity
import com.example.firebaseauthinkotlin.R
import com.example.firebaseauthinkotlin.databinding.ActivityRegisterPageBinding

class RegisterPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRegisterPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "Registration"

        binding.createAccountBtn.setOnClickListener {
            val email = binding.emailRegister.text.toString()
            val password = binding.passwordRegister.text.toString()
            if(email.isNotEmpty() && password.isNotEmpty())
                MainActivity.auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                    if(it.isSuccessful){
                        startActivity(Intent(this, DetailsPage::class.java))
                        finish()
                    }
                }.addOnFailureListener {
                    Toast.makeText(this, it.localizedMessage, Toast.LENGTH_LONG).show()
                }
        }
    }
}