package com.wooda.androidref

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.wooda.androidref.systeminformation.SystemInformationActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializeControls()
    }

    private fun initializeControls() {
        findViewById<Button>(R.id.system_information_btn).setOnClickListener { SystemInformationActivity.startActivity(this) }
    }
}