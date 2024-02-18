package com.example.todoapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.todoapp.MainViewModel

@Composable
fun EditDialog(viewModel: MainViewModel = hiltViewModel()) {
    AlertDialog(
        onDismissRequest = {
            viewModel.isShowDialog = false
            viewModel.clearTextField()
        },
        confirmButton = {
            Button(
                onClick = {
                    viewModel.isShowDialog = false
                    if (viewModel.isEditing) viewModel.updateTask() else viewModel.createTask()
                    viewModel.clearTextField()
                },
                modifier = Modifier.width(120.dp),
            ) {
                Text(text = "OK")
            }
        },
        dismissButton = {
            Button(
                onClick = {
                    viewModel.isShowDialog = false
                    viewModel.clearTextField()
                },
                modifier = Modifier.width(120.dp),
            ) {
                Text(text = "キャンセル")
            }
        },
        title = {
            Text(
                text = if (viewModel.isEditing) "タスク更新" else "タスク新規作成"
            )
        },
        text = {
            Column {
                Text(text = "タイトル")
                TextField(
                    value = viewModel.title,
                    onValueChange = { viewModel.title = it },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent
                    )
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "詳細")
                TextField(
                    value = viewModel.description,
                    onValueChange = { viewModel.description = it },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent
                    )
                )
            }
        },
    )
}
