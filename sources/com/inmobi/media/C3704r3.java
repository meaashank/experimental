package com.inmobi.media;

import com.android.launcher3.IconCache;
import java.io.File;

/* JADX INFO: renamed from: com.inmobi.media.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3704r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f153305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f153306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C3691q3 f153307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3732t3 f153308e;

    public C3704r3(C3732t3 c3732t3, String str) {
        this.f153308e = c3732t3;
        this.f153304a = str;
        this.f153305b = new long[c3732t3.f153388h];
    }

    public final File a(int i10) {
        return new File(this.f153308e.f153381a, this.f153304a + IconCache.EMPTY_CLASS_NAME + i10);
    }

    public final File b(int i10) {
        return new File(this.f153308e.f153381a, this.f153304a + IconCache.EMPTY_CLASS_NAME + i10 + ".tmp");
    }
}
