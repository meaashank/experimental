package com.unity3d.services.core.webview;

import android.content.Context;
import android.webkit.WebSettings;

/* JADX INFO: loaded from: classes7.dex */
public class WebViewWithCache extends WebView {
    public WebViewWithCache(Context context, boolean z10) {
        super(context, z10);
        WebSettings settings = getSettings();
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        if (z10) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
    }
}
