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
        val btnDummy = findViewById<Button>(R.id.btnrepo)

        btnAboutProject.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        btnDummy.setOnClickListener {
            val linkTujuan = "https://github.com/Unalome7431/PrakPAB"

            val intentBukaBrowser = Intent(Intent.ACTION_VIEW, Uri.parse(linkTujuan))
            startActivity(intentBukaBrowser)
        }
    }
}