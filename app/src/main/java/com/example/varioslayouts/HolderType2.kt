package com.example.varioslayouts

import android.media.Image
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ejemplos.b8.EPVariosLayoutsRecycler.Dato

class HolderType2 (v: View) : RecyclerView.ViewHolder(v) {

    var imagen: ImageView
    var titulo: TextView


    init {
        imagen = v.findViewById(R.id.imageViewType2)
        titulo = v.findViewById(R.id.txt_titleType2)

    }
    fun bind(entity: Dato) {
        imagen.setImageBitmap(entity.foto)
        titulo.setText(entity.textoCorto)
    }

}
