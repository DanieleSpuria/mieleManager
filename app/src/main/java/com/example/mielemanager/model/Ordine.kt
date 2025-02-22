package com.example.mielemanager.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "ordine",
    foreignKeys = [
        ForeignKey(
            entity = Cliente::class,
            parentColumns = ["id"],
            childColumns = ["clienteId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Miele::class,
            parentColumns = ["id"],
            childColumns = ["mieleId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Tappo::class,
            parentColumns = ["id"],
            childColumns = ["tappoId"],
            onDelete = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = Boccia::class,
            parentColumns = ["id"],
            childColumns = ["bocciaId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Ordine(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val clienteId: Int,
    val mieleId: Int,
    val tappoId: Int,
    val bocciaId: Int,
    val quantity: Int,
    val price: Double,
    val date: String,
    val status: Boolean,
    val note: String
)
