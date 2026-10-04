package io.reactivex.internal.util;

import androidx.compose.animation.core.C1598m0;
import androidx.constraintlayout.motion.widget.s;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscription;
import uc.C5666a;

/* JADX INFO: loaded from: classes7.dex */
public final class f {
    public f() {
        throw new IllegalStateException("No instances!");
    }

    public static String a(String str) {
        return s.a("It is not allowed to subscribe with a(n) ", str, " multiple times. Please create a fresh instance of ", str, " and subscribe that to the target source instead.");
    }

    public static void b(Class<?> cls) {
        C5666a.Y(new ProtocolViolationException(a(cls.getName())));
    }

    public static boolean c(AtomicReference<io.reactivex.disposables.b> atomicReference, io.reactivex.disposables.b bVar, Class<?> cls) {
        io.reactivex.internal.functions.a.g(bVar, "next is null");
        if (C1598m0.a(atomicReference, null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == DisposableHelper.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }

    public static boolean d(AtomicReference<Subscription> atomicReference, Subscription subscription, Class<?> cls) {
        io.reactivex.internal.functions.a.g(subscription, "next is null");
        if (C1598m0.a(atomicReference, null, subscription)) {
            return true;
        }
        subscription.cancel();
        if (atomicReference.get() == SubscriptionHelper.CANCELLED) {
            return false;
        }
        b(cls);
        return false;
    }

    public static boolean e(io.reactivex.disposables.b bVar, io.reactivex.disposables.b bVar2, Class<?> cls) {
        io.reactivex.internal.functions.a.g(bVar2, "next is null");
        if (bVar == null) {
            return true;
        }
        bVar2.dispose();
        if (bVar == DisposableHelper.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }

    public static boolean f(Subscription subscription, Subscription subscription2, Class<?> cls) {
        io.reactivex.internal.functions.a.g(subscription2, "next is null");
        if (subscription == null) {
            return true;
        }
        subscription2.cancel();
        if (subscription == SubscriptionHelper.CANCELLED) {
            return false;
        }
        b(cls);
        return false;
    }
}
