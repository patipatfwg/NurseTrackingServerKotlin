package com.mysoso.nursetrackingserver.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.mysoso.nursetrackingserver.MQTTHelper
import com.mysoso.nursetrackingserver.MainActivity
import com.mysoso.nursetrackingserver.R
import com.mysoso.nursetrackingserver.services.mqtt.MqttFun
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.nav_header_main.*
import java.io.BufferedReader

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        val editText = root.edit_IPServer.text.toString()
        root.btn_connect?.setOnClickListener {
            Toast.makeText(requireContext(),editText , Toast.LENGTH_LONG).show()
        }
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })

        return root
    }


}