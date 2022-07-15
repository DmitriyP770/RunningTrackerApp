package com.example.runningtrackerapp.repositories

import com.example.runningtrackerapp.domain.Run
import com.example.runningtrackerapp.domain.RunDAO
import javax.inject.Inject


class MainRepositorie @Inject constructor(
    val  runDAO: RunDAO
){
    suspend fun insertRun(run: Run) = runDAO.insertRun(run )
    suspend fun deletRun(run: Run) = runDAO.deleteRun(run)
    fun getAllRunsSortedByDay() = runDAO.getAllRunsSortedByDay()
    fun getAllRunsSortedByCalories ()= runDAO.getAllRunsSortedByCalories()
    fun getAllRunsSortedByAvgSpeed()= runDAO.getAllRunsSortedByAvgSpeed()
    fun getAllRunsSortedByDistance()= runDAO.getAllRunsSortedByDistance()
    fun getAllRunsSortedByTimeOfRun()=runDAO.getAllRunsSortedByTimeOfRun()


    fun getTotalTimeOfRuns() = runDAO.getTotalTimeOfRuns()
    fun getTotalCaloriesBurned() = runDAO.getTotalCaloriesBurned()
    fun getTotalDistance() =runDAO.getTotalDistance()
    fun getAvgSpeed() = runDAO.getAvgSpeed()
}