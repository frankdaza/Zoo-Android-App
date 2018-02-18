package com.frankdaza.zooapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.frankdaza.zooapp.Adapter.AnimalAdapter
import com.frankdaza.zooapp.model.Animal
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var listAnimals = ArrayList<Animal>()
    lateinit var animalsAdapter: AnimalAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load animals
        this.listAnimals.add(Animal("Babbon", "The Baboon is a kind of monkey that live in the jungle and in many zoos in the planet", R.drawable.baboon))
        this.listAnimals.add(Animal("Bulldog", "The Bulldog is a kind of dog that is so pretty and a good friend", R.drawable.bulldog))
        this.listAnimals.add(Animal("Panda", "The Panda is one of the beautiful fat animals in the worl, only eats bamboo", R.drawable.panda))
        this.listAnimals.add(Animal("Swallow", "The Swallow is a kind of bird that live in Colombia", R.drawable.swallow_bird))
        this.listAnimals.add(Animal("White Tiger", "The White Tiger is similar to the lion, but is more beautiful", R.drawable.white_tiger))
        this.listAnimals.add(Animal("Zebra", "The Zebra is like a white horse with black lines, or a black horse with white lines", R.drawable.zebra))

        this.animalsAdapter = AnimalAdapter(this, this.listAnimals)
        listViewAnimals.adapter = this.animalsAdapter
    }

}
