package com.example.mielemanager.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mielemanager.dao.BocciaDao
import com.example.mielemanager.dao.ClienteDao
import com.example.mielemanager.dao.MieleDao
import com.example.mielemanager.dao.OrdineDao
import com.example.mielemanager.dao.TappoDao
import com.example.mielemanager.model.Boccia
import com.example.mielemanager.model.Cliente
import com.example.mielemanager.model.Miele
import com.example.mielemanager.model.Ordine
import com.example.mielemanager.model.Tappo

@Database(
    entities = [
        Miele::class,
        Boccia::class,
        Tappo::class,
        Cliente::class,
        Ordine::class
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun mieleDao(): MieleDao
    abstract fun bocciaDao(): BocciaDao
    abstract fun tappoDao(): TappoDao
    abstract fun clienteDao(): ClienteDao
    abstract fun ordineDao(): OrdineDao
}