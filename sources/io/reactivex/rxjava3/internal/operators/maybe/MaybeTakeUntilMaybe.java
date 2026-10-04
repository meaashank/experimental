package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeTakeUntilMaybe<T, U> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.I<U> f209554b;

    public static final class TakeUntilMainMaybeObserver<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -2187421758664251153L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TakeUntilOtherMaybeObserver<U> f209556b = new TakeUntilOtherMaybeObserver<>(this);

        public static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<U> {
            private static final long serialVersionUID = -1266041316834525931L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TakeUntilMainMaybeObserver<?, U> f209557a;

            public TakeUntilOtherMaybeObserver(TakeUntilMainMaybeObserver<?, U> parent) {
                this.f209557a = parent;
            }

            @Override // zc.F, zc.InterfaceC5888e
            public void onComplete() {
                this.f209557a.d();
            }

            @Override // zc.F, zc.a0, zc.InterfaceC5888e
            public void onError(Throwable e10) {
                this.f209557a.e(e10);
            }

            @Override // zc.F, zc.a0, zc.InterfaceC5888e
            public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
                DisposableHelper.setOnce(this, d10);
            }

            @Override // zc.F, zc.a0
            public void onSuccess(Object value) {
                this.f209557a.d();
            }
        }

        public TakeUntilMainMaybeObserver(zc.F<? super T> downstream) {
            this.f209555a = downstream;
        }

        public void d() {
            if (DisposableHelper.dispose(this)) {
                this.f209555a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.f209556b);
        }

        public void e(Throwable e10) {
            if (DisposableHelper.dispose(this)) {
                this.f209555a.onError(e10);
            } else {
                Ic.a.Y(e10);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            DisposableHelper.dispose(this.f209556b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f209555a.onComplete();
            }
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            DisposableHelper.dispose(this.f209556b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f209555a.onError(e10);
            } else {
                Ic.a.Y(e10);
            }
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            DisposableHelper.setOnce(this, d10);
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            DisposableHelper.dispose(this.f209556b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f209555a.onSuccess(value);
            }
        }
    }

    public MaybeTakeUntilMaybe(zc.I<T> source, zc.I<U> other) {
        super(source);
        this.f209554b = other;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = new TakeUntilMainMaybeObserver(observer);
        observer.onSubscribe(takeUntilMainMaybeObserver);
        this.f209554b.b(takeUntilMainMaybeObserver.f209556b);
        this.f209610a.b(takeUntilMainMaybeObserver);
    }
}
