package com.gekss.sydykov_daniel_hw_7_month_3_

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gekss.sydykov_daniel_hw_7_month_3_.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    private val musicList = arrayListOf(
        Music("1","Heads Will Roll","Yeah Yeah Yeahs","4:21"),
        Music("2","Manda Bala","Ariis","1:51"),
        Music("3","Sahara","Hensonn","2:51"),
        Music("4","Metamorphosis","Interworld","2:22"),
        Music("5","Baixo","xxanteria","1:44"),
        Music("6","Rave","Dxrk","2:49"),
        Music("7","Rapture","Interworld","2:44"),
        Music("8","Avoid Me","Kute","1:45"),
        Music("9","Override","Kslv Noh","1:54"),
        Music("10","Close Eyes","Dvrst","2:12"),
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = MusicAdapter(musicList, this::onClick)
        binding.musicRv.adapter = adapter
    }

    private fun onClick(pos: Int) {
        val intent = Intent(activity, DetailActivity::class.java)
        intent.putExtra("key2", pos)
        startActivity(intent)
    }
}