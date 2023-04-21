package com.example.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class ScreenTwoFragment : Fragment(R.layout.fragment_screen_two) {
   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      super.onViewCreated(view, savedInstanceState)

      val btnScreenOne = requireView().findViewById<Button>(R.id.btnScreenOne)
      val btnScreenThree = requireView().findViewById<Button>(R.id.btnScreenThree)

      btnScreenOne.setOnClickListener { findNavController().navigate(R.id.action_screenTwoFragment_to_screenOneFragment) }
      btnScreenThree.setOnClickListener { findNavController().navigate(R.id.action_screenTwoFragment_to_screenThreeFragment) }
   }
}