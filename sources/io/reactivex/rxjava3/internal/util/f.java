package io.reactivex.rxjava3.internal.util;

import androidx.compose.animation.core.C1598m0;
import androidx.constraintlayout.motion.widget.s;
import io.reactivex.rxjava3.exceptions.ProtocolViolationException;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class f {
    public f() {
        throw new IllegalStateException("No instances!");
    }

    public static String a(String consumer) {
        return s.a("It is not allowed to subscribe with a(n) ", consumer, " multiple times. Please create a fresh instance of ", consumer, " and subscribe that to the target source instead.");
    }

    public static void b(Class<?> consumer) {
        Ic.a.Y(new ProtocolViolationException(a(consumer.getName())));
    }

    public static boolean c(AtomicReference<io.reactivex.rxjava3.disposables.d> upstream, io.reactivex.rxjava3.disposables.d next, Class<?> observer) {
        Objects.requireNonNull(next, "next is null");
        if (C1598m0.a(upstream, null, next)) {
            return true;
        }
        next.dispose();
        if (upstream.get() == DisposableHelper.DISPOSED) {
            return false;
        }
        b(observer);
        return false;
    }

    public static boolean d(AtomicReference<Subscription> upstream, Subscription next, Class<?> subscriber) {
        Objects.requireNonNull(next, "next is null");
        if (C1598m0.a(upstream, null, next)) {
            return true;
        }
        next.cancel();
        if (upstream.get() == SubscriptionHelper.CANCELLED) {
            return false;
        }
        b(subscriber);
        return false;
    }

    public static boolean e(io.reactivex.rxjava3.disposables.d upstream, io.reactivex.rxjava3.disposables.d next, Class<?> observer) {
        Objects.requireNonNull(next, "next is null");
        if (upstream == null) {
            return true;
        }
        next.dispose();
        if (upstream == DisposableHelper.DISPOSED) {
            return false;
        }
        b(observer);
        return false;
    }

    public static boolean f(Subscription upstream, Subscription next, Class<?> subscriber) {
        Objects.requireNonNull(next, "next is null");
        if (upstream == null) {
            return true;
        }
        next.cancel();
        if (upstream == SubscriptionHelper.CANCELLED) {
            return false;
        }
        b(subscriber);
        return false;
    }
}
