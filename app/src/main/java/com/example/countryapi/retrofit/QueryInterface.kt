package com.example.countryapi.retrofit

import com.example.countryapi.entity.AllItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.GET

interface QueryInterface {

    @GET("/all")
    fun getAllItems(): Call<MutableList<AllItem>>


}