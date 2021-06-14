package com.example.motion_reycyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {
     private  var adapter = ListAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        adapter.setData(getList())
        val view =  inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerView = view.rcv_home
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter
        return  view
    }

    private fun getList(): List<Info> {
        val list :MutableList<Info> = ArrayList()
        list.add(Info(R.drawable.kakashi,"Kakashi","Male"))
        list.add(Info(R.drawable.naruto,"Not papaBoruto","Male"))
        list.add(Info(R.drawable.sasuke,"Narutooooooo","Male"))
        return list
    }


}