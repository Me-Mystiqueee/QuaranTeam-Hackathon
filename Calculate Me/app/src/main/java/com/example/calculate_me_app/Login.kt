package com.example.calculate_me_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sawolabs.androidsdk.Sawo


class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun onClickLogin(view: View) {
        Sawo(
            this,
            "20378f20-825b-4cc8-bd98-d00c258ddf47", // your api key,
            "6160475baaa97bd4878dc6e0mxuRm1sVcbOlgdfbk7Y3jWT1" // your secret key
        ).login(
            "email", // can be one of 'email' or 'phone_number_sms'
            CallbackActivity::class.java.name // Callback class name
        )
    }
}
