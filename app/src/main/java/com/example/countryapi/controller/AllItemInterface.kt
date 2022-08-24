package com.example.countryapi.controller

import com.example.countryapi.entity.AllItem

interface AllItemInterface {

    fun onResponse(allitems:MutableList<AllItem>?)
    fun onFailure(message:String?)

}