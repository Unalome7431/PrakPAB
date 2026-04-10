package com.example.lokacaruy

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAboutProject = findViewById<Button>(R.id.btnGoToProfile)
        val btnrepo = findViewById<Button>(R.id.btnrepo)
        val btnshare = findViewById<Button>(R.id.btnshare)

        btnAboutProject.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        btnshare.setOnClickListener {
            val teksYangDibagikan = "Halo! berikut merupakan link repository kami: https://github.com/Unalome7431/PrakPAB"

            val sendIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, teksYangDibagikan)
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, "Bagikan Lokacara ke:")
            startActivity(shareIntent)
        }

        btnrepo.setOnClickListener {
            val linkTujuan = "https://github.com/Unalome7431/PrakPAB"

            val intentBukaBrowser = Intent(Intent.ACTION_VIEW, Uri.parse(linkTujuan))
            startActivity(intentBukaBrowser)
        }
    }
}