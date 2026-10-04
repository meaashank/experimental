package com.prism.commons.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;
import androidx.appcompat.app.ActivityC1486c;
import androidx.appcompat.widget.Toolbar;
import c6.C2947b;
import com.prism.commons.utils.H;

/* JADX INFO: loaded from: classes5.dex */
public class WebViewActivity extends ActivityC1486c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f161966a = "EXTRA_KEY_TITLE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f161967b = "EXTRA_KEY_URL";

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.activity.k, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        H.a(this);
    }

    @Override // androidx.fragment.app.r, androidx.activity.k, androidx.core.app.ActivityC2390m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H.a(this);
        setContentView(C2947b.k.f129439a0);
        setSupportActionBar((Toolbar) findViewById(C2947b.h.f129220p6));
        getSupportActionBar().X(true);
        String stringExtra = getIntent().getStringExtra("EXTRA_KEY_TITLE");
        String stringExtra2 = getIntent().getStringExtra(f161967b);
        setTitle(stringExtra);
        ((WebView) findViewById(C2947b.h.f129071W6)).loadUrl(stringExtra2);
    }

    @Override // androidx.appcompat.app.ActivityC1486c, androidx.fragment.app.r, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
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
