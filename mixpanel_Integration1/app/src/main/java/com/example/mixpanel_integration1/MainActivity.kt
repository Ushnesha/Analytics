package com.example.mixpanel_integration1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mixpanel.android.mpmetrics.MixpanelAPI
import org.json.JSONException
import org.json.JSONObject
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mixpanelAPI = MixpanelAPI.getInstance(this, getString(R.string.mixpanel_token))

        try{
            val props = JSONObject()
            props.put("Gender", "Male")
            props.put("Logged in", false)
            props.put("Has Telephone", true)
            mixpanelAPI.track("MainActivity - onCreate called",props)
        }catch (e:JSONException){
            Log.e("APP", "JSON parsing error")
        }



    }
}
