package okio;

import ed.InterfaceC4376a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: okio.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C5358h extends g0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final a f225950i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f225951j = 65536;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f225952k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f225953l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public static C5358h f225954m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f225955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public C5358h f225956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f225957h;

    /* JADX INFO: renamed from: okio.h$a */
    public static final class a {
        public a() {
        }

        @Nullable
        public final C5358h c() throws InterruptedException {
            C5358h c5358h = C5358h.f225954m;
            kotlin.jvm.internal.G.m(c5358h);
            C5358h c5358h2 = c5358h.f225956g;
            if (c5358h2 == null) {
                long jNanoTime = System.nanoTime();
                C5358h.class.wait(C5358h.f225952k);
                C5358h c5358h3 = C5358h.f225954m;
                kotlin.jvm.internal.G.m(c5358h3);
                if (c5358h3.f225956g != null || System.nanoTime() - jNanoTime < C5358h.f225953l) {
                    return null;
                }
                return C5358h.f225954m;
            }
            long jNanoTime2 = c5358h2.f225957h - System.nanoTime();
            if (jNanoTime2 > 0) {
                long j10 = jNanoTime2 / 1000000;
                C5358h.class.wait(j10, (int) (jNanoTime2 - (1000000 * j10)));
                return null;
            }
            C5358h c5358h4 = C5358h.f225954m;
            kotlin.jvm.internal.G.m(c5358h4);
            c5358h4.f225956g = c5358h2.f225956g;
            c5358h2.f225956g = null;
            return c5358h2;
        }

        public final boolean d(C5358h c5358h) {
            synchronized (C5358h.class) {
                if (!c5358h.f225955f) {
                    return false;
                }
                c5358h.f225955f = false;
                C5358h c5358h2 = C5358h.f225954m;
                while (c5358h2 != null) {
                    C5358h c5358h3 = c5358h2.f225956g;
                    if (c5358h3 == c5358h) {
                        c5358h2.f225956g = c5358h.f225956g;
                        c5358h.f225956g = null;
                        return false;
                    }
                    c5358h2 = c5358h3;
                }
                return true;
            }
        }

        public final void e(C5358h c5358h, long j10, boolean z10) {
            synchronized (C5358h.class) {
                try {
                    if (c5358h.f225955f) {
                        throw new IllegalStateException("Unbalanced enter/exit");
                    }
                    c5358h.f225955f = true;
                    if (C5358h.f225954m == null) {
                        a aVar = C5358h.f225950i;
                        C5358h.f225954m = new C5358h();
                        new b().start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (j10 != 0 && z10) {
                        c5358h.f225957h = Math.min(j10, c5358h.d() - jNanoTime) + jNanoTime;
                    } else if (j10 != 0) {
                        c5358h.f225957h = j10 + jNanoTime;
                    } else {
                        if (!z10) {
                            throw new AssertionError();
                        }
                        c5358h.f225957h = c5358h.d();
                    }
                    long j11 = c5358h.f225957h - jNanoTime;
                    C5358h c5358h2 = C5358h.f225954m;
                    kotlin.jvm.internal.G.m(c5358h2);
                    while (true) {
                        C5358h c5358h3 = c5358h2.f225956g;
                        if (c5358h3 == null) {
                            break;
                        }
                        kotlin.jvm.internal.G.m(c5358h3);
                        if (j11 < c5358h3.f225957h - jNanoTime) {
                            break;
                        }
                        c5358h2 = c5358h2.f225956g;
                        kotlin.jvm.internal.G.m(c5358h2);
                    }
                    c5358h.f225956g = c5358h2.f225956g;
                    c5358h2.f225956g = c5358h;
                    if (c5358h2 == C5358h.f225954m) {
                        C5358h.class.notify();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX INFO: renamed from: okio.h$b */
    public static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C5358h c5358hC;
            while (true) {
                try {
                    synchronized (C5358h.class) {
                        try {
                            c5358hC = C5358h.f225950i.c();
                            if (c5358hC == C5358h.f225954m) {
                                C5358h.f225954m = null;
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (c5358hC != null) {
                        c5358hC.C();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: renamed from: okio.h$c */
    public static final class c implements c0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c0 f225959b;

        public c(c0 c0Var) {
            this.f225959b = c0Var;
        }

        @Override // okio.c0
        public void O2(@NotNull C5360j source, long j10) throws IOException {
            kotlin.jvm.internal.G.p(source, "source");
            l0.e(source.f226051b, 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                a0 a0Var = source.f226050a;
                kotlin.jvm.internal.G.m(a0Var);
                while (true) {
                    if (j11 >= 65536) {
                        break;
                    }
                    j11 += (long) (a0Var.f225916c - a0Var.f225915b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    } else {
                        a0Var = a0Var.f225919f;
                        kotlin.jvm.internal.G.m(a0Var);
                    }
                }
                C5358h c5358h = C5358h.this;
                c0 c0Var = this.f225959b;
                c5358h.w();
                try {
                    try {
                        c0Var.O2(source, j11);
                        if (C5358h.f225950i.d(c5358h)) {
                            throw c5358h.y(null);
                        }
                        j10 -= j11;
                    } catch (IOException e10) {
                        if (!C5358h.f225950i.d(c5358h)) {
                            throw e10;
                        }
                        throw c5358h.y(e10);
                    }
                } catch (Throwable th) {
                    C5358h.f225950i.d(c5358h);
                    throw th;
                }
            }
        }

        @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a aVar;
            C5358h c5358h = C5358h.this;
            c0 c0Var = this.f225959b;
            c5358h.w();
            try {
                c0Var.close();
                if (aVar.d(c5358h)) {
                    throw c5358h.y(null);
                }
            } catch (IOException e10) {
                if (!aVar.d(c5358h)) {
                    throw e10;
                }
                throw c5358h.y(e10);
            } finally {
                C5358h.f225950i.d(c5358h);
            }
        }

        @NotNull
        public C5358h d() {
            return C5358h.this;
        }

        @Override // okio.c0, java.io.Flushable
        public void flush() throws IOException {
            a aVar;
            C5358h c5358h = C5358h.this;
            c0 c0Var = this.f225959b;
            c5358h.w();
            try {
                c0Var.flush();
                if (aVar.d(c5358h)) {
                    throw c5358h.y(null);
                }
            } catch (IOException e10) {
                if (!aVar.d(c5358h)) {
                    throw e10;
                }
                throw c5358h.y(e10);
            } finally {
                C5358h.f225950i.d(c5358h);
            }
        }

        @Override // okio.c0
        public g0 timeout() {
            return C5358h.this;
        }

        @NotNull
        public String toString() {
            return "AsyncTimeout.sink(" + this.f225959b + ')';
        }
    }

    /* JADX INFO: renamed from: okio.h$d */
    public static final class d implements e0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f225961b;

        public d(e0 e0Var) {
            this.f225961b = e0Var;
        }

        @Override // okio.e0
        public long L3(@NotNull C5360j sink, long j10) throws IOException {
            a aVar;
            kotlin.jvm.internal.G.p(sink, "sink");
            C5358h c5358h = C5358h.this;
            e0 e0Var = this.f225961b;
            c5358h.w();
            try {
                long jL3 = e0Var.L3(sink, j10);
                if (aVar.d(c5358h)) {
                    throw c5358h.y(null);
                }
                return jL3;
            } catch (IOException e10) {
                if (aVar.d(c5358h)) {
                    throw c5358h.y(e10);
                }
                throw e10;
            } finally {
                C5358h.f225950i.d(c5358h);
            }
        }

        @Override // okio.e0, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a aVar;
            C5358h c5358h = C5358h.this;
            e0 e0Var = this.f225961b;
            c5358h.w();
            try {
                e0Var.close();
                if (aVar.d(c5358h)) {
                    throw c5358h.y(null);
                }
            } catch (IOException e10) {
                if (!aVar.d(c5358h)) {
                    throw e10;
                }
                throw c5358h.y(e10);
            } finally {
                C5358h.f225950i.d(c5358h);
            }
        }

        @NotNull
        public C5358h d() {
            return C5358h.this;
        }

        @Override // okio.e0
        public g0 timeout() {
            return C5358h.this;
        }

        @NotNull
        public String toString() {
            return "AsyncTimeout.source(" + this.f225961b + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f225952k = millis;
        f225953l = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static final long r(C5358h c5358h, long j10) {
        return c5358h.f225957h - j10;
    }

    @NotNull
    public final c0 A(@NotNull c0 sink) {
        kotlin.jvm.internal.G.p(sink, "sink");
        return new c(sink);
    }

    @NotNull
    public final e0 B(@NotNull e0 source) {
        kotlin.jvm.internal.G.p(source, "source");
        return new d(source);
    }

    public void C() {
    }

    public final <T> T D(@NotNull InterfaceC4376a<? extends T> block) throws IOException {
        a aVar;
        kotlin.jvm.internal.G.p(block, "block");
        w();
        try {
            T tInvoke = block.invoke();
            if (aVar.d(this)) {
                throw y(null);
            }
            return tInvoke;
        } catch (IOException e10) {
            if (aVar.d(this)) {
                throw y(e10);
            }
            throw e10;
        } finally {
            f225950i.d(this);
        }
    }

    @InterfaceC4850b0
    @NotNull
    public final IOException q(@Nullable IOException iOException) {
        return y(iOException);
    }

    public final void w() {
        long j10 = j();
        boolean zF = f();
        if (j10 != 0 || zF) {
            f225950i.e(this, j10, zF);
        }
    }

    public final boolean x() {
        return f225950i.d(this);
    }

    @NotNull
    public IOException y(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(Jb.d.f58184l);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long z(long j10) {
        return this.f225957h - j10;
    }
}
