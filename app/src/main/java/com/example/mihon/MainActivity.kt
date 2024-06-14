package com.example.mihon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val limpar: Button = findViewById(R.id.limpar)

        limpar.setOnClickListener(){
            Toast.makeText(this, "Limpo com sucesso", Toast.LENGTH_LONG).show()
        }
    }

    fun TelaPrincipal(view: View) {
        var intent = Intent(this, TelaPrincipal::class.java)
        startActivity(intent)
    }
}