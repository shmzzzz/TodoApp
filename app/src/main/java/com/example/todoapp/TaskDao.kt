package com.example.todoapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TaskDao {
    @Query("SELECT * FROM task")
    fun getAllTask(): List<Task>

    @Update
    fun updateTask(tasks: Task)

    @Insert
    fun insertTask(tasks: Task)

    @Delete
    fun deleteTask(task: Task)
}
