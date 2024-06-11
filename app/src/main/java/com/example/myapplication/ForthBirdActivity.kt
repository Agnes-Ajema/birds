package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityForthBirdBinding
import com.example.myapplication.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ForthBirdActivity : AppCompatActivity() {

    lateinit var binding: ActivityForthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityForthBirdBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnPrev4.setOnClickListener{
            finish()
        }
        binding.btnNext4.setOnClickListener {
            val intent = Intent(this,FifthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://plus.unsplash.com/premium_photo-1694621017917-bd784f857235?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8ZG92ZXxlbnwwfHwwfHx8MA%3D%3D")
            .into(binding.imageView3)
    }
}








