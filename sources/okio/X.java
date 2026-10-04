package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.DeprecationLevel;
import kotlin.InterfaceC4852c0;
import kotlin.InterfaceC4982o;
import kotlin.L0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f225891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C5360j f225892b = new C5360j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f225893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f225894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f225895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public c0 f225896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final c0 f225897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final e0 f225898h;

    public static final class a implements c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final g0 f225899a = new g0();

        public a() {
        }

        @Override // okio.c0
        public void O2(@NotNull C5360j source, long j10) {
            c0 c0Var;
            kotlin.jvm.internal.G.p(source, "source");
            X x10 = X.this;
            synchronized (x10.f225892b) {
                try {
                    if (x10.f225894d) {
                        throw new IllegalStateException("closed");
                    }
                    if (!x10.f225893c) {
                        while (true) {
                            if (j10 <= 0) {
                                c0Var = null;
                                break;
                            }
                            c0Var = x10.f225896f;
                            if (c0Var != null) {
                                break;
                            }
                            if (x10.f225895e) {
                                throw new IOException("source is closed");
                            }
                            long j11 = x10.f225891a;
                            C5360j c5360j = x10.f225892b;
                            long j12 = j11 - c5360j.f226051b;
                            if (j12 == 0) {
                                this.f225899a.k(c5360j);
                                if (x10.f225893c) {
                                    throw new IOException(com.prism.gaia.server.content.j.f167256W);
                                }
                            } else {
                                long jMin = Math.min(j12, j10);
                                x10.f225892b.O2(source, jMin);
                                j10 -= jMin;
                                x10.f225892b.notifyAll();
                            }
                        }
                    } else {
                        throw new IOException(com.prism.gaia.server.content.j.f167256W);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c0Var != null) {
                X x11 = X.this;
                g0 g0VarTimeout = c0Var.timeout();
                g0 g0VarTimeout2 = x11.f225897g.timeout();
                long j13 = g0VarTimeout.j();
                long jA = g0.f225945d.a(g0VarTimeout2.j(), g0VarTimeout.j());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                g0VarTimeout.i(jA, timeUnit);
                if (!g0VarTimeout.f()) {
                    if (g0VarTimeout2.f()) {
                        g0VarTimeout.e(g0VarTimeout2.d());
                    }
                    try {
                        c0Var.O2(source, j10);
                        g0VarTimeout.i(j13, timeUnit);
                        if (g0VarTimeout2.f()) {
                            g0VarTimeout.a();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        g0VarTimeout.i(j13, TimeUnit.NANOSECONDS);
                        if (g0VarTimeout2.f()) {
                            g0VarTimeout.a();
                        }
                        throw th2;
                    }
                }
                long jD = g0VarTimeout.d();
                if (g0VarTimeout2.f()) {
                    g0VarTimeout.e(Math.min(g0VarTimeout.d(), g0VarTimeout2.d()));
                }
                try {
                    c0Var.O2(source, j10);
                    g0VarTimeout.i(j13, timeUnit);
                    if (g0VarTimeout2.f()) {
                        g0VarTimeout.e(jD);
                    }
                } catch (Throwable th3) {
                    g0VarTimeout.i(j13, TimeUnit.NANOSECONDS);
                    if (g0VarTimeout2.f()) {
                        g0VarTimeout.e(jD);
                    }
                    throw th3;
                }
            }
        }

        @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            X x10 = X.this;
            synchronized (x10.f225892b) {
                try {
                    if (x10.f225894d) {
                        return;
                    }
                    c0 c0Var = x10.f225896f;
                    if (c0Var == null) {
                        if (x10.f225895e && x10.f225892b.f226051b > 0) {
                            throw new IOException("source is closed");
                        }
                        x10.f225894d = true;
                        x10.f225892b.notifyAll();
                        c0Var = null;
                    }
                    if (c0Var != null) {
                        X x11 = X.this;
                        g0 g0VarTimeout = c0Var.timeout();
                        g0 g0VarTimeout2 = x11.f225897g.timeout();
                        long j10 = g0VarTimeout.j();
                        long jA = g0.f225945d.a(g0VarTimeout2.j(), g0VarTimeout.j());
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        g0VarTimeout.i(jA, timeUnit);
                        if (!g0VarTimeout.f()) {
                            if (g0VarTimeout2.f()) {
                                g0VarTimeout.e(g0VarTimeout2.d());
                            }
                            try {
                                c0Var.close();
                                g0VarTimeout.i(j10, timeUnit);
                                if (g0VarTimeout2.f()) {
                                    g0VarTimeout.a();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                g0VarTimeout.i(j10, TimeUnit.NANOSECONDS);
                                if (g0VarTimeout2.f()) {
                                    g0VarTimeout.a();
                                }
                                throw th;
                            }
                        }
                        long jD = g0VarTimeout.d();
                        if (g0VarTimeout2.f()) {
                            g0VarTimeout.e(Math.min(g0VarTimeout.d(), g0VarTimeout2.d()));
                        }
                        try {
                            c0Var.close();
                            g0VarTimeout.i(j10, timeUnit);
                            if (g0VarTimeout2.f()) {
                                g0VarTimeout.e(jD);
                            }
                        } catch (Throwable th2) {
                            g0VarTimeout.i(j10, TimeUnit.NANOSECONDS);
                            if (g0VarTimeout2.f()) {
                                g0VarTimeout.e(jD);
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // okio.c0, java.io.Flushable
        public void flush() {
            c0 c0Var;
            X x10 = X.this;
            synchronized (x10.f225892b) {
                if (x10.f225894d) {
                    throw new IllegalStateException("closed");
                }
                if (x10.f225893c) {
                    throw new IOException(com.prism.gaia.server.content.j.f167256W);
                }
                c0Var = x10.f225896f;
                if (c0Var == null) {
                    if (x10.f225895e && x10.f225892b.f226051b > 0) {
                        throw new IOException("source is closed");
                    }
                    c0Var = null;
                }
            }
            if (c0Var != null) {
                X x11 = X.this;
                g0 g0VarTimeout = c0Var.timeout();
                g0 g0VarTimeout2 = x11.f225897g.timeout();
                long j10 = g0VarTimeout.j();
                long jA = g0.f225945d.a(g0VarTimeout2.j(), g0VarTimeout.j());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                g0VarTimeout.i(jA, timeUnit);
                if (!g0VarTimeout.f()) {
                    if (g0VarTimeout2.f()) {
                        g0VarTimeout.e(g0VarTimeout2.d());
                    }
                    try {
                        c0Var.flush();
                        g0VarTimeout.i(j10, timeUnit);
                        if (g0VarTimeout2.f()) {
                            g0VarTimeout.a();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        g0VarTimeout.i(j10, TimeUnit.NANOSECONDS);
                        if (g0VarTimeout2.f()) {
                            g0VarTimeout.a();
                        }
                        throw th;
                    }
                }
                long jD = g0VarTimeout.d();
                if (g0VarTimeout2.f()) {
                    g0VarTimeout.e(Math.min(g0VarTimeout.d(), g0VarTimeout2.d()));
                }
                try {
                    c0Var.flush();
                    g0VarTimeout.i(j10, timeUnit);
                    if (g0VarTimeout2.f()) {
                        g0VarTimeout.e(jD);
                    }
                } catch (Throwable th2) {
                    g0VarTimeout.i(j10, TimeUnit.NANOSECONDS);
                    if (g0VarTimeout2.f()) {
                        g0VarTimeout.e(jD);
                    }
                    throw th2;
                }
            }
        }

        @Override // okio.c0
        @NotNull
        public g0 timeout() {
            return this.f225899a;
        }
    }

    public static final class b implements e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final g0 f225901a = new g0();

        public b() {
        }

        @Override // okio.e0
        public long L3(@NotNull C5360j sink, long j10) {
            kotlin.jvm.internal.G.p(sink, "sink");
            X x10 = X.this;
            synchronized (x10.f225892b) {
                try {
                    if (x10.f225895e) {
                        throw new IllegalStateException("closed");
                    }
                    if (x10.f225893c) {
                        throw new IOException(com.prism.gaia.server.content.j.f167256W);
                    }
                    do {
                        C5360j c5360j = x10.f225892b;
                        if (c5360j.f226051b != 0) {
                            long jL3 = c5360j.L3(sink, j10);
                            x10.f225892b.notifyAll();
                            return jL3;
                        }
                        if (x10.f225894d) {
                            return -1L;
                        }
                        this.f225901a.k(c5360j);
                    } while (!x10.f225893c);
                    throw new IOException(com.prism.gaia.server.content.j.f167256W);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            X x10 = X.this;
            synchronized (x10.f225892b) {
                x10.f225895e = true;
                x10.f225892b.notifyAll();
            }
        }

        @Override // okio.e0
        @NotNull
        public g0 timeout() {
            return this.f225901a;
        }
    }

    public X(long j10) {
        this.f225891a = j10;
        if (j10 < 1) {
            throw new IllegalArgumentException(androidx.collection.Q.a("maxBufferSize < 1: ", j10).toString());
        }
        this.f225897g = new a();
        this.f225898h = new b();
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "sink", imports = {}))
    @dd.j(name = "-deprecated_sink")
    @NotNull
    public final c0 a() {
        return this.f225897g;
    }

    @InterfaceC4982o(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @InterfaceC4852c0(expression = "source", imports = {}))
    @dd.j(name = "-deprecated_source")
    @NotNull
    public final e0 b() {
        return this.f225898h;
    }

    public final void c() {
        synchronized (this.f225892b) {
            this.f225893c = true;
            this.f225892b.l();
            this.f225892b.notifyAll();
        }
    }

    public final void d(@NotNull c0 sink) throws IOException {
        boolean z10;
        C5360j c5360j;
        kotlin.jvm.internal.G.p(sink, "sink");
        while (true) {
            synchronized (this.f225892b) {
                if (this.f225896f != null) {
                    throw new IllegalStateException("sink already folded");
                }
                if (this.f225893c) {
                    this.f225896f = sink;
                    throw new IOException(com.prism.gaia.server.content.j.f167256W);
                }
                if (this.f225892b.r3()) {
                    this.f225895e = true;
                    this.f225896f = sink;
                    return;
                } else {
                    z10 = this.f225894d;
                    c5360j = new C5360j();
                    C5360j c5360j2 = this.f225892b;
                    c5360j.O2(c5360j2, c5360j2.f226051b);
                    this.f225892b.notifyAll();
                }
            }
            try {
                sink.O2(c5360j, c5360j.f226051b);
                if (z10) {
                    sink.close();
                } else {
                    sink.flush();
                }
            } catch (Throwable th) {
                synchronized (this.f225892b) {
                    this.f225895e = true;
                    this.f225892b.notifyAll();
                    throw th;
                }
            }
        }
    }

    public final void e(c0 c0Var, ed.l<? super c0, L0> lVar) {
        g0 g0VarTimeout = c0Var.timeout();
        g0 g0VarTimeout2 = this.f225897g.timeout();
        long j10 = g0VarTimeout.j();
        long jA = g0.f225945d.a(g0VarTimeout2.j(), g0VarTimeout.j());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        g0VarTimeout.i(jA, timeUnit);
        if (!g0VarTimeout.f()) {
            if (g0VarTimeout2.f()) {
                g0VarTimeout.e(g0VarTimeout2.d());
            }
            try {
                lVar.invoke(c0Var);
                g0VarTimeout.i(j10, timeUnit);
                if (g0VarTimeout2.f()) {
                    g0VarTimeout.a();
                    return;
                }
                return;
            } catch (Throwable th) {
                g0VarTimeout.i(j10, TimeUnit.NANOSECONDS);
                if (g0VarTimeout2.f()) {
                    g0VarTimeout.a();
                }
                throw th;
            }
        }
        long jD = g0VarTimeout.d();
        if (g0VarTimeout2.f()) {
            g0VarTimeout.e(Math.min(g0VarTimeout.d(), g0VarTimeout2.d()));
        }
        try {
            lVar.invoke(c0Var);
            g0VarTimeout.i(j10, timeUnit);
            if (g0VarTimeout2.f()) {
                g0VarTimeout.e(jD);
            }
        } catch (Throwable th2) {
            g0VarTimeout.i(j10, TimeUnit.NANOSECONDS);
            if (g0VarTimeout2.f()) {
                g0VarTimeout.e(jD);
            }
            throw th2;
        }
    }

    @NotNull
    public final C5360j f() {
        return this.f225892b;
    }

    public final boolean g() {
        return this.f225893c;
    }

    @Nullable
    public final c0 h() {
        return this.f225896f;
    }

    public final long i() {
        return this.f225891a;
    }

    public final boolean j() {
        return this.f225894d;
    }

    public final boolean k() {
        return this.f225895e;
    }

    public final void l(boolean z10) {
        this.f225893c = z10;
    }

    public final void m(@Nullable c0 c0Var) {
        this.f225896f = c0Var;
    }

    public final void n(boolean z10) {
        this.f225894d = z10;
    }

    public final void o(boolean z10) {
        this.f225895e = z10;
    }

    @dd.j(name = "sink")
    @NotNull
    public final c0 p() {
        return this.f225897g;
    }

    @dd.j(name = "source")
    @NotNull
    public final e0 q() {
        return this.f225898h;
    }
}
