package com.frankdaza.zooapp.Adapter

import android.content.Context
import android.content.Intent
import android.support.v4.content.ContextCompat

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.frankdaza.zooapp.AnimalInfoActivity
import com.frankdaza.zooapp.model.Animal
import kotlinx.android.synthetic.main.animal_ticket.view.*

/**
 * Created by Frank Edward Daza González on 2/18/18.
 */
class AnimalAdapter : BaseAdapter {

    var listAnimals: ArrayList<Animal>
    var context: Context

    constructor(context: Context, listAnimals: ArrayList<Animal>) : super() {
        this.context = context
        this.listAnimals = listAnimals
    }


    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val animal = this.listAnimals[p0]
        var inflater = this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var animalTicketView = inflater.inflate(com.frankdaza.zooapp.R.layout.animal_ticket, null)
        animalTicketView.animalImageView.setImageResource(animal.image)
        animalTicketView.nameTextView.text = animal.name
        animalTicketView.descripcionTextView.text = animal.description

        animalTicketView.mainItemLinearLayout.setOnClickListener {
            val intent = Intent(this.context, AnimalInfoActivity::class.java)
            intent.putExtra("name", animal.name)
            intent.putExtra("description", animal.description)
            intent.putExtra("image", animal.image)
            ContextCompat.startActivity(this.context, intent, null)
        }

        return animalTicketView
    }

    override fun getItem(p0: Int): Any {
        return this.listAnimals.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return this.listAnimals.size
    }

}