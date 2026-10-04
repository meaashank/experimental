package com.mbridge.msdk.thrid.okio;

import androidx.collection.Q;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f159821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Inflater f159822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f159823d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f159820a = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CRC32 f159824e = new CRC32();

    public j(s sVar) {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        Inflater inflater = new Inflater(true);
        this.f159822c = inflater;
        e eVarA = l.a(sVar);
        this.f159821b = eVarA;
        this.f159823d = new k(eVarA, inflater);
    }

    private void a(c cVar, long j10, long j11) {
        o oVar = cVar.f159809a;
        while (true) {
            long j12 = oVar.f159844c - oVar.f159843b;
            if (j10 < j12) {
                break;
            }
            j10 -= j12;
            oVar = oVar.f159847f;
        }
        while (j11 > 0) {
            int i10 = (int) (((long) oVar.f159843b) + j10);
            int iMin = (int) Math.min(oVar.f159844c - i10, j11);
            this.f159824e.update(oVar.f159842a, i10, iMin);
            j11 -= (long) iMin;
            oVar = oVar.f159847f;
            j10 = 0;
        }
    }

    private void d() throws IOException {
        this.f159821b.e(10L);
        byte bF = this.f159821b.a().f(3L);
        boolean z10 = ((bF >> 1) & 1) == 1;
        if (z10) {
            a(this.f159821b.a(), 0L, 10L);
        }
        a("ID1ID2", 8075, this.f159821b.readShort());
        this.f159821b.skip(8L);
        if (((bF >> 2) & 1) == 1) {
            this.f159821b.e(2L);
            if (z10) {
                a(this.f159821b.a(), 0L, 2L);
            }
            long jG = this.f159821b.a().g();
            this.f159821b.e(jG);
            if (z10) {
                a(this.f159821b.a(), 0L, jG);
            }
            this.f159821b.skip(jG);
        }
        if (((bF >> 3) & 1) == 1) {
            long jA = this.f159821b.a((byte) 0);
            if (jA == -1) {
                throw new EOFException();
            }
            if (z10) {
                a(this.f159821b.a(), 0L, jA + 1);
            }
            this.f159821b.skip(jA + 1);
        }
        if (((bF >> 4) & 1) == 1) {
            long jA2 = this.f159821b.a((byte) 0);
            if (jA2 == -1) {
                throw new EOFException();
            }
            if (z10) {
                a(this.f159821b.a(), 0L, jA2 + 1);
            }
            this.f159821b.skip(jA2 + 1);
        }
        if (z10) {
            a("FHCRC", this.f159821b.g(), (short) this.f159824e.getValue());
            this.f159824e.reset();
        }
    }

    private void h() throws IOException {
        a("CRC", this.f159821b.e(), (int) this.f159824e.getValue());
        a("ISIZE", this.f159821b.e(), (int) this.f159822c.getBytesWritten());
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) throws IOException {
        j jVar;
        if (j10 < 0) {
            throw new IllegalArgumentException(Q.a("byteCount < 0: ", j10));
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f159820a == 0) {
            d();
            this.f159820a = 1;
        }
        if (this.f159820a == 1) {
            long j11 = cVar.f159810b;
            long jB = this.f159823d.b(cVar, j10);
            if (jB != -1) {
                a(cVar, j11, jB);
                return jB;
            }
            jVar = this;
            jVar.f159820a = 2;
        } else {
            jVar = this;
        }
        if (jVar.f159820a == 2) {
            h();
            jVar.f159820a = 3;
            if (!jVar.f159821b.f()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f159823d.close();
    }

    private void a(String str, int i10, int i11) throws IOException {
        if (i11 != i10) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i11), Integer.valueOf(i10)));
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f159821b.b();
    }
}
