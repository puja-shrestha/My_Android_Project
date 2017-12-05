package com.example.mypc.coderswag.Services

import com.example.mypc.coderswag.Model.Category
import com.example.mypc.coderswag.Model.Product

/**
 * Created by My PC on 12/5/2017.
 */
object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoddieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat01"),
            Product("Devslopes Hat Black", "$20", "hat02"),
            Product("Devslopes Hat White", "$18","hat03"),
            Product("Devslopes Hat Snapback", "$22", "hat04")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie gray", "$28","hoodie01"),
            Product("Devslopes Hoodie Red", "$32","hoodie02"),
            Product("Devslopes Gray Hoodie", "$28","hoodie03"),
            Product("Devslopes Black Hoodie", "$32","hoodie04")
    )

    val shirts = listOf(
            Product("Devslopes Shirt Black", "$18","shirt01"),
            Product("Devslopes Badge Light gray", "$20","shirt02"),
            Product("Devslopes Logo Shirt Red", "$22","shir03"),
            Product("Devslopes Hustle", "$22","shirt04"),
            Product("kickflip","$18","shirt05")
    )
}