package com.mbridge.msdk.config.dynamic.baseview.webview.util;

import android.net.Uri;
import android.support.v4.media.e;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public class a {
    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        Object[] array = uri.getQueryParameterNames().toArray();
        if (!TextUtils.isEmpty(scheme) && scheme.equals("js")) {
            return "javascript:" + uri.getQueryParameter(String.valueOf(array[0]));
        }
        if (TextUtils.isEmpty(scheme) || !scheme.equals("mv")) {
            return str;
        }
        String queryParameter = uri.getQueryParameter(String.valueOf(array[0]));
        String queryParameter2 = array.length > 1 ? uri.getQueryParameter(String.valueOf(array[1])) : "";
        StringBuilder sb2 = new StringBuilder("javascript:window.WindVane.");
        sb2.append(uri.getHost());
        sb2.append("(");
        sb2.append(queryParameter);
        sb2.append(",");
        return e.a(sb2, queryParameter2, ");");
    }
}
