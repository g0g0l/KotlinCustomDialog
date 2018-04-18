package com.example.bibaswann.customdialog

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.dialog_face.view.*

class MyDialog {
    companion object {
        fun showDialog(mContext: Context, okCancelCallback: MainActivity.OkCancelCallback, heading: String = "", body: String = "", okText: String = "", cancelText: String = "") {

            //Set the view
            val myDialog = LayoutInflater.from(mContext).inflate(R.layout.dialog_face, null)
            val warningDlg = AlertDialog.Builder(mContext).create()
            warningDlg.setView(myDialog)

            if (heading != "") {
                myDialog.tvHeading.text = heading
            }
            if (body != "") {
                myDialog.tvMsg.text = body
            }

            if (okText != "") {
                myDialog.btnOk.text = okText
            }

            if (cancelText != "") {
                myDialog.btnTryAgain.text = cancelText
            }

            //Set the action
            myDialog.btnOk.setOnClickListener {
                warningDlg.dismiss()
                okCancelCallback.onOKClick()
            }
            myDialog.btnTryAgain.setOnClickListener {
                warningDlg.dismiss()
                okCancelCallback.onCancelClick()
            }

            //Show the dialog
            warningDlg.show()
        }
    }
}