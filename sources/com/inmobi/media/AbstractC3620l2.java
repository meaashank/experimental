package com.inmobi.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.webkit.WebResourceResponse;
import com.google.common.net.HttpHeaders;
import java.io.InputStream;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.inmobi.media.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3620l2 {
    public static final boolean a(String str) {
        return str != null && str.length() > 0;
    }

    public static final boolean a(JSONArray jSONArray) {
        kotlin.jvm.internal.G.p(jSONArray, "<this>");
        return jSONArray.length() == 0;
    }

    public static final int a(float f10) {
        try {
            return (int) (f10 / AbstractC3760v3.b());
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final int a(int i10) {
        try {
            return (int) (i10 / AbstractC3760v3.b());
        } catch (Exception unused) {
            return i10;
        }
    }

    public static final Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter filter) {
        kotlin.jvm.internal.G.p(context, "<this>");
        kotlin.jvm.internal.G.p(filter, "filter");
        if (C3635m3.f153124a.G()) {
            return context.registerReceiver(broadcastReceiver, filter, 2);
        }
        return context.registerReceiver(broadcastReceiver, filter);
    }

    public static final WebResourceResponse a(InputStream inputStream, String mimeType) {
        kotlin.jvm.internal.G.p(inputStream, "<this>");
        kotlin.jvm.internal.G.p(mimeType, "mimeType");
        Map mapK = kotlin.collections.m0.k(new Pair(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*"));
        if (C3635m3.y()) {
            return new WebResourceResponse(mimeType, "UTF-8", 200, "OK", mapK, inputStream);
        }
        return new WebResourceResponse(mimeType, "UTF-8", inputStream);
    }
}
