package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivitySecondBirdBinding
import com.example.myapplication.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {

    lateinit var binding:ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityThirdBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnPrev3.setOnClickListener{
            finish()
        }
        binding.btnNext3.setOnClickListener {
            val intent = Intent(this,ForthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1594032032416-f14717538fe2?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fGRvdmV8ZW58MHx8MHx8fDA%3D")
            .into(binding.imageView4)
    }
}

