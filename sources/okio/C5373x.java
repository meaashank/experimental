package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C5373x implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f226107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Z f226108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Inflater f226109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final A f226110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CRC32 f226111e;

    public C5373x(@NotNull e0 source) {
        kotlin.jvm.internal.G.p(source, "source");
        Z z10 = new Z(source);
        this.f226108b = z10;
        Inflater inflater = new Inflater(true);
        this.f226109c = inflater;
        this.f226110d = new A((InterfaceC5362l) z10, inflater);
        this.f226111e = new CRC32();
    }

    @Override // okio.e0
    public long L3(@NotNull C5360j sink, long j10) throws IOException {
        C5373x c5373x;
        kotlin.jvm.internal.G.p(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.collection.Q.a("byteCount < 0: ", j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (this.f226107a == 0) {
            d();
            this.f226107a = (byte) 1;
        }
        if (this.f226107a == 1) {
            long j11 = sink.f226051b;
            long jL3 = this.f226110d.L3(sink, j10);
            if (jL3 != -1) {
                l(sink, j11, jL3);
                return jL3;
            }
            c5373x = this;
            c5373x.f226107a = (byte) 2;
        } else {
            c5373x = this;
        }
        if (c5373x.f226107a == 2) {
            k();
            c5373x.f226107a = (byte) 3;
            if (!c5373x.f226108b.r3()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    public final void a(String str, int i10, int i11) throws IOException {
        if (i11 != i10) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3)));
        }
    }

    @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f226110d.close();
    }

    public final void d() throws IOException {
        this.f226108b.i3(10L);
        byte bF1 = this.f226108b.f225908b.f1(3L);
        boolean z10 = ((bF1 >> 1) & 1) == 1;
        if (z10) {
            l(this.f226108b.f225908b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.f226108b.readShort());
        this.f226108b.skip(8L);
        if (((bF1 >> 2) & 1) == 1) {
            this.f226108b.i3(2L);
            if (z10) {
                l(this.f226108b.f225908b, 0L, 2L);
            }
            long jE1 = this.f226108b.f225908b.e1();
            this.f226108b.i3(jE1);
            if (z10) {
                l(this.f226108b.f225908b, 0L, jE1);
            }
            this.f226108b.skip(jE1);
        }
        if (((bF1 >> 3) & 1) == 1) {
            long jM1 = this.f226108b.m1((byte) 0);
            if (jM1 == -1) {
                throw new EOFException();
            }
            if (z10) {
                l(this.f226108b.f225908b, 0L, jM1 + 1);
            }
            this.f226108b.skip(jM1 + 1);
        }
        if (((bF1 >> 4) & 1) == 1) {
            long jM12 = this.f226108b.m1((byte) 0);
            if (jM12 == -1) {
                throw new EOFException();
            }
            if (z10) {
                l(this.f226108b.f225908b, 0L, jM12 + 1);
            }
            this.f226108b.skip(jM12 + 1);
        }
        if (z10) {
            a("FHCRC", this.f226108b.e1(), (short) this.f226111e.getValue());
            this.f226111e.reset();
        }
    }

    public final void k() throws IOException {
        a("CRC", this.f226108b.F3(), (int) this.f226111e.getValue());
        a("ISIZE", this.f226108b.F3(), (int) this.f226109c.getBytesWritten());
    }

    public final void l(C5360j c5360j, long j10, long j11) {
        a0 a0Var = c5360j.f226050a;
        kotlin.jvm.internal.G.m(a0Var);
        while (true) {
            int i10 = a0Var.f225916c;
            int i11 = a0Var.f225915b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            a0Var = a0Var.f225919f;
            kotlin.jvm.internal.G.m(a0Var);
        }
        while (j11 > 0) {
            int i12 = (int) (((long) a0Var.f225915b) + j10);
            int iMin = (int) Math.min(a0Var.f225916c - i12, j11);
            this.f226111e.update(a0Var.f225914a, i12, iMin);
            j11 -= (long) iMin;
            a0Var = a0Var.f225919f;
            kotlin.jvm.internal.G.m(a0Var);
            j10 = 0;
        }
    }

    @Override // okio.e0
    @NotNull
    public g0 timeout() {
        return this.f226108b.f225907a.timeout();
    }
}
