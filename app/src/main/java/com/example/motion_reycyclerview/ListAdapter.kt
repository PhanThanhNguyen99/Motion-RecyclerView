package com.example.motion_reycyclerview

import android.transition.TransitionInflater
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_user.view.*

class ListAdapter:RecyclerView.Adapter<ListAdapter.ViewHolder>() {
    private lateinit var listUser : List<Info>
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_user,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.img_avt.setImageResource(listUser[position].resourceID)
        holder.itemView.txt_Name.text = listUser[position].name

        holder.itemView.item_1.setOnClickListener {
              var action = HomeFragmentDirections.actionHomeFragmentToInfoFragment(listUser[position])
            holder.itemView.findNavController().navigate(action)
//              val extras = FragmentNavigatorExtras(it.img_avt to "img_item")
//             holder.itemView.findNavController().navigate(R.id.action_homeFragment_to_infoFragment,
//                     null,
//                     null,
//                     extras)
        }

    }

    override fun getItemCount(): Int {
        return listUser.size
    }
    fun setData(list :List<Info>){
        this.listUser = list
        notifyDataSetChanged()
    }
}