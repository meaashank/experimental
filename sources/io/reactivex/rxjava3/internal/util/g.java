package io.reactivex.rxjava3.internal.util;

import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import zc.V;

/* JADX INFO: loaded from: classes7.dex */
public final class g {
    public g() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(Subscriber<?> subscriber, AtomicInteger wip, AtomicThrowable errors) {
        if (wip.getAndIncrement() == 0) {
            errors.k(subscriber);
        }
    }

    public static void b(V<?> observer, AtomicInteger wip, AtomicThrowable errors) {
        if (wip.getAndIncrement() == 0) {
            errors.o(observer);
        }
    }

    public static void c(Subscriber<?> subscriber, Throwable ex, AtomicInteger wip, AtomicThrowable errors) {
        if (errors.i(ex) && wip.getAndIncrement() == 0) {
            errors.k(subscriber);
        }
    }

    public static void d(V<?> observer, Throwable ex, AtomicInteger wip, AtomicThrowable errors) {
        if (errors.i(ex) && wip.getAndIncrement() == 0) {
            errors.o(observer);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void e(V<? super T> observer, T value, AtomicInteger wip, AtomicThrowable errors) {
        if (wip.get() == 0 && wip.compareAndSet(0, 1)) {
            observer.onNext(value);
            if (wip.decrementAndGet() != 0) {
                errors.o(observer);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean f(Subscriber<? super T> subscriber, T value, AtomicInteger wip, AtomicThrowable errors) {
        if (wip.get() == 0 && wip.compareAndSet(0, 1)) {
            subscriber.onNext(value);
            if (wip.decrementAndGet() == 0) {
                return true;
            }
            errors.k(subscriber);
        }
        return false;
    }
}
