package com.example.counter

import android.graphics.Color

class Presenter {
    lateinit var view: CounterView
    var model = CounterModel()

    fun increment() {
        model.increment()
        view.showCount(model.count.toString())
        if (model.count == 10) {
            view.showToast("УРААААА")
        }
        if (model.count == 15) {
            view.showColor(Color.GREEN)
        }
    }

    fun init(view: CounterView) {
        this.view = view
    }
}