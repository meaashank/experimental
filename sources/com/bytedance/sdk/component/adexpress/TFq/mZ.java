package com.bytedance.sdk.component.adexpress.TFq;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class mZ {
    private WeakReference<NOt> ZRu;

    public mZ(NOt nOt) {
        this.ZRu = new WeakReference<>(nOt);
    }

    public void ZRu(NOt nOt) {
        this.ZRu = new WeakReference<>(nOt);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<NOt> weakReference = this.ZRu;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ZRu.get();
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<NOt> weakReference = this.ZRu;
        return (weakReference == null || weakReference.get() == null) ? "" : this.ZRu.get().adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<NOt> weakReference = this.ZRu;
        return (weakReference == null || weakReference.get() == null) ? "" : this.ZRu.get().appInfo();
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<NOt> weakReference = this.ZRu;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ZRu.get().changeVideoState(str);
    }

    @JavascriptInterface
    public void chooseAdResult(String str) {
        WeakReference<NOt> weakReference = this.ZRu;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ZRu.get().chooseAdResult(str);
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<NOt> weakReference = this.ZRu;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ZRu.get().clickEvent(str);
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<NOt> weakReference = this.ZRu;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ZRu.get().dynamicTrack(str);
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<NOt> weakReference = this.ZRu;
        return (weakReference == null || weakReference.get() == null) ? "" : this.ZRu.get().getCurrentVideoState();
    }

    @JavascriptInterface
    public String getData(String str) {
        WeakReference<NOt> weakReference = this.ZRu;
        return (weakReference == null || weakReference.get() == null) ? "" : this.ZRu.get().getData(str);
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<NOt> weakReference = this.ZRu;
        return (weakReference == null || weakReference.get() == null) ? "" : this.ZRu.get().getTemplateInfo();
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<NOt> weakReference = this.ZRu;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ZRu.get().initRenderFinish();
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<NOt> weakReference = this.ZRu;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ZRu.get().muteVideo(str);
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<NOt> weakReference = this.ZRu;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ZRu.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<NOt> weakReference = this.ZRu;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ZRu.get().ZRu(str);
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<NOt> weakReference = this.ZRu;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ZRu.get().skipVideo();
    }
}
