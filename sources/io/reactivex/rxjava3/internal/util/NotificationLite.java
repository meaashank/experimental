package io.reactivex.rxjava3.internal.util;

import java.io.Serializable;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public enum NotificationLite {
    COMPLETE;

    public static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final io.reactivex.rxjava3.disposables.d f211933a;

        public DisposableNotification(io.reactivex.rxjava3.disposables.d d10) {
            this.f211933a = d10;
        }

        public String toString() {
            return "NotificationLite.Disposable[" + this.f211933a + "]";
        }
    }

    public static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f211934a;

        public ErrorNotification(Throwable e10) {
            this.f211934a = e10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return Objects.equals(this.f211934a, ((ErrorNotification) obj).f211934a);
            }
            return false;
        }

        public int hashCode() {
            return this.f211934a.hashCode();
        }

        public String toString() {
            return "NotificationLite.Error[" + this.f211934a + "]";
        }
    }

    public static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Subscription f211935a;

        public SubscriptionNotification(Subscription s10) {
            this.f211935a = s10;
        }

        public String toString() {
            return "NotificationLite.Subscription[" + this.f211935a + "]";
        }
    }

    public static <T> boolean accept(Object o10, Subscriber<? super T> s10) {
        if (o10 == COMPLETE) {
            s10.onComplete();
            return true;
        }
        if (o10 instanceof ErrorNotification) {
            s10.onError(((ErrorNotification) o10).f211934a);
            return true;
        }
        s10.onNext(o10);
        return false;
    }

    public static <T> boolean acceptFull(Object o10, Subscriber<? super T> s10) {
        if (o10 == COMPLETE) {
            s10.onComplete();
            return true;
        }
        if (o10 instanceof ErrorNotification) {
            s10.onError(((ErrorNotification) o10).f211934a);
            return true;
        }
        if (o10 instanceof SubscriptionNotification) {
            s10.onSubscribe(((SubscriptionNotification) o10).f211935a);
            return false;
        }
        s10.onNext(o10);
        return false;
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(io.reactivex.rxjava3.disposables.d d10) {
        return new DisposableNotification(d10);
    }

    public static Object error(Throwable e10) {
        return new ErrorNotification(e10);
    }

    public static io.reactivex.rxjava3.disposables.d getDisposable(Object o10) {
        return ((DisposableNotification) o10).f211933a;
    }

    public static Throwable getError(Object o10) {
        return ((ErrorNotification) o10).f211934a;
    }

    public static Subscription getSubscription(Object o10) {
        return ((SubscriptionNotification) o10).f211935a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object o10) {
        return o10;
    }

    public static boolean isComplete(Object o10) {
        return o10 == COMPLETE;
    }

    public static boolean isDisposable(Object o10) {
        return o10 instanceof DisposableNotification;
    }

    public static boolean isError(Object o10) {
        return o10 instanceof ErrorNotification;
    }

    public static boolean isSubscription(Object o10) {
        return o10 instanceof SubscriptionNotification;
    }

    public static <T> Object next(T value) {
        return value;
    }

    public static Object subscription(Subscription s10) {
        return new SubscriptionNotification(s10);
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    public static <T> boolean accept(Object o10, V<? super T> observer) {
        if (o10 == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (o10 instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) o10).f211934a);
            return true;
        }
        observer.onNext(o10);
        return false;
    }

    public static <T> boolean acceptFull(Object o10, V<? super T> observer) {
        if (o10 == COMPLETE) {
            observer.onComplete();
            return true;
        }
        if (o10 instanceof ErrorNotification) {
            observer.onError(((ErrorNotification) o10).f211934a);
            return true;
        }
        if (o10 instanceof DisposableNotification) {
            observer.onSubscribe(((DisposableNotification) o10).f211933a);
            return false;
        }
        observer.onNext(o10);
        return false;
    }
}
