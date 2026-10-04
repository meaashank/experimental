package okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class A implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5362l f225860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Inflater f225861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f225862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f225863d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A(@NotNull e0 source, @NotNull Inflater inflater) {
        this(S.c(source), inflater);
        kotlin.jvm.internal.G.p(source, "source");
        kotlin.jvm.internal.G.p(inflater, "inflater");
    }

    @Override // okio.e0
    public long L3(@NotNull C5360j sink, long j10) throws IOException {
        kotlin.jvm.internal.G.p(sink, "sink");
        do {
            long jA = a(sink, j10);
            if (jA > 0) {
                return jA;
            }
            if (this.f225861b.finished() || this.f225861b.needsDictionary()) {
                return -1L;
            }
        } while (!this.f225860a.r3());
        throw new EOFException("source exhausted prematurely");
    }

    public final long a(@NotNull C5360j sink, long j10) throws IOException {
        kotlin.jvm.internal.G.p(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.collection.Q.a("byteCount < 0: ", j10).toString());
        }
        if (this.f225863d) {
            throw new IllegalStateException("closed");
        }
        if (j10 == 0) {
            return 0L;
        }
        try {
            a0 a0VarQ3 = sink.q3(1);
            int iMin = (int) Math.min(j10, 8192 - a0VarQ3.f225916c);
            d();
            int iInflate = this.f225861b.inflate(a0VarQ3.f225914a, a0VarQ3.f225916c, iMin);
            k();
            if (iInflate > 0) {
                a0VarQ3.f225916c += iInflate;
                long j11 = iInflate;
                sink.f226051b += j11;
                return j11;
            }
            if (a0VarQ3.f225915b == a0VarQ3.f225916c) {
                sink.f226050a = a0VarQ3.b();
                b0.d(a0VarQ3);
            }
            return 0L;
        } catch (DataFormatException e10) {
            throw new IOException(e10);
        }
    }

    @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f225863d) {
            return;
        }
        this.f225861b.end();
        this.f225863d = true;
        this.f225860a.close();
    }

    public final boolean d() throws IOException {
        if (!this.f225861b.needsInput()) {
            return false;
        }
        if (this.f225860a.r3()) {
            return true;
        }
        a0 a0Var = this.f225860a.getBuffer().f226050a;
        kotlin.jvm.internal.G.m(a0Var);
        int i10 = a0Var.f225916c;
        int i11 = a0Var.f225915b;
        int i12 = i10 - i11;
        this.f225862c = i12;
        this.f225861b.setInput(a0Var.f225914a, i11, i12);
        return false;
    }

    public final void k() throws IOException {
        int i10 = this.f225862c;
        if (i10 == 0) {
            return;
        }
        int remaining = i10 - this.f225861b.getRemaining();
        this.f225862c -= remaining;
        this.f225860a.skip(remaining);
    }

    @Override // okio.e0
    @NotNull
    public g0 timeout() {
        return this.f225860a.timeout();
    }

    public A(@NotNull InterfaceC5362l source, @NotNull Inflater inflater) {
        kotlin.jvm.internal.G.p(source, "source");
        kotlin.jvm.internal.G.p(inflater, "inflater");
        this.f225860a = source;
        this.f225861b = inflater;
    }
}
