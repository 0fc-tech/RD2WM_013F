package com.example.mod12punkapi

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import okhttp3.*
import org.json.JSONArray
import java.io.IOException

//logt
private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clientOKHttp = OkHttpClient()
        val request = Request.Builder()
            .url("https://api.punkapi.com/v2/beers")
            .build()
        clientOKHttp.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                //loge
                Log.e(TAG, "onFailure: " + e.message, )
            }

            override fun onResponse(call: Call, response: Response) {
                //Log.i(TAG, "onResponse: ${response.body?.string()}")
                if(response.isSuccessful){
                    //val moshi : Moshi= Moshi.Builder()
                    //    .addLast(KotlinJsonAdapterFactory())
                    //    .build()
                    //val adapter = moshi.adapter<List<Beer>>()
                    //val cards: List<Beer> = adapter.fromJson(response.body?.string())
                    val jsonString = response.body?.string()
                    val arrayBeer = JSONArray(jsonString)
                    for (  jsonObjI : Int in 0 until arrayBeer.length() ){
                        Log.i(TAG, "Beer: "+ arrayBeer.get(jsonObjI).toString())
                    }
                }
            }

        })
    }
}

