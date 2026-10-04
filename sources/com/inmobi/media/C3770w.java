package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;

/* JADX INFO: renamed from: com.inmobi.media.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3770w extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiAdRequestStatus f153485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final short f153486b;

    public C3770w(InMobiAdRequestStatus status, short s10) {
        kotlin.jvm.internal.G.p(status, "status");
        this.f153485a = status;
        this.f153486b = s10;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f153485a.getMessage();
    }
}
