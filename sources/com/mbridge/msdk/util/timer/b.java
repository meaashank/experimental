package com.mbridge.msdk.util.timer;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.util.timer.a f160170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f160171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f160172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f160173d = 0;

    public static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.util.timer.a f160174a;

        public a(long j10, long j11) {
            super(j10, j11);
        }

        public void a(com.mbridge.msdk.util.timer.a aVar) {
            this.f160174a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.util.timer.a aVar = this.f160174a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            com.mbridge.msdk.util.timer.a aVar = this.f160174a;
            if (aVar != null) {
                aVar.onTick(j10);
            }
        }
    }

    public void a() {
        a aVar = this.f160172c;
        if (aVar != null) {
            aVar.cancel();
            this.f160172c = null;
        }
    }

    public b b(long j10) {
        this.f160173d = j10;
        return this;
    }

    public void c() {
        if (this.f160172c == null) {
            b();
        }
        this.f160172c.start();
    }

    public void b() {
        a aVar = this.f160172c;
        if (aVar != null) {
            aVar.cancel();
            this.f160172c = null;
        }
        if (this.f160171b <= 0) {
            this.f160171b = this.f160173d + 1000;
        }
        a aVar2 = new a(this.f160173d, this.f160171b);
        this.f160172c = aVar2;
        aVar2.a(this.f160170a);
    }

    public b a(long j10) {
        if (j10 < 0) {
            j10 = 1000;
        }
        this.f160171b = j10;
        return this;
    }

    public b a(com.mbridge.msdk.util.timer.a aVar) {
        this.f160170a = aVar;
        return this;
    }
}
