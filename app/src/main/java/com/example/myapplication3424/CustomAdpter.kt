package com.example.myapplication3424
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CustomAdpter(val userlist : ArrayList<User>) : RecyclerView.Adapter <CustomAdpter.ViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(p0.context).inflate(R.layout.list_layout,p0,false)
        return ViewHolder(v)

    }

    override fun getItemCount(): Int {
        return userlist.size

    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

        val user: User = userlist[p1]
        p0.textViewName.text = user.name
        p0.textViewName.text = user.adress

    }

    class ViewHolder(itemView :  View) : RecyclerView.ViewHolder(itemView){

            val textViewName = itemView.findViewById(R.id.textViewName) as TextView
            val textViewAddress = itemView.findViewById(R.id.textViewAdress) as TextView
    }
}