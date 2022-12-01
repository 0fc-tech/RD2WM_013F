package com.example.mod10recyclerview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val alGateaux = arrayListOf(
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
            Gateau("Gateau au chocolat",false,"Chocolaté et sucré", 4),
            Gateau("Gâteau au citron et à l'orange",true,"Fruité et sucré", 8),
            Gateau("Quatre quart",false,"Sucré et beurré", 1000),
            Gateau("Tarte à la framboise",false,"Framboisé", 4),
        )
        val adapter = GateauAdapter(alGateaux,{
            Toast.makeText(
                this,
                if(it.glacage) "Glacé" else "Pas glacé",
                Toast.LENGTH_SHORT).show()
        })
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewGateau)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}