package com.aar.alc40phase1challenge;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.webkit.WebView;
import android.webkit.WebViewClient;


public class AboutALC extends AppCompatActivity {
    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        this.setTitle("About ALC");

        String url = "https://andela.com/alc/";


        webView = (WebView) findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.setWebViewClient(
                new SSLConfig()
        );

        webView.loadUrl(url);




    }

            }










