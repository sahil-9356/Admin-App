package com.example.adminparivaragro

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.adminparivaragro.adpater.DeliveryAdapter
import com.example.adminparivaragro.adpater.PendingOrderAdapter
import com.example.adminparivaragro.databinding.ActivityPendingOrderBinding

class PendingOrderActivity : AppCompatActivity() {
    private val binding:ActivityPendingOrderBinding by lazy {
        ActivityPendingOrderBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.backButton.setOnClickListener {
            finish()
        }

        val orderedcustomerName= arrayListOf("John Doe","Jane Smith","Mike Jackson")

       val orderedQuantity= arrayListOf("8","6","5")

        val orderedproductImage= arrayListOf(R.drawable.brofreya,R.drawable.brofreya,R.drawable.brofreya)

        val adapter= PendingOrderAdapter(orderedcustomerName,orderedQuantity, orderedproductImage,this)
        binding.pendingOrderRecyclerView.adapter=adapter
        binding.pendingOrderRecyclerView.layoutManager= LinearLayoutManager(this)

    }
}

