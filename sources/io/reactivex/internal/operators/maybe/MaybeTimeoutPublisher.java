package io.reactivex.internal.operators.maybe;

import hc.InterfaceC4535o;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeTimeoutPublisher<T, U> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Publisher<U> f204951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hc.w<? extends T> f204952c;

    public static final class TimeoutFallbackMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<T> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f204953a;

        public TimeoutFallbackMaybeObserver(hc.t<? super T> tVar) {
            this.f204953a = tVar;
        }

        @Override // hc.t
        public void onComplete() {
            this.f204953a.onComplete();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f204953a.onError(th);
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            this.f204953a.onSuccess(t10);
        }
    }

    public static final class TimeoutMainMaybeObserver<T, U> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -5955289211445418871L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f204954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TimeoutOtherMaybeObserver<T, U> f204955b = new TimeoutOtherMaybeObserver<>(this);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final hc.w<? extends T> f204956c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TimeoutFallbackMaybeObserver<T> f204957d;

        public TimeoutMainMaybeObserver(hc.t<? super T> tVar, hc.w<? extends T> wVar) {
            this.f204954a = tVar;
            this.f204956c = wVar;
            this.f204957d = wVar != null ? new TimeoutFallbackMaybeObserver<>(tVar) : null;
        }

        public void d() {
            if (DisposableHelper.dispose(this)) {
                hc.w<? extends T> wVar = this.f204956c;
                if (wVar == null) {
                    this.f204954a.onError(new TimeoutException());
                } else {
                    wVar.b(this.f204957d);
                }
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
            SubscriptionHelper.cancel(this.f204955b);
            TimeoutFallbackMaybeObserver<T> timeoutFallbackMaybeObserver = this.f204957d;
            if (timeoutFallbackMaybeObserver != null) {
                DisposableHelper.dispose(timeoutFallbackMaybeObserver);
            }
        }

        public void e(Throwable th) {
            if (DisposableHelper.dispose(this)) {
                this.f204954a.onError(th);
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
            SubscriptionHelper.cancel(this.f204955b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f204954a.onComplete();
            }
        }

        @Override // hc.t
        public void onError(Throwable th) {
            SubscriptionHelper.cancel(this.f204955b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f204954a.onError(th);
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
            SubscriptionHelper.cancel(this.f204955b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f204954a.onSuccess(t10);
            }
        }
    }

    public static final class TimeoutOtherMaybeObserver<T, U> extends AtomicReference<Subscription> implements InterfaceC4535o<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TimeoutMainMaybeObserver<T, U> f204958a;

        public TimeoutOtherMaybeObserver(TimeoutMainMaybeObserver<T, U> timeoutMainMaybeObserver) {
            this.f204958a = timeoutMainMaybeObserver;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f204958a.d();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            this.f204958a.e(th);
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            get().cancel();
            this.f204958a.d();
        }

        @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public MaybeTimeoutPublisher(hc.w<T> wVar, Publisher<U> publisher, hc.w<? extends T> wVar2) {
        super(wVar);
        this.f204951b = publisher;
        this.f204952c = wVar2;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        TimeoutMainMaybeObserver timeoutMainMaybeObserver = new TimeoutMainMaybeObserver(tVar, this.f204952c);
        tVar.onSubscribe(timeoutMainMaybeObserver);
        this.f204951b.subscribe(timeoutMainMaybeObserver.f204955b);
        this.f204988a.b(timeoutMainMaybeObserver);
    }
}
