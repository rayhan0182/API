package com.example.apiservice.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apiservice.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.alluser.setOnClickListener {


            startActivity(Intent(this@MainActivity, MainActivity2::class.java))

        }




    }
}