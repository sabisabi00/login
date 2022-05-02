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

class RegisterFragment : Fragment() {
    lateinit var v : View
    lateinit var txtLogin : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        v = inflater.inflate(R.layout.fragment_register, container, false)

        txtLogin = v.findViewById(R.id.txtLogin)

        return v
    }

    override fun onStart() {
        super.onStart()

        txtLogin.setOnClickListener {

            val action = RegisterFragmentDirections.actionRegisterFragmentToLoginFragment()
            v.findNavController().navigate(action)
        }
    }
}