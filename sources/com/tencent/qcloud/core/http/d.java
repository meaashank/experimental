package com.tencent.qcloud.core.http;

import java.io.IOException;
import okio.AbstractC5369t;
import okio.C5360j;
import okio.c0;
import ub.InterfaceC5664b;

/* JADX INFO: loaded from: classes7.dex */
public class d extends AbstractC5369t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f194246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f194247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f194248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f194249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC5664b f194250f;

    public d(c0 c0Var, long j10, InterfaceC5664b interfaceC5664b) {
        super(c0Var);
        this.f194246b = 0L;
        this.f194247c = 0L;
        this.f194249e = 0L;
        this.f194248d = j10;
        this.f194250f = interfaceC5664b;
    }

    @Override // okio.AbstractC5369t, okio.c0
    public void O2(C5360j c5360j, long j10) throws IOException {
        super.O2(c5360j, j10);
        n(j10);
    }

    public long l() {
        return this.f194247c + this.f194246b;
    }

    public final void m() {
        InterfaceC5664b interfaceC5664b = this.f194250f;
        if (interfaceC5664b == null) {
            return;
        }
        long j10 = this.f194247c;
        long j11 = j10 - this.f194249e;
        if (j11 <= 51200) {
            long j12 = j11 * 10;
            long j13 = this.f194248d;
            if (j12 <= j13 && j10 != j13) {
                return;
            }
        }
        this.f194249e = j10;
        long j14 = this.f194246b;
        interfaceC5664b.onProgress(j10 + j14, j14 + this.f194248d);
    }

    public void n(long j10) {
        this.f194247c += j10;
        m();
    }

    public d(c0 c0Var, long j10, long j11, InterfaceC5664b interfaceC5664b) {
        super(c0Var);
        this.f194247c = 0L;
        this.f194249e = 0L;
        this.f194248d = j10;
        this.f194246b = j11;
        this.f194250f = interfaceC5664b;
    }
}
