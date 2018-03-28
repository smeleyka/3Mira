package ru.smeleyka.a3mira;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.NavigationView;
import android.support.v4.view.MenuCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.webkit.WebSettings;
import android.webkit.WebView;


import com.jakewharton.rxbinding2.support.design.widget.RxBottomNavigationView;

import org.reactivestreams.Subscription;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.disposables.Disposable;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity.class";

    @BindView(R.id.bottom_nav)   BottomNavigationView mBottomNavigationView;
    @BindView(R.id.web_view)    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        getSupportActionBar().hide();

//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            Window w = getWindow(); // in Activity's onCreate() for instance
//            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
//        }

        webView.setWebViewClient(new MyWebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setAppCachePath(getCacheDir().getAbsolutePath());
        webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webView.setLayoutAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                Log.d(TAG,"onAnimationStart");

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Log.d(TAG,"onAnimationEnd");

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                Log.d(TAG,"onAnimationRepeat");

            }
        });

        webView.computeScroll();

        scroll();





        //webView.loadUrl(getString(R.string.url));

        Disposable buttomNavigationViewSub = RxBottomNavigationView.itemSelections(mBottomNavigationView)
                .subscribe(menuItem -> {
                    switch (menuItem.getItemId()) {
                        case R.id.action_home:
                            webView.loadUrl(getString(R.string.url_home));
                            Log.d(TAG,"url_home");
                            break;
                        case R.id.action_route:
                            webView.loadUrl(getString(R.string.url_route));
                            Log.d(TAG,"url_route");
                            break;
                        case R.id.action_faq:
                            webView.loadUrl(getString(R.string.url_faq));
                            Log.d(TAG,"url_faq");
                            break;
                        default:
                            break;
                    }
                });
    }

    @OnClick(R.id.web_view)
    public void onWebViewClick() {
        Log.d(TAG, webView.getScrollX() + " " + webView.getScrollY());
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @TargetApi(23)
    public void scroll(){
        webView.setOnScrollChangeListener((v, scrollX, scrollY, oldScrollX, oldScrollY) -> {
            Log.d(TAG,"scrollX"+String.valueOf(scrollX));
            Log.d(TAG,"scrollY"+String.valueOf(scrollY));
            Log.d(TAG,"oldScrollX"+String.valueOf(oldScrollX));
            Log.d(TAG,"oldScrollY"+String.valueOf(oldScrollY));
            showBottomNavigation(oldScrollY<scrollY);
        });
    }

    public void showBottomNavigation(boolean show){
       if(show) {
           mBottomNavigationView.setVisibility(View.INVISIBLE);
       }

       else if (!show){
           mBottomNavigationView.setVisibility(View.VISIBLE);
       }
    }




}
