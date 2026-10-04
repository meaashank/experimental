package io.reactivex.internal.schedulers;

import androidx.compose.animation.core.C1598m0;
import hc.H;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.schedulers.i;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import oc.C5348b;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends H implements i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f207033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f207034e = "RxComputationThreadPool";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final RxThreadFactory f207035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f207036g = "rx2.computation-threads";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f207037h = k(Runtime.getRuntime().availableProcessors(), Integer.getInteger(f207036g, 0).intValue());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f207038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f207039j = "rx2.computation-priority";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadFactory f207040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<b> f207041c;

    /* JADX INFO: renamed from: io.reactivex.internal.schedulers.a$a, reason: collision with other inner class name */
    public static final class C0776a extends H.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5348b f207042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.reactivex.disposables.a f207043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C5348b f207044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f207045d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public volatile boolean f207046e;

        public C0776a(c cVar) {
            this.f207045d = cVar;
            C5348b c5348b = new C5348b();
            this.f207042a = c5348b;
            io.reactivex.disposables.a aVar = new io.reactivex.disposables.a();
            this.f207043b = aVar;
            C5348b c5348b2 = new C5348b();
            this.f207044c = c5348b2;
            c5348b2.c(c5348b);
            c5348b2.c(aVar);
        }

        @Override // hc.H.c
        @lc.e
        public io.reactivex.disposables.b b(@lc.e Runnable runnable) {
            return this.f207046e ? EmptyDisposable.INSTANCE : this.f207045d.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f207042a);
        }

        @Override // hc.H.c
        @lc.e
        public io.reactivex.disposables.b c(@lc.e Runnable runnable, long j10, @lc.e TimeUnit timeUnit) {
            return this.f207046e ? EmptyDisposable.INSTANCE : this.f207045d.e(runnable, j10, timeUnit, this.f207043b);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (this.f207046e) {
                return;
            }
            this.f207046e = true;
            this.f207044c.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f207046e;
        }
    }

    public static final class b implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f207047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c[] f207048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f207049c;

        public b(int i10, ThreadFactory threadFactory) {
            this.f207047a = i10;
            this.f207048b = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f207048b[i11] = new c(threadFactory);
            }
        }

        @Override // io.reactivex.internal.schedulers.i
        public void a(int i10, i.a aVar) {
            int i11 = this.f207047a;
            if (i11 == 0) {
                for (int i12 = 0; i12 < i10; i12++) {
                    aVar.a(i12, a.f207038i);
                }
                return;
            }
            int i13 = ((int) this.f207049c) % i11;
            for (int i14 = 0; i14 < i10; i14++) {
                aVar.a(i14, new C0776a(this.f207048b[i13]));
                i13++;
                if (i13 == i11) {
                    i13 = 0;
                }
            }
            this.f207049c = i13;
        }

        public c b() {
            int i10 = this.f207047a;
            if (i10 == 0) {
                return a.f207038i;
            }
            c[] cVarArr = this.f207048b;
            long j10 = this.f207049c;
            this.f207049c = 1 + j10;
            return cVarArr[(int) (j10 % ((long) i10))];
        }

        public void c() {
            for (c cVar : this.f207048b) {
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
        f207038i = cVar;
        cVar.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger(f207039j, 5).intValue())), true);
        f207035f = rxThreadFactory;
        b bVar = new b(0, rxThreadFactory);
        f207033d = bVar;
        bVar.c();
    }

    public a(ThreadFactory threadFactory) {
        this.f207040b = threadFactory;
        this.f207041c = new AtomicReference<>(f207033d);
        i();
    }

    public static int k(int i10, int i11) {
        return (i11 <= 0 || i11 > i10) ? i10 : i11;
    }

    @Override // io.reactivex.internal.schedulers.i
    public void a(int i10, i.a aVar) {
        io.reactivex.internal.functions.a.h(i10, "number > 0 required");
        this.f207041c.get().a(i10, aVar);
    }

    @Override // hc.H
    @lc.e
    public H.c c() {
        return new C0776a(this.f207041c.get().b());
    }

    @Override // hc.H
    @lc.e
    public io.reactivex.disposables.b f(@lc.e Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f207041c.get().b().f(runnable, j10, timeUnit);
    }

    @Override // hc.H
    @lc.e
    public io.reactivex.disposables.b g(@lc.e Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f207041c.get().b().g(runnable, j10, j11, timeUnit);
    }

    @Override // hc.H
    public void h() {
        b bVar;
        b bVar2;
        do {
            bVar = this.f207041c.get();
            bVar2 = f207033d;
            if (bVar == bVar2) {
                return;
            }
        } while (!C1598m0.a(this.f207041c, bVar, bVar2));
        bVar.c();
    }

    @Override // hc.H
    public void i() {
        b bVar = new b(f207037h, this.f207040b);
        if (C1598m0.a(this.f207041c, f207033d, bVar)) {
            return;
        }
        bVar.c();
    }

    public a() {
        this(f207035f);
    }
}
