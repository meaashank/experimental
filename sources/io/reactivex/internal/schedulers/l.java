package io.reactivex.internal.schedulers;

import hc.H;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends H {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f207105b = new l();

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f207106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f207107b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f207108c;

        public a(Runnable runnable, c cVar, long j10) {
            this.f207106a = runnable;
            this.f207107b = cVar;
            this.f207108c = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f207107b.f207116d) {
                return;
            }
            long jA = this.f207107b.a(TimeUnit.MILLISECONDS);
            long j10 = this.f207108c;
            if (j10 > jA) {
                try {
                    Thread.sleep(j10 - jA);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    C5666a.Y(e10);
                    return;
                }
            }
            if (this.f207107b.f207116d) {
                return;
            }
            this.f207106a.run();
        }
    }

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f207109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f207110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f207111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f207112d;

        public b(Runnable runnable, Long l10, int i10) {
            this.f207109a = runnable;
            this.f207110b = l10.longValue();
            this.f207111c = i10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iB = io.reactivex.internal.functions.a.b(this.f207110b, bVar.f207110b);
            return iB == 0 ? io.reactivex.internal.functions.a.a(this.f207111c, bVar.f207111c) : iB;
        }
    }

    public static final class c extends H.c implements io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PriorityBlockingQueue<b> f207113a = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f207114b = new AtomicInteger();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicInteger f207115c = new AtomicInteger();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f207116d;

        public final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f207117a;

            public a(b bVar) {
                this.f207117a = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f207117a.f207112d = true;
                c.this.f207113a.remove(this.f207117a);
            }
        }

        @Override // hc.H.c
        @lc.e
        public io.reactivex.disposables.b b(@lc.e Runnable runnable) {
            return e(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // hc.H.c
        @lc.e
        public io.reactivex.disposables.b c(@lc.e Runnable runnable, long j10, @lc.e TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j10) + a(TimeUnit.MILLISECONDS);
            return e(new a(runnable, this, millis), millis);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f207116d = true;
        }

        public io.reactivex.disposables.b e(Runnable runnable, long j10) {
            if (this.f207116d) {
                return EmptyDisposable.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j10), this.f207115c.incrementAndGet());
            this.f207113a.add(bVar);
            if (this.f207114b.getAndIncrement() != 0) {
                return io.reactivex.disposables.c.f(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f207116d) {
                b bVarPoll = this.f207113a.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f207114b.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!bVarPoll.f207112d) {
                    bVarPoll.f207109a.run();
                }
            }
            this.f207113a.clear();
            return EmptyDisposable.INSTANCE;
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f207116d;
        }
    }

    public static l k() {
        return f207105b;
    }

    @Override // hc.H
    @lc.e
    public H.c c() {
        return new c();
    }

    @Override // hc.H
    @lc.e
    public io.reactivex.disposables.b e(@lc.e Runnable runnable) {
        C5666a.b0(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    @Override // hc.H
    @lc.e
    public io.reactivex.disposables.b f(@lc.e Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j10);
            C5666a.b0(runnable).run();
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            C5666a.Y(e10);
        }
        return EmptyDisposable.INSTANCE;
    }
}
