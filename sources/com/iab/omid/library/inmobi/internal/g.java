package com.iab.omid.library.inmobi.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static g f151445b = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f151446a;

    private g() {
    }

    public static g b() {
        return f151445b;
    }

    public Context a() {
        return this.f151446a;
    }

    public void a(Context context) {
        this.f151446a = context != null ? context.getApplicationContext() : null;
    }
}
