package com.inmobi.media;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class X8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f152596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f152597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T8 f152598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f152599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map f152600e;

    public final String a() {
        String str = this.f152596a;
        if (str != null) {
            return str;
        }
        String strA = U8.a(this.f152597b);
        this.f152596a = strA;
        return strA;
    }

    public final boolean b() {
        return this.f152598c != null;
    }
}
