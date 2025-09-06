package com.example.apiservice.Retrofit

import com.example.apiservice.Model.Showdata
import retrofit2.http.GET

interface Apiservice {

    @GET("users")

   suspend fun getdata(): List<Showdata>


}