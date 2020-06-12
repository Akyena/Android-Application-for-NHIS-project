package eastpoint.nhis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mywebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebview = (WebView)findViewById(R.id.view);
        WebSettings wsetting = mywebview.getSettings();
        wsetting.setJavaScriptEnabled(true);
        mywebview.loadUrl("http://10.0.2.2/NHIS/index.php");
        mywebview.setWebViewClient(new WebViewClient());


    }

    @Override
    public void onBackPressed() {
        if(mywebview.canGoBack()){
            mywebview.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
