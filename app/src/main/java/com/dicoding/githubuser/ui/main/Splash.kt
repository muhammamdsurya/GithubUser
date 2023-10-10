package com.dicoding.githubuser.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.dicoding.githubuser.R

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Tambahkan kode untuk menunda tampilan splash screen jika diperlukan.
        // Misalnya, Anda bisa menambahkan delay menggunakan handler.

        Handler().postDelayed({
            // Setelah selesai splash screen, pindah ke activity utama atau lainnya.
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Menutup activity splash screen agar tidak bisa kembali lagi.
        }, 3000) // Delay selama 3 detik (misalnya).
    }
}
