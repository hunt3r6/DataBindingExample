package com.androidunix.databindingexample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.androidunix.databindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.cat = Cat(name = "Garfile", color = "Orange", ras = "Persia")
        binding.act = this

    }

    fun showCat(cat: Cat) {
        Toast.makeText(this, cat.name, Toast.LENGTH_SHORT).show()
    }
}
