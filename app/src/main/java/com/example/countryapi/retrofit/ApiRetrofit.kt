package com.example.countryapi.retrofit

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiRetrofit {

    companion object{
        lateinit var gson: Gson
        lateinit var retrofit: Retrofit

        fun init():Retrofit{
            if (!this::gson.isInitialized){
                gson = GsonBuilder()
                    .setLenient()
                    .create()
            }
            if (!this::retrofit.isInitialized){
                retrofit =Retrofit.Builder()
                    .baseUrl("https://restcountries.com/v3.1/all/")
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()
            }
            return retrofit
        }
    }

}