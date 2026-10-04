package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeTakeUntilMaybe<T, U> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.w<U> f204935b;

    public static final class TakeUntilMainMaybeObserver<T, U> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -2187421758664251153L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f204936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TakeUntilOtherMaybeObserver<U> f204937b = new TakeUntilOtherMaybeObserver<>(this);

        public static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<U> {
            private static final long serialVersionUID = -1266041316834525931L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TakeUntilMainMaybeObserver<?, U> f204938a;

            public TakeUntilOtherMaybeObserver(TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver) {
                this.f204938a = takeUntilMainMaybeObserver;
            }

            @Override // hc.t
            public void onComplete() {
                this.f204938a.d();
            }

            @Override // hc.t
            public void onError(Throwable th) {
                this.f204938a.e(th);
            }

            @Override // hc.t
            public void onSubscribe(io.reactivex.disposables.b bVar) {
                DisposableHelper.setOnce(this, bVar);
            }

            @Override // hc.t
            public void onSuccess(Object obj) {
                this.f204938a.d();
            }
        }

        public TakeUntilMainMaybeObserver(hc.t<? super T> tVar) {
            this.f204936a = tVar;
        }

        public void d() {
            if (DisposableHelper.dispose(this)) {
                this.f204936a.onComplete();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.f204937b);
        }

        public void e(Throwable th) {
            if (DisposableHelper.dispose(this)) {
                this.f204936a.onError(th);
            } else {
                C5666a.Y(th);
            }
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // hc.t
        public void onComplete() {
            DisposableHelper.dispose(this.f204937b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f204936a.onComplete();
            }
        }

        @Override // hc.t
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.f204937b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f204936a.onError(th);
            } else {
                C5666a.Y(th);
            }
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            DisposableHelper.dispose(this.f204937b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f204936a.onSuccess(t10);
            }
        }
    }

    public MaybeTakeUntilMaybe(hc.w<T> wVar, hc.w<U> wVar2) {
        super(wVar);
        this.f204935b = wVar2;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = new TakeUntilMainMaybeObserver(tVar);
        tVar.onSubscribe(takeUntilMainMaybeObserver);
        this.f204935b.b(takeUntilMainMaybeObserver.f204937b);
        this.f204988a.b(takeUntilMainMaybeObserver);
    }
}
