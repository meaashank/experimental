package com.iab.omid.library.bytedance2.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f151316b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f151317a;

    private g() {
    }

    public static g b() {
        return f151316b;
    }

    public Context a() {
        return this.f151317a;
    }

    public void a(Context context) {
        this.f151317a = context != null ? context.getApplicationContext() : null;
    }
}
