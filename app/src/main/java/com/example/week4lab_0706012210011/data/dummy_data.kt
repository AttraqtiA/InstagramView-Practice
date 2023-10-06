package com.example.week4lab_0706012210011.data

import com.example.week4lab_0706012210011.R
import com.example.week4lab_0706012210011.model.categories
import com.example.week4lab_0706012210011.model.line_chat
import com.example.week4lab_0706012210011.model.products

class dummy_data {
    fun get_data_line(): List<line_chat> {
        return listOf(
            line_chat("Lebron James",  "Practice starts in 10, where are you?", "4/10/2023"),
            line_chat("Kobe Bryant", "Hey, how's it going?", "3/10/2023"),
            line_chat("Michael Jordan", "I heard you had a great game last night!", "2/10/2023"),
            line_chat("Stephen Curry",  "Let's grab dinner tonight.", "1/10/2023"),
            line_chat("Kevin Durant", "Can you pass me the ball more often?", "30/9/2023"),
            line_chat("Magic Johnson", "We need to work on our defense.", "30/9/2023"),
            line_chat("Larry Bird",  "I'll be late for practice tomorrow.", "28/9/2023"),
            line_chat("Tim Duncan",  "I'm excited about the upcoming game.", "25/9/2023"),
            line_chat("Shaquille O'Neal",  "I need new sneakers.", "21/9/2023"),
            line_chat("Charles Barkley", "Let's hit the gym early.", "18/9/2023")
        )
    }

    fun get_data_tokopedia_category(): List<categories> {
        return listOf(
            categories(image_path = R.drawable.car, category_name = "Cars", number_of_items = 100),
            categories(image_path = R.drawable.gadget, category_name = "Gadgets", number_of_items = 50),
            categories(image_path = R.drawable.electronics, category_name = "Electronics", number_of_items = 75),
            categories(image_path = R.drawable.clothing, category_name = "Clothing", number_of_items = 200),
            categories(image_path = R.drawable.furniture, category_name = "Furniture", number_of_items = 120),
            categories(image_path = R.drawable.books, category_name = "Books", number_of_items = 300),
            categories(image_path = R.drawable.sports, category_name = "Sports", number_of_items = 80),
            categories(image_path = R.drawable.beauty, category_name = "Beauty", number_of_items = 150),
        )
    }

    fun get_data_tokopedia_product(): List<products> {
        return listOf(
            products(
                image_path = R.drawable.phone,
                product_name = "Samsung S23",
                price = 699000,
                location = "New York",
                sold = 50
            ),

            products(
                image_path = R.drawable.laptop,
                product_name = "Laptop ABC",
                price = 129009,
                location = "Los Angeles",
                sold = 30
            ),
            products(
                image_path = R.drawable.smartwatch,
                product_name = "Smartwatch QRS",
                price = 19009,
                location = "San Francisco",
                sold = 20
            ),
            products(
                image_path = R.drawable.camera,
                product_name = "Canon EOS 718D",
                price = 5990000,
                location = "Chicago",
                sold = 10
            )
        )
    }



}