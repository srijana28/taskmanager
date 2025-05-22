package com.example.taskmanager
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val description: String? = null,
    val priority: Int = 0,  // 0=Low, 1=Medium, 2=High
    val isCompleted: Boolean = false,
    val createdAt: Long = System.currentTimeMillis()
)