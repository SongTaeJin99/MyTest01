package com.example.mytest01.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mytest01.R
import com.example.mytest01.databinding.RvItemBinding
import com.example.mytest01.datas.PersonInfo
import com.example.mytest01.viewholders.PersonViewHolder

class PersonAdapter(val pDatas : MutableList<PersonInfo>) : RecyclerView.Adapter<PersonViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        return PersonViewHolder(RvItemBinding.bind(view))
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.binding.itemName.text = pDatas[position].name
        holder.binding.itemDesc.text = pDatas[position].desc
        holder.binding.itemIv.setImageResource(pDatas[position].img)

    }


    override fun getItemCount(): Int {
        return  pDatas.size
    }

}