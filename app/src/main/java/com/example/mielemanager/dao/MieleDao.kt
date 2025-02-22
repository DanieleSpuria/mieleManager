package com.example.mielemanager.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.mielemanager.model.Miele
import kotlinx.coroutines.flow.Flow

@Dao
interface MieleDao {

    @Insert
    fun insert(miele: Miele)

    @Query("SELECT * FROM miele WHERE id = :id")
    fun getMieleById(id: Int): Flow<Miele?>

    @Query("SELECT * FROM miele")
    fun getAllMiele(): Flow<List<Miele>>
}