package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableTakeUntil<T, U> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.E<? extends U> f205996b;

    public static final class TakeUntilMainObserver<T, U> extends AtomicInteger implements hc.G<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 1418547743690811973L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f205997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference<io.reactivex.disposables.b> f205998b = new AtomicReference<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TakeUntilMainObserver<T, U>.OtherObserver f205999c = new OtherObserver();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicThrowable f206000d = new AtomicThrowable();

        public final class OtherObserver extends AtomicReference<io.reactivex.disposables.b> implements hc.G<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            public OtherObserver() {
            }

            @Override // hc.G
            public void onComplete() {
                TakeUntilMainObserver.this.d();
            }

            @Override // hc.G
            public void onError(Throwable th) {
                TakeUntilMainObserver.this.e(th);
            }

            @Override // hc.G
            public void onNext(U u10) {
                DisposableHelper.dispose(this);
                TakeUntilMainObserver.this.d();
            }

            @Override // hc.G
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }
        }

        public TakeUntilMainObserver(hc.G<? super T> g10) {
            this.f205997a = g10;
        }

        public void d() {
            DisposableHelper.dispose(this.f205998b);
            io.reactivex.internal.util.g.a(this.f205997a, this, this.f206000d);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this.f205998b);
            DisposableHelper.dispose(this.f205999c);
        }

        public void e(Throwable th) {
            DisposableHelper.dispose(this.f205998b);
            io.reactivex.internal.util.g.c(this.f205997a, th, this, this.f206000d);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f205998b.get());
        }

        @Override // hc.G
        public void onComplete() {
            DisposableHelper.dispose(this.f205999c);
            io.reactivex.internal.util.g.a(this.f205997a, this, this.f206000d);
        }

        @Override // hc.G
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.f205999c);
            io.reactivex.internal.util.g.c(this.f205997a, th, this, this.f206000d);
        }

        @Override // hc.G
        public void onNext(T t10) {
            io.reactivex.internal.util.g.e(this.f205997a, t10, this, this.f206000d);
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this.f205998b, bVar);
        }
    }

    public ObservableTakeUntil(hc.E<T> e10, hc.E<? extends U> e11) {
        super(e10);
        this.f205996b = e11;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        TakeUntilMainObserver takeUntilMainObserver = new TakeUntilMainObserver(g10);
        g10.onSubscribe(takeUntilMainObserver);
        this.f205996b.a(takeUntilMainObserver.f205999c);
        this.f206214a.a(takeUntilMainObserver);
    }
}
