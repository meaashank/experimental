package io.reactivex.internal.operators.observable;

import hc.H;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.reactivex.internal.operators.observable.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4666t<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f206443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f206444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hc.H f206445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f206446e;

    /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.t$a */
    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f206447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f206448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f206449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final H.c f206450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f206451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public io.reactivex.disposables.b f206452f;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.t$a$a, reason: collision with other inner class name */
        public final class RunnableC0767a implements Runnable {
            public RunnableC0767a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f206447a.onComplete();
                } finally {
                    a.this.f206450d.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.t$a$b */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f206454a;

            public b(Throwable th) {
                this.f206454a = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f206447a.onError(this.f206454a);
                } finally {
                    a.this.f206450d.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.t$a$c */
        public final class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final T f206456a;

            public c(T t10) {
                this.f206456a = t10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f206447a.onNext(this.f206456a);
            }
        }

        public a(hc.G<? super T> g10, long j10, TimeUnit timeUnit, H.c cVar, boolean z10) {
            this.f206447a = g10;
            this.f206448b = j10;
            this.f206449c = timeUnit;
            this.f206450d = cVar;
            this.f206451e = z10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206452f.dispose();
            this.f206450d.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206450d.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            this.f206450d.c(new RunnableC0767a(), this.f206448b, this.f206449c);
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f206450d.c(new b(th), this.f206451e ? this.f206448b : 0L, this.f206449c);
        }

        @Override // hc.G
        public void onNext(T t10) {
            this.f206450d.c(new c(t10), this.f206448b, this.f206449c);
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206452f, bVar)) {
                this.f206452f = bVar;
                this.f206447a.onSubscribe(this);
            }
        }
    }

    public C4666t(hc.E<T> e10, long j10, TimeUnit timeUnit, hc.H h10, boolean z10) {
        super(e10);
        this.f206443b = j10;
        this.f206444c = timeUnit;
        this.f206445d = h10;
        this.f206446e = z10;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new a(this.f206446e ? g10 : new io.reactivex.observers.l(g10, false), this.f206443b, this.f206444c, this.f206445d.c(), this.f206446e));
    }
}
