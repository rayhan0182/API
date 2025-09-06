package com.example.apiservice.Repository

import com.example.apiservice.Model.Showdata
import com.example.apiservice.Retrofit.Apiservice
import javax.inject.Inject

class Repository @Inject constructor(private val apiservice: Apiservice) {


    suspend fun getrepo(): List<Showdata>{


       return apiservice.getdata()


    }



}