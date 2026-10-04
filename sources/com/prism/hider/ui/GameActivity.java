package com.prism.hider.ui;

import P9.a;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActivityC1486c;
import com.app.hider.master.promax.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.prism.fusionadsdk.LjAdLoader;
import com.prism.fusionadsdk.LjAdRequest;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class GameActivity extends ActivityC1486c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f167955g = "GameActivity";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f167956h = "EXTRA_KEY_GAME_TYPE";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f167957i = "EXTRA_KEY_GAME_URL";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f167958j = "EXTRA_KEY_GAME_NAME";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f167959k = 9835;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f167962c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f167964e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<String, String> f167960a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f167961b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f167963d = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f167965f = false;

    public class JSBridge {
        private Activity activity;

        public JSBridge(Activity activity) {
            this.activity = activity;
        }

        private void onShowSkuList() {
            ma.i.i(this.activity, GameActivity.f167959k);
        }

        @JavascriptInterface
        public int buyPermission(String str, int i10, int i11) {
            String str2 = GameActivity.f167955g;
            StringBuilder sbA = androidx.constraintlayout.widget.e.a("buy permission, gameName: ", str, ", level:", i10, "; price:");
            sbA.append(i11);
            Log.d(str2, sbA.toString());
            if (ma.i.d(this.activity)) {
                return i11;
            }
            onShowSkuList();
            GameActivity.this.f167965f = true;
            return 0;
        }

        @JavascriptInterface
        public int checkUnlimitedMoney(String str) {
            android.support.v4.media.b.a("checkUnlimitedMoney, game name is ", str, GameActivity.f167955g);
            return ma.i.d(this.activity) ? 1 : 0;
        }

        @JavascriptInterface
        public int checkUnlimitedPlay(String str, int i10) {
            Log.d(GameActivity.f167955g, "checkUnlimitedPlay,gameName:" + str + "; level: " + i10);
            if (i10 <= GameActivity.this.f167963d) {
                Log.d(GameActivity.f167955g, str + " is in freeLevel");
                return 1;
            }
            if (ma.i.d(this.activity)) {
                android.support.v4.media.b.a("user have subscribe game, gameName=", str, GameActivity.f167955g);
                return 1;
            }
            if (GameActivity.this.f167961b) {
                android.support.v4.media.b.a("user have view ad, gameName=", str, GameActivity.f167955g);
                GameActivity.this.f167961b = false;
                return 1;
            }
            android.support.v4.media.b.a("to show sku list, gameName=", str, GameActivity.f167955g);
            onShowSkuList();
            GameActivity.this.f167965f = false;
            return 0;
        }

        @JavascriptInterface
        public int onBuyClick(String str, String str2, String str3) {
            return 0;
        }

        @JavascriptInterface
        public boolean onGameStart(String str, int i10) {
            Log.d("Bridge", "onGameStart, name: $gameName, level: $level");
            R9.a.a().n(this.activity, str, String.valueOf(i10));
            return true;
        }

        @JavascriptInterface
        public void onLevelUp(String str, String str2) {
        }
    }

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri uri = Uri.parse(str);
            Log.d(GameActivity.f167955g, "load_url: " + str);
            if (!uri.getScheme().equals("js")) {
                return false;
            }
            if (!uri.getAuthority().equals("game_level_up")) {
                return true;
            }
            R9.a.a().n(GameActivity.this.getApplicationContext(), uri.getQueryParameter("name"), uri.getQueryParameter(FirebaseAnalytics.Param.LEVEL));
            Log.d(GameActivity.f167955g, "report...");
            return true;
        }
    }

    public class b extends T6.a {

        public class a implements T6.b {
            public a() {
            }

            @Override // T6.b
            public void a(@NonNull com.prism.fusionadsdkbase.g gVar) {
                Log.d(GameActivity.f167955g, "onUserEarnedRewards, type= " + gVar.f162381a + ", amount=" + gVar.f162382b);
                GameActivity gameActivity = GameActivity.this;
                if (gameActivity.f167965f) {
                    return;
                }
                gameActivity.f167961b = true;
            }
        }

        /* JADX INFO: renamed from: com.prism.hider.ui.GameActivity$b$b, reason: collision with other inner class name */
        public class RunnableC0682b implements Runnable {
            public RunnableC0682b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!GameActivity.this.f167965f) {
                    GameActivity.this.f167961b = true;
                }
                GameActivity.this.f167964e.setVisibility(8);
            }
        }

        public b() {
        }

        @Override // T6.a
        public void b() {
            if (GameActivity.this.isFinishing()) {
                return;
            }
            String unused = GameActivity.f167955g;
        }

        @Override // T6.a
        public void c(int i10) {
            if (GameActivity.this.isFinishing()) {
                return;
            }
            String unused = GameActivity.f167955g;
            GameActivity gameActivity = GameActivity.this;
            Toast.makeText(gameActivity, gameActivity.getString(R.string.loading_ad_failed), 1).show();
            new Handler().postDelayed(new RunnableC0682b(), 5000L);
        }

        @Override // T6.a
        public void d() {
        }

        @Override // T6.a
        public void f(Object obj) {
            Log.d(GameActivity.f167955g, "on Ad Loaded");
            if (GameActivity.this.isFinishing()) {
                return;
            }
            J6.c cVar = (J6.c) obj;
            GameActivity.this.f167964e.setVisibility(8);
            if (cVar instanceof K6.d) {
                cVar.b(GameActivity.this, new a());
            } else {
                cVar.c(GameActivity.this, null);
            }
            String str = GameActivity.f167955g;
        }
    }

    public final void b1() {
        this.f167964e.setVisibility(0);
        new LjAdLoader.Builder().withCache(false).withAdListener(new b()).withReportPrefix(a.b.f65590f).build().u(this, new LjAdRequest.Builder(this).setAdPlaceName(a.C0095a.f65584g).build());
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, android.app.Activity
    public void onActivityResult(int i10, int i11, @Nullable Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 != 9835 || i11 == -1) {
            return;
        }
        b1();
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        setContentView(R.layout.hider_activity_game);
        WebView webView = (WebView) findViewById(R.id.web_view);
        this.f167964e = findViewById(R.id.show_ads);
        String stringExtra = getIntent().getStringExtra(f167957i);
        webView.setWebViewClient(new a());
        webView.setWebChromeClient(new WebChromeClient() { // from class: com.prism.hider.ui.GameActivity.2
            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                Log.d(GameActivity.f167955g, "ConsoleMessage: message: " + consoleMessage.message());
                return super.onConsoleMessage(consoleMessage);
            }
        });
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        webView.setScrollBarStyle(33554432);
        webView.setHorizontalScrollBarEnabled(true);
        webView.addJavascriptInterface(new JSBridge(this), "bridge");
        webView.loadUrl(stringExtra);
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.fragment.app.r, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.ActivityC1486c, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
