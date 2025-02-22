package com.example.mielemanager.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mielemanager.model.Cliente

@Dao
interface ClienteDao {

    @Insert
    fun insert(cliente: Cliente)

    @Query("SELECT * FROM cliente WHERE id = :id")
    fun getClienteById(id: Int): Cliente?

    @Query("SELECT * FROM cliente")
    fun getAllMiele(): List<Cliente>
}