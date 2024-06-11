package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R.*
import com.example.myapplication.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
            val btnNext = findViewById<ImageView>(R.id.btnNext)
            binding.btnNext.setOnClickListener{
                val intent = Intent(this,SecondBirdActivity::class.java)
                startActivity(intent)

            }
            Picasso
                .get()
                .load("https://media.istockphoto.com/id/1360923661/photo/flying-pigeon-in-the-woods.webp?b=1&s=170667a&w=0&k=20&c=tc3Q6rDKEjYmXdqqTXQ0hI2X-CiLcITVnZdFxTpWXog=")
                .into(binding.imageView)
        }
    }
