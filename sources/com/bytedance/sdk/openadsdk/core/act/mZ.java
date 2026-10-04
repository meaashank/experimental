package com.bytedance.sdk.openadsdk.core.act;

import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.a;

/* JADX INFO: loaded from: classes3.dex */
public class mZ implements NOt {
    public static void ZRu(Context context, String str, CustomTabsIntent customTabsIntent, Uri uri) {
        customTabsIntent.f86571a.setPackage(str);
        customTabsIntent.t(context, uri);
    }

    @Override // com.bytedance.sdk.openadsdk.core.act.NOt
    public void ZRu(a aVar) {
        throw null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.act.NOt
    public void ZRu() {
        throw null;
    }
}
