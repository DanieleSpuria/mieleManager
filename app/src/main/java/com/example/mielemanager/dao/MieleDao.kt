package com.example.mielemanager.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mielemanager.model.Miele

@Dao
interface MieleDao {

    @Insert
    suspend fun insert(miele: Miele)

    @Query("SELECT * FROM miele WHERE id = :id")
    suspend fun getMieleById(id: Int): Miele?

    @Query("SELECT * FROM miele")
    suspend fun getAllMiele(): List<Miele>
}