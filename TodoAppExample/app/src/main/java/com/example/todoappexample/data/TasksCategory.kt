package com.example.todoappexample.data

sealed class TasksCategory{
    object Personal : TasksCategory()
    object Business : TasksCategory()
    object Other : TasksCategory()
}