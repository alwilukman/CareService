package com.example.careservice

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.careservice.databinding.ActivityMainBinding
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.FirebaseAuthUIActivityResultContract
import com.firebase.ui.auth.data.model.FirebaseAuthUIAuthenticationResult
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {


        private lateinit var binding: ActivityMainBinding

        private val contract = FirebaseAuthUIActivityResultContract()
        private val signInLauncher = registerForActivityResult(contract) {
            this.onSignInResult(it)
        }

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.login.setOnClickListener {
                mulaiLogin()
            }
        }

        private fun mulaiLogin() {
            val providers = arrayListOf(
                AuthUI.IdpConfig.GoogleBuilder().build()
            )
            val intent = AuthUI.getInstance()
                .createSignInIntentBuilder()
                .setAvailableProviders(providers)
                .build()
            signInLauncher.launch(intent)
        }

        private fun onSignInResult(
            result: FirebaseAuthUIAuthenticationResult
        ) {
            val response = result.idpResponse
            if (result.resultCode == RESULT_OK) {
                val nama = FirebaseAuth.getInstance()
                    .currentUser?.displayName
                Log.i("LOGIN", "$nama berhasil login")
            } else {
                Log.i("LOGIN", "Login gagal: ${response?.error?.message}")
            }
            updateUI()
        }

        private fun updateUI() {
            startActivity(Intent(this, MenuUtama::class.java))
            finish()
        }
}