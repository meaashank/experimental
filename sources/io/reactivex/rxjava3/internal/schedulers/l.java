package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import zc.W;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f211853b = new l();

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f211854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f211855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f211856c;

        public a(Runnable run, c worker, long execTime) {
            this.f211854a = run;
            this.f211855b = worker;
            this.f211856c = execTime;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f211855b.f211864d) {
                return;
            }
            long jA = this.f211855b.a(TimeUnit.MILLISECONDS);
            long j10 = this.f211856c;
            if (j10 > jA) {
                try {
                    Thread.sleep(j10 - jA);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    Ic.a.Y(e10);
                    return;
                }
            }
            if (this.f211855b.f211864d) {
                return;
            }
            this.f211854a.run();
        }
    }

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f211857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f211858b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f211859c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f211860d;

        public b(Runnable run, Long execTime, int count) {
            this.f211857a = run;
            this.f211858b = execTime.longValue();
            this.f211859c = count;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b that) {
            int iCompare = Long.compare(this.f211858b, that.f211858b);
            return iCompare == 0 ? Integer.compare(this.f211859c, that.f211859c) : iCompare;
        }
    }

    public static final class c extends W.c implements io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PriorityBlockingQueue<b> f211861a = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f211862b = new AtomicInteger();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicInteger f211863c = new AtomicInteger();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f211864d;

        public final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f211865a;

            public a(b timedRunnable) {
                this.f211865a = timedRunnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f211865a.f211860d = true;
                c.this.f211861a.remove(this.f211865a);
            }
        }

        @Override // zc.W.c
        @yc.e
        public io.reactivex.rxjava3.disposables.d b(@yc.e Runnable action) {
            return e(action, a(TimeUnit.MILLISECONDS));
        }

        @Override // zc.W.c
        @yc.e
        public io.reactivex.rxjava3.disposables.d c(@yc.e Runnable action, long delayTime, @yc.e TimeUnit unit) {
            long millis = unit.toMillis(delayTime) + a(TimeUnit.MILLISECONDS);
            return e(new a(action, this, millis), millis);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211864d = true;
        }

        public io.reactivex.rxjava3.disposables.d e(Runnable action, long execTime) {
            if (this.f211864d) {
                return EmptyDisposable.INSTANCE;
            }
            b bVar = new b(action, Long.valueOf(execTime), this.f211863c.incrementAndGet());
            this.f211861a.add(bVar);
            if (this.f211862b.getAndIncrement() != 0) {
                return io.reactivex.rxjava3.disposables.c.g(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f211864d) {
                b bVarPoll = this.f211861a.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f211862b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!bVarPoll.f211860d) {
                    bVarPoll.f211857a.run();
                }
            }
            this.f211861a.clear();
            return EmptyDisposable.INSTANCE;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211864d;
        }
    }

    public static l k() {
        return f211853b;
    }

    @Override // zc.W
    @yc.e
    public W.c c() {
        return new c();
    }

    @Override // zc.W
    @yc.e
    public io.reactivex.rxjava3.disposables.d e(@yc.e Runnable run) {
        Ic.a.b0(run).run();
        return EmptyDisposable.INSTANCE;
    }

    @Override // zc.W
    @yc.e
    public io.reactivex.rxjava3.disposables.d f(@yc.e Runnable run, long delay, TimeUnit unit) {
        try {
            unit.sleep(delay);
            Ic.a.b0(run).run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            Ic.a.Y(e10);
        }
        return EmptyDisposable.INSTANCE;
    }
}
