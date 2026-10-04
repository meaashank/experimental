package io.reactivex.internal.operators.maybe;

import hc.InterfaceC4535o;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeTakeUntilPublisher<T, U> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Publisher<U> f204939b;

    public static final class TakeUntilMainMaybeObserver<T, U> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<T>, io.reactivex.disposables.b {
        private static final long serialVersionUID = -2187421758664251153L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f204940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TakeUntilOtherMaybeObserver<U> f204941b = new TakeUntilOtherMaybeObserver<>(this);

        public static final class TakeUntilOtherMaybeObserver<U> extends AtomicReference<Subscription> implements InterfaceC4535o<U> {
            private static final long serialVersionUID = -1266041316834525931L;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TakeUntilMainMaybeObserver<?, U> f204942a;

            public TakeUntilOtherMaybeObserver(TakeUntilMainMaybeObserver<?, U> takeUntilMainMaybeObserver) {
                this.f204942a = takeUntilMainMaybeObserver;
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                this.f204942a.d();
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(Throwable th) {
                this.f204942a.e(th);
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(Object obj) {
                SubscriptionHelper.cancel(this);
                this.f204942a.d();
            }

            @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
            public void onSubscribe(Subscription subscription) {
                SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
            }
        }

        public TakeUntilMainMaybeObserver(hc.t<? super T> tVar) {
            this.f204940a = tVar;
        }

        public void d() {
            if (DisposableHelper.dispose(this)) {
                this.f204940a.onComplete();
            }
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            DisposableHelper.dispose(this);
            SubscriptionHelper.cancel(this.f204941b);
        }

        public void e(Throwable th) {
            if (DisposableHelper.dispose(this)) {
                this.f204940a.onError(th);
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
            SubscriptionHelper.cancel(this.f204941b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f204940a.onComplete();
            }
        }

        @Override // hc.t
        public void onError(Throwable th) {
            SubscriptionHelper.cancel(this.f204941b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f204940a.onError(th);
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
            SubscriptionHelper.cancel(this.f204941b);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f204940a.onSuccess(t10);
            }
        }
    }

    public MaybeTakeUntilPublisher(hc.w<T> wVar, Publisher<U> publisher) {
        super(wVar);
        this.f204939b = publisher;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        TakeUntilMainMaybeObserver takeUntilMainMaybeObserver = new TakeUntilMainMaybeObserver(tVar);
        tVar.onSubscribe(takeUntilMainMaybeObserver);
        this.f204939b.subscribe(takeUntilMainMaybeObserver.f204941b);
        this.f204988a.b(takeUntilMainMaybeObserver);
    }
}
