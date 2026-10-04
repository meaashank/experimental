package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeTakeUntilPublisher<T, U> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Publisher<U> f209558b;

    public static final class TakeUntilMainMaybeObserver<T, U> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {
        private static final long serialVersionUID = -2187421758664251153L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TakeUntilOtherMaybeObserver<U> f209560b = new TakeUntilOtherMaybeObserver<>(this);

        public static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<Subscription> implements InterfaceC5907y<U> {
            private static final long serialVersionUID = -1266041316834525931L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TakeUntilMainMaybeObserver<?, U> f209561a;

            public TakeUntilOtherMaybeObserver(TakeUntilMainMaybeObserver<?, U> parent) {
                this.f209561a = parent;
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                this.f209561a.d();
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(Throwable e10) {
                this.f209561a.e(e10);
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(Object value) {
                SubscriptionHelper.cancel(this);
                this.f209561a.d();
            }

            @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
            public void onSubscribe(Subscription s10) {
                SubscriptionHelper.setOnce(this, s10, Long.MAX_VALUE);
            }
        }

        public TakeUntilMainMaybeObserver(zc.F<? super T> downstream) {
            this.f209559a = downstream;
        }

        public void d() {
            if (DisposableHelper.dispose(this)) {
                this.f209559a.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            DisposableHelper.dispose(this);
            SubscriptionHelper.cancel(this.f209560b);
        }

        public void e(Throwable e10) {
            if (DisposableHelper.dispose(this)) {
                this.f209559a.onError(e10);
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
            SubscriptionHelper.cancel(this.f209560b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f209559a.onComplete();
            }
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            SubscriptionHelper.cancel(this.f209560b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f209559a.onError(e10);
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
            SubscriptionHelper.cancel(this.f209560b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f209559a.onSuccess(value);
            }
        }
    }

    public MaybeTakeUntilPublisher(zc.I<T> source, Publisher<U> other) {
        super(source);
        this.f209558b = other;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = new TakeUntilMainMaybeObserver(observer);
        observer.onSubscribe(takeUntilMainMaybeObserver);
        this.f209558b.subscribe(takeUntilMainMaybeObserver.f209560b);
        this.f209610a.b(takeUntilMainMaybeObserver);
    }
}
