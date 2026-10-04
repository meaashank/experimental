package com.mbridge.msdk.preload.listenter;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class a implements PreloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WeakReference<PreloadListener> f157911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f157912b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f157913c = false;

    public a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f157911a = new WeakReference<>(preloadListener);
        }
    }

    public boolean a() {
        return this.f157913c;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f157911a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f157911a.get().onPreloadFaild(str);
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f157911a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f157911a.get().onPreloadSucceed();
    }

    public void a(boolean z10) {
        this.f157913c = z10;
    }
}
