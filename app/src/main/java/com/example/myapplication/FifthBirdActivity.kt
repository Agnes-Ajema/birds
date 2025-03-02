package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityFifthBirdBinding
import com.example.myapplication.databinding.ActivityForthBirdBinding
import com.squareup.picasso.Picasso

class FifthBirdActivity : AppCompatActivity() {

    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityFifthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnPrev5 = findViewById<ImageView>(R.id.btnPrev5)
        binding.btnPrev5.setOnClickListener{
            finish()
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1580980407668-6bb45a674180?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8ZG92ZXxlbnwwfHwwfHx8MA%3D%3D")
            .into(binding.imageView2)

        }
    }

