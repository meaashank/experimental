package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicBoolean;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class ObservableUnsubscribeOn<T> extends AbstractC4648a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.H f206069b;

    public static final class UnsubscribeObserver<T> extends AtomicBoolean implements hc.G<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = 1015244841293359600L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.G<? super T> f206070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hc.H f206071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f206072c;

        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                UnsubscribeObserver.this.f206072c.dispose();
            }
        }

        public UnsubscribeObserver(hc.G<? super T> g10, hc.H h10) {
            this.f206070a = g10;
            this.f206071b = h10;
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            if (compareAndSet(false, true)) {
                this.f206071b.e(new a());
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return get();
        }

        @Override // hc.G
        public void onComplete() {
            if (get()) {
                return;
            }
            this.f206070a.onComplete();
        }

        @Override // hc.G
        public void onError(Throwable th) {
            if (get()) {
                C5666a.Y(th);
            } else {
                this.f206070a.onError(th);
            }
        }

        @Override // hc.G
        public void onNext(T t10) {
            if (get()) {
                return;
            }
            this.f206070a.onNext(t10);
        }

        @Override // hc.G
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f206072c, bVar)) {
                this.f206072c = bVar;
                this.f206070a.onSubscribe(this);
            }
        }
    }

    public ObservableUnsubscribeOn(hc.E<T> e10, hc.H h10) {
        super(e10);
        this.f206069b = h10;
    }

    @Override // hc.z
    public void C5(hc.G<? super T> g10) {
        this.f206214a.a(new UnsubscribeObserver(g10, this.f206069b));
    }
}
