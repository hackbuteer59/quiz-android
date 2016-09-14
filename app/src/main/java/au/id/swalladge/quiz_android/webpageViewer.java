package au.id.swalladge.quiz_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class webpageViewer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webviewer);

        loadWebView("file:///android_asset/about.html");
    }

    /**
     * general helper function to load the given url in the webview on the activity layout
     * @param url
     */
    private void loadWebView(String url) {
        WebView view = (WebView) findViewById(R.id.theWebView);
        view.loadUrl(url);
    }

    /**
     * return to the main screen
     * @param view
     */
    public void backToMenu(View view) {
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }
}
