package io.reactivex.disposables;

import lc.e;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
final class SubscriptionDisposable extends ReferenceDisposable<Subscription> {
    private static final long serialVersionUID = -707001650852963139L;

    public SubscriptionDisposable(Subscription subscription) {
        super(subscription);
    }

    @Override // io.reactivex.disposables.ReferenceDisposable
    public void a(@e Subscription subscription) {
        subscription.cancel();
    }

    public void b(@e Subscription subscription) {
        subscription.cancel();
    }
}
