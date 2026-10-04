package com.apm.insight.b;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f137063a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static g f137064c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f137065b;

    private f(@NonNull Context context) {
        this.f137065b = new b(context);
        g gVar = new g();
        f137064c = gVar;
        gVar.a();
    }

    public static f a(Context context) {
        if (f137063a == null) {
            synchronized (f.class) {
                try {
                    if (f137063a == null) {
                        f137063a = new f(context);
                    }
                } finally {
                }
            }
        }
        return f137063a;
    }

    public static g b() {
        return f137064c;
    }

    public final void c() {
        this.f137065b.a();
    }

    public final void d() {
        this.f137065b.b();
    }

    public final b a() {
        return this.f137065b;
    }
}
