package com.example.androidsdk;

import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webviewClient extends WebViewClient
{
    public String myurl;

    @Override
    public boolean shouldOverrideUrlLoading(final WebView view, final String url)
    {
        new Thread(new Runnable()
        {

            public void run()
            {
                view.loadUrl(url);
            }



        }).start();



        return true;
    }


    @Override
    public void onPageFinished(WebView view, String url) {

         myurl = view.getUrl();
        super.onPageFinished(view, url);
    }
}