package com.example.assignment_3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var postAdapter: PostAdapter
    lateinit var recyclerView : RecyclerView
    var list : List<Post> = listOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView= this.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        list= listOf(Post("Aya"),Post("Alham"),Post("Mona"),Post("Mariam"),Post("Ahmed"))
        postAdapter= PostAdapter(list)

        recyclerView.adapter=postAdapter
    }

}