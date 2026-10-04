package io.reactivex.internal.operators.maybe;

import hc.AbstractC4530j;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeToFlowable<T> extends AbstractC4530j<T> implements pc.f<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hc.w<T> f204963b;

    public static final class MaybeToFlowableSubscriber<T> extends DeferredScalarSubscription<T> implements hc.t<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public io.reactivex.disposables.b f204964k;

        public MaybeToFlowableSubscriber(Subscriber<? super T> subscriber) {
            super(subscriber);
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            this.f204964k.dispose();
        }

        @Override // hc.t
        public void onComplete() {
            this.f207169a.onComplete();
        }

        @Override // hc.t
        public void onError(Throwable th) {
            this.f207169a.onError(th);
        }

        @Override // hc.t
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            if (DisposableHelper.validate(this.f204964k, bVar)) {
                this.f204964k = bVar;
                this.f207169a.onSubscribe(this);
            }
        }

        @Override // hc.t
        public void onSuccess(T t10) {
            b(t10);
        }
    }

    public MaybeToFlowable(hc.w<T> wVar) {
        this.f204963b = wVar;
    }

    @Override // hc.AbstractC4530j
    public void d6(Subscriber<? super T> subscriber) {
        this.f204963b.b(new MaybeToFlowableSubscriber(subscriber));
    }

    @Override // pc.f
    public hc.w<T> source() {
        return this.f204963b;
    }
}
