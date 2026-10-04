package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import zc.W;

/* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4760s<T> extends AbstractC4740a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f211164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f211165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zc.W f211166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f211167e;

    /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.s$a */
    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super T> f211168a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f211169b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TimeUnit f211170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final W.c f211171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f211172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211173f;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.s$a$a, reason: collision with other inner class name */
        public final class RunnableC0785a implements Runnable {
            public RunnableC0785a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f211168a.onComplete();
                } finally {
                    a.this.f211171d.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.s$a$b */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f211175a;

            public b(Throwable throwable) {
                this.f211175a = throwable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    a.this.f211168a.onError(this.f211175a);
                } finally {
                    a.this.f211171d.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.s$a$c */
        public final class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final T f211177a;

            public c(T t10) {
                this.f211177a = t10;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f211168a.onNext(this.f211177a);
            }
        }

        public a(zc.V<? super T> actual, long delay, TimeUnit unit, W.c w10, boolean delayError) {
            this.f211168a = actual;
            this.f211169b = delay;
            this.f211170c = unit;
            this.f211171d = w10;
            this.f211172e = delayError;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211173f.dispose();
            this.f211171d.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211171d.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            this.f211171d.c(new RunnableC0785a(), this.f211169b, this.f211170c);
        }

        @Override // zc.V
        public void onError(final Throwable t10) {
            this.f211171d.c(new b(t10), this.f211172e ? this.f211169b : 0L, this.f211170c);
        }

        @Override // zc.V
        public void onNext(final T t10) {
            this.f211171d.c(new c(t10), this.f211169b, this.f211170c);
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211173f, d10)) {
                this.f211173f = d10;
                this.f211168a.onSubscribe(this);
            }
        }
    }

    public C4760s(zc.T<T> source, long delay, TimeUnit unit, zc.W scheduler, boolean delayError) {
        super(source);
        this.f211164b = delay;
        this.f211165c = unit;
        this.f211166d = scheduler;
        this.f211167e = delayError;
    }

    @Override // zc.N
    public void d6(zc.V<? super T> t10) {
        this.f210954a.a(new a(this.f211167e ? t10 : new io.reactivex.rxjava3.observers.m(t10, false), this.f211164b, this.f211165c, this.f211166d.c(), this.f211167e));
    }
}
