package com.example.varioslayouts

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ejemplos.b8.EPVariosLayoutsRecycler.Dato
import com.example.varioslayouts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val datos : ArrayList<Dato> = arrayListOf()
        datos.add(
            Dato(
                "Cohete espacial",
                "Soy un cohete espacial que viajo por el espacio interestela",
                BitmapFactory.decodeResource(this.resources, R.drawable.cohete_flat),
                Tipo.TYPE_ITEM_1.ordinal
            )
        )
        datos.add(
            Dato(
                "Coordillera de noche",
                "No hay nada como una noche plácida en la montaña, ¿verdad?",
                BitmapFactory.decodeResource(this.resources, R.drawable.material_flat),
                Tipo.TYPE_ITEM_2.ordinal
            )
        )
        datos.add(
            Dato(
                "London city",
                "No hay nada como pasear por la orilla del Támesis en una mañana con niebla",
                BitmapFactory.decodeResource(this.resources, R.drawable.london_flat),
                Tipo.TYPE_ITEM_3.ordinal
            )
        )
        datos.add(
            Dato(
                "Discovery en la noche",
                "Viajar al epacio, recorrer la vía láctea, y volver a casa con mi Discovery...",
                BitmapFactory.decodeResource(this.resources, R.drawable.moon_flat),
                Tipo.TYPE_ITEM_3.ordinal
            )
        )

        val recyclerView = binding.mirecycler
        val adaptador = DatoAdapter(datos)

        recyclerView.adapter = adaptador
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


    }


    enum class Tipo {
        TYPE_ITEM_1,
        TYPE_ITEM_2,
        TYPE_ITEM_3}

}