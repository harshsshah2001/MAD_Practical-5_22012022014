package com.example.mad_practical_5_22012022014

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.MediaStore
import android.telecom.Call
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
        val editTextBrowser2:EditText=findViewById(R.id.editTextText2)
        browseButton.setOnClickListener {
            OpenUrl(editTextBrowser.text.toString())
        }
        browseButton2.setOnClickListener {
            Call(editTextBrowser2.text.toString())
        }
        browseButton3.setOnClickListener {
            CallLog()
        }
        browseButton4.setOnClickListener {
            Gallery()
        }
        browseButton5.setOnClickListener {
            Cemera()
        }
        browseButton6.setOnClickListener {
            Alaram()
        }
    }
    fun OpenUrl(url:String){
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also { startActivity(it) }
    }
    fun Call(phone:String){
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$phone")).also { startActivity((it))}
    }
    fun CallLog(){
        Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).also { startActivity(it) }
    }
    fun Gallery(){
        Intent(Intent.ACTION_VIEW).setType("image/*").also { startActivity(it) }
    }
    fun Cemera(){
        Intent(MediaStore.ACTION_IMAGE_CAPTURE).also { startActivity(it) }
    }
    fun Alaram(){
        Intent(AlarmClock.ACTION_SHOW_ALARMS).also { startActivity(it) }
    }
}