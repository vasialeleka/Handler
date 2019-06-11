package com.vasialeleka.handler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() , View.OnClickListener{
    override fun onClick(v: View?) {
        when(v){
            btnStart -> startSomething()
        }
    }

    private fun startSomething() {
        for (i in 0..10){
            // something long
            longProcess()
            info.text = "Long proceess" + i

        }
    }

    private fun longProcess() {
        TimeUnit.SECONDS.sleep(1)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
