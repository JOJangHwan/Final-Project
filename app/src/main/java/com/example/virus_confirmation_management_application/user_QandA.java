package com.example.virus_confirmation_management_application;

import static com.example.virus_confirmation_management_application.user_Frag2.a;
import static com.example.virus_confirmation_management_application.user_bottomnavi.pagedata;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class user_QandA extends AppCompatActivity {

    private WebView webView;
    private String url = "http://ncov.mohw.go.kr/faqBoardList.do?brdId=3&brdGubun=38";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_qanda_activity);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_map:
                        pagedata=0;
                        Intent intent = new Intent(getApplicationContext(), user_bottomnavi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                    case R.id.action_main:
                        pagedata=1;
                        a=0;
                        intent = new Intent(getApplicationContext(), user_bottomnavi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                    case R.id.action_person:
                        pagedata=2;
                        intent = new Intent(getApplicationContext(), user_bottomnavi.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent); // 액티비티 이동 구문
                        break;
                }
                return true;
            }
        });

        webView = (WebView) findViewById(R.id.user_qanda_activity);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClientClass());

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class WebViewClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}