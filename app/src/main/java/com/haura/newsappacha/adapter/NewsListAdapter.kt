package com.haura.newsappacha.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.haura.newsappacha.DetailNewsActivity
import com.haura.newsappacha.R
import com.haura.newsappacha.model.NewsModel

class NewsListAdapter (private val listNews:ArrayList<NewsModel>) :
        RecyclerView.Adapter<NewsListAdapter.ListViewHolder>(){

    inner class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        var imgPhoto : ImageView = itemView.findViewById(R.id.iv_item_photo)
        var textTitle : TextView = itemView.findViewById(R.id.tv_title)
        var textDesc : TextView = itemView.findViewById(R.id.tv_deskripsi)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_news, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsListAdapter.ListViewHolder, position: Int) {
        val news = listNews[position]
        holder.textTitle.text = news.title
        holder.textDesc.text = news.desc

        Glide.with(holder.itemView.context)
            .load(news.image)
            .into(holder.imgPhoto)

        holder.itemView.setOnClickListener{
            val intent = Intent(it.context, DetailNewsActivity::class.java)
            intent.putExtra(DetailNewsActivity.EXTRA_DETAIL_NEWS, news)
            it.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return listNews.size
    }



}