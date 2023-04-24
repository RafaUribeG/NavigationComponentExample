package com.example.todoappexample.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todoappexample.data.TasksCategory
import com.example.todoappexample.databinding.ItemTaskCategoryBinding
import com.example.todoappexample.viewHolder.CategoriesViewHolder

class CategoriesAdapter(private val categories: List<TasksCategory>) :
    RecyclerView.Adapter<CategoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        val binding = ItemTaskCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoriesViewHolder(binding)
    }


    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        holder.render(categories[position])
    }

    override fun getItemCount() = categories.size
}