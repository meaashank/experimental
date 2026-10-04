package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public class yBV {
    public static void ZRu(Uri uri, com.bytedance.sdk.openadsdk.core.VdW vdW) {
        if (vdW == null || !vdW.ZRu(uri)) {
            return;
        }
        try {
            vdW.NOt(uri);
        } catch (Exception e10) {
            e10.toString();
        }
    }

    public static String ZRu(WebView webView, int i10) {
        if (webView == null) {
            return "";
        }
        String userAgentString = webView.getSettings().getUserAgentString();
        if (TextUtils.isEmpty(userAgentString)) {
            return "";
        }
        return userAgentString + " open_news open_news_u_s/" + i10;
    }
}
