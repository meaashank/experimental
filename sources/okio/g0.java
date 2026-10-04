package okio;

import ed.InterfaceC4376a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public class g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final b f225945d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dd.g
    @NotNull
    public static final g0 f225946e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f225947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f225948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f225949c;

    public static final class a extends g0 {
        @Override // okio.g0
        @NotNull
        public g0 e(long j10) {
            return this;
        }

        @Override // okio.g0
        public void h() {
        }

        @Override // okio.g0
        @NotNull
        public g0 i(long j10, @NotNull TimeUnit unit) {
            kotlin.jvm.internal.G.p(unit, "unit");
            return this;
        }
    }

    public static final class b {
        public b() {
        }

        public final long a(long j10, long j11) {
            return (j10 != 0 && (j11 == 0 || j10 < j11)) ? j10 : j11;
        }

        public b(C4969v c4969v) {
        }
    }

    @NotNull
    public g0 a() {
        this.f225947a = false;
        return this;
    }

    @NotNull
    public g0 b() {
        this.f225949c = 0L;
        return this;
    }

    @NotNull
    public final g0 c(long j10, @NotNull TimeUnit unit) {
        kotlin.jvm.internal.G.p(unit, "unit");
        if (j10 <= 0) {
            throw new IllegalArgumentException(androidx.collection.Q.a("duration <= 0: ", j10).toString());
        }
        return e(unit.toNanos(j10) + System.nanoTime());
    }

    public long d() {
        if (this.f225947a) {
            return this.f225948b;
        }
        throw new IllegalStateException("No deadline");
    }

    @NotNull
    public g0 e(long j10) {
        this.f225947a = true;
        this.f225948b = j10;
        return this;
    }

    public boolean f() {
        return this.f225947a;
    }

    public final <T> T g(@NotNull g0 other, @NotNull InterfaceC4376a<? extends T> block) {
        kotlin.jvm.internal.G.p(other, "other");
        kotlin.jvm.internal.G.p(block, "block");
        long j10 = j();
        long jA = f225945d.a(other.j(), j());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        i(jA, timeUnit);
        if (!f()) {
            if (other.f()) {
                e(other.d());
            }
            try {
                T tInvoke = block.invoke();
                i(j10, timeUnit);
                if (other.f()) {
                    a();
                }
                return tInvoke;
            } catch (Throwable th) {
                i(j10, TimeUnit.NANOSECONDS);
                if (other.f()) {
                    a();
                }
                throw th;
            }
        }
        long jD = d();
        if (other.f()) {
            e(Math.min(d(), other.d()));
        }
        try {
            T tInvoke2 = block.invoke();
            i(j10, timeUnit);
            if (other.f()) {
                e(jD);
            }
            return tInvoke2;
        } catch (Throwable th2) {
            i(j10, TimeUnit.NANOSECONDS);
            if (other.f()) {
                e(jD);
            }
            throw th2;
        }
    }

    public void h() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f225947a && this.f225948b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    @NotNull
    public g0 i(long j10, @NotNull TimeUnit unit) {
        kotlin.jvm.internal.G.p(unit, "unit");
        if (j10 < 0) {
            throw new IllegalArgumentException(androidx.collection.Q.a("timeout < 0: ", j10).toString());
        }
        this.f225949c = unit.toNanos(j10);
        return this;
    }

    public long j() {
        return this.f225949c;
    }

    public final void k(@NotNull Object monitor) throws InterruptedIOException {
        kotlin.jvm.internal.G.p(monitor, "monitor");
        try {
            boolean zF = f();
            long j10 = j();
            long jNanoTime = 0;
            if (!zF && j10 == 0) {
                monitor.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zF && j10 != 0) {
                j10 = Math.min(j10, d() - jNanoTime2);
            } else if (zF) {
                j10 = d() - jNanoTime2;
            }
            if (j10 > 0) {
                long j11 = j10 / 1000000;
                Long.signum(j11);
                monitor.wait(j11, (int) (j10 - (1000000 * j11)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= j10) {
                throw new InterruptedIOException(Jb.d.f58184l);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
