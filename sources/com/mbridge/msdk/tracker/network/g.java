package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f159954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f159955b;

    public g(String str, String str2) {
        this.f159954a = str;
        this.f159955b = str2;
    }

    public final String a() {
        return this.f159954a;
    }

    public final String b() {
        return this.f159955b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && g.class == obj.getClass()) {
            g gVar = (g) obj;
            if (TextUtils.equals(this.f159954a, gVar.f159954a) && TextUtils.equals(this.f159955b, gVar.f159955b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f159955b.hashCode() + (this.f159954a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Header[name=");
        sb2.append(this.f159954a);
        sb2.append(",value=");
        return android.support.v4.media.e.a(sb2, this.f159955b, "]");
    }
}
