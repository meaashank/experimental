package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeTimeoutMaybe<T, U> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.I<U> f209562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zc.I<? extends T> f209563c;

    public static final class TimeoutFallbackMaybeObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<T> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209564a;

        public TimeoutFallbackMaybeObserver(zc.F<? super T> downstream) {
            this.f209564a = downstream;
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209564a.onComplete();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209564a.onError(e10);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            DisposableHelper.setOnce(this, d10);
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            this.f209564a.onSuccess(value);
        }
    }

    public static final class TimeoutMainMaybeObserver<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -5955289211445418871L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TimeoutOtherMaybeObserver<T, U> f209566b = new TimeoutOtherMaybeObserver<>(this);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final zc.I<? extends T> f209567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TimeoutFallbackMaybeObserver<T> f209568d;

        public TimeoutMainMaybeObserver(zc.F<? super T> actual, zc.I<? extends T> fallback) {
            this.f209565a = actual;
            this.f209567c = fallback;
            this.f209568d = fallback != null ? new TimeoutFallbackMaybeObserver<>(actual) : null;
        }

        public void d() {
            if (DisposableHelper.dispose(this)) {
                zc.I<? extends T> i10 = this.f209567c;
                if (i10 == null) {
                    this.f209565a.onError(new TimeoutException());
                } else {
                    i10.b(this.f209568d);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.f209566b);
            TimeoutFallbackMaybeObserver<T> timeoutFallbackMaybeObserver = this.f209568d;
            if (timeoutFallbackMaybeObserver != null) {
                DisposableHelper.dispose(timeoutFallbackMaybeObserver);
            }
        }

        public void e(Throwable e10) {
            if (DisposableHelper.dispose(this)) {
                this.f209565a.onError(e10);
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
            DisposableHelper.dispose(this.f209566b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f209565a.onComplete();
            }
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            DisposableHelper.dispose(this.f209566b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f209565a.onError(e10);
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
            DisposableHelper.dispose(this.f209566b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f209565a.onSuccess(value);
            }
        }
    }

    public static final class TimeoutOtherMaybeObserver<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimeoutMainMaybeObserver<T, U> f209569a;

        public TimeoutOtherMaybeObserver(TimeoutMainMaybeObserver<T, U> parent) {
            this.f209569a = parent;
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209569a.d();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209569a.e(e10);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            DisposableHelper.setOnce(this, d10);
        }

        @Override // zc.F, zc.a0
        public void onSuccess(Object value) {
            this.f209569a.d();
        }
    }

    public MaybeTimeoutMaybe(zc.I<T> source, zc.I<U> other, zc.I<? extends T> fallback) {
        super(source);
        this.f209562b = other;
        this.f209563c = fallback;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        TimeoutMainMaybeObserver timeoutMainMaybeObserver = new TimeoutMainMaybeObserver(observer, this.f209563c);
        observer.onSubscribe(timeoutMainMaybeObserver);
        this.f209562b.b(timeoutMainMaybeObserver.f209566b);
        this.f209610a.b(timeoutMainMaybeObserver);
    }
}
