package com.example.odev4

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.odev4.databinding.FragmentSayfafYBinding


class SayfaYFragment : Fragment() {
    private lateinit var binding: FragmentSayfafYBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfafYBinding.inflate(inflater, container, false)

        val geriTusu = object : OnBackPressedCallback(true){ //Geri dönüş aktif değil
            override fun handleOnBackPressed() {
                findNavController().navigate(R.id.sayfaY_anasayfa)

            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,geriTusu)

        return binding.root
    }


}