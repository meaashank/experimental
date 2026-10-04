package com.mbridge.msdk.video.dynview.util.time;

import android.os.CountDownTimer;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f160595a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f160596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.util.time.a f160597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f160598d;

    public static class a extends CountDownTimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.video.dynview.util.time.a f160599a;

        public a(long j10, long j11) {
            super(j10, j11);
        }

        public void a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
            this.f160599a = aVar;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f160599a;
            if (aVar != null) {
                aVar.onFinish();
            }
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            com.mbridge.msdk.video.dynview.util.time.a aVar = this.f160599a;
            if (aVar != null) {
                aVar.onTick(j10);
            }
        }
    }

    public b a(long j10) {
        if (j10 < 0) {
            j10 = 1000;
        }
        this.f160596b = j10;
        return this;
    }

    public b b(long j10) {
        this.f160595a = j10;
        return this;
    }

    public void c() {
        if (this.f160598d == null) {
            b();
        }
        this.f160598d.start();
    }

    public b a(com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f160597c = aVar;
        return this;
    }

    public void b() {
        a aVar = this.f160598d;
        if (aVar != null) {
            aVar.cancel();
            this.f160598d = null;
        }
        if (this.f160596b <= 0) {
            this.f160596b = this.f160595a + 1000;
        }
        a aVar2 = new a(this.f160595a, this.f160596b);
        this.f160598d = aVar2;
        aVar2.a(this.f160597c);
    }

    public void a(long j10, com.mbridge.msdk.video.dynview.util.time.a aVar) {
        this.f160595a = j10;
        this.f160597c = aVar;
        b();
        a aVar2 = this.f160598d;
        if (aVar2 != null) {
            aVar2.start();
        }
    }

    public void a() {
        a aVar = this.f160598d;
        if (aVar != null) {
            aVar.cancel();
            this.f160598d = null;
        }
    }
}
