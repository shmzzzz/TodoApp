package com.example.todoapp

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {
    @Query("SELECT * FROM task")
    fun getAllTask(): Flow<List<Task>>

    @Update
    suspend fun updateTask(tasks: Task)

    @Insert
    suspend fun insertTask(tasks: Task)

    @Delete
    suspend fun deleteTask(task: Task)
}
