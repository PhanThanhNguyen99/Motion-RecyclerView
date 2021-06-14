package com.example.motion_reycyclerview

import android.os.Build
import android.os.Bundle
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.navigation.fragment.navArgs
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.fragment_info.view.*

class InfoFragment : Fragment() {
  private val args by navArgs<InfoFragmentArgs>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_info, container, false)
        view.txt_nameif.setText(args.curretUser.name)
        view.txt_genderif.setText(args.curretUser.gender)
       view.cir_img.setImageResource(args.curretUser.resourceID)
        
        return  view
    }

}