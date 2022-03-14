package com.haura.newsappacha

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail_news.*
import kotlinx.android.synthetic.main.activity_detail_news.view.*
import com.haura.newsappacha.model.NewsModel as NewsModel

class DetailNewsActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_DETAIL_NEWS = "extra_detail_news"
    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_news)

        val news = intent.getParcelableExtra<NewsModel>(EXTRA_DETAIL_NEWS) as NewsModel

        iv_news.setImageResource(news.image)
        tv_detail_judul.text = news.title
        tv_detail_deskripsi.text = news.desc
    }




}