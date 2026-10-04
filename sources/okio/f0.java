package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f225939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f225940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f225941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f225942d;

    public static final class a extends AbstractC5369t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f0 f225943b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0 c0Var, f0 f0Var) {
            super(c0Var);
            this.f225943b = f0Var;
        }

        @Override // okio.AbstractC5369t, okio.c0
        public void O2(@NotNull C5360j source, long j10) throws IOException {
            kotlin.jvm.internal.G.p(source, "source");
            while (j10 > 0) {
                try {
                    long j11 = this.f225943b.j(j10);
                    super.O2(source, j11);
                    j10 -= j11;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        }
    }

    public static final class b extends AbstractC5370u {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f0 f225944b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e0 e0Var, f0 f0Var) {
            super(e0Var);
            this.f225944b = f0Var;
        }

        @Override // okio.AbstractC5370u, okio.e0
        public long L3(@NotNull C5360j sink, long j10) throws InterruptedIOException {
            kotlin.jvm.internal.G.p(sink, "sink");
            try {
                return super.L3(sink, this.f225944b.j(j10));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException("interrupted");
            }
        }
    }

    public f0(long j10) {
        this.f225939a = j10;
        this.f225941c = PlaybackStateCompat.ACTION_PLAY_FROM_URI;
        this.f225942d = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    }

    public static /* synthetic */ void e(f0 f0Var, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j11 = f0Var.f225941c;
        }
        long j13 = j11;
        if ((i10 & 4) != 0) {
            j12 = f0Var.f225942d;
        }
        f0Var.d(j10, j13, j12);
    }

    public final long a(long j10, long j11) {
        if (this.f225940b == 0) {
            return j11;
        }
        long jMax = Math.max(this.f225939a - j10, 0L);
        long jG = this.f225942d - g(jMax);
        if (jG >= j11) {
            this.f225939a = f(j11) + j10 + jMax;
            return j11;
        }
        long j12 = this.f225941c;
        if (jG >= j12) {
            this.f225939a = f(this.f225942d) + j10;
            return jG;
        }
        long jMin = Math.min(j12, j11);
        long jF = f(jMin - this.f225942d) + jMax;
        if (jF != 0) {
            return -jF;
        }
        this.f225939a = f(this.f225942d) + j10;
        return jMin;
    }

    @dd.k
    public final void b(long j10) {
        e(this, j10, 0L, 0L, 6, null);
    }

    @dd.k
    public final void c(long j10, long j11) {
        e(this, j10, j11, 0L, 4, null);
    }

    @dd.k
    public final void d(long j10, long j11, long j12) {
        synchronized (this) {
            if (j10 < 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (j11 <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (j12 < j11) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this.f225940b = j10;
            this.f225941c = j11;
            this.f225942d = j12;
            notifyAll();
        }
    }

    public final long f(long j10) {
        return (j10 * 1000000000) / this.f225940b;
    }

    public final long g(long j10) {
        return (j10 * this.f225940b) / 1000000000;
    }

    @NotNull
    public final c0 h(@NotNull c0 sink) {
        kotlin.jvm.internal.G.p(sink, "sink");
        return new a(sink, this);
    }

    @NotNull
    public final e0 i(@NotNull e0 source) {
        kotlin.jvm.internal.G.p(source, "source");
        return new b(source, this);
    }

    public final long j(long j10) {
        long jA;
        if (j10 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        synchronized (this) {
            while (true) {
                jA = a(System.nanoTime(), j10);
                if (jA < 0) {
                    k(-jA);
                }
            }
        }
        return jA;
    }

    public final void k(long j10) throws InterruptedException {
        long j11 = j10 / 1000000;
        wait(j11, (int) (j10 - (1000000 * j11)));
    }

    public f0() {
        this(System.nanoTime());
    }
}
