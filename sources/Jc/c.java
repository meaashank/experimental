package Jc;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import yc.e;
import zc.W;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Queue<b> f58233b = new PriorityBlockingQueue(11);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f58234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile long f58235d;

    public final class a extends W.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile boolean f58236a;

        /* JADX INFO: renamed from: Jc.c$a$a, reason: collision with other inner class name */
        public final class RunnableC0065a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f58238a;

            public RunnableC0065a(b timedAction) {
                this.f58238a = timedAction;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f58233b.remove(this.f58238a);
            }
        }

        public a() {
        }

        @Override // zc.W.c
        public long a(@e TimeUnit unit) {
            return c.this.d(unit);
        }

        @Override // zc.W.c
        @e
        public io.reactivex.rxjava3.disposables.d b(@e Runnable run) {
            if (this.f58236a) {
                return EmptyDisposable.INSTANCE;
            }
            c cVar = c.this;
            long j10 = cVar.f58234c;
            cVar.f58234c = 1 + j10;
            b bVar = new b(this, 0L, run, j10);
            cVar.f58233b.add(bVar);
            return io.reactivex.rxjava3.disposables.c.g(new RunnableC0065a(bVar));
        }

        @Override // zc.W.c
        @e
        public io.reactivex.rxjava3.disposables.d c(@e Runnable run, long delayTime, @e TimeUnit unit) {
            if (this.f58236a) {
                return EmptyDisposable.INSTANCE;
            }
            long nanos = unit.toNanos(delayTime) + c.this.f58235d;
            c cVar = c.this;
            long j10 = cVar.f58234c;
            cVar.f58234c = 1 + j10;
            b bVar = new b(this, nanos, run, j10);
            cVar.f58233b.add(bVar);
            return io.reactivex.rxjava3.disposables.c.g(new RunnableC0065a(bVar));
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f58236a = true;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f58236a;
        }
    }

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f58240a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f58241b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f58242c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f58243d;

        public b(a scheduler, long time, Runnable run, long count) {
            this.f58240a = time;
            this.f58241b = run;
            this.f58242c = scheduler;
            this.f58243d = count;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b o10) {
            long j10 = this.f58240a;
            long j11 = o10.f58240a;
            return j10 == j11 ? Long.compare(this.f58243d, o10.f58243d) : Long.compare(j10, j11);
        }

        public String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.f58240a), this.f58241b.toString());
        }
    }

    public c() {
    }

    @Override // zc.W
    @e
    public W.c c() {
        return new a();
    }

    @Override // zc.W
    public long d(@e TimeUnit unit) {
        return unit.convert(this.f58235d, TimeUnit.NANOSECONDS);
    }

    public void k(long delayTime, TimeUnit unit) {
        l(unit.toNanos(delayTime) + this.f58235d, TimeUnit.NANOSECONDS);
    }

    public void l(long delayTime, TimeUnit unit) {
        n(unit.toNanos(delayTime));
    }

    public void m() {
        n(this.f58235d);
    }

    public final void n(long targetTimeInNanoseconds) {
        while (true) {
            b bVarPeek = this.f58233b.peek();
            if (bVarPeek == null) {
                break;
            }
            long j10 = bVarPeek.f58240a;
            if (j10 > targetTimeInNanoseconds) {
                break;
            }
            if (j10 == 0) {
                j10 = this.f58235d;
            }
            this.f58235d = j10;
            this.f58233b.remove(bVarPeek);
            if (!bVarPeek.f58242c.f58236a) {
                bVarPeek.f58241b.run();
            }
        }
        this.f58235d = targetTimeInNanoseconds;
    }

    public c(long delayTime, TimeUnit unit) {
        this.f58235d = unit.toNanos(delayTime);
    }
}
