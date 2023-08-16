package com.example.mad_practical_5_22012022014

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browseButton:Button=findViewById(R.id.Btn_Browse)
        val editTextBrowser:EditText=findViewById(R.id.editTextText)

        browseButton.setOnClickListener {
            OpenUrl(editTextBrowser.text.toString())
        }
    }
    fun OpenUrl(url:String){
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also { startActivity(it) }
    }
    fun Call(phone:String){
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$phone")).also { startActivity((it))}
    }
    fun CallLog(){

    }
    fun Gallery(){

    }
    fun Cemera(){

    }
    fun Alaram(){

    }
}