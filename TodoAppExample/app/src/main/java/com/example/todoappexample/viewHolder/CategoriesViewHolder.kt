package com.example.todoappexample.viewHolder

import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.todoappexample.R
import com.example.todoappexample.data.TasksCategory
import com.example.todoappexample.databinding.ItemTaskCategoryBinding

class CategoriesViewHolder(val binding : ItemTaskCategoryBinding) : RecyclerView.ViewHolder(binding.root){

    fun render(tasksCategory: TasksCategory){


        when(tasksCategory){
            TasksCategory.Business -> {
                binding.tvCategoryName.text = "Business"
                binding.divider.setBackgroundColor(
                    ContextCompat.getColor(binding.divider.context, R.color.todo_business_category)
                )
            }
            TasksCategory.Other -> {
                binding.tvCategoryName.text = "Personal"
                binding.divider.setBackgroundColor(
                    ContextCompat.getColor(binding.divider.context, R.color.todo_personal_category)
                )
            }
            TasksCategory.Personal -> {
                binding.tvCategoryName.text = "Other"
                binding.divider.setBackgroundColor(
                    ContextCompat.getColor(binding.divider.context, R.color.todo_other_category)
                )
            }
        }
    }
}