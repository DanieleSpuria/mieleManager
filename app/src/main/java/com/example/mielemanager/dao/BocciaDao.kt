package com.example.mielemanager.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mielemanager.model.Boccia

@Dao
interface BocciaDao {

    @Insert
    suspend fun insert(boccia: Boccia)

    @Query("SELECT * FROM tappo WHERE id = :id")
    suspend fun getBocciaById(id: Int): Boccia?

    @Query("SELECT * FROM boccia")
    suspend fun getAllBocce(): List<Boccia>
}