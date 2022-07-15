package com.example.runningtrackerapp.di

import android.app.Application
import android.content.Context
import androidx.room.Room
import com.example.runningtrackerapp.domain.RunDAO
import com.example.runningtrackerapp.domain.RunningDataBase
import com.example.runningtrackerapp.other.Constants.RUNNING_DB_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object AppModule {

    @Singleton
    @Provides
    fun provideRunningDataBase(@ApplicationContext app: Context) = Room.databaseBuilder(
        app,
        RunningDataBase::class.java,
        RUNNING_DB_NAME
    ).build()


    @Singleton
    @Provides
    fun provideRunDao(dataBase: RunningDataBase) = dataBase.getRunDAO()

}