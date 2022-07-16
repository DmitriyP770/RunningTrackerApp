package com.example.runningtrackerapp.presenter.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController

import com.example.runningtrackerapp.R
import com.example.runningtrackerapp.presenter.viewmodels.MainViewModel
import com.google.android.material.floatingactionbutton.FloatingActionButton
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RunFragment : Fragment(R.layout.fragment_run) {

   private val viewModel:MainViewModel by viewModels()

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      super.onViewCreated(view, savedInstanceState)
      val fab:FloatingActionButton = requireView().findViewById(R.id.fab_run)
      fab.setOnClickListener{
         findNavController().navigate(R.id.action_runFragment_to_trackingFragment)
      }
   }
}