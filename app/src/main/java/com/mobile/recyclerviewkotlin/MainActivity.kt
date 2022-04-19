package com.mobile.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.cropcut,
                "Crop Cut",
                "Model Rambut Pria 2022"
            ),
            Superhero(
                R.drawable.fringecrop,
                "Fringe Crop",
                "Model Rambut Pria 2022"
            ),
            Superhero(
                R.drawable.frenchcrop,
                "Frech Crop",
                "Model Rambut Pria 2022"
            ),
            Superhero(
                R.drawable.pompadour,
                "Pompadour",
                "Model Rambut Pria 2022"
            ),
            Superhero(
                R.drawable.sidepart,
                "Side Part",
                "Model Rambut Pria 2022"
            ),
            Superhero(
                R.drawable.taperfade,
                "Tape Fade",
                "Model Rambut Pria 2022"
            ),
            Superhero(
                R.drawable.tappercrop,
                "Tapper Cut",
                "Model Rambut Pria 2022"
            ),
            Superhero(
                R.drawable.texturedcrop,
                "Textured Crop",
                "Model Rambut Pria 2022"
            ),
            Superhero(
                R.drawable.tightcrop,
                "Tight Crop",
                "Model Rambut Pria 2022"
            ),
            Superhero(
                R.drawable.undercut,
                "Under Cut",
                "Model Rambut Pria 2022"
            )
            )


        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){

            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}