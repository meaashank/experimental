package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.C1598m0;
import hc.H;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends H {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f207060d = "RxCachedThreadScheduler";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final RxThreadFactory f207061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f207062f = "RxCachedWorkerPoolEvictor";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final RxThreadFactory f207063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f207064h = 60;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final TimeUnit f207065i = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f207066j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f207067k = "rx2.io-priority";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f207068l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f207069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<a> f207070c;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f207071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConcurrentLinkedQueue<c> f207072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final io.reactivex.disposables.a f207073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ScheduledExecutorService f207074d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Future<?> f207075e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ThreadFactory f207076f;

        public a(long j10, TimeUnit timeUnit, ThreadFactory threadFactory) {
            a aVar;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j10) : 0L;
            this.f207071a = nanos;
            this.f207072b = new ConcurrentLinkedQueue<>();
            this.f207073c = new io.reactivex.disposables.a();
            this.f207076f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, e.f207063g);
                aVar = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(aVar, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                aVar = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            aVar.f207074d = scheduledExecutorServiceNewScheduledThreadPool;
            aVar.f207075e = scheduledFutureScheduleWithFixedDelay;
        }

        public void a() {
            if (this.f207072b.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            for (c cVar : this.f207072b) {
                if (cVar.f207081c > jNanoTime) {
                    return;
                }
                if (this.f207072b.remove(cVar)) {
                    this.f207073c.a(cVar);
                }
            }
        }

        public c b() {
            if (this.f207073c.f202939b) {
                return e.f207066j;
            }
            while (!this.f207072b.isEmpty()) {
                c cVarPoll = this.f207072b.poll();
                if (cVarPoll != null) {
                    return cVarPoll;
                }
            }
            c cVar = new c(this.f207076f);
            this.f207073c.c(cVar);
            return cVar;
        }

        public long c() {
            return System.nanoTime();
        }

        public void d(c cVar) {
            cVar.f207081c = System.nanoTime() + this.f207071a;
            this.f207072b.offer(cVar);
        }

        public void e() {
            this.f207073c.dispose();
            Future<?> future = this.f207075e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f207074d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    public static final class b extends H.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f207078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f207079c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f207080d = new AtomicBoolean();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.reactivex.disposables.a f207077a = new io.reactivex.disposables.a();

        public b(a aVar) {
            this.f207078b = aVar;
            this.f207079c = aVar.b();
        }

        @Override // hc.H.c
        @lc.e
        public io.reactivex.disposables.b c(@lc.e Runnable runnable, long j10, @lc.e TimeUnit timeUnit) {
            return this.f207077a.f202939b ? EmptyDisposable.INSTANCE : this.f207079c.e(runnable, j10, timeUnit, this.f207077a);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f207080d.compareAndSet(false, true)) {
                this.f207077a.dispose();
                this.f207078b.d(this.f207079c);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f207080d.get();
        }
    }

    public static final class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f207081c;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f207081c = 0L;
        }

        public long i() {
            return this.f207081c;
        }

        public void j(long j10) {
            this.f207081c = j10;
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f207066j = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger(f207067k, 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax, false);
        f207061e = rxThreadFactory;
        f207063g = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax, false);
        a aVar = new a(0L, null, rxThreadFactory);
        f207068l = aVar;
        aVar.e();
    }

    public e(ThreadFactory threadFactory) {
        this.f207069b = threadFactory;
        this.f207070c = new AtomicReference<>(f207068l);
        i();
    }

    @Override // hc.H
    @lc.e
    public H.c c() {
        return new b(this.f207070c.get());
    }

    @Override // hc.H
    public void h() {
        a aVar;
        a aVar2;
        do {
            aVar = this.f207070c.get();
            aVar2 = f207068l;
            if (aVar == aVar2) {
                return;
            }
        } while (!C1598m0.a(this.f207070c, aVar, aVar2));
        aVar.e();
    }

    @Override // hc.H
    public void i() {
        a aVar = new a(60L, f207065i, this.f207069b);
        if (C1598m0.a(this.f207070c, f207068l, aVar)) {
            return;
        }
        aVar.e();
    }

    public int k() {
        return this.f207070c.get().f207073c.g();
    }

    public e() {
        this(f207061e);
    }
}
