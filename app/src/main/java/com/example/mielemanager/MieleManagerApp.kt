package com.example.mielemanager

import android.app.Application
import androidx.room.Room
import com.example.mielemanager.database.AppDatabase

class MieleManagerApp : Application() {

    lateinit var database : AppDatabase

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "miele-manager"
        ).build()
    }
}