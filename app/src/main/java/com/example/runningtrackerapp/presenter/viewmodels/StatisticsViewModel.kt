package com.example.runningtrackerapp.presenter.viewmodels

import androidx.lifecycle.ViewModel
import com.example.runningtrackerapp.repositories.MainRepositorie
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StatisticsViewModel @Inject constructor(
    val mainRepositorie: MainRepositorie
) : ViewModel()  {
}