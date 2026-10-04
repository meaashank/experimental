package io.reactivex.internal.operators.maybe;

import hc.InterfaceC4535o;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeDelayOtherPublisher<T, U> extends AbstractC4640a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Publisher<U> f204816b;

    public static final class OtherSubscriber<T> extends AtomicReference<Subscription> implements InterfaceC4535o<Object> {
        private static final long serialVersionUID = -1215060610805418006L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final hc.t<? super T> f204817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public T f204818b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Throwable f204819c;

        public OtherSubscriber(hc.t<? super T> tVar) {
            this.f204817a = tVar;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Throwable th = this.f204819c;
            if (th != null) {
                this.f204817a.onError(th);
                return;
            }
            T t10 = this.f204818b;
            if (t10 != null) {
                this.f204817a.onSuccess(t10);
            } else {
                this.f204817a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th) {
            Throwable th2 = this.f204819c;
            if (th2 == null) {
                this.f204817a.onError(th);
            } else {
                this.f204817a.onError(new CompositeException(th2, th));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object obj) {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                lazySet(subscriptionHelper);
                subscription.cancel();
                onComplete();
            }
        }

        @Override // hc.InterfaceC4535o, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            SubscriptionHelper.setOnce(this, subscription, Long.MAX_VALUE);
        }
    }

    public static final class a<T, U> implements hc.t<T>, io.reactivex.disposables.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OtherSubscriber<T> f204820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Publisher<U> f204821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.disposables.b f204822c;

        public a(hc.t<? super T> tVar, Publisher<U> publisher) {
            this.f204820a = new OtherSubscriber<>(tVar);
            this.f204821b = publisher;
        }

        public void a() {
            this.f204821b.subscribe(this.f204820a);
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
            this.f204822c.dispose();
            this.f204822c = DisposableHelper.DISPOSED;
            SubscriptionHelper.cancel(this.f204820a);
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return SubscriptionHelper.isCancelled(this.f204820a.get());
        }

        @Override // hc.t
        public void onComplete() {
            this.f204822c = DisposableHelper.DISPOSED;
            a();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f204822c = DisposableHelper.DISPOSED;
            this.f204820a.f204819c = th;
            a();
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f204822c, bVar)) {
                this.f204822c = bVar;
                this.f204820a.f204817a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            this.f204822c = DisposableHelper.DISPOSED;
            this.f204820a.f204818b = t10;
            a();
        }
    }

    public MaybeDelayOtherPublisher(hc.w<T> wVar, Publisher<U> publisher) {
        super(wVar);
        this.f204816b = publisher;
    }

    @Override // hc.q
    public void o1(hc.t<? super T> tVar) {
        this.f204988a.b(new a(tVar, this.f204816b));
    }
}
