package com.haura.newsappacha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.haura.newsappacha.adapter.NewsListAdapter
import com.haura.newsappacha.data.NewsData
import com.haura.newsappacha.model.NewsModel
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        initRecyclerViewNews()

    }

    private fun initRecyclerViewNews() {
        val list : ArrayList<NewsModel> = arrayListOf()
        rv_news.setHasFixedSize(true)
        list.addAll(NewsData.listData)
        rv_news.layoutManager = LinearLayoutManager(this)
        rv_news.adapter = NewsListAdapter(list)
    }
}