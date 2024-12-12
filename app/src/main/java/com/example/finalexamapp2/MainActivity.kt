package com.example.finalexamapp2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity" // Tag pour les logs

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Étape 1 : Log au démarrage
        Log.d(TAG, "Étape 1 : Application démarrée - onCreate exécuté")

        // Étape 2 : Simuler une exception pour débogage
        try {
            val list = listOf("A", "B", "C")
            val item = list[3] // Provoque une IndexOutOfBoundsException
            Log.d(TAG, "Élément récupéré : $item") // Ajout d'un log pour utiliser la variable
        } catch (e: IndexOutOfBoundsException) {
            Log.e(TAG, "Étape 2 : Erreur détectée - Index hors limites", e)
        }
    }
}
