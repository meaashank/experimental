package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription;
import org.reactivestreams.Subscriber;
import zc.AbstractC5902t;

/* JADX INFO: loaded from: classes7.dex */
public final class MaybeToFlowable<T> extends AbstractC5902t<T> implements Dc.h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zc.I<T> f209582b;

    public static final class MaybeToFlowableSubscriber<T> extends DeferredScalarSubscription<T> implements zc.F<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public io.reactivex.rxjava3.disposables.d f209583k;

        public MaybeToFlowableSubscriber(Subscriber<? super T> downstream) {
            super(downstream);
        }

        @Override // io.reactivex.rxjava3.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
            super.cancel();
            this.f209583k.dispose();
        }

        @Override // zc.F, zc.InterfaceC5888e
        public void onComplete() {
            this.f211917a.onComplete();
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onError(Throwable e10) {
            this.f211917a.onError(e10);
        }

        @Override // zc.F, zc.a0, zc.InterfaceC5888e
        public void onSubscribe(io.reactivex.rxjava3.disposables.d d10) {
            if (DisposableHelper.validate(this.f209583k, d10)) {
                this.f209583k = d10;
                this.f211917a.onSubscribe(this);
            }
        }

        @Override // zc.F, zc.a0
        public void onSuccess(T value) {
            b(value);
        }
    }

    public MaybeToFlowable(zc.I<T> source) {
        this.f209582b = source;
    }

    @Override // zc.AbstractC5902t
    public void G6(Subscriber<? super T> s10) {
        this.f209582b.b(new MaybeToFlowableSubscriber(s10));
    }

    @Override // Dc.h
    public zc.I<T> source() {
        return this.f209582b;
    }
}
