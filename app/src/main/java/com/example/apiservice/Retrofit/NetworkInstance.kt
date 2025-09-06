package com.example.apiservice.Retrofit

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkInstance {

    @Provides

    fun baseurl() = "https://jsonplaceholder.typicode.com/"

    @Provides

    @Singleton

    fun retrofit(baseurl: String): Retrofit = Retrofit.Builder()

        .baseUrl(baseurl)

        .addConverterFactory(GsonConverterFactory.create())

        .build()


        @Provides

        @Singleton

        fun apiservice(retrofit: Retrofit): Apiservice = retrofit.create(Apiservice::class.java)



}