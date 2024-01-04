package com.gekss.sydykov_daniel_hw_7_month_3_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gekss.sydykov_daniel_hw_7_month_3_.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val singer = intent.getStringExtra("singer")
        binding.tvResName.text = name
        binding.tvResSinger.text = singer
    }
}