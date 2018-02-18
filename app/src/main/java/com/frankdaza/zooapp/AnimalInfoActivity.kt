package com.frankdaza.zooapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_animal_info.*

class AnimalInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_info)

        val bundle: Bundle = intent.extras
        imgAnimal.setImageResource(bundle.getInt("image"))
        txtAnimalName.text = bundle.getString("name")
        txtAnimalDescription.text = bundle.getString("description")
    }
}
