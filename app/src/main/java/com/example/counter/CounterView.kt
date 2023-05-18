package com.example.counter

interface CounterView {

    fun showCount(count:String)
    fun showToast(message: String)
    fun showColor(color: Int)

}