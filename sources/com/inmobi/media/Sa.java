package com.inmobi.media;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class Sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T8 f152441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f152442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f152443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f152444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f152445e;

    public final String toString() {
        return "STATUS_CODE:" + this.f152444d + " | ERROR:" + this.f152441a + " | HEADERS:" + this.f152442b + " | RESPONSE: " + U8.a(this.f152443c);
    }
}
