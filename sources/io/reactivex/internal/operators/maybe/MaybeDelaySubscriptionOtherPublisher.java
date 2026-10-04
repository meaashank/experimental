package io.reactivex.internal.operators.maybe;

import hc.InterfaceC4535o;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeDelaySubscriptionOtherPublisher<T, U> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Publisher<U> f204823b;

    public static final class DelayMaybeObserver<T> extends AtomicReference<io.reactivex.disposables.b> implements hc.t<T> {
        private static final long serialVersionUID = 706635022205076709L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f204824a;

        public DelayMaybeObserver(hc.t<? super T> tVar) {
            this.f204824a = tVar;
        }

        @Override // hc.t
        public void onComplete() {
            this.f204824a.onComplete();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f204824a.onError(th);
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            DisposableHelper.setOnce(this, bVar);
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            this.f204824a.onSuccess(t10);
        }
    }

    public static final class a<T> implements InterfaceC4535o<Object>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DelayMaybeObserver<T> f204825a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public hc.w<T> f204826b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Subscription f204827c;

        public a(hc.t<? super T> tVar, hc.w<T> wVar) {
            this.f204825a = new DelayMaybeObserver<>(tVar);
            this.f204826b = wVar;
        }

        public void a() {
            hc.w<T> wVar = this.f204826b;
            this.f204826b = null;
            wVar.b(this.f204825a);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f204827c.cancel();
            this.f204827c = SubscriptionHelper.CANCELLED;
            DisposableHelper.dispose(this.f204825a);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(this.f204825a.get());
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Subscription subscription = this.f204827c;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                this.f204827c = subscriptionHelper;
                a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            Subscription subscription = this.f204827c;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription == subscriptionHelper) {
                C5666a.Y(th);
            } else {
                this.f204827c = subscriptionHelper;
                this.f204825a.f204824a.onError(th);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            Subscription subscription = this.f204827c;
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                subscription.cancel();
                this.f204827c = subscriptionHelper;
                a();
            }
        }

        @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f204827c, subscription)) {
                this.f204827c = subscription;
                this.f204825a.f204824a.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public MaybeDelaySubscriptionOtherPublisher(hc.w<T> wVar, Publisher<U> publisher) {
        super(wVar);
        this.f204823b = publisher;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        this.f204823b.subscribe(new a(tVar, this.f204988a));
    }
}
