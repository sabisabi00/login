package com.example.loginscreen.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.findNavController
import com.example.loginscreen.R

class LoginFragment : Fragment() {
    lateinit var v : View
    lateinit var txtRegister : TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        v = inflater.inflate(R.layout.fragment_login, container, false)

        txtRegister = v.findViewById(R.id.txtRegister)

        return v
    }

    override fun onStart() {
        super.onStart()


        txtRegister.setOnClickListener{

            val action = LoginFragmentDirections.actionLoginFragmentToRegisterFragment()
            v.findNavController().navigate(action)
        }
    }
}