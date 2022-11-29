package com.example.mod6tppermission

import android.Manifest
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    val requestPermissionLauncherCall =
        registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { isGranted :Boolean -> callPhone(isGranted)
        }

    private fun callPhone(isCallPermissionGranted : Boolean) {

        val intentCall =if(isCallPermissionGranted) {
            Intent(Intent.ACTION_CALL, Uri.parse("tel:0612345678"))
        }else{
            Intent(Intent.ACTION_DIAL, Uri.parse("tel:0612345678"))
        }

        startActivity(intentCall)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.buttonCall).setOnClickListener {
            if(ActivityCompat.checkSelfPermission(this,Manifest.permission.CALL_PHONE) == 0){
                callPhone(true)
            }else{
                requestPermissionLauncherCall.launch(Manifest.permission.CALL_PHONE)
            }
        }
    }
}






