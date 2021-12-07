package com.example.varioslayouts

import android.media.Image
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ejemplos.b8.EPVariosLayoutsRecycler.Dato

class HolderType3 (v: View) : RecyclerView.ViewHolder(v) {

    var imagen: ImageView
    var titulo: TextView
    var texto: TextView

    init {
        imagen = v.findViewById(R.id.imageViewType3)
        titulo = v.findViewById(R.id.txt_titleType3)
        texto = v.findViewById(R.id.textViewLType3)

    }
    fun bind(entity: Dato) {
        imagen.setImageBitmap(entity.foto)
        titulo.setText(entity.textoCorto)
        texto.setText(entity.textoLargo)
    }
}
