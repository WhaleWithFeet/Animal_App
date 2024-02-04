package com.kroger.classapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val characters = mutableListOf<Animal>()
        characters.add(
            createAnimal(
                "Orangutan",
                "ID: 1",
                "Size: 100 pounds",
                "Life Span: 37 years"
            )
        )
        characters.add(
            createAnimal(
                "Capybara",
                "ID: 2",
                "Size: 110 pounds",
                "Life Span: 6 years"
            )
        )
        characters.add(
            createAnimal(
                "Red Ant",
                "ID: 3",
                "Size: 3 milligrams",
                "Life Span: 60 days"
            )
        )
        characters.add(
            createAnimal(
                "Grizzly Bear",
                "ID: 4",
                "Size: 600 pounds",
                "Life Span: 22 years"
            )
        )
        characters.add(
            createAnimal(
                "Platypus",
                "ID: 5",
                "Size: 4 pounds",
                "Life Span: 15 years"
            )
        )
        characters.add(
            createAnimal(
                "Elk",
                "ID: 6",
                "Size: 710 pounds",
                "Life Span: 11 years"
            )
        )
        characters.add(
            createAnimal(
                "Gorilla",
                "ID: 7",
                "Size: 350 pounds",
                "Life Span: 37 years"
            )
        )
        characters.add(
            createAnimal(
                "Mongoose",
                "ID: 8",
                "Size: 11 ounces",
                "Life Span: 10 years"
            )
        )

        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AnimalAdapter(characters)
    }
    private fun createAnimal(name: String,id: String, size: String, lifeExp: String) = Animal(
        name = name,
        size = size,
        lifeExp = lifeExp,
        id =  id,
        image = R.drawable.ic_launcher_background


    )

}
