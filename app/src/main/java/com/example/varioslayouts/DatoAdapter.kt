package com.example.varioslayouts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ejemplos.b8.EPVariosLayoutsRecycler.Dato

class DatoAdapter internal constructor (val datos: ArrayList<Dato>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup,
                                    viewType: Int):
                            RecyclerView.ViewHolder {


        return when (viewType){

            0 -> HolderType1(LayoutInflater.from(parent.context)
                .inflate(R.layout.item_type_1, parent, false))
            1 -> HolderType2(LayoutInflater.from(parent.context)
                .inflate(R.layout.item_type_2, parent, false))
            2 -> HolderType3(LayoutInflater.from(parent.context)
                .inflate(R.layout.item_type_3, parent, false))

            else -> HolderType1(LayoutInflater.from(parent.context)
                .inflate(R.layout.item_type_1, parent, false))
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item: Dato = datos[position]

            when (holder) {
                is HolderType1 ->holder.bind(item)

                is HolderType2 ->holder.bind(item)

                is HolderType3 ->holder.bind(item)

            }
    }

    override fun getItemCount() = datos.size

    override fun getItemViewType(position: Int) = datos[position].tipo

}