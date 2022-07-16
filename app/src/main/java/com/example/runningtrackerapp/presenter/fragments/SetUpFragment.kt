package com.example.runningtrackerapp.presenter.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController

import com.example.runningtrackerapp.R
import com.example.runningtrackerapp.presenter.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint


class SetUpFragment : Fragment(R.layout.fragment_setup) {

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      super.onViewCreated(view, savedInstanceState)
      var tvContinue:TextView = requireView().findViewById(R.id.tvContinue)

         tvContinue.setOnClickListener {
            findNavController().navigate(R.id.action_setUpFragment_to_runFragment)
         }
      }

   }


