package io.reactivex.disposables;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Future;
import lc.e;
import nc.InterfaceC5265a;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public c() {
        throw new IllegalStateException("No instances!");
    }

    @e
    public static b a() {
        return EmptyDisposable.INSTANCE;
    }

    @e
    public static b b() {
        return f(Functions.f202948b);
    }

    @e
    public static b c(@e InterfaceC5265a interfaceC5265a) {
        io.reactivex.internal.functions.a.g(interfaceC5265a, "run is null");
        return new ActionDisposable(interfaceC5265a);
    }

    @e
    public static b d(@e Future<?> future) {
        io.reactivex.internal.functions.a.g(future, "future is null");
        return e(future, true);
    }

    @e
    public static b e(@e Future<?> future, boolean z10) {
        io.reactivex.internal.functions.a.g(future, "future is null");
        return new FutureDisposable(future, z10);
    }

    @e
    public static b f(@e Runnable runnable) {
        io.reactivex.internal.functions.a.g(runnable, "run is null");
        return new RunnableDisposable(runnable);
    }

    @e
    public static b g(@e Subscription subscription) {
        io.reactivex.internal.functions.a.g(subscription, "subscription is null");
        return new SubscriptionDisposable(subscription);
    }
}
