package com.apm.insight.j;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f137257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f137258b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f137259c;

    public a(Handler handler, long j10) {
        this.f137257a = handler;
        this.f137259c = j10;
    }

    public final void a() {
        this.f137257a.post(this);
    }

    public final long b() {
        return this.f137259c;
    }

    public final void a(long j10) {
        if (j10 > 0) {
            this.f137257a.postDelayed(this, j10);
        } else {
            this.f137257a.post(this);
        }
    }
}
