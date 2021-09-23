package com.bondidos.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.squareup.moshi.Moshi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val json = "[\n" +
                "    {\n" +
                "        \"breeds\": [],\n" +
                "        \"id\": \"d8s\",\n" +
                "        \"url\": \"https://cdn2.thecatapi.com/images/d8s.jpg\",\n" +
                "        \"width\": 537,\n" +
                "        \"height\": 720\n" +
                "    }\n" +
                "]"

        /*val json = "{\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"T-Shirt\",\n" +
                "    \"details\": \"This is a full sized T-Shirt\"\n" +
                "}"*/
        val moshi = Moshi.Builder().build()
        val jsonAdapter = moshi.adapter<Product>(Product::class.java)
        val product = jsonAdapter.fromJson(json)
        Log.d("Logs", product.toString())

    }
}