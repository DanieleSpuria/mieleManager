package com.example.mielemanager.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mielemanager.model.Cliente

@Dao
interface ClienteDao {

    @Insert
    suspend fun insert(cliente: Cliente)

    @Query("SELECT * FROM cliente WHERE id = :id")
    suspend fun getClienteById(id: Int): Cliente?

    @Query("SELECT * FROM cliente")
    suspend fun getAllMiele(): List<Cliente>
}