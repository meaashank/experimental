package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f157635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Object f157636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected WindVaneWebView f157637c;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        this.f157635a = context;
        this.f157637c = windVaneWebView;
    }

    public void initialize(Object obj, WindVaneWebView windVaneWebView) {
        this.f157636b = obj;
        this.f157637c = windVaneWebView;
    }
}
