package com.inmobi.media;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f152367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f152369c;

    public P1(int i10, int i11, String str) {
        str = (i11 & 2) != 0 ? null : str;
        this.f152367a = i10;
        this.f152368b = str;
        this.f152369c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P1)) {
            return false;
        }
        P1 p12 = (P1) obj;
        return this.f152367a == p12.f152367a && kotlin.jvm.internal.G.g(this.f152368b, p12.f152368b) && kotlin.jvm.internal.G.g(this.f152369c, p12.f152369c);
    }

    public final int hashCode() {
        int i10 = this.f152367a * 31;
        String str = this.f152368b;
        int iHashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f152369c;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "BusEvent(eventId=" + this.f152367a + ", eventMessage=" + this.f152368b + ", eventData=" + this.f152369c + ')';
    }

    public P1(int i10, String str, Map map) {
        this.f152367a = i10;
        this.f152368b = str;
        this.f152369c = map;
    }
}
