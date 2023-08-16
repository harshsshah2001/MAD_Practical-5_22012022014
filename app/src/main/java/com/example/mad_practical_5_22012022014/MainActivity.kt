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
        val browseButton2:Button=findViewById(R.id.Btn_Browse2)
        val browseButton3:Button=findViewById(R.id.Btn_Browse3)
        val browseButton4:Button=findViewById(R.id.Btn_Browse4)
        val browseButton5:Button=findViewById(R.id.Btn_Browse5)
        val browseButton6:Button=findViewById(R.id.Btn_Browse6)
        val editTextBrowser:EditText=findViewById(R.id.editTextText)

        browseButton.setOnClickListener {
            OpenUrl(editTextBrowser.text.toString())
        }
        browseButton4.setOnClickListener {
            CallLog()
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
        Intent(Intent.CATEGORY_APP_GALLERY).also { startActivity(it) }
    }
    fun Cemera(){

    }
    fun Alaram(){

    }
}