package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeTimeoutMaybe<T, U> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.w<U> f204943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hc.w<? extends T> f204944c;

    public static final class TimeoutFallbackMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<T> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f204945a;

        public TimeoutFallbackMaybeObserver(hc.t<? super T> tVar) {
            this.f204945a = tVar;
        }

        @Override // hc.t
        public void onComplete() {
            this.f204945a.onComplete();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f204945a.onError(th);
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            this.f204945a.onSuccess(t10);
        }
    }

    public static final class TimeoutMainMaybeObserver<T, U> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -5955289211445418871L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f204946a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TimeoutOtherMaybeObserver<T, U> f204947b = new TimeoutOtherMaybeObserver<>(this);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final hc.w<? extends T> f204948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TimeoutFallbackMaybeObserver<T> f204949d;

        public TimeoutMainMaybeObserver(hc.t<? super T> tVar, hc.w<? extends T> wVar) {
            this.f204946a = tVar;
            this.f204948c = wVar;
            this.f204949d = wVar != null ? new TimeoutFallbackMaybeObserver<>(tVar) : null;
        }

        public void d() {
            if (DisposableHelper.dispose(this)) {
                hc.w<? extends T> wVar = this.f204948c;
                if (wVar == null) {
                    this.f204946a.onError(new TimeoutException());
                } else {
                    wVar.b(this.f204949d);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.f204947b);
            TimeoutFallbackMaybeObserver<T> timeoutFallbackMaybeObserver = this.f204949d;
            if (timeoutFallbackMaybeObserver != null) {
                DisposableHelper.dispose(timeoutFallbackMaybeObserver);
            }
        }

        public void e(Throwable th) {
            if (DisposableHelper.dispose(this)) {
                this.f204946a.onError(th);
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
            DisposableHelper.dispose(this.f204947b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f204946a.onComplete();
            }
        }

        @Override // hc.t
        public void onError(Throwable th) {
            DisposableHelper.dispose(this.f204947b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f204946a.onError(th);
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
            DisposableHelper.dispose(this.f204947b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f204946a.onSuccess(t10);
            }
        }
    }

    public static final class TimeoutOtherMaybeObserver<T, U> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimeoutMainMaybeObserver<T, U> f204950a;

        public TimeoutOtherMaybeObserver(TimeoutMainMaybeObserver<T, U> timeoutMainMaybeObserver) {
            this.f204950a = timeoutMainMaybeObserver;
        }

        @Override // hc.t
        public void onComplete() {
            this.f204950a.d();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f204950a.e(th);
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // hc.t
        public void onSuccess(Object obj) {
            this.f204950a.d();
        }
    }

    public MaybeTimeoutMaybe(hc.w<T> wVar, hc.w<U> wVar2, hc.w<? extends T> wVar3) {
        super(wVar);
        this.f204943b = wVar2;
        this.f204944c = wVar3;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        TimeoutMainMaybeObserver timeoutMainMaybeObserver = new TimeoutMainMaybeObserver(tVar, this.f204944c);
        tVar.onSubscribe(timeoutMainMaybeObserver);
        this.f204943b.b(timeoutMainMaybeObserver.f204947b);
        this.f204988a.b(timeoutMainMaybeObserver);
    }
}
