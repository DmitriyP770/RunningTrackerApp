package com.example.runningtrackerapp.domain

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "run_table")
data class Run(
    val img: Bitmap? = null,
    val timestamp: Long = 0L,
    val avgSpeed: Double = 0.0,
    val caloriesBurned: Double = 0.0,
    val timeInMillis: Long = 0L,
    val distanceInMeters: Double = 0.0

){
    @PrimaryKey
    var id:Int? = null
}
