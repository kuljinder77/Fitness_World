package com.example.kuljindersingh.fitnessworld.storedatabase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.kuljindersingh.fitnessworld.R;

/**
 * Created by kuljinder singh on 5/22/2016.
 */
public class supwebview extends Activity
{

    WebView webview;
    String link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.supwebview);
        webview=(WebView)findViewById(R.id.webview);
        link=getIntent().getStringExtra("url");
        webview.getSettings().setJavaScriptEnabled(true);

        webview.loadUrl(link);
    }
}
