package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C5365o implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5361k f226075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Deflater f226076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f226077c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5365o(@NotNull c0 sink, @NotNull Deflater deflater) {
        this(S.b(sink), deflater);
        kotlin.jvm.internal.G.p(sink, "sink");
        kotlin.jvm.internal.G.p(deflater, "deflater");
    }

    @Override // okio.c0
    public void O2(@NotNull C5360j source, long j10) throws IOException {
        kotlin.jvm.internal.G.p(source, "source");
        l0.e(source.f226051b, 0L, j10);
        while (j10 > 0) {
            a0 a0Var = source.f226050a;
            kotlin.jvm.internal.G.m(a0Var);
            int iMin = (int) Math.min(j10, a0Var.f225916c - a0Var.f225915b);
            this.f226076b.setInput(a0Var.f225914a, a0Var.f225915b, iMin);
            a(false);
            long j11 = iMin;
            source.f226051b -= j11;
            int i10 = a0Var.f225915b + iMin;
            a0Var.f225915b = i10;
            if (i10 == a0Var.f225916c) {
                source.f226050a = a0Var.b();
                b0.d(a0Var);
            }
            j10 -= j11;
        }
    }

    @IgnoreJRERequirement
    public final void a(boolean z10) throws IOException {
        a0 a0VarQ3;
        int iDeflate;
        C5360j buffer = this.f226075a.getBuffer();
        while (true) {
            a0VarQ3 = buffer.q3(1);
            if (z10) {
                Deflater deflater = this.f226076b;
                byte[] bArr = a0VarQ3.f225914a;
                int i10 = a0VarQ3.f225916c;
                iDeflate = deflater.deflate(bArr, i10, 8192 - i10, 2);
            } else {
                Deflater deflater2 = this.f226076b;
                byte[] bArr2 = a0VarQ3.f225914a;
                int i11 = a0VarQ3.f225916c;
                iDeflate = deflater2.deflate(bArr2, i11, 8192 - i11);
            }
            if (iDeflate > 0) {
                a0VarQ3.f225916c += iDeflate;
                buffer.f226051b += (long) iDeflate;
                this.f226075a.x2();
            } else if (this.f226076b.needsInput()) {
                break;
            }
        }
        if (a0VarQ3.f225915b == a0VarQ3.f225916c) {
            buffer.f226050a = a0VarQ3.b();
            b0.d(a0VarQ3);
        }
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f226077c) {
            return;
        }
        try {
            d();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f226076b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f226075a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f226077c = true;
        if (th != null) {
            throw th;
        }
    }

    public final void d() throws IOException {
        this.f226076b.finish();
        a(false);
    }

    @Override // okio.c0, java.io.Flushable
    public void flush() throws IOException {
        a(true);
        this.f226075a.flush();
    }

    @Override // okio.c0
    @NotNull
    public g0 timeout() {
        return this.f226075a.timeout();
    }

    @NotNull
    public String toString() {
        return "DeflaterSink(" + this.f226075a + ')';
    }

    public C5365o(@NotNull InterfaceC5361k sink, @NotNull Deflater deflater) {
        kotlin.jvm.internal.G.p(sink, "sink");
        kotlin.jvm.internal.G.p(deflater, "deflater");
        this.f226075a = sink;
        this.f226076b = deflater;
    }
}
