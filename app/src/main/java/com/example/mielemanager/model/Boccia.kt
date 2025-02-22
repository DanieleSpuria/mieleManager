package com.example.mielemanager.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "boccia")
data class Boccia(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val size: Int,
    val quantity: Int
)
