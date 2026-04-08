package com.example.anacoffe.pertemuan_4

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.anacoffe.MainActivity
import com.example.anacoffe.R
import com.example.anacoffe.databinding.ActivityFourthBinding
import com.example.anacoffe.databinding.ActivityMainBinding
import com.example.anacoffe.databinding.ActivityThirdBinding

class FourthActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        Log.e("==onCreate==", "fourth berhasil")
        binding = ActivityFourthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val name = intent.getStringExtra("nama")
        val from = intent.getStringExtra("asal")
        val age = intent.getIntExtra("usia", 0)
        Log.e("Data Intent", "Nama: $name , Usia: $age, Asal: $from")

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.e("==onStart==", "onStart: {nama_activity} terlihat di layar")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("==onDestroy==", "{nama_activity} dihapus dari stack")
    }
}

