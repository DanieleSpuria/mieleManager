package com.example.mielemanager.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mielemanager.model.Tappo

@Dao
interface TappoDao {

    @Insert
    suspend fun insert(tappo: Tappo)

    @Query("SELECT * FROM tappo WHERE id = :id")
    suspend fun getMieleById(id: Int): Tappo?

    @Query("SELECT * FROM tappo")
    suspend fun getallTappi(): List<Tappo>
}