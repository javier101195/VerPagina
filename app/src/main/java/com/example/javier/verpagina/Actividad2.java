package com.example.javier.verpagina;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Actividad2 extends Activity {
    private WebView webV1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activdad3);

        webV1 = (WebView) findViewById(R.id.webV1);

        Bundle bundle = getIntent().getExtras();
        webV1.loadUrl("http://" + bundle.getString("direccion"));
        webV1.setWebViewClient(new WebViewClient());
    }

    public void finalizar(View view) {
        finish();
    }

}
