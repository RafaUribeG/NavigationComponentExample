package com.example.todoappexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todoappexample.adapter.CategoriesAdapter
import com.example.todoappexample.data.TasksCategory
import com.example.todoappexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val categories = listOf(
        TasksCategory.Business,
        TasksCategory.Personal,
        TasksCategory.Other
    )

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initComponents()
        initUI()
    }

    private fun initUI() {
        binding.rvCategories.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
    }

    private fun initComponents() {
        val myRecyclerCategories = binding.rvCategories
        myRecyclerCategories.adapter = CategoriesAdapter(categories)

        val myRecyclerTask = binding.rvTasks

    }
}