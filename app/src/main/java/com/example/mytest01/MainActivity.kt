package com.example.mytest01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mytest01.adapters.PersonAdapter
import com.example.mytest01.databinding.ActivityMainBinding
import com.example.mytest01.datas.PersonInfo

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pDatas = mutableListOf(
            PersonInfo("John1", "i am jokdns1 ksf skfd skkw sfds", R.mipmap.ic_launcher),
            PersonInfo("John2", "i am jokdns2 ksf skfd skkw sfds", R.mipmap.ic_launcher),
            PersonInfo("John3", "i am jokdns3 ksf skfd skkw sfds", R.mipmap.ic_launcher),
            PersonInfo("John4", "i am jokdns4 ksf skfd skkw sfds", R.mipmap.ic_launcher),
            PersonInfo("John5", "i am jokdns5 ksf skfd skkw sfds", R.mipmap.ic_launcher),
            PersonInfo("John6", "i am jokdns6 ksf skfd skkw sfds", R.mipmap.ic_launcher),
            PersonInfo("John7", "i am jokdns7 ksf skfd skkw sfds", R.mipmap.ic_launcher),
            PersonInfo("John8", "i am jokdns8 ksf skfd skkw sfds", R.mipmap.ic_launcher),
            PersonInfo("John9", "i am jokdns9 ksf skfd skkw sfds", R.mipmap.ic_launcher),
            PersonInfo("John10", "i am jokdns10 ksf skfd skkw sfds", R.mipmap.ic_launcher),

        )

        val recyclerView = binding.rv
        recyclerView.adapter = PersonAdapter(pDatas)
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}