package com.example.mihon

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.example.mihon.R


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class HistoricoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_historico, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val deleteButton = view.findViewById<Button>(R.id.delete_button)
        val deleteButton1 = view.findViewById<Button>(R.id.delete_button1)
        val deleteButton2 = view.findViewById<Button>(R.id.delete_button2)
        val deleteButton3 = view.findViewById<Button>(R.id.delete_button3)
        val deleteButton4 = view.findViewById<Button>(R.id.delete_button4)
        val deleteButton5 = view.findViewById<Button>(R.id.delete_button5)
        val deleteButton6 = view.findViewById<Button>(R.id.delete_button6)


        // Defina um clique listener para o botão de lixo
        deleteButton.setOnClickListener {
            showDeleteConfirmationDialog()
        }
        deleteButton1.setOnClickListener {
            showDeleteConfirmationDialog()
        }
        deleteButton2.setOnClickListener {
            showDeleteConfirmationDialog()
        }
        deleteButton3.setOnClickListener {
            showDeleteConfirmationDialog()
        }
        deleteButton4.setOnClickListener {
            showDeleteConfirmationDialog()
        }
        deleteButton5.setOnClickListener {
            showDeleteConfirmationDialog()
        }
        deleteButton6.setOnClickListener {
            showDeleteConfirmationDialog()
        }
    }

    private fun showDeleteConfirmationDialog() {
        val builder = AlertDialog.Builder(requireContext())
        builder.setTitle("Confirmar exclusão")
            .setMessage("Tem certeza que deseja excluir este item?")
            .setPositiveButton("Sim") { dialog, _ ->
                dialog.dismiss()
            }
            .setNegativeButton("Não") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }
}
