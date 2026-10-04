package com.inmobi.media;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes5.dex */
public final class G0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E0 f151957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Yb f151958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f151959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f151960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f151961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f151962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f151963g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f151964h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f151965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final F0 f151966j;

    public G0(E0 adUnit) {
        kotlin.jvm.internal.G.p(adUnit, "adUnit");
        this.f151957a = adUnit;
        this.f151958b = new Yb();
        this.f151966j = new F0(this);
    }

    public final String a() {
        C3604k0 c3604k0Y;
        LinkedList<C3561h> linkedListF;
        C3561h c3561h;
        String strW;
        E0 e02 = this.f151957a;
        return (e02 == null || (c3604k0Y = e02.y()) == null || (linkedListF = c3604k0Y.f()) == null || (c3561h = (C3561h) kotlin.collections.U.L2(linkedListF)) == null || (strW = c3561h.w()) == null) ? "" : strW;
    }
}
