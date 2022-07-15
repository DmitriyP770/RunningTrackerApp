package com.example.runningtrackerapp.presenter.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels

import com.example.runningtrackerapp.R
import com.example.runningtrackerapp.presenter.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_tracking) {

   private val viewModel:MainViewModel by viewModels()
}