package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeTimeoutPublisher<T, U> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Publisher<U> f209570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zc.I<? extends T> f209571c;

    public static final class TimeoutFallbackMaybeObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<T> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209572a;

        public TimeoutFallbackMaybeObserver(zc.F<? super T> downstream) {
            this.f209572a = downstream;
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209572a.onComplete();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209572a.onError(e10);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            DisposableHelper.setOnce(this, d10);
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            this.f209572a.onSuccess(value);
        }
    }

    public static final class TimeoutMainMaybeObserver<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -5955289211445418871L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TimeoutOtherMaybeObserver<T, U> f209574b = new TimeoutOtherMaybeObserver<>(this);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final zc.I<? extends T> f209575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TimeoutFallbackMaybeObserver<T> f209576d;

        public TimeoutMainMaybeObserver(zc.F<? super T> actual, zc.I<? extends T> fallback) {
            this.f209573a = actual;
            this.f209575c = fallback;
            this.f209576d = fallback != null ? new TimeoutFallbackMaybeObserver<>(actual) : null;
        }

        public void d() {
            if (DisposableHelper.dispose(this)) {
                zc.I<? extends T> i10 = this.f209575c;
                if (i10 == null) {
                    this.f209573a.onError(new TimeoutException());
                } else {
                    i10.b(this.f209576d);
                }
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            DisposableHelper.dispose(this);
            SubscriptionHelper.cancel(this.f209574b);
            TimeoutFallbackMaybeObserver<T> timeoutFallbackMaybeObserver = this.f209576d;
            if (timeoutFallbackMaybeObserver != null) {
                DisposableHelper.dispose(timeoutFallbackMaybeObserver);
            }
        }

        public void e(Throwable e10) {
            if (DisposableHelper.dispose(this)) {
                this.f209573a.onError(e10);
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
            SubscriptionHelper.cancel(this.f209574b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f209573a.onComplete();
            }
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            SubscriptionHelper.cancel(this.f209574b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f209573a.onError(e10);
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
            SubscriptionHelper.cancel(this.f209574b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f209573a.onSuccess(value);
            }
        }
    }

    public static final class TimeoutOtherMaybeObserver<T, U> extends AtomicReference<Subscription> implements InterfaceC5907y<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimeoutMainMaybeObserver<T, U> f209577a;

        public TimeoutOtherMaybeObserver(TimeoutMainMaybeObserver<T, U> parent) {
            this.f209577a = parent;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f209577a.d();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable e10) {
            this.f209577a.e(e10);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object value) {
            get().cancel();
            this.f209577a.d();
        }

        @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s10) {
            SubscriptionHelper.setOnce(this, s10, Long.MAX_VALUE);
        }
    }

    public MaybeTimeoutPublisher(zc.I<T> source, Publisher<U> other, zc.I<? extends T> fallback) {
        super(source);
        this.f209570b = other;
        this.f209571c = fallback;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        TimeoutMainMaybeObserver timeoutMainMaybeObserver = new TimeoutMainMaybeObserver(observer, this.f209571c);
        observer.onSubscribe(timeoutMainMaybeObserver);
        this.f209570b.subscribe(timeoutMainMaybeObserver.f209574b);
        this.f209610a.b(timeoutMainMaybeObserver);
    }
}
