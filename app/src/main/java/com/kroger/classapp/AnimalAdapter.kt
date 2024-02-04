package com.kroger.classapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimalAdapter(private val animals: List<Animal>) : RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {


    class AnimalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val animalImage: ImageView = itemView.findViewById(R.id.Animal_image)
        val animalName: TextView = itemView.findViewById(R.id.Animal_title)
        val animalSize: TextView = itemView.findViewById(R.id.Animal_Size)
        val animalLife: TextView = itemView.findViewById(R.id.Animal_Life)
        val animalID: TextView = itemView.findViewById(R.id.Animal_ID)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {

       return AnimalViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.animal_card_view, parent, false))
    }

    override fun getItemCount(): Int {
       return animals.size
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val animal = animals[position]
        holder.animalName.text = animal.name
        holder.animalID.text = animal.id
        holder.animalLife.text = animal.lifeExp
        holder.animalSize.text = animal.size
        holder.animalImage.setImageResource(animal.image)

    }
}
