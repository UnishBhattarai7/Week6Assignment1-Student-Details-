 package com.unish.week6assignment1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.ScrollView
import android.widget.Spinner
import com.unish.week6assignment1.R


class AboutUsFragment : Fragment() {
    private lateinit var about : WebView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
     val view = inflater.inflate(R.layout.fragment_about_us, container, false)

        about = view.findViewById(R.id.about)
        about.loadUrl("https://softwarica.edu.np/about-softwarica/")

        return view
    }


}