package okio;

import java.io.IOException;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class U implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OutputStream f225880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final g0 f225881b;

    public U(@NotNull OutputStream out, @NotNull g0 timeout) {
        kotlin.jvm.internal.G.p(out, "out");
        kotlin.jvm.internal.G.p(timeout, "timeout");
        this.f225880a = out;
        this.f225881b = timeout;
    }

    @Override // okio.c0
    public void O2(@NotNull C5360j source, long j10) throws IOException {
        kotlin.jvm.internal.G.p(source, "source");
        l0.e(source.f226051b, 0L, j10);
        while (j10 > 0) {
            this.f225881b.h();
            a0 a0Var = source.f226050a;
            kotlin.jvm.internal.G.m(a0Var);
            int iMin = (int) Math.min(j10, a0Var.f225916c - a0Var.f225915b);
            this.f225880a.write(a0Var.f225914a, a0Var.f225915b, iMin);
            int i10 = a0Var.f225915b + iMin;
            a0Var.f225915b = i10;
            long j11 = iMin;
            j10 -= j11;
            source.f226051b -= j11;
            if (i10 == a0Var.f225916c) {
                source.f226050a = a0Var.b();
                b0.d(a0Var);
            }
        }
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f225880a.close();
    }

    @Override // okio.c0, java.io.Flushable
    public void flush() throws IOException {
        this.f225880a.flush();
    }

    @Override // okio.c0
    @NotNull
    public g0 timeout() {
        return this.f225881b;
    }

    @NotNull
    public String toString() {
        return "sink(" + this.f225880a + ')';
    }
}
