package com.bytedance.sdk.component.adexpress.TFq;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.ZRu.le;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class uR {
    private WeakReference<le> ZRu;

    public uR(le leVar) {
        this.ZRu = new WeakReference<>(leVar);
    }

    public void ZRu(le leVar) {
        this.ZRu = new WeakReference<>(leVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<le> weakReference = this.ZRu;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ZRu.get().invokeMethod(str);
    }
}
