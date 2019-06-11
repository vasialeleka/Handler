package com.vasialeleka.handler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v) {
            btnStart -> startSomething()
            btnTest -> showToast("Test")
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }

    private fun startSomething() {
        var thread = Thread(Runnable {
            for (i in 0..10) {
                // something long
                longProcess()
                info.text = "Long proceess" + i
            }
        })
        thread.start()

    }

    private fun longProcess() {
        TimeUnit.SECONDS.sleep(1)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnStart.setOnClickListener(this)
    }
}
