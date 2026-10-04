package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class u0<T> extends AbstractC4648a<T, Kc.d<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.H f206470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f206471c;

    public static final class a<T> implements hc.G<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super Kc.d<T>> f206472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TimeUnit f206473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final hc.H f206474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f206475d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public io.reactivex.disposables.b f206476e;

        public a(hc.G<? super Kc.d<T>> g10, TimeUnit timeUnit, hc.H h10) {
            this.f206472a = g10;
            this.f206474c = h10;
            this.f206473b = timeUnit;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f206476e.dispose();
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return this.f206476e.isDisposed();
        }

        @Override // hc.G
        public void onComplete() {
            this.f206472a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            this.f206472a.onError(th);
        }

        @Override // hc.G
        public void onNext(T t10) {
            long jD = this.f206474c.d(this.f206473b);
            long j10 = this.f206475d;
            this.f206475d = jD;
            this.f206472a.onNext(new Kc.d(t10, jD - j10, this.f206473b));
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206476e, bVar)) {
                this.f206476e = bVar;
                this.f206475d = this.f206474c.d(this.f206473b);
                this.f206472a.onSubscribe(this);
            }
        }
    }

    public u0(hc.E<T> e10, TimeUnit timeUnit, hc.H h10) {
        super(e10);
        this.f206470b = h10;
        this.f206471c = timeUnit;
    }

    @Override // hc.z
    public void C5(hc.G<? super Kc.d<T>> g10) {
        this.f206214a.a(new a(g10, this.f206471c, this.f206470b));
    }
}
