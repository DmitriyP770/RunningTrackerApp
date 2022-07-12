package com.example.runningtrackerapp.domain

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM run_table ORDER BY timestamp DESC")
    fun getAllRunsSortedByDay():LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY caloriesBurned DESC")
    fun getAllRunsSortedByCalories():LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY avgSpeed")
    fun getAllRunsSortedByAvgSpeed():LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY distanceInMeters DESC")
    fun getAllRunsSortedByDistance():LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY timeInMillis DESC")
    fun getAllRunsSortedByTimeOfRun():LiveData<List<Run>>

    @Query("SELECT SUM(timeInMillis) FROM run_table")
    fun getTotalTimeOfRuns():LiveData<Long>

    @Query("SELECT SUM (caloriesBurned) FROM run_table")
    fun getTotalCaloriesBurned(): LiveData<Double>

    @Query("SELECT SUM(distanceInMeters) FROM run_table")
    fun getTotalDistance():LiveData<Double>

    @Query("SELECT AVG(avgSpeed) FROM  run_table")
    fun getAvgSpeed(): LiveData<Double>

}