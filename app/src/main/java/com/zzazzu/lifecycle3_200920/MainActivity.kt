package com.zzazzu.lifecycle3_200920

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("메인화면", "onCreate 실행됨")

        moveToOtherBtn.setOnClickListener {
            val myIntent = Intent (this, other::class.java)
            startActivity(myIntent)

        }
    }
}