package com.example.countryapi.recyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.countryapi.recyclerview.model.RvItem
import kotlinx.android.synthetic.main.item_view.view.*

class AllItemAdapter:RecyclerView.Adapter<AllItemAdapter.AllItemViewHolder>() {
    var posts = mutableListOf<RvItem>()
    set(value) {
        field = value
        notifyDataSetChanged()
    }
    inner class AllItemViewHolder(view:View):RecyclerView.ViewHolder(view){
        fun setData(post:RvItem){
            itemView.textView.text = post.name
            itemView.textView2.text = post.capital
            itemView.textView3.text = post.language
        }
    }
}