package com.bytedance.sdk.component.adexpress.TFq;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.ZRu.le;
import e.e0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class TFq {
    private static int FA = 10;
    private static int Ht = 10;
    private static final byte[] TFq = new byte[0];
    private static volatile TFq Vor;
    private final AtomicBoolean Mm = new AtomicBoolean(false);
    private List<com.bytedance.sdk.component.Vor.uR> ZRu = new ArrayList();
    private List<com.bytedance.sdk.component.Vor.uR> NOt = new ArrayList();
    private Map<Integer, mZ> mZ = new HashMap();
    private Map<Integer, uR> uR = new HashMap();

    private TFq() {
        com.bytedance.sdk.component.adexpress.ZRu.ZRu.mZ mZVarMZ = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ();
        if (mZVarMZ != null) {
            Ht = mZVarMZ.aT();
            FA = mZVarMZ.ZH();
        }
    }

    private void Mm(com.bytedance.sdk.component.Vor.uR uRVar) {
        uRVar.removeAllViews();
        uRVar.mZ();
        uRVar.setWebChromeClient(null);
        uRVar.setWebViewClient(null);
        uRVar.setDownloadListener(null);
        uRVar.setJavaScriptEnabled(true);
        uRVar.setAppCacheEnabled(false);
        uRVar.setSupportZoom(false);
        uRVar.setUseWideViewPort(true);
        uRVar.setJavaScriptCanOpenWindowsAutomatically(true);
        uRVar.setDomStorageEnabled(true);
        uRVar.setBuiltInZoomControls(false);
        uRVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        uRVar.setLoadWithOverviewMode(false);
        uRVar.setDefaultTextEncodingName("UTF-8");
        uRVar.setDefaultFontSize(16);
    }

    public static TFq ZRu() {
        if (Vor == null) {
            synchronized (TFq.class) {
                try {
                    if (Vor == null) {
                        Vor = new TFq();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Vor;
    }

    public void Ht(com.bytedance.sdk.component.Vor.uR uRVar) {
        if (uRVar == null) {
            return;
        }
        mZ mZVar = this.mZ.get(Integer.valueOf(uRVar.hashCode()));
        if (mZVar != null) {
            mZVar.ZRu(null);
        }
        uRVar.b_("SDK_INJECT_GLOBAL");
    }

    @e0
    public void NOt(com.bytedance.sdk.component.Vor.uR uRVar) {
        if (uRVar == null) {
            return;
        }
        Mm(uRVar);
        uRVar.b_("SDK_INJECT_GLOBAL");
        Ht(uRVar);
        ZRu(uRVar);
    }

    public boolean TFq(com.bytedance.sdk.component.Vor.uR uRVar) {
        if (uRVar == null) {
            return false;
        }
        try {
            Context context = uRVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            uRVar.lp();
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    @e0
    public void mZ(com.bytedance.sdk.component.Vor.uR uRVar) {
        if (uRVar == null) {
            return;
        }
        Mm(uRVar);
        uRVar.b_("SDK_INJECT_GLOBAL");
        Ht(uRVar);
        uR(uRVar);
    }

    public void uR(com.bytedance.sdk.component.Vor.uR uRVar) {
        if (uRVar == null) {
            return;
        }
        if (this.ZRu.size() >= Ht) {
            try {
                Context context = uRVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                uRVar.lp();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.ZRu.contains(uRVar)) {
            return;
        }
        try {
            Context context2 = uRVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                uRVar.setRecycler(true);
                this.ZRu.add(uRVar);
                mZ();
            }
        } catch (Throwable th2) {
            mZ();
            th2.getMessage();
        }
    }

    @Nullable
    public com.bytedance.sdk.component.Vor.uR NOt(Context context, String str) {
        if (mZ() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.uR.TFq.ZRu(str) && mZ() <= 1) {
            mZ();
            return null;
        }
        com.bytedance.sdk.component.Vor.uR uRVarRemove = this.ZRu.remove(0);
        if (uRVarRemove == null) {
            return null;
        }
        try {
            Context context2 = uRVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                uRVarRemove.setRecycler(false);
                mZ();
            }
            return uRVarRemove;
        } catch (Throwable unused) {
            mZ();
            return null;
        }
    }

    public int mZ() {
        return this.ZRu.size();
    }

    @Nullable
    public com.bytedance.sdk.component.Vor.uR ZRu(Context context, String str) {
        if (uR() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.uR.TFq.ZRu(str) && uR() <= 1) {
            uR();
            return null;
        }
        com.bytedance.sdk.component.Vor.uR uRVarRemove = this.NOt.remove(0);
        if (uRVarRemove == null) {
            return null;
        }
        try {
            Context context2 = uRVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                uRVarRemove.setRecycler(false);
                uR();
            }
            return uRVarRemove;
        } catch (Throwable unused) {
            uR();
            return null;
        }
    }

    public void NOt() {
        for (com.bytedance.sdk.component.Vor.uR uRVar : this.ZRu) {
            if (uRVar != null) {
                try {
                    Context context = uRVar.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    uRVar.lp();
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
        this.ZRu.clear();
        for (com.bytedance.sdk.component.Vor.uR uRVar2 : this.NOt) {
            if (uRVar2 != null) {
                try {
                    Context context2 = uRVar2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    uRVar2.lp();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.NOt.clear();
    }

    public int uR() {
        return this.NOt.size();
    }

    public void ZRu(com.bytedance.sdk.component.Vor.uR uRVar) {
        if (uRVar == null) {
            return;
        }
        if (this.NOt.size() >= FA) {
            try {
                Context context = uRVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                uRVar.lp();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.NOt.contains(uRVar)) {
            return;
        }
        try {
            Context context2 = uRVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                uRVar.setRecycler(true);
                this.NOt.add(uRVar);
                uR();
            }
        } catch (Throwable th2) {
            uR();
            th2.getMessage();
        }
    }

    public void NOt(int i10) {
        synchronized (TFq) {
            FA = i10;
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public void ZRu(com.bytedance.sdk.component.Vor.uR uRVar, NOt nOt) {
        if (uRVar == null || nOt == null) {
            return;
        }
        mZ mZVar = this.mZ.get(Integer.valueOf(uRVar.hashCode()));
        if (mZVar != null) {
            mZVar.ZRu(nOt);
        } else {
            mZVar = new mZ(nOt);
            this.mZ.put(Integer.valueOf(uRVar.hashCode()), mZVar);
        }
        uRVar.ZRu(mZVar, "SDK_INJECT_GLOBAL");
    }

    @SuppressLint({"JavascriptInterface"})
    public void ZRu(WebView webView, le leVar, String str) {
        if (webView == null || leVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        uR uRVar = this.uR.get(Integer.valueOf(webView.hashCode()));
        if (uRVar != null) {
            uRVar.ZRu(leVar);
        } else {
            uRVar = new uR(leVar);
            this.uR.put(Integer.valueOf(webView.hashCode()), uRVar);
        }
        webView.addJavascriptInterface(uRVar, str);
    }

    public void ZRu(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        uR uRVar = this.uR.get(Integer.valueOf(webView.hashCode()));
        if (uRVar != null) {
            uRVar.ZRu(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void ZRu(int i10) {
        synchronized (TFq) {
            Ht = i10;
        }
    }
}
