package org.insatandroidclub.formation.webview;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebViewActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	setContentView(R.layout.main);
    	// Instanciation du WebView...
    	WebView wvSite = (WebView)findViewById(R.id.webview);
    	//...on active JavaScript...
    	WebSettings webSettings = wvSite.getSettings();
    	webSettings.setJavaScriptEnabled(true);
    	//...et on charge la page
    	wvSite.loadUrl("http://www.insatandroidclub.org/portal/");
    	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.webview, menu);
        return true;
    }
}
