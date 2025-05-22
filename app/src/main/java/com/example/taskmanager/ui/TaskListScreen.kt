package com.example.taskmanager.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.taskmanager.Task
import com.example.taskmanager.TaskViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskListScreen(
    viewModel: TaskViewModel,
    navController: NavController
) {
    val tasks by viewModel.tasks.collectAsState(initial = emptyList())

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = { navController.navigate("add_task") }) {
                Icon(Icons.Default.Add, "Add Task")
            }
        }
    ) { padding ->
        LazyColumn(modifier = Modifier.padding(padding)) {
            items(tasks) { task ->
                TaskItem(
                    task = task,
                    onDelete = { viewModel.deleteTask(it) },
                    onToggleComplete = { updatedTask -> viewModel.updateTask(updatedTask) }
                )
            }
        }
    }
}