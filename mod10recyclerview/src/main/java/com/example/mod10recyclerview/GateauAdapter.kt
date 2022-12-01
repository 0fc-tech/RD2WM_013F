package com.example.mod10recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mod10recyclerview.databinding.TemplateLineGateauBinding

class GateauAdapter(val alGateaux : ArrayList<Gateau>, val listener : (gateau:Gateau) -> Unit) :
    RecyclerView.Adapter<GateauAdapter.GateauVH>(){

    class GateauVH(val bindingLineGateau:TemplateLineGateauBinding)
        : ViewHolder(bindingLineGateau.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GateauVH {
        val binding = TemplateLineGateauBinding.inflate(
            LayoutInflater.from(parent.context),parent,false)
        return GateauVH(binding)
    }

    override fun onBindViewHolder(holder: GateauVH, position: Int) {
        val gateauToDisplay = alGateaux[position]
        holder.bindingLineGateau.gateau=gateauToDisplay
        holder.itemView.setOnClickListener {
            listener(gateauToDisplay)
        }
    }

    override fun getItemCount(): Int = alGateaux.size

}






