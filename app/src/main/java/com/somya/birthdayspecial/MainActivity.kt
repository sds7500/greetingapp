package com.somya.birthdayspecial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun gotobirthday(view: View) {
        val intent=Intent(this,birthdayActivity::class.java)
        startActivity(intent)
    }

    fun gotoanniversary(view: View) {
        val intent=Intent(this,anniversaryActivity::class.java)
        startActivity(intent)
    }

    fun gotowedding(view: View) {
        val intent=Intent(this,weddingActivity::class.java)
        startActivity(intent)
    }
}