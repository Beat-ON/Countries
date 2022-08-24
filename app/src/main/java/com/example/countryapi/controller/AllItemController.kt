package com.example.countryapi.controller

import com.example.countryapi.entity.AllItem
import com.example.countryapi.retrofit.ApiRetrofit
import com.example.countryapi.retrofit.QueryInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AllItemController {

    fun AllItemStart(listener:AllItemInterface){
        var call =ApiRetrofit.init()
            .create(QueryInterface::class.java)
            .getAllItems()
            .enqueue(object : Callback<MutableList<AllItem>>{
                override fun onResponse(
                    call: Call<MutableList<AllItem>>?,
                    response: Response<MutableList<AllItem>>?
                ) {
                    listener.onResponse(response?.body())
                }

                override fun onFailure(call: Call<MutableList<AllItem>>?, t: Throwable?) {
                    listener.onFailure(t?.localizedMessage)
                }

            })
    }

}