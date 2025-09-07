package com.example.apiservice.Activity

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apiservice.Model.Createdata
import com.example.apiservice.R
import com.example.apiservice.Vm.Userviewmodel
import com.example.apiservice.databinding.ActivityCreateuserBinding
import com.example.apiservice.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class createuser : AppCompatActivity() {
    lateinit var binding: ActivityCreateuserBinding
    private val viewmodel: Userviewmodel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateuserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.save.setOnClickListener {

            val userid = binding.userid.text.toString()

            val title = binding.title.text.toString()

            val body = binding.body.text.toString()

            viewmodel.createuser(userid.toInt(),title,body)

            viewmodel.cdata.observe(this){posts->

               binding.respons.text = ("${posts.userid}\n${posts.title}\n${posts.body}")

            }
        }

    }




}