package com.example.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class ScreenOneFragment : Fragment(R.layout.fragment_screen_one) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnScreenTwo = requireView().findViewById<Button>(R.id.btnScreenTwo)
        val btnScreenThree = requireView().findViewById<Button>(R.id.btnScreenThree)

        btnScreenTwo.setOnClickListener { findNavController().navigate(R.id.action_screenOneFragment_to_screenTwoFragment) }

        btnScreenThree.setOnClickListener { findNavController().navigate(R.id.action_screenOneFragment_to_screenThreeFragment) }

    }

}