package com.example.apiservice.Activity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.apiservice.RC.Adapter
import com.example.apiservice.Vm.Userviewmodel
import com.example.apiservice.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val viewmodel: Userviewmodel by  viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewmodel.fetchuser()

        viewmodel.livedata.observe(this){data->

            binding.rc.adapter = Adapter(data)

        }



    }
}