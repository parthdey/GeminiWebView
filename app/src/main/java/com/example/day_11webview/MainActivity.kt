package com.example.day_11webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webViewer = findViewById<WebView>(R.id.webViewer)
        webViewSetUp(webViewer)

    }
    private fun webViewSetUp(webViewer: WebView){

        webViewer.webViewClient = WebViewClient()

        webViewer.apply {
            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true
            loadUrl("https://gemini.google.com/app/937a3307c1ac5dda?utm_source=sem&utm_medium=paid-media&utm_campaign=q4enIN_sem1")
        }
    }

}