package com.inmobi.media;

import android.content.Context;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes5.dex */
public final class ld extends WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f153118a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(Context context) {
        super(context);
        kotlin.jvm.internal.G.p(context, "context");
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.f153118a = true;
        super.destroy();
    }
}
