package com.example.mihon

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.google.android.material.card.MaterialCardView

class BibliotecaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_biblioteca, container, false)

        // Obtém o NavController
        val navController = findNavController()

        // Encontra os botões de cada item na sua view
        val itemCardView1: MaterialCardView = view.findViewById(R.id.cardView)
        val itemCardView2: MaterialCardView = view.findViewById(R.id.cardView2)
        val itemCardView3: MaterialCardView = view.findViewById(R.id.cardView3)
        val itemCardView4: MaterialCardView = view.findViewById(R.id.cardView4)
        val itemCardView5: MaterialCardView = view.findViewById(R.id.cardView5)
        val itemCardView6: MaterialCardView = view.findViewById(R.id.cardView6)
        val itemCardView7: MaterialCardView = view.findViewById(R.id.cardView7)
        val itemCardView8: MaterialCardView = view.findViewById(R.id.cardView8)
        val itemCardView9: MaterialCardView = view.findViewById(R.id.cardView9)
        val itemCardView10: MaterialCardView = view.findViewById(R.id.cardView10)
        val itemCardView11: MaterialCardView = view.findViewById(R.id.cardView11)
        val itemCardView12: MaterialCardView = view.findViewById(R.id.cardView12)

        // Define o OnClickListener para cada botão
        itemCardView1.setOnClickListener {
            navController.navigate(R.id.card1Fragment)
        }

        itemCardView2.setOnClickListener {
            navController.navigate(R.id.card1Fragment)
        }

        itemCardView3.setOnClickListener {
            navController.navigate(R.id.card1Fragment)
        }

        itemCardView4.setOnClickListener {
            navController.navigate(R.id.card1Fragment)
        }

        itemCardView5.setOnClickListener {
            navController.navigate(R.id.card1Fragment)
        }

        itemCardView6.setOnClickListener {
            navController.navigate(R.id.card1Fragment)
        }

        itemCardView7.setOnClickListener {
            navController.navigate(R.id.card1Fragment)
        }

        itemCardView8.setOnClickListener {
            navController.navigate(R.id.card1Fragment)
        }

        itemCardView9.setOnClickListener {
            navController.navigate(R.id.card1Fragment)
        }

        itemCardView10.setOnClickListener {
            navController.navigate(R.id.card1Fragment)
        }

        itemCardView11.setOnClickListener {
            navController.navigate(R.id.card1Fragment)
        }

        itemCardView12.setOnClickListener {
            navController.navigate(R.id.card1Fragment)
        }

        return view
    }
}