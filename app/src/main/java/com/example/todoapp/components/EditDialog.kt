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
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun EditDialog(isShowDialog: MutableState<Boolean>) {
    AlertDialog(
        onDismissRequest = { isShowDialog.value = false },
        confirmButton = {
            Button(
                onClick = {
                    isShowDialog.value = false
                    // TODO: データの保存処理を行う
                },
                modifier = Modifier.width(120.dp),
            ) {
                Text(text = "OK")
            }
        },
        dismissButton = {
            Button(
                onClick = { isShowDialog.value = false }, modifier = Modifier.width(120.dp),
            ) {
                Text(text = "キャンセル")
            }
        },
        title = { Text(text = "タスク新規作成") },
        text = {
            Column {
                Text(text = "タイトル")
                TextField(
                    value = "",
                    onValueChange = {},
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent
                    )
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "詳細")
                TextField(
                    value = "",
                    onValueChange = {},
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Transparent,
                        unfocusedContainerColor = Color.Transparent
                    )
                )
            }
        },
    )
}