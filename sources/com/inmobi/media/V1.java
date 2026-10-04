package com.inmobi.media;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class V1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f152500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f152502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f152503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f152504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f152505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f152506g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f152507h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f152508i;

    public V1(int i10, String url, Map map, boolean z10, boolean z11, int i11, long j10, long j11) {
        kotlin.jvm.internal.G.p(url, "url");
        this.f152500a = i10;
        this.f152501b = url;
        this.f152502c = map;
        this.f152503d = z10;
        this.f152504e = z11;
        this.f152505f = i11;
        this.f152506g = j10;
        this.f152507h = j11;
        this.f152508i = new AtomicBoolean(false);
    }

    public /* synthetic */ V1(String str, Map map, boolean z10, boolean z11, int i10, int i11) {
        this(new Random().nextInt() & Integer.MAX_VALUE, str, (i11 & 4) != 0 ? null : map, z10, z11, i10, System.currentTimeMillis(), System.currentTimeMillis());
    }
}
