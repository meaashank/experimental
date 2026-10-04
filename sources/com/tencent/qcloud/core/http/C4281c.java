package com.tencent.qcloud.core.http;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import ub.InterfaceC5664b;
import vb.C5724e;

/* JADX INFO: renamed from: com.tencent.qcloud.core.http.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C4281c extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f194241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f194242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f194243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f194244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC5664b f194245e;

    public C4281c(InputStream inputStream, long j10, InterfaceC5664b interfaceC5664b) {
        super(inputStream);
        this.f194241a = 0L;
        this.f194243c = 0L;
        this.f194244d = -1L;
        this.f194242b = j10;
        this.f194245e = interfaceC5664b;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        C5724e.g("Test", "CountingInputStream is closed", new Object[0]);
    }

    public long d() {
        return this.f194242b;
    }

    public long k() {
        return this.f194241a;
    }

    public void l(long j10) {
        this.f194241a += j10;
        m();
    }

    public final void m() {
        InterfaceC5664b interfaceC5664b = this.f194245e;
        if (interfaceC5664b == null) {
            return;
        }
        long j10 = this.f194241a;
        long j11 = j10 - this.f194243c;
        if (j11 <= 51200) {
            long j12 = j11 * 10;
            long j13 = this.f194242b;
            if (j12 <= j13 && j10 != j13) {
                return;
            }
        }
        this.f194243c = j10;
        interfaceC5664b.onProgress(j10, this.f194242b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        super.mark(i10);
        this.f194244d = this.f194241a;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = super.read(bArr, i10, i11);
        if (i12 > 0) {
            l(i12);
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f194244d == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f194241a = this.f194244d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = super.skip(j10);
        l(jSkip);
        return jSkip;
    }
}
