package com.example.mod5nav.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.mod5nav.databinding.FragmentLoginBinding
import com.example.mod5nav.model.User


class LoginFragment : Fragment() {
    lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonSignIn.setOnClickListener {
            //TODO Récupérer les 2 champs pour en créer un user
            val user = User(binding.editTextEmail.text.toString(),
                            binding.editTextPassword.text.toString())
            val homeDestination = LoginFragmentDirections.actionLoginToHome(user)
            //TODO On se dirige vers Home fragment avec le user comme arg
            it.findNavController().navigate(homeDestination)
            //it.findNavController().navigate(R.id.actionLoginToHome)
        }
    }
}











