package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;
import zc.InterfaceC5907y;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeDelayOtherPublisher<T, U> extends AbstractC4725a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Publisher<U> f209443b;

    public static final class OtherSubscriber<T> extends AtomicReference<Subscription> implements InterfaceC5907y<Object> {
        private static final long serialVersionUID = -1215060610805418006L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zc.F<? super T> f209444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public T f209445b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Throwable f209446c;

        public OtherSubscriber(zc.F<? super T> downstream) {
            this.f209444a = downstream;
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            Throwable th = this.f209446c;
            if (th != null) {
                this.f209444a.onError(th);
                return;
            }
            T t10 = this.f209445b;
            if (t10 != null) {
                this.f209444a.onSuccess(t10);
            } else {
                this.f209444a.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable t10) {
            Throwable th = this.f209446c;
            if (th == null) {
                this.f209444a.onError(t10);
            } else {
                this.f209444a.onError(new CompositeException(th, t10));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(Object t10) {
            Subscription subscription = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (subscription != subscriptionHelper) {
                lazySet(subscriptionHelper);
                subscription.cancel();
                onComplete();
            }
        }

        @Override // zc.InterfaceC5907y, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription s10) {
            SubscriptionHelper.setOnce(this, s10, Long.MAX_VALUE);
        }
    }

    public static final class a<T, U> implements zc.F<T>, io.reactivex.rxjava3.disposables.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OtherSubscriber<T> f209447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Publisher<U> f209448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209449c;

        public a(zc.F<? super T> actual, Publisher<U> otherSource) {
            this.f209447a = new OtherSubscriber<>(actual);
            this.f209448b = otherSource;
        }

        public void a() {
            this.f209448b.subscribe(this.f209447a);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public void dispose() {
            this.f209449c.dispose();
            this.f209449c = DisposableHelper.DISPOSED;
            SubscriptionHelper.cancel(this.f209447a);
        }

        @Override // io.reactivex.rxjava3.disposables.d
        public boolean isDisposed() {
            return this.f209447a.get() == SubscriptionHelper.CANCELLED;
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f209449c = DisposableHelper.DISPOSED;
            a();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f209449c = DisposableHelper.DISPOSED;
            this.f209447a.f209446c = e10;
            a();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f209449c, d10)) {
                this.f209449c = d10;
                this.f209447a.f209444a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            this.f209449c = DisposableHelper.DISPOSED;
            this.f209447a.f209445b = value;
            a();
        }
    }

    public MaybeDelayOtherPublisher(zc.I<T> source, Publisher<U> other) {
        super(source);
        this.f209443b = other;
    }

    @Override // zc.AbstractC5881C
    public void U1(zc.F<? super T> observer) {
        this.f209610a.b(new a(observer, this.f209443b));
    }
}
