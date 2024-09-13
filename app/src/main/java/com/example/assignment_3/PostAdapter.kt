package com.example.assignment_3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(var list: List<Post>):RecyclerView.Adapter<PostAdapter.PostViewHolder>() {

   class PostViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
       val name : TextView = itemView.findViewById(R.id.username)
   }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.activity_post,parent,false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int {
       return list.size
    }

    override fun onBindViewHolder(holder: PostAdapter.PostViewHolder, position: Int) {
        var itemPosition = list[position]
        holder.name.text=itemPosition.name

    }
}