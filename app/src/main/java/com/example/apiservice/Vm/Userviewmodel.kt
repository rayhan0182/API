package com.example.apiservice.Vm

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.apiservice.Model.Createdata
import com.example.apiservice.Model.Showdata
import com.example.apiservice.Repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class Userviewmodel @Inject constructor(val repository: Repository) : ViewModel() {


    private val _ulivedata = MutableLiveData<List<Showdata>>()

    val livedata: LiveData<List<Showdata>> = _ulivedata


    private val _cdata = MutableLiveData<Createdata>()

    val cdata: LiveData<Createdata> = _cdata


    fun fetchuser() {

        viewModelScope.launch {

            try {


                _ulivedata.value = repository.getrepo()


            } catch (e: Exception) {

                Log.e("fetchuser: ", e.message.toString())

            }

        }

    }


    fun createuser(id: Int, htitle: String, details: String) {


        viewModelScope.launch {

            try {

                val userd = Createdata(id, 1, htitle, details)

                _cdata.value = userd


            } catch (e: Exception) {


                Log.e("createuser: ", e.message.toString())

            }


        }


    }


}