package hc;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.schedulers.SchedulerWhen;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.TimeUnit;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public abstract class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f202654a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public static final class a implements io.reactivex.disposables.b, Runnable, Kc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @lc.e
        public final Runnable f202655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @lc.e
        public final c f202656b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @lc.f
        public Thread f202657c;

        public a(@lc.e Runnable runnable, @lc.e c cVar) {
            this.f202655a = runnable;
            this.f202656b = cVar;
        }

        @Override // Kc.a
        public Runnable d() {
            return this.f202655a;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f202657c == Thread.currentThread()) {
                c cVar = this.f202656b;
                if (cVar instanceof io.reactivex.internal.schedulers.g) {
                    ((io.reactivex.internal.schedulers.g) cVar).h();
                    return;
                }
            }
            this.f202656b.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f202656b.isDisposed();
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f202657c = Thread.currentThread();
            try {
                this.f202655a.run();
            } finally {
                dispose();
                this.f202657c = null;
            }
        }
    }

    public static final class b implements io.reactivex.disposables.b, Runnable, Kc.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @lc.e
        public final Runnable f202658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @lc.e
        public final c f202659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f202660c;

        public b(@lc.e Runnable runnable, @lc.e c cVar) {
            this.f202658a = runnable;
            this.f202659b = cVar;
        }

        @Override // Kc.a
        public Runnable d() {
            return this.f202658a;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f202660c = true;
            this.f202659b.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f202660c;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f202660c) {
                return;
            }
            try {
                this.f202658a.run();
            } catch (Throwable th) {
                io.reactivex.exceptions.a.b(th);
                this.f202659b.dispose();
                throw ExceptionHelper.e(th);
            }
        }
    }

    public static abstract class c implements io.reactivex.disposables.b {

        public final class a implements Runnable, Kc.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @lc.e
            public final Runnable f202661a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @lc.e
            public final SequentialDisposable f202662b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final long f202663c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public long f202664d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public long f202665e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public long f202666f;

            public a(long j10, @lc.e Runnable runnable, long j11, @lc.e SequentialDisposable sequentialDisposable, long j12) {
                this.f202661a = runnable;
                this.f202662b = sequentialDisposable;
                this.f202663c = j12;
                this.f202665e = j11;
                this.f202666f = j10;
            }

            @Override // Kc.a
            public Runnable d() {
                return this.f202661a;
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
                    java.lang.Runnable r0 = r12.f202661a
                    r0.run()
                    io.reactivex.internal.disposables.SequentialDisposable r0 = r12.f202662b
                    boolean r0 = r0.isDisposed()
                    if (r0 != 0) goto L53
                    hc.H$c r0 = hc.H.c.this
                    java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
                    long r2 = r0.a(r1)
                    long r4 = hc.H.f202654a
                    long r6 = r2 + r4
                    long r8 = r12.f202665e
                    int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                    r6 = 1
                    if (r0 < 0) goto L34
                    long r10 = r12.f202663c
                    long r8 = r8 + r10
                    long r8 = r8 + r4
                    int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                    if (r0 < 0) goto L2a
                    goto L34
                L2a:
                    long r4 = r12.f202666f
                    long r8 = r12.f202664d
                    long r8 = r8 + r6
                    r12.f202664d = r8
                    long r8 = r8 * r10
                    long r8 = r8 + r4
                    goto L42
                L34:
                    long r4 = r12.f202663c
                    long r8 = r2 + r4
                    long r10 = r12.f202664d
                    long r10 = r10 + r6
                    r12.f202664d = r10
                    long r4 = r4 * r10
                    long r4 = r8 - r4
                    r12.f202666f = r4
                L42:
                    r12.f202665e = r2
                    long r8 = r8 - r2
                    io.reactivex.internal.disposables.SequentialDisposable r0 = r12.f202662b
                    hc.H$c r2 = hc.H.c.this
                    io.reactivex.disposables.b r1 = r2.c(r12, r8, r1)
                    r0.getClass()
                    io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
                L53:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: hc.H.c.a.run():void");
            }
        }

        public long a(@lc.e TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @lc.e
        public io.reactivex.disposables.b b(@lc.e Runnable runnable) {
            return c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        @lc.e
        public abstract io.reactivex.disposables.b c(@lc.e Runnable runnable, long j10, @lc.e TimeUnit timeUnit);

        @lc.e
        public io.reactivex.disposables.b d(@lc.e Runnable runnable, long j10, long j11, @lc.e TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Runnable runnableB0 = C5666a.b0(runnable);
            long nanos = timeUnit.toNanos(j11);
            long jA = a(TimeUnit.NANOSECONDS);
            io.reactivex.disposables.b bVarC = c(new a(timeUnit.toNanos(j10) + jA, runnableB0, jA, sequentialDisposable2, nanos), j10, timeUnit);
            if (bVarC == EmptyDisposable.INSTANCE) {
                return bVarC;
            }
            DisposableHelper.replace(sequentialDisposable, bVarC);
            return sequentialDisposable2;
        }
    }

    public static long b() {
        return f202654a;
    }

    @lc.e
    public abstract c c();

    public long d(@lc.e TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @lc.e
    public io.reactivex.disposables.b e(@lc.e Runnable runnable) {
        return f(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    @lc.e
    public io.reactivex.disposables.b f(@lc.e Runnable runnable, long j10, @lc.e TimeUnit timeUnit) {
        c cVarC = c();
        a aVar = new a(C5666a.b0(runnable), cVarC);
        cVarC.c(aVar, j10, timeUnit);
        return aVar;
    }

    @lc.e
    public io.reactivex.disposables.b g(@lc.e Runnable runnable, long j10, long j11, @lc.e TimeUnit timeUnit) {
        c cVarC = c();
        b bVar = new b(C5666a.b0(runnable), cVarC);
        io.reactivex.disposables.b bVarD = cVarC.d(bVar, j10, j11, timeUnit);
        return bVarD == EmptyDisposable.INSTANCE ? bVarD : bVar;
    }

    @lc.e
    public <S extends H & io.reactivex.disposables.b> S j(@lc.e nc.o<AbstractC4530j<AbstractC4530j<AbstractC4521a>>, AbstractC4521a> oVar) {
        return new SchedulerWhen(oVar, this);
    }

    public void h() {
    }

    public void i() {
    }
}
