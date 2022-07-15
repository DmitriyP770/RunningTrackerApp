package com.example.runningtrackerapp.domain

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters


@Database(entities = [Run::class],
    version = 1
)
@TypeConverters(Converter::class)
abstract class RunningDataBase : RoomDatabase() {

   abstract fun getRunDAO(): RunDAO

}