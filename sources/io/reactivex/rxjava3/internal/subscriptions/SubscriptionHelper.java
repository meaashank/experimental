package io.reactivex.rxjava3.internal.subscriptions;

import Ic.a;
import androidx.collection.Q;
import androidx.compose.animation.core.C1598m0;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.internal.util.b;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public enum SubscriptionHelper implements Subscription {
    CANCELLED;

    public static void deferredRequest(AtomicReference<Subscription> field, AtomicLong requested, long n10) {
        Subscription subscription = field.get();
        if (subscription != null) {
            subscription.request(n10);
            return;
        }
        if (validate(n10)) {
            b.a(requested, n10);
            Subscription subscription2 = field.get();
            if (subscription2 != null) {
                long andSet = requested.getAndSet(0L);
                if (andSet != 0) {
                    subscription2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<Subscription> field, AtomicLong requested, Subscription s10) {
        if (!setOnce(field, s10)) {
            return false;
        }
        long andSet = requested.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        s10.request(andSet);
        return true;
    }

    public static boolean replace(AtomicReference<Subscription> field, Subscription s10) {
        Subscription subscription;
        do {
            subscription = field.get();
            if (subscription == CANCELLED) {
                if (s10 == null) {
                    return false;
                }
                s10.cancel();
                return false;
            }
        } while (!C1598m0.a(field, subscription, s10));
        return true;
    }

    public static void reportMoreProduced(long n10) {
        a.Y(new ProtocolViolationException(Q.a("More produced than requested: ", n10)));
    }

    public static void reportSubscriptionSet() {
        a.Y(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<Subscription> field, Subscription s10) {
        Subscription subscription;
        do {
            subscription = field.get();
            if (subscription == CANCELLED) {
                if (s10 == null) {
                    return false;
                }
                s10.cancel();
                return false;
            }
        } while (!C1598m0.a(field, subscription, s10));
        if (subscription == null) {
            return true;
        }
        subscription.cancel();
        return true;
    }

    public static boolean setOnce(AtomicReference<Subscription> field, Subscription s10) {
        Objects.requireNonNull(s10, "s is null");
        if (C1598m0.a(field, null, s10)) {
            return true;
        }
        s10.cancel();
        if (field.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    public static boolean validate(Subscription current, Subscription next) {
        if (next == null) {
            a.Y(new NullPointerException("next is null"));
            return false;
        }
        if (current == null) {
            return true;
        }
        next.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
    }

    @Override // org.reactivestreams.Subscription
    public void request(long n10) {
    }

    public static boolean cancel(AtomicReference<Subscription> field) {
        Subscription andSet;
        Subscription subscription = field.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (subscription == subscriptionHelper || (andSet = field.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean validate(long n10) {
        if (n10 > 0) {
            return true;
        }
        a.Y(new IllegalArgumentException(Q.a("n > 0 required but it was ", n10)));
        return false;
    }

    public static boolean setOnce(AtomicReference<Subscription> field, Subscription s10, long request) {
        if (!setOnce(field, s10)) {
            return false;
        }
        s10.request(request);
        return true;
    }
}
