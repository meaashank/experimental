package okio;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C5372w implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Y f226102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Deflater f226103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C5365o f226104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f226105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CRC32 f226106e;

    public C5372w(@NotNull c0 sink) {
        kotlin.jvm.internal.G.p(sink, "sink");
        Y y10 = new Y(sink);
        this.f226102a = y10;
        Deflater deflater = new Deflater(-1, true);
        this.f226103b = deflater;
        this.f226104c = new C5365o((InterfaceC5361k) y10, deflater);
        this.f226106e = new CRC32();
        C5360j c5360j = y10.f225904b;
        c5360j.f4(8075);
        c5360j.Y3(8);
        c5360j.Y3(0);
        c5360j.b4(0);
        c5360j.Y3(0);
        c5360j.Y3(0);
    }

    @Override // okio.c0
    public void O2(@NotNull C5360j source, long j10) throws IOException {
        kotlin.jvm.internal.G.p(source, "source");
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.collection.Q.a("byteCount < 0: ", j10).toString());
        }
        if (j10 == 0) {
            return;
        }
        l(source, j10);
        this.f226104c.O2(source, j10);
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f226105d) {
            return;
        }
        try {
            this.f226104c.d();
            m();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f226103b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.f226102a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f226105d = true;
        if (th != null) {
            throw th;
        }
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "deflater", imports = {}))
    @dd.j(name = "-deprecated_deflater")
    @NotNull
    public final Deflater d() {
        return this.f226103b;
    }

    @Override // okio.c0, java.io.Flushable
    public void flush() throws IOException {
        this.f226104c.flush();
    }

    @dd.j(name = "deflater")
    @NotNull
    public final Deflater k() {
        return this.f226103b;
    }

    public final void l(C5360j c5360j, long j10) {
        a0 a0Var = c5360j.f226050a;
        kotlin.jvm.internal.G.m(a0Var);
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, a0Var.f225916c - a0Var.f225915b);
            this.f226106e.update(a0Var.f225914a, a0Var.f225915b, iMin);
            j10 -= (long) iMin;
            a0Var = a0Var.f225919f;
            kotlin.jvm.internal.G.m(a0Var);
        }
    }

    public final void m() throws IOException {
        this.f226102a.y1((int) this.f226106e.getValue());
        this.f226102a.y1((int) this.f226103b.getBytesRead());
    }

    @Override // okio.c0
    @NotNull
    public g0 timeout() {
        return this.f226102a.f225903a.timeout();
    }
}
