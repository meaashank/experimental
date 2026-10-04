package com.mbridge.msdk.foundation.same;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile b f156343b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f156344a = null;

    private b() {
    }

    public static b b() {
        if (f156343b == null) {
            synchronized (b.class) {
                try {
                    if (f156343b == null) {
                        f156343b = new b();
                    }
                } finally {
                }
            }
        }
        return f156343b;
    }

    public Boolean a() {
        return this.f156344a;
    }
}
