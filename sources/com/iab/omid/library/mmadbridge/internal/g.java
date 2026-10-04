package com.iab.omid.library.mmadbridge.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f151574b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f151575a;

    private g() {
    }

    public static g b() {
        return f151574b;
    }

    public Context a() {
        return this.f151575a;
    }

    public void a(Context context) {
        this.f151575a = context != null ? context.getApplicationContext() : null;
    }
}
