package com.example.mielemanager.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "miele")
data class Miele(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val quantity: Int
)