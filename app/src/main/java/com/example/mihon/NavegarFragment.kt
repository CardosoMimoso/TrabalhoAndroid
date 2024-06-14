package com.example.mihon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment

class NavegarFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar o layout deste fragment
        val view = inflater.inflate(R.layout.fragment_navegar, container, false)

        // Inicializar o ListView e o ArrayAdapter
        val fontes = arrayOf(
            "MangaDex", "Aqua Manga", "Comicastle", "ComicExtra", "MangaDex (English)",
            "Read Comics Online", "Read One Piece Manga Online", "Read Naruto Boruto Samurai 8 Manga Online",
            "ReadComicOnline", "ReadFreeComics", "Tapas", "Boruto Explorer", "Bruttal", "Crystal Comics",
            "Diskus Scan", "HQ Now!", "Fonte Local"
        )

        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.item_textview, R.id.textViewItem, fontes)
        val lista: ListView = view.findViewById(R.id.navList)
        lista.adapter = arrayAdapter

        return view
    }
}
