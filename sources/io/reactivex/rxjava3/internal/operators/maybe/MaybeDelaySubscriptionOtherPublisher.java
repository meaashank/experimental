package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeDelaySubscriptionOtherPublisher<T, U> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Publisher<U> f209450b;

    public static final class DelayMaybeObserver<T> extends AtomicReference<io.reactivex.rxjava3.disposables.d> implements zc.F<T> {
        private static final long serialVersionUID = 706635022205076709L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209451a;

        public DelayMaybeObserver(zc.F<? super T> downstream) {
            this.f209451a = downstream;
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209451a.onComplete();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209451a.onError(e10);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            DisposableHelper.setOnce(this, d10);
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            this.f209451a.onSuccess(value);
        }
    }

    public static final class a<T> implements InterfaceC5907y<Object>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DelayMaybeObserver<T> f209452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public zc.I<T> f209453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Subscription f209454c;

        public a(zc.F<? super T> actual, zc.I<T> source) {
            this.f209452a = new DelayMaybeObserver<>(actual);
            this.f209453b = source;
        }

        public void a() {
            zc.I<T> i10 = this.f209453b;
            this.f209453b = null;
            i10.b(this.f209452a);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f209454c.cancel();
            this.f209454c = SubscriptionHelper.CANCELLED;
            DisposableHelper.dispose(this.f209452a);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f209452a.get());
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Subscription subscription = this.f209454c;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                this.f209454c = subscriptionHelper;
                a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t10) {
            Subscription subscription = this.f209454c;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription == subscriptionHelper) {
                Ic.a.Y(t10);
            } else {
                this.f209454c = subscriptionHelper;
                this.f209452a.f209451a.onError(t10);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object t10) {
            Subscription subscription = this.f209454c;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                subscription.cancel();
                this.f209454c = subscriptionHelper;
                a();
            }
        }

        @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s10) {
            if (SubscriptionHelper.validate(this.f209454c, s10)) {
                this.f209454c = s10;
                this.f209452a.f209451a.onSubscribe(this);
                s10.request(Long.MAX_VALUE);
            }
        }
    }

    public MaybeDelaySubscriptionOtherPublisher(zc.I<T> source, Publisher<U> other) {
        super(source);
        this.f209450b = other;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        this.f209450b.subscribe(new a(observer, this.f209610a));
    }
}
