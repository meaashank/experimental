package zc;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.schedulers.SchedulerWhen;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f241335a = TimeUnit.MINUTES.toNanos(Long.getLong("rx3.scheduler.drift-tolerance", 15).longValue());

    public static final class a implements io.reactivex.rxjava3.disposables.d, Runnable, Jc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @yc.e
        public final Runnable f241336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @yc.e
        public final c f241337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @yc.f
        public Thread f241338c;

        public a(@yc.e Runnable decoratedRun, @yc.e c w10) {
            this.f241336a = decoratedRun;
            this.f241337b = w10;
        }

        @Override // Jc.a
        public Runnable d() {
            return this.f241336a;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            if (this.f241338c == Thread.currentThread()) {
                c cVar = this.f241337b;
                if (cVar instanceof io.reactivex.rxjava3.internal.schedulers.g) {
                    ((io.reactivex.rxjava3.internal.schedulers.g) cVar).h();
                    return;
                }
            }
            this.f241337b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f241337b.isDisposed();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f241338c = Thread.currentThread();
            try {
                this.f241336a.run();
            } finally {
                dispose();
                this.f241338c = null;
            }
        }
    }

    public static final class b implements io.reactivex.rxjava3.disposables.d, Runnable, Jc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @yc.e
        public final Runnable f241339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @yc.e
        public final c f241340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f241341c;

        public b(@yc.e Runnable run, @yc.e c worker) {
            this.f241339a = run;
            this.f241340b = worker;
        }

        @Override // Jc.a
        public Runnable d() {
            return this.f241339a;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f241341c = true;
            this.f241340b.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f241341c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f241341c) {
                return;
            }
            try {
                this.f241339a.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                this.f241340b.dispose();
                throw ExceptionHelper.i(th);
            }
        }
    }

    public static abstract class c implements io.reactivex.rxjava3.disposables.d {

        public final class a implements Runnable, Jc.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @yc.e
            public final Runnable f241342a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @yc.e
            public final SequentialDisposable f241343b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f241344c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public long f241345d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public long f241346e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public long f241347f;

            public a(long firstStartInNanoseconds, @yc.e Runnable decoratedRun, long firstNowNanoseconds, @yc.e SequentialDisposable sd2, long periodInNanoseconds) {
                this.f241342a = decoratedRun;
                this.f241343b = sd2;
                this.f241344c = periodInNanoseconds;
                this.f241346e = firstNowNanoseconds;
                this.f241347f = firstStartInNanoseconds;
            }

            @Override // Jc.a
            public Runnable d() {
                return this.f241342a;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r12 = this;
                    java.lang.Runnable r0 = r12.f241342a
                    r0.run()
                    io.reactivex.rxjava3.internal.disposables.SequentialDisposable r0 = r12.f241343b
                    boolean r0 = r0.isDisposed()
                    if (r0 != 0) goto L53
                    zc.W$c r0 = zc.W.c.this
                    java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
                    long r2 = r0.a(r1)
                    long r4 = zc.W.f241335a
                    long r6 = r2 + r4
                    long r8 = r12.f241346e
                    int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    r6 = 1
                    if (r0 < 0) goto L34
                    long r10 = r12.f241344c
                    long r8 = r8 + r10
                    long r8 = r8 + r4
                    int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                    if (r0 < 0) goto L2a
                    goto L34
                L2a:
                    long r4 = r12.f241347f
                    long r8 = r12.f241345d
                    long r8 = r8 + r6
                    r12.f241345d = r8
                    long r8 = r8 * r10
                    long r8 = r8 + r4
                    goto L42
                L34:
                    long r4 = r12.f241344c
                    long r8 = r2 + r4
                    long r10 = r12.f241345d
                    long r10 = r10 + r6
                    r12.f241345d = r10
                    long r4 = r4 * r10
                    long r4 = r8 - r4
                    r12.f241347f = r4
                L42:
                    r12.f241346e = r2
                    long r8 = r8 - r2
                    io.reactivex.rxjava3.internal.disposables.SequentialDisposable r0 = r12.f241343b
                    zc.W$c r2 = zc.W.c.this
                    io.reactivex.rxjava3.disposables.d r1 = r2.c(r12, r8, r1)
                    r0.getClass()
                    io.reactivex.rxjava3.internal.disposables.DisposableHelper.replace(r0, r1)
                L53:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: zc.W.c.a.run():void");
            }
        }

        public long a(@yc.e TimeUnit unit) {
            return unit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @yc.e
        public io.reactivex.rxjava3.disposables.d b(@yc.e Runnable run) {
            return c(run, 0L, TimeUnit.NANOSECONDS);
        }

        @yc.e
        public abstract io.reactivex.rxjava3.disposables.d c(@yc.e Runnable run, long delay, @yc.e TimeUnit unit);

        @yc.e
        public io.reactivex.rxjava3.disposables.d d(@yc.e Runnable run, final long initialDelay, final long period, @yc.e final TimeUnit unit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Runnable runnableB0 = Ic.a.b0(run);
            long nanos = unit.toNanos(period);
            long jA = a(TimeUnit.NANOSECONDS);
            io.reactivex.rxjava3.disposables.d dVarC = c(new a(unit.toNanos(initialDelay) + jA, runnableB0, jA, sequentialDisposable2, nanos), initialDelay, unit);
            if (dVarC == EmptyDisposable.INSTANCE) {
                return dVarC;
            }
            DisposableHelper.replace(sequentialDisposable, dVarC);
            return sequentialDisposable2;
        }
    }

    public static long b() {
        return f241335a;
    }

    @yc.e
    public abstract c c();

    public long d(@yc.e TimeUnit unit) {
        return unit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @yc.e
    public io.reactivex.rxjava3.disposables.d e(@yc.e Runnable run) {
        return f(run, 0L, TimeUnit.NANOSECONDS);
    }

    @yc.e
    public io.reactivex.rxjava3.disposables.d f(@yc.e Runnable run, long delay, @yc.e TimeUnit unit) {
        c cVarC = c();
        a aVar = new a(Ic.a.b0(run), cVarC);
        cVarC.c(aVar, delay, unit);
        return aVar;
    }

    @yc.e
    public io.reactivex.rxjava3.disposables.d g(@yc.e Runnable run, long initialDelay, long period, @yc.e TimeUnit unit) {
        c cVarC = c();
        b bVar = new b(Ic.a.b0(run), cVarC);
        io.reactivex.rxjava3.disposables.d dVarD = cVarC.d(bVar, initialDelay, period, unit);
        return dVarD == EmptyDisposable.INSTANCE ? dVarD : bVar;
    }

    @yc.e
    public <S extends W & io.reactivex.rxjava3.disposables.d> S j(@yc.e Bc.o<AbstractC5902t<AbstractC5902t<AbstractC5885b>>, AbstractC5885b> combine) {
        Objects.requireNonNull(combine, "combine is null");
        return new SchedulerWhen(combine, this);
    }

    public void h() {
    }

    public void i() {
    }
}
