package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {
    lateinit var binding: ActivityMainBinding
    var presenter = Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.init(this)
        initClicker()
    }

    private fun initClicker() {
        with(binding) {
            incrementBtn.setOnClickListener {
                presenter.increment()
            }
        }
    }

    override fun showCount(count: String) {
        binding.countTv.text = count

    }

    override fun showToast(message: String) {
        Toast.makeText(applicationContext,message,Toast.LENGTH_LONG).show()
    }

    override fun showColor(color: Int) {
        binding.countTv.setTextColor(color)
    }
}
