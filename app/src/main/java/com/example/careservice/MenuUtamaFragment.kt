package com.example.careservice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.careservice.databinding.FragmentMenuUtamaBinding

class MenuUtamaFragment : Fragment() {

    private lateinit var binding: FragmentMenuUtamaBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuUtamaBinding.inflate(
            layoutInflater, container, false
        )

        binding.btnServicesite.setOnClickListener { view: View ->
            view
            findNavController().navigate(R.id.action_menuUtamaFragment_to_serviceOnsite
            )
        }
        binding.btnServicehome.setOnClickListener { view: View ->
            view.findNavController().navigate(
                R.id.action_menuUtamaFragment_to_serviceAthome
            )
        }
        binding.btnProfile.setOnClickListener { view: View ->
            view.findNavController().navigate(
                R.id.action_menuUtamaFragment_to_profile
            )
        }
        binding.btnSos.setOnClickListener { view: View ->
            view.findNavController().navigate(
                R.id.action_menuUtamaFragment2_to_SOS
            )
        }


        return binding.root

    }
}