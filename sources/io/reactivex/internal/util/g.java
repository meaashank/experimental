package io.reactivex.internal.util;

import hc.G;
import java.util.concurrent.atomic.AtomicInteger;
import org.reactivestreams.Subscriber;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class g {
    public g() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(G<?> g10, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.getClass();
            Throwable thC = ExceptionHelper.c(atomicThrowable);
            if (thC != null) {
                g10.onError(thC);
            } else {
                g10.onComplete();
            }
        }
    }

    public static void b(Subscriber<?> subscriber, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.getClass();
            Throwable thC = ExceptionHelper.c(atomicThrowable);
            if (thC != null) {
                subscriber.onError(thC);
            } else {
                subscriber.onComplete();
            }
        }
    }

    public static void c(G<?> g10, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        atomicThrowable.getClass();
        if (!ExceptionHelper.a(atomicThrowable, th)) {
            C5666a.Y(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            g10.onError(ExceptionHelper.c(atomicThrowable));
        }
    }

    public static void d(Subscriber<?> subscriber, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        atomicThrowable.getClass();
        if (!ExceptionHelper.a(atomicThrowable, th)) {
            C5666a.Y(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            subscriber.onError(ExceptionHelper.c(atomicThrowable));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void e(G<? super T> g10, T t10, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            g10.onNext(t10);
            if (atomicInteger.decrementAndGet() != 0) {
                atomicThrowable.getClass();
                Throwable thC = ExceptionHelper.c(atomicThrowable);
                if (thC != null) {
                    g10.onError(thC);
                } else {
                    g10.onComplete();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void f(Subscriber<? super T> subscriber, T t10, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            subscriber.onNext(t10);
            if (atomicInteger.decrementAndGet() != 0) {
                atomicThrowable.getClass();
                Throwable thC = ExceptionHelper.c(atomicThrowable);
                if (thC != null) {
                    subscriber.onError(thC);
                } else {
                    subscriber.onComplete();
                }
            }
        }
    }
}
