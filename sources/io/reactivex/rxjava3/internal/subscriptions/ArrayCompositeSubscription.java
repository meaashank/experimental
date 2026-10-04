package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.disposables.d;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<Subscription> implements d {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeSubscription(int capacity) {
        super(capacity);
    }

    public Subscription a(int index, Subscription resource) {
        Subscription subscription;
        do {
            subscription = get(index);
            if (subscription == SubscriptionHelper.CANCELLED) {
                if (resource == null) {
                    return null;
                }
                resource.cancel();
                return null;
            }
        } while (!compareAndSet(index, subscription, resource));
        return subscription;
    }

    public boolean b(int index, Subscription resource) {
        Subscription subscription;
        do {
            subscription = get(index);
            if (subscription == SubscriptionHelper.CANCELLED) {
                if (resource == null) {
                    return false;
                }
                resource.cancel();
                return false;
            }
        } while (!compareAndSet(index, subscription, resource));
        if (subscription == null) {
            return true;
        }
        subscription.cancel();
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public void dispose() {
        Subscription andSet;
        if (get(0) != SubscriptionHelper.CANCELLED) {
            int length = length();
            for (int i10 = 0; i10 < length; i10++) {
                Subscription subscription = get(i10);
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (subscription != subscriptionHelper && (andSet = getAndSet(i10, subscriptionHelper)) != subscriptionHelper && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    public boolean isDisposed() {
        return get(0) == SubscriptionHelper.CANCELLED;
    }
}
