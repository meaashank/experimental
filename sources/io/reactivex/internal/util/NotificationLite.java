package io.reactivex.internal.util;

import hc.G;
import java.io.Serializable;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public enum NotificationLite {
    COMPLETE;

    public static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.reactivex.disposables.b f207184a;

        public DisposableNotification(io.reactivex.disposables.b bVar) {
            this.f207184a = bVar;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f207184a + "]";
        }
    }

    public static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f207185a;

        public ErrorNotification(Throwable th) {
            this.f207185a = th;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return io.reactivex.internal.functions.a.c(this.f207185a, ((ErrorNotification) obj).f207185a);
            }
            return false;
        }

        public int hashCode() {
            return this.f207185a.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f207185a + "]";
        }
    }

    public static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscription f207186a;

        public SubscriptionNotification(Subscription subscription) {
            this.f207186a = subscription;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.f207186a + "]";
        }
    }

    public static <T> boolean accept(Object obj, Subscriber<? super T> subscriber) {
        if (obj == COMPLETE) {
            subscriber.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            subscriber.onError(((ErrorNotification) obj).f207185a);
            return true;
        }
        subscriber.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, Subscriber<? super T> subscriber) {
        if (obj == COMPLETE) {
            subscriber.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            subscriber.onError(((ErrorNotification) obj).f207185a);
            return true;
        }
        if (obj instanceof SubscriptionNotification) {
            subscriber.onSubscribe(((SubscriptionNotification) obj).f207186a);
            return false;
        }
        subscriber.onNext(obj);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(io.reactivex.disposables.b bVar) {
        return new DisposableNotification(bVar);
    }

    public static Object error(Throwable th) {
        return new ErrorNotification(th);
    }

    public static io.reactivex.disposables.b getDisposable(Object obj) {
        return ((DisposableNotification) obj).f207184a;
    }

    public static Throwable getError(Object obj) {
        return ((ErrorNotification) obj).f207185a;
    }

    public static Subscription getSubscription(Object obj) {
        return ((SubscriptionNotification) obj).f207186a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof DisposableNotification;
    }

    public static boolean isError(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof SubscriptionNotification;
    }

    public static <T> Object next(T t10) {
        return t10;
    }

    public static Object subscription(Subscription subscription) {
        return new SubscriptionNotification(subscription);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object obj, G<? super T> g10) {
        if (obj == COMPLETE) {
            g10.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            g10.onError(((ErrorNotification) obj).f207185a);
            return true;
        }
        g10.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, G<? super T> g10) {
        if (obj == COMPLETE) {
            g10.onComplete();
            return true;
        }
        if (obj instanceof ErrorNotification) {
            g10.onError(((ErrorNotification) obj).f207185a);
            return true;
        }
        if (obj instanceof DisposableNotification) {
            g10.onSubscribe(((DisposableNotification) obj).f207184a);
            return false;
        }
        g10.onNext(obj);
        return false;
    }
}
