package com.mbridge.msdk.thrid.okhttp.internal.connection;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IOException f159330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f159331b;

    public e(IOException iOException) {
        super(iOException);
        this.f159330a = iOException;
        this.f159331b = iOException;
    }

    public void a(IOException iOException) {
        com.mbridge.msdk.thrid.okhttp.internal.c.a((Throwable) this.f159330a, (Throwable) iOException);
        this.f159331b = iOException;
    }

    public IOException d() {
        return this.f159330a;
    }

    public IOException g() {
        return this.f159331b;
    }
}
