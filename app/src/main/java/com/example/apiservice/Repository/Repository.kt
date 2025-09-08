package com.example.apiservice.Repository

import android.util.Log
import com.example.apiservice.Model.Createdata
import com.example.apiservice.Model.Showdata
import com.example.apiservice.Retrofit.Apiservice
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Path
import javax.inject.Inject

class Repository @Inject constructor(private val apiservice: Apiservice) {


    suspend fun getrepo(): List<Showdata>{


       return apiservice.getdata()


    }

    suspend fun createrepo(userd: Createdata): Createdata{


       return apiservice.create(userd)

    }

    suspend fun updatefetch(showdata: Showdata):Result<Showdata>{

       return try {

            val udata = apiservice.updateuser(showdata.id,showdata)

            Result.success(udata)


        } catch (e: Exception){

            Result.failure(e)

        }




    }








}