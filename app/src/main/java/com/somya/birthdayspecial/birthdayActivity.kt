package com.somya.birthdayspecial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_birthday.*

class birthdayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday)
    }

    fun createcard(view: View) {
        val name = BirthdayName.editableText.toString()
        val message=BirthdayMessage.editableText.toString()
        val yourname=BirthdayYourName.editableText.toString()

        Toast.makeText(this,"Card Creation started for $name", Toast.LENGTH_LONG).show()
        val intent= Intent(this,createBirthdayActivity::class.java)
        intent.putExtra(createBirthdayActivity.name_person,name)
        intent.putExtra(createBirthdayActivity.message_person,message)
        intent.putExtra(createBirthdayActivity.your_name,yourname)
        startActivity(intent)
    }

}