package com.example.week7criticalthinking

import android.content.Context
import androidx.appcompat.app.AlertDialog

class Warning(context: Context, message: String) {
    init {

        val builder: AlertDialog.Builder = AlertDialog.Builder(context)
        builder.setMessage(message)
        builder.setTitle("Alert !")
        builder.setCancelable(true)
        builder.setPositiveButton("I Understand!") { dialog, which ->
            dialog.dismiss()
        }

        builder.create()
        builder.show()
    }
}