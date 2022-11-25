package com.example.mod5tpcolorme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.mod5tpcolorme.databinding.FragmentBlankBinding
import kotlin.random.Random


class BlankFragment : Fragment() {
    lateinit var binding: FragmentBlankBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBlankBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonToRedOrPink.setOnClickListener {
            if(Random.nextBoolean()){
                it.findNavController().navigate(R.id.actionBlankToPink)
            }else{
                it.findNavController().navigate(R.id.actionBlankToRed)
            }
        }
    }

}