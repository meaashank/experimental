package com.bytedance.sdk.openadsdk.core.FA;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import e.e0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class uR {
    private static int NOt;
    private static volatile uR mZ;
    private final List<TFq> ZRu = new ArrayList();

    public static uR ZRu() {
        if (mZ == null) {
            synchronized (uR.class) {
                try {
                    if (mZ == null) {
                        mZ = new uR();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mZ;
    }

    @Nullable
    public TFq NOt() {
        TFq tFqRemove;
        if (mZ() > 0 && (tFqRemove = this.ZRu.remove(0)) != null) {
            return tFqRemove;
        }
        return null;
    }

    public int mZ() {
        return this.ZRu.size();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void mZ(TFq tFq) {
        if (tFq == null || tFq.getWebView() == null) {
            return;
        }
        if (tFq.getParent() != null) {
            ((ViewGroup) tFq.getParent()).removeView(tFq);
        }
        try {
            tFq.removeAllViews();
            tFq.mZ();
            tFq.setWebChromeClient(null);
            tFq.setWebViewClient(null);
            tFq.setDownloadListener(null);
            tFq.setDefaultTextEncodingName("UTF-8");
            tFq.setAllowFileAccess(false);
            tFq.setJavaScriptEnabled(true);
            tFq.setAppCacheEnabled(true);
            tFq.setDatabaseEnabled(true);
            tFq.setSupportZoom(false);
            tFq.getWebView().setLayerType(0, null);
            tFq.setBackgroundColor(0);
            tFq.getWebView().setHorizontalScrollBarEnabled(false);
            tFq.getWebView().setHorizontalScrollbarOverlay(false);
            tFq.getWebView().setVerticalScrollBarEnabled(false);
            tFq.getWebView().setVerticalScrollbarOverlay(false);
            tFq.ZRu(true);
            tFq.aT();
            tFq.setMixedContentMode(0);
        } catch (Exception unused) {
        }
    }

    public void NOt(TFq tFq) {
        if (tFq != null) {
            if (this.ZRu.size() >= NOt) {
                tFq.lp();
            } else {
                if (this.ZRu.contains(tFq)) {
                    return;
                }
                mZ(tFq);
                this.ZRu.add(tFq);
            }
        }
    }

    @e0
    public void ZRu(TFq tFq) {
        if (tFq != null) {
            NOt(tFq);
        }
    }
}
