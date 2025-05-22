package com.example.taskmanager.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun TaskManagerApp(viewModel: TaskViewModel) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "task_list"
    ) {
        composable("task_list") {
            TaskListScreen(viewModel = viewModel, navController = navController)
        }
        composable("add_task") {
            AddTaskScreen(viewModel = viewModel, navController = navController)
        }
    }
}