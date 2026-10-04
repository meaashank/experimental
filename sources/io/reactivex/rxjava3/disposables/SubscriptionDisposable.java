package io.reactivex.rxjava3.disposables;

import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
final class SubscriptionDisposable extends ReferenceDisposable<Subscription> {
    private static final long serialVersionUID = -707001650852963139L;

    public SubscriptionDisposable(Subscription value) {
        super(value);
    }

    @Override // io.reactivex.rxjava3.disposables.ReferenceDisposable
    public void a(@yc.e Subscription value) {
        value.cancel();
    }

    public void b(@yc.e Subscription value) {
        value.cancel();
    }
}
