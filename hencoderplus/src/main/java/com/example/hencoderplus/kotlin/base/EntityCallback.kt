package com.example.hencoderplus.kotlin.base

interface EntityCallback<T>{
    fun onSuccess(t:T)
    fun onFailure(message:String?)
}