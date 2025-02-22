package com.example.mielemanager.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mielemanager.model.Ordine

@Dao
interface OrdineDao {

    @Insert
    fun insert(ordine: Ordine)

    @Query("SELECT * FROM ordine WHERE id = :id")
    fun getOrdineById(id: Int): Ordine?

    @Query("SELECT * FROM ordine")
    fun getAllOrdini(): List<Ordine>
}