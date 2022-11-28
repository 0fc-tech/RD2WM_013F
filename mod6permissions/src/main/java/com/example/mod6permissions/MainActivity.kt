package com.example.mod6permissions

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    val requestPermissionLauncher =
        registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted: Boolean ->
            if (isGranted) {
                sendSms()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.buttonSendSMS).setOnClickListener {
            if(ActivityCompat.checkSelfPermission(this,Manifest.permission.SEND_SMS)
                == PackageManager.PERMISSION_GRANTED){
                sendSms()
            }else{
                requestPermissionLauncher.launch(Manifest.permission.SEND_SMS)
            }
        }
    }
    fun sendSms(){
        val intentSMS = Intent(Intent.ACTION_SENDTO)
        intentSMS.data = Uri.parse("sms:+33612345678")  // This ensures only SMS apps respond
        intentSMS.putExtra("sms_body", "hello")

//        if (intentSMS.resolveActivity(packageManager) != null) {
            startActivity(intentSMS)
  //      }
    }
}





