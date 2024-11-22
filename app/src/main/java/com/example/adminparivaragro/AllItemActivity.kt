package com.example.adminparivaragro

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adminparivaragro.adpater.AddItemAdapter
import com.example.adminparivaragro.databinding.ActivityAllItemBinding

class AllItemActivity : AppCompatActivity() {
    private val binding: ActivityAllItemBinding by lazy {
        ActivityAllItemBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        val menuProductName= listOf("Fertilizers","Pesticides","Urea","Corn","Pesticides","Urea")
        val menuItemPrice= listOf("₹5","₹6","₹7","₹5","₹6","₹7",)
        val menuImage= listOf(R.drawable.brofreya,R.drawable.kocide_3000,R.drawable.kocide_3000,R.drawable.brofreya,R.drawable.kocide_3000,R.drawable.brofreya)
        binding.backButton.setOnClickListener {
            finish()
        }

        val adapter=AddItemAdapter(ArrayList(menuProductName),ArrayList(menuItemPrice),ArrayList(menuImage))

        binding.MenuRecyclerView.layoutManager=LinearLayoutManager(this)
        binding.MenuRecyclerView.adapter=adapter

        }
    }
