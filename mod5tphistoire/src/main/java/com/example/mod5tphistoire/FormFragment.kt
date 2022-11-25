package com.example.mod5tphistoire

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.mod5tphistoire.databinding.FragmentFormBinding


class FormFragment : Fragment() {
    lateinit var binding: FragmentFormBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFormBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonStartStory.setOnClickListener {
            val histoire = Histoire(
                binding.editTextPrenom.text.toString(),
                binding.editTextLieu.text.toString(),
            )
            it.findNavController().navigate(
                FormFragmentDirections.actionFormToStory(histoire)
            )
        }
    }

}