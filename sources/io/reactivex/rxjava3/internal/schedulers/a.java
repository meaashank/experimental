package io.reactivex.rxjava3.internal.schedulers;

import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.schedulers.i;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import zc.W;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends W implements i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f211781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f211782e = "RxComputationThreadPool";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final RxThreadFactory f211783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f211784g = "rx3.computation-threads";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f211785h = k(Runtime.getRuntime().availableProcessors(), Integer.getInteger(f211784g, 0).intValue());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f211786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f211787j = "rx3.computation-priority";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f211788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<b> f211789c;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.schedulers.a$a, reason: collision with other inner class name */
    public static final class C0793a extends W.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Cc.a f211790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.a f211791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Cc.a f211792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f211793d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f211794e;

        public C0793a(c poolWorker) {
            this.f211793d = poolWorker;
            Cc.a aVar = new Cc.a();
            this.f211790a = aVar;
            io.reactivex.rxjava3.disposables.a aVar2 = new io.reactivex.rxjava3.disposables.a();
            this.f211791b = aVar2;
            Cc.a aVar3 = new Cc.a();
            this.f211792c = aVar3;
            aVar3.a(aVar);
            aVar3.a(aVar2);
        }

        @Override // zc.W.c
        @yc.e
        public io.reactivex.rxjava3.disposables.d b(@yc.e Runnable action) {
            return this.f211794e ? EmptyDisposable.INSTANCE : this.f211793d.e(action, 0L, TimeUnit.MILLISECONDS, this.f211790a);
        }

        @Override // zc.W.c
        @yc.e
        public io.reactivex.rxjava3.disposables.d c(@yc.e Runnable action, long delayTime, @yc.e TimeUnit unit) {
            return this.f211794e ? EmptyDisposable.INSTANCE : this.f211793d.e(action, delayTime, unit, this.f211791b);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            if (this.f211794e) {
                return;
            }
            this.f211794e = true;
            this.f211792c.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211794e;
        }
    }

    public static final class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f211795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c[] f211796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f211797c;

        public b(int maxThreads, ThreadFactory threadFactory) {
            this.f211795a = maxThreads;
            this.f211796b = new c[maxThreads];
            for (int i10 = 0; i10 < maxThreads; i10++) {
                this.f211796b[i10] = new c(threadFactory);
            }
        }

        @Override // io.reactivex.rxjava3.internal.schedulers.i
        public void a(int number, i.a callback) {
            int i10 = this.f211795a;
            if (i10 == 0) {
                for (int i11 = 0; i11 < number; i11++) {
                    callback.a(i11, a.f211786i);
                }
                return;
            }
            int i12 = ((int) this.f211797c) % i10;
            for (int i13 = 0; i13 < number; i13++) {
                callback.a(i13, new C0793a(this.f211796b[i12]));
                i12++;
                if (i12 == i10) {
                    i12 = 0;
                }
            }
            this.f211797c = i12;
        }

        public c b() {
            int i10 = this.f211795a;
            if (i10 == 0) {
                return a.f211786i;
            }
            c[] cVarArr = this.f211796b;
            long j10 = this.f211797c;
            this.f211797c = 1 + j10;
            return cVarArr[(int) (j10 % ((long) i10))];
        }

        public void c() {
            for (c cVar : this.f211796b) {
                cVar.dispose();
            }
        }
    }

    public static final class c extends g {
        public c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new RxThreadFactory("RxComputationShutdown"));
        f211786i = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger(f211787j, 5).intValue())), true);
        f211783f = rxThreadFactory;
        b bVar = new b(0, rxThreadFactory);
        f211781d = bVar;
        bVar.c();
    }

    public a(ThreadFactory threadFactory) {
        this.f211788b = threadFactory;
        this.f211789c = new AtomicReference<>(f211781d);
        i();
    }

    public static int k(int cpuCount, int paramThreads) {
        return (paramThreads <= 0 || paramThreads > cpuCount) ? cpuCount : paramThreads;
    }

    @Override // io.reactivex.rxjava3.internal.schedulers.i
    public void a(int number, i.a callback) {
        io.reactivex.rxjava3.internal.functions.a.b(number, "number > 0 required");
        this.f211789c.get().a(number, callback);
    }

    @Override // zc.W
    @yc.e
    public W.c c() {
        return new C0793a(this.f211789c.get().b());
    }

    @Override // zc.W
    @yc.e
    public io.reactivex.rxjava3.disposables.d f(@yc.e Runnable run, long delay, TimeUnit unit) {
        return this.f211789c.get().b().f(run, delay, unit);
    }

    @Override // zc.W
    @yc.e
    public io.reactivex.rxjava3.disposables.d g(@yc.e Runnable run, long initialDelay, long period, TimeUnit unit) {
        return this.f211789c.get().b().g(run, initialDelay, period, unit);
    }

    @Override // zc.W
    public void h() {
        AtomicReference<b> atomicReference = this.f211789c;
        b bVar = f211781d;
        b andSet = atomicReference.getAndSet(bVar);
        if (andSet != bVar) {
            andSet.c();
        }
    }

    @Override // zc.W
    public void i() {
        b bVar = new b(f211785h, this.f211788b);
        if (C1598m0.a(this.f211789c, f211781d, bVar)) {
            return;
        }
        bVar.c();
    }

    public a() {
        this(f211783f);
    }
}
