package Kc;

import hc.H;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import lc.e;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Queue<b> f58555b = new PriorityBlockingQueue(11);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f58556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile long f58557d;

    public final class a extends H.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile boolean f58558a;

        /* JADX INFO: renamed from: Kc.c$a$a, reason: collision with other inner class name */
        public final class RunnableC0069a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f58560a;

            public RunnableC0069a(b bVar) {
                this.f58560a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f58555b.remove(this.f58560a);
            }
        }

        public a() {
        }

        @Override // hc.H.c
        public long a(@e TimeUnit timeUnit) {
            return c.this.d(timeUnit);
        }

        @Override // hc.H.c
        @e
        public io.reactivex.disposables.b b(@e Runnable runnable) {
            if (this.f58558a) {
                return EmptyDisposable.INSTANCE;
            }
            c cVar = c.this;
            long j10 = cVar.f58556c;
            cVar.f58556c = 1 + j10;
            b bVar = new b(this, 0L, runnable, j10);
            cVar.f58555b.add(bVar);
            return io.reactivex.disposables.c.f(new RunnableC0069a(bVar));
        }

        @Override // hc.H.c
        @e
        public io.reactivex.disposables.b c(@e Runnable runnable, long j10, @e TimeUnit timeUnit) {
            if (this.f58558a) {
                return EmptyDisposable.INSTANCE;
            }
            long nanos = timeUnit.toNanos(j10) + c.this.f58557d;
            c cVar = c.this;
            long j11 = cVar.f58556c;
            cVar.f58556c = 1 + j11;
            b bVar = new b(this, nanos, runnable, j11);
            cVar.f58555b.add(bVar);
            return io.reactivex.disposables.c.f(new RunnableC0069a(bVar));
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f58558a = true;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f58558a;
        }
    }

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f58562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f58563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f58564c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f58565d;

        public b(a aVar, long j10, Runnable runnable, long j11) {
            this.f58562a = j10;
            this.f58563b = runnable;
            this.f58564c = aVar;
            this.f58565d = j11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            long j10 = this.f58562a;
            long j11 = bVar.f58562a;
            return j10 == j11 ? io.reactivex.internal.functions.a.b(this.f58565d, bVar.f58565d) : io.reactivex.internal.functions.a.b(j10, j11);
        }

        public String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.f58562a), this.f58563b.toString());
        }
    }

    public c() {
    }

    private void n(long j10) {
        while (true) {
            b bVarPeek = this.f58555b.peek();
            if (bVarPeek == null) {
                break;
            }
            long j11 = bVarPeek.f58562a;
            if (j11 > j10) {
                break;
            }
            if (j11 == 0) {
                j11 = this.f58557d;
            }
            this.f58557d = j11;
            this.f58555b.remove(bVarPeek);
            if (!bVarPeek.f58564c.f58558a) {
                bVarPeek.f58563b.run();
            }
        }
        this.f58557d = j10;
    }

    @Override // hc.H
    @e
    public H.c c() {
        return new a();
    }

    @Override // hc.H
    public long d(@e TimeUnit timeUnit) {
        return timeUnit.convert(this.f58557d, TimeUnit.NANOSECONDS);
    }

    public void k(long j10, TimeUnit timeUnit) {
        l(timeUnit.toNanos(j10) + this.f58557d, TimeUnit.NANOSECONDS);
    }

    public void l(long j10, TimeUnit timeUnit) {
        n(timeUnit.toNanos(j10));
    }

    public void m() {
        n(this.f58557d);
    }

    public c(long j10, TimeUnit timeUnit) {
        this.f58557d = timeUnit.toNanos(j10);
    }
}
