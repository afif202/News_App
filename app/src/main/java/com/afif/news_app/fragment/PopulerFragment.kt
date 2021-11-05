package com.afif.news_app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.afif.news_app.data.DataNews
import com.afif.news_app.adapter.NewsAdapter
import com.afif.news_app.R
import com.afif.news_app.initViewHeadline


class PopulerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_populer, container, false)

        val rvNews = view.findViewById<RecyclerView>(R.id.rv_popular_news)
        rvNews.layoutManager = LinearLayoutManager(view.context)
        rvNews.adapter = NewsAdapter(DataNews.listPopularNews)

        val newsHeadline = view.findViewById<View>(R.id.news_headline)
        initViewHeadline(view.context, newsHeadline,1 )

        return view
    }

}