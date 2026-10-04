package okio;

import java.io.Closeable;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5367q implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f226078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f226079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f226080c;

    /* JADX INFO: renamed from: okio.q$a */
    public static final class a implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final AbstractC5367q f226081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f226082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f226083c;

        public a(@NotNull AbstractC5367q fileHandle, long j10) {
            kotlin.jvm.internal.G.p(fileHandle, "fileHandle");
            this.f226081a = fileHandle;
            this.f226082b = j10;
        }

        @Override // okio.c0
        public void O2(@NotNull C5360j source, long j10) throws IOException {
            kotlin.jvm.internal.G.p(source, "source");
            if (this.f226083c) {
                throw new IllegalStateException("closed");
            }
            this.f226081a.h1(this.f226082b, source, j10);
            this.f226082b += j10;
        }

        @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f226083c) {
                return;
            }
            this.f226083c = true;
            synchronized (this.f226081a) {
                AbstractC5367q abstractC5367q = this.f226081a;
                int i10 = abstractC5367q.f226080c - 1;
                abstractC5367q.f226080c = i10;
                if (i10 == 0) {
                    if (abstractC5367q.f226079b) {
                        abstractC5367q.o();
                    }
                }
            }
        }

        public final boolean d() {
            return this.f226083c;
        }

        @Override // okio.c0, java.io.Flushable
        public void flush() throws IOException {
            if (this.f226083c) {
                throw new IllegalStateException("closed");
            }
            this.f226081a.p();
        }

        @NotNull
        public final AbstractC5367q k() {
            return this.f226081a;
        }

        public final long l() {
            return this.f226082b;
        }

        public final void m(boolean z10) {
            this.f226083c = z10;
        }

        public final void n(long j10) {
            this.f226082b = j10;
        }

        @Override // okio.c0
        @NotNull
        public g0 timeout() {
            return g0.f225946e;
        }
    }

    /* JADX INFO: renamed from: okio.q$b */
    public static final class b implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final AbstractC5367q f226084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f226085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f226086c;

        public b(@NotNull AbstractC5367q fileHandle, long j10) {
            kotlin.jvm.internal.G.p(fileHandle, "fileHandle");
            this.f226084a = fileHandle;
            this.f226085b = j10;
        }

        @Override // okio.e0
        public long L3(@NotNull C5360j sink, long j10) throws IOException {
            kotlin.jvm.internal.G.p(sink, "sink");
            if (this.f226086c) {
                throw new IllegalStateException("closed");
            }
            long jU = this.f226084a.U(this.f226085b, sink, j10);
            if (jU != -1) {
                this.f226085b += jU;
            }
            return jU;
        }

        @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f226086c) {
                return;
            }
            this.f226086c = true;
            synchronized (this.f226084a) {
                AbstractC5367q abstractC5367q = this.f226084a;
                int i10 = abstractC5367q.f226080c - 1;
                abstractC5367q.f226080c = i10;
                if (i10 == 0) {
                    if (abstractC5367q.f226079b) {
                        abstractC5367q.o();
                    }
                }
            }
        }

        public final boolean d() {
            return this.f226086c;
        }

        @NotNull
        public final AbstractC5367q k() {
            return this.f226084a;
        }

        public final long l() {
            return this.f226085b;
        }

        public final void m(boolean z10) {
            this.f226086c = z10;
        }

        public final void n(long j10) {
            this.f226085b = j10;
        }

        @Override // okio.e0
        @NotNull
        public g0 timeout() {
            return g0.f225946e;
        }
    }

    public AbstractC5367q(boolean z10) {
        this.f226078a = z10;
    }

    public static /* synthetic */ c0 O0(AbstractC5367q abstractC5367q, long j10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        return abstractC5367q.N0(j10);
    }

    public static /* synthetic */ e0 T0(AbstractC5367q abstractC5367q, long j10, int i10, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: source");
        }
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        return abstractC5367q.Q0(j10);
    }

    public final void C0(@NotNull e0 source, long j10) throws IOException {
        kotlin.jvm.internal.G.p(source, "source");
        if (!(source instanceof Z)) {
            if (!(source instanceof b) || ((b) source).f226084a != this) {
                throw new IllegalArgumentException("source was not created by this FileHandle");
            }
            b bVar = (b) source;
            if (bVar.f226086c) {
                throw new IllegalStateException("closed");
            }
            bVar.f226085b = j10;
            return;
        }
        Z z10 = (Z) source;
        e0 e0Var = z10.f225907a;
        if (!(e0Var instanceof b) || ((b) e0Var).f226084a != this) {
            throw new IllegalArgumentException("source was not created by this FileHandle");
        }
        b bVar2 = (b) e0Var;
        if (bVar2.f226086c) {
            throw new IllegalStateException("closed");
        }
        C5360j c5360j = z10.f225908b;
        long j11 = c5360j.f226051b;
        long j12 = j10 - (bVar2.f226085b - j11);
        if (0 <= j12 && j12 < j11) {
            z10.skip(j12);
        } else {
            c5360j.l();
            bVar2.f226085b = j10;
        }
    }

    public final void L0(long j10) throws IOException {
        if (!this.f226078a) {
            throw new IllegalStateException("file handle is read-only");
        }
        synchronized (this) {
            if (this.f226079b) {
                throw new IllegalStateException("closed");
            }
        }
        r(j10);
    }

    @NotNull
    public final c0 N0(long j10) throws IOException {
        if (!this.f226078a) {
            throw new IllegalStateException("file handle is read-only");
        }
        synchronized (this) {
            if (this.f226079b) {
                throw new IllegalStateException("closed");
            }
            this.f226080c++;
        }
        return new a(this, j10);
    }

    public final long P(long j10, @NotNull C5360j sink, long j11) throws Throwable {
        kotlin.jvm.internal.G.p(sink, "sink");
        synchronized (this) {
            try {
                if (!this.f226079b) {
                    return U(j10, sink, j11);
                }
                try {
                    throw new IllegalStateException("closed");
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @NotNull
    public final e0 Q0(long j10) throws IOException {
        synchronized (this) {
            if (this.f226079b) {
                throw new IllegalStateException("closed");
            }
            this.f226080c++;
        }
        return new b(this, j10);
    }

    public final long U(long j10, C5360j c5360j, long j11) throws IOException {
        if (j11 < 0) {
            throw new IllegalArgumentException(androidx.collection.Q.a("byteCount < 0: ", j11).toString());
        }
        long j12 = j11 + j10;
        long j13 = j10;
        while (true) {
            if (j13 >= j12) {
                break;
            }
            a0 a0VarQ3 = c5360j.q3(1);
            int iQ = q(j13, a0VarQ3.f225914a, a0VarQ3.f225916c, (int) Math.min(j12 - j13, 8192 - r7));
            if (iQ == -1) {
                if (a0VarQ3.f225915b == a0VarQ3.f225916c) {
                    c5360j.f226050a = a0VarQ3.b();
                    b0.d(a0VarQ3);
                }
                if (j10 == j13) {
                    return -1L;
                }
            } else {
                a0VarQ3.f225916c += iQ;
                long j14 = iQ;
                j13 += j14;
                c5360j.f226051b += j14;
            }
        }
        return j13 - j10;
    }

    public final void X0(long j10, @NotNull C5360j source, long j11) throws Throwable {
        kotlin.jvm.internal.G.p(source, "source");
        if (!this.f226078a) {
            throw new IllegalStateException("file handle is read-only");
        }
        synchronized (this) {
            try {
                if (!this.f226079b) {
                    h1(j10, source, j11);
                    return;
                }
                try {
                    throw new IllegalStateException("closed");
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this) {
            if (this.f226079b) {
                return;
            }
            this.f226079b = true;
            if (this.f226080c != 0) {
                return;
            }
            o();
        }
    }

    public final void f1(long j10, @NotNull byte[] array, int i10, int i11) throws Throwable {
        kotlin.jvm.internal.G.p(array, "array");
        if (!this.f226078a) {
            throw new IllegalStateException("file handle is read-only");
        }
        synchronized (this) {
            try {
                if (!this.f226079b) {
                    u(j10, array, i10, i11);
                    return;
                }
                try {
                    throw new IllegalStateException("closed");
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void flush() throws IOException {
        if (!this.f226078a) {
            throw new IllegalStateException("file handle is read-only");
        }
        synchronized (this) {
            if (this.f226079b) {
                throw new IllegalStateException("closed");
            }
        }
        p();
    }

    public final void h1(long j10, C5360j c5360j, long j11) throws IOException {
        l0.e(c5360j.f226051b, 0L, j11);
        long j12 = j10 + j11;
        long j13 = j10;
        while (j13 < j12) {
            a0 a0Var = c5360j.f226050a;
            kotlin.jvm.internal.G.m(a0Var);
            int iMin = (int) Math.min(j12 - j13, a0Var.f225916c - a0Var.f225915b);
            u(j13, a0Var.f225914a, a0Var.f225915b, iMin);
            int i10 = a0Var.f225915b + iMin;
            a0Var.f225915b = i10;
            long j14 = iMin;
            j13 += j14;
            c5360j.f226051b -= j14;
            if (i10 == a0Var.f225916c) {
                c5360j.f226050a = a0Var.b();
                b0.d(a0Var);
            }
        }
    }

    @NotNull
    public final c0 k() throws IOException {
        return N0(size());
    }

    public final boolean l() {
        return this.f226078a;
    }

    public final long m(@NotNull c0 sink) throws IOException {
        long j10;
        kotlin.jvm.internal.G.p(sink, "sink");
        if (sink instanceof Y) {
            Y y10 = (Y) sink;
            j10 = y10.f225904b.f226051b;
            sink = y10.f225903a;
        } else {
            j10 = 0;
        }
        if (!(sink instanceof a) || ((a) sink).f226081a != this) {
            throw new IllegalArgumentException("sink was not created by this FileHandle");
        }
        a aVar = (a) sink;
        if (aVar.f226083c) {
            throw new IllegalStateException("closed");
        }
        return aVar.f226082b + j10;
    }

    public final long n(@NotNull e0 source) throws IOException {
        long j10;
        kotlin.jvm.internal.G.p(source, "source");
        if (source instanceof Z) {
            Z z10 = (Z) source;
            j10 = z10.f225908b.f226051b;
            source = z10.f225907a;
        } else {
            j10 = 0;
        }
        if (!(source instanceof b) || ((b) source).f226084a != this) {
            throw new IllegalArgumentException("source was not created by this FileHandle");
        }
        b bVar = (b) source;
        if (bVar.f226086c) {
            throw new IllegalStateException("closed");
        }
        return bVar.f226085b - j10;
    }

    public abstract void o() throws IOException;

    public abstract void p() throws IOException;

    public abstract int q(long j10, @NotNull byte[] bArr, int i10, int i11) throws IOException;

    public abstract void r(long j10) throws IOException;

    public final void r0(@NotNull c0 sink, long j10) throws IOException {
        kotlin.jvm.internal.G.p(sink, "sink");
        if (!(sink instanceof Y)) {
            if (!(sink instanceof a) || ((a) sink).f226081a != this) {
                throw new IllegalArgumentException("sink was not created by this FileHandle");
            }
            a aVar = (a) sink;
            if (aVar.f226083c) {
                throw new IllegalStateException("closed");
            }
            aVar.f226082b = j10;
            return;
        }
        Y y10 = (Y) sink;
        c0 c0Var = y10.f225903a;
        if (!(c0Var instanceof a) || ((a) c0Var).f226081a != this) {
            throw new IllegalArgumentException("sink was not created by this FileHandle");
        }
        a aVar2 = (a) c0Var;
        if (aVar2.f226083c) {
            throw new IllegalStateException("closed");
        }
        y10.q2();
        aVar2.f226082b = j10;
    }

    public abstract long s() throws IOException;

    public final long size() throws IOException {
        synchronized (this) {
            if (this.f226079b) {
                throw new IllegalStateException("closed");
            }
        }
        return s();
    }

    public abstract void u(long j10, @NotNull byte[] bArr, int i10, int i11) throws IOException;

    public final int y(long j10, @NotNull byte[] array, int i10, int i11) throws Throwable {
        kotlin.jvm.internal.G.p(array, "array");
        synchronized (this) {
            try {
                if (!this.f226079b) {
                    return q(j10, array, i10, i11);
                }
                try {
                    throw new IllegalStateException("closed");
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}
