package com.example.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class ScreenThreeFragment : Fragment(R.layout.fragment_screen_three) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnScreenOne = requireView().findViewById<Button>(R.id.btnScreenOne)

        btnScreenOne.setOnClickListener { findNavController().navigate(R.id.action_screenThreeFragment_to_screenOneFragment) }

    }

}