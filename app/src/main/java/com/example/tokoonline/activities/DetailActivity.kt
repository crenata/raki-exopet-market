package com.example.tokoonline.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tokoonline.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    private lateinit var bundle: Bundle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bundle = intent.extras!!

        setSupportActionBar(binding.toolbar)
        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }

        binding.toolbarLayout.title = bundle.getString("name")
        binding.image.setImageResource(bundle.getInt("image"))
        binding.content.name.text = bundle.getString("name")
        binding.content.price.text = bundle.getString("price")
        binding.content.venom.text = bundle.getString("venom")
        binding.content.size.text = bundle.getString("size")
        binding.content.sex.text = bundle.getString("sex")
        binding.content.desc.text = bundle.getString("desc")
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}