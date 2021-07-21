package com.somya.birthdayspecial

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import kotlinx.android.synthetic.main.activity_create_birthday.*

class createBirthdayActivity : AppCompatActivity() {
    companion object{
        const val name_person="person_name"
        const val message_person="message_person"
        const val your_name="your_name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_birthday)
        val name=intent.getStringExtra(name_person)
        val cmessage=intent.getStringExtra(message_person)
        val yname=intent.getStringExtra(your_name)

        cardname.text="$name"
        cardfromname.text="$yname"
        cardmessage.text="$cmessage"
    }

    fun sharebirthdaygreeting(view: View) {
        val bitmap=Bitmap.createBitmap(greetingcard.width,greetingcard.height,Bitmap.Config.ARGB_8888)
        val canvas=Canvas(bitmap)
        greetingcard.draw(canvas)

        val intent=Intent()
        intent.action=Intent.ACTION_SEND
        val path=MediaStore.Images.Media.insertImage(contentResolver,bitmap,"Title","null")
        val uri=Uri.parse(path)
        intent.putExtra(Intent.EXTRA_STREAM,uri)
        intent.type="image/*"
        startActivity(Intent.createChooser(intent,"Share Greeting to"))
    }
}