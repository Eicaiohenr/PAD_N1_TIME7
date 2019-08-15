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

        users.add(User("Livro", "Dom Quixote; Miguel de Servantes ; Penguim companhia "))
        users.add(User("Livro2 ", "Ulisses; James Joyce;Penguim companhia "))
        users.add(User("Livro3 ", "Em Busca do Tempo Perdido; Marcel Proust;Gallimard "))
        users.add(User("Livro4 ", "Harry Potter e a Pedra Filosofal; J.K. Rowling;J.K. Rowling "))
        users.add(User("Livro5 ", "A Culpa é das Estrelas; John Green;intríseca "))


        val adapter = CustomAdpter(users)


        recyclerView.adapter = adapter


    }
}
