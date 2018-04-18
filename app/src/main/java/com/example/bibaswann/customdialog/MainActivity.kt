package com.example.bibaswann.customdialog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            MyDialog.Companion.showDialog(this, object :OkCancelCallback{
                override fun onCancelClick() {
                    Toast.makeText(this@MainActivity,"You clicked cancel",Toast.LENGTH_LONG).show()
                }

                override fun onOKClick() {
                    Toast.makeText(this@MainActivity,"You clicked ok",Toast.LENGTH_LONG).show()
                }
            })

        }
    }

    interface OkCancelCallback {
        fun onOKClick()

        fun onCancelClick()
    }
}
