package com.example.mielemanager.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mielemanager.model.Ordine

@Dao
interface OrdineDao {

    @Insert
    suspend fun insert(ordine: Ordine)

    @Query("SELECT * FROM ordine WHERE id = :id")
    suspend fun getOrdineById(id: Int): Ordine?

    @Query("SELECT * FROM ordine")
    suspend fun getAllOrdini(): List<Ordine>
}