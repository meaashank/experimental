package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class y0<T> extends AbstractC4740a<T, Jc.d<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.W f211233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f211234c;

    public static final class a<T> implements zc.V<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.V<? super Jc.d<T>> f211235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TimeUnit f211236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final zc.W f211237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f211238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f211239e;

        public a(zc.V<? super Jc.d<T>> actual, TimeUnit unit, zc.W scheduler) {
            this.f211235a = actual;
            this.f211237c = scheduler;
            this.f211236b = unit;
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f211239e.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f211239e.isDisposed();
        }

        @Override // zc.V
        public void onComplete() {
            this.f211235a.onComplete();
        }

        @Override // zc.V
        public void onError(Throwable t10) {
            this.f211235a.onError(t10);
        }

        @Override // zc.V
        public void onNext(T t10) {
            long jD = this.f211237c.d(this.f211236b);
            long j10 = this.f211238d;
            this.f211238d = jD;
            this.f211235a.onNext(new Jc.d(t10, jD - j10, this.f211236b));
        }

        @Override // zc.V
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f211239e, d10)) {
                this.f211239e = d10;
                this.f211238d = this.f211237c.d(this.f211236b);
                this.f211235a.onSubscribe(this);
            }
        }
    }

    public y0(zc.T<T> source, TimeUnit unit, zc.W scheduler) {
        super(source);
        this.f211233b = scheduler;
        this.f211234c = unit;
    }

    @Override // zc.N
    public void d6(zc.V<? super Jc.d<T>> t10) {
        this.f210954a.a(new a(t10, this.f211234c, this.f211233b));
    }
}
