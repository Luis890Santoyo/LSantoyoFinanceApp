package com.example.lsantoyofinanceapp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class User(
    val name: String,
    val balance: Double
)

data class SummaryCard(
    val title: String,
    val amount: String,
    val backgroundColor: Color
)

data class Transaction(
    val id: Int,
    val establishment: String,
    val category: String,
    val amount: Double,
    val time: String,
    val icon: ImageVector
)
