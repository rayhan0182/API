package com.example.apiservice.Retrofit

import com.example.apiservice.Activity.createuser
import com.example.apiservice.Model.Createdata
import com.example.apiservice.Model.Showdata
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface Apiservice {

    @GET("users")

   suspend fun getdata(): List<Showdata>

   @POST("posts")

    suspend fun create(@Body used: Createdata): Createdata


}