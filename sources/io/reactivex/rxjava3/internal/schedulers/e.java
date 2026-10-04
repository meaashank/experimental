package io.reactivex.rxjava3.internal.schedulers;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import zc.W;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends W {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f211808d = "RxCachedThreadScheduler";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final RxThreadFactory f211809e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f211810f = "RxCachedWorkerPoolEvictor";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final RxThreadFactory f211811g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long f211813i = 60;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f211816l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f211817m = "rx3.io-priority";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f211818n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f211819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<a> f211820c;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final TimeUnit f211815k = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f211812h = "rx3.io-keep-alive-time";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final long f211814j = Long.getLong(f211812h, 60).longValue();

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f211821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConcurrentLinkedQueue<c> f211822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.a f211823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ScheduledExecutorService f211824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Future<?> f211825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ThreadFactory f211826f;

        public a(long keepAliveTime, TimeUnit unit, ThreadFactory threadFactory) {
            a aVar;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = unit != null ? unit.toNanos(keepAliveTime) : 0L;
            this.f211821a = nanos;
            this.f211822b = new ConcurrentLinkedQueue<>();
            this.f211823c = new io.reactivex.rxjava3.disposables.a();
            this.f211826f = threadFactory;
            if (unit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, e.f211811g);
                aVar = this;
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(aVar, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                aVar = this;
                scheduledExecutorServiceNewScheduledThreadPool = null;
                scheduledFutureScheduleWithFixedDelay = null;
            }
            aVar.f211824d = scheduledExecutorServiceNewScheduledThreadPool;
            aVar.f211825e = scheduledFutureScheduleWithFixedDelay;
        }

        public static void a(ConcurrentLinkedQueue<c> expiringWorkerQueue, io.reactivex.rxjava3.disposables.a allWorkers) {
            if (expiringWorkerQueue.isEmpty()) {
                return;
            }
            long jNanoTime = System.nanoTime();
            for (c cVar : expiringWorkerQueue) {
                if (cVar.f211831c > jNanoTime) {
                    return;
                }
                if (expiringWorkerQueue.remove(cVar)) {
                    allWorkers.c(cVar);
                }
            }
        }

        public static long c() {
            return System.nanoTime();
        }

        public c b() {
            if (this.f211823c.f207344b) {
                return e.f211816l;
            }
            while (!this.f211822b.isEmpty()) {
                c cVarPoll = this.f211822b.poll();
                if (cVarPoll != null) {
                    return cVarPoll;
                }
            }
            c cVar = new c(this.f211826f);
            this.f211823c.a(cVar);
            return cVar;
        }

        public void d(c threadWorker) {
            threadWorker.f211831c = System.nanoTime() + this.f211821a;
            this.f211822b.offer(threadWorker);
        }

        public void e() {
            this.f211823c.dispose();
            Future<?> future = this.f211825e;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f211824d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a(this.f211822b, this.f211823c);
        }
    }

    public static final class b extends W.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f211828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f211829c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f211830d = new AtomicBoolean();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.a f211827a = new io.reactivex.rxjava3.disposables.a();

        public b(a pool) {
            this.f211828b = pool;
            this.f211829c = pool.b();
        }

        @Override // zc.W.c
        @yc.e
        public io.reactivex.rxjava3.disposables.d c(@yc.e Runnable action, long delayTime, @yc.e TimeUnit unit) {
            return this.f211827a.f207344b ? EmptyDisposable.INSTANCE : this.f211829c.e(action, delayTime, unit, this.f211827a);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            if (this.f211830d.compareAndSet(false, true)) {
                this.f211827a.dispose();
                this.f211828b.d(this.f211829c);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211830d.get();
        }
    }

    public static final class c extends g {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f211831c;

        public c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f211831c = 0L;
        }

        public long i() {
            return this.f211831c;
        }

        public void j(long expirationTime) {
            this.f211831c = expirationTime;
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxCachedThreadSchedulerShutdown"));
        f211816l = cVar;
        cVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger(f211817m, 5).intValue()));
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxCachedThreadScheduler", iMax, false);
        f211809e = rxThreadFactory;
        f211811g = new RxThreadFactory("RxCachedWorkerPoolEvictor", iMax, false);
        a aVar = new a(0L, null, rxThreadFactory);
        f211818n = aVar;
        aVar.e();
    }

    public e(ThreadFactory threadFactory) {
        this.f211819b = threadFactory;
        this.f211820c = new AtomicReference<>(f211818n);
        i();
    }

    @Override // zc.W
    @yc.e
    public W.c c() {
        return new b(this.f211820c.get());
    }

    @Override // zc.W
    public void h() {
        AtomicReference<a> atomicReference = this.f211820c;
        a aVar = f211818n;
        a andSet = atomicReference.getAndSet(aVar);
        if (andSet != aVar) {
            andSet.e();
        }
    }

    @Override // zc.W
    public void i() {
        a aVar = new a(f211814j, f211815k, this.f211819b);
        if (C1598m0.a(this.f211820c, f211818n, aVar)) {
            return;
        }
        aVar.e();
    }

    public int k() {
        return this.f211820c.get().f211823c.g();
    }

    public e() {
        this(f211809e);
    }
}
