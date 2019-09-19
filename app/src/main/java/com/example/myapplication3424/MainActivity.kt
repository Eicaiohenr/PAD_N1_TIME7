package com.example.myapplication3424

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById(R.id.recycleView) as  RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false  )

        val  users = ArrayList<User>()

        users.add(User("Segunda", "Arroz, feijão, frango"))
        users.add(User("Livro2 ", "lasanha"))
        users.add(User("Livro3 ", " pizza de frango catupiry"))
        users.add(User("Livro4 ", "macarrão e 'carne' moide"))
        users.add(User("Livro5 ", "arroz e feijoada "))


        val adapter = CustomAdpter(users)


        recyclerView.adapter = adapter


    }
}
