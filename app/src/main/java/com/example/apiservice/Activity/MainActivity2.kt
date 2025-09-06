package com.example.apiservice.Activity

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.apiservice.R
import com.example.apiservice.RC.Adapter
import com.example.apiservice.Vm.Userviewmodel
import com.example.apiservice.databinding.ActivityMain2Binding
import com.example.apiservice.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlin.getValue
@AndroidEntryPoint
class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    private val viewmodel: Userviewmodel by  viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        viewmodel.fetchuser()

        viewmodel.livedata.observe(this){data->

            binding.rc.adapter = Adapter(data)

        }

    }
}