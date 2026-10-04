package com.mbridge.msdk.thrid.okio;

import androidx.collection.Q;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f159825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Inflater f159826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f159827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f159828d;

    public k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f159825a = eVar;
        this.f159826b = inflater;
    }

    private void h() throws IOException {
        int i10 = this.f159827c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f159826b.getRemaining();
        this.f159827c -= remaining;
        this.f159825a.skip(remaining);
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) throws IOException {
        boolean zD;
        if (j10 < 0) {
            throw new IllegalArgumentException(Q.a("byteCount < 0: ", j10));
        }
        if (this.f159828d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        do {
            zD = d();
            try {
                o oVarB = cVar.b(1);
                int iInflate = this.f159826b.inflate(oVarB.f159842a, oVarB.f159844c, (int) Math.min(j10, 8192 - oVarB.f159844c));
                if (iInflate > 0) {
                    oVarB.f159844c += iInflate;
                    long j11 = iInflate;
                    cVar.f159810b += j11;
                    return j11;
                }
                if (!this.f159826b.finished() && !this.f159826b.needsDictionary()) {
                }
                h();
                if (oVarB.f159843b != oVarB.f159844c) {
                    return -1L;
                }
                cVar.f159809a = oVarB.b();
                p.a(oVarB);
                return -1L;
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        } while (!zD);
        throw new EOFException("source exhausted prematurely");
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f159828d) {
            return;
        }
        this.f159826b.end();
        this.f159828d = true;
        this.f159825a.close();
    }

    public final boolean d() throws IOException {
        if (!this.f159826b.needsInput()) {
            return false;
        }
        h();
        if (this.f159826b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f159825a.f()) {
            return true;
        }
        o oVar = this.f159825a.a().f159809a;
        int i10 = oVar.f159844c;
        int i11 = oVar.f159843b;
        int i12 = i10 - i11;
        this.f159827c = i12;
        this.f159826b.setInput(oVar.f159842a, i11, i12);
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f159825a.b();
    }
}
