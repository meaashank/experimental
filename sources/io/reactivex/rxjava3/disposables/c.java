package io.reactivex.rxjava3.disposables;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.Objects;
import java.util.concurrent.Future;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c {
    @yc.e
    public static d a() {
        return EmptyDisposable.INSTANCE;
    }

    @yc.e
    public static d b() {
        return g(Functions.f207353b);
    }

    @yc.e
    public static d c(@yc.e Bc.a action) {
        Objects.requireNonNull(action, "action is null");
        return new ActionDisposable(action);
    }

    @yc.e
    public static d d(@yc.e AutoCloseable autoCloseable) {
        Objects.requireNonNull(autoCloseable, "autoCloseable is null");
        return new AutoCloseableDisposable(autoCloseable);
    }

    @yc.e
    public static d e(@yc.e Future<?> future) {
        Objects.requireNonNull(future, "future is null");
        return f(future, true);
    }

    @yc.e
    public static d f(@yc.e Future<?> future, boolean allowInterrupt) {
        Objects.requireNonNull(future, "future is null");
        return new FutureDisposable(future, allowInterrupt);
    }

    @yc.e
    public static d g(@yc.e Runnable run) {
        Objects.requireNonNull(run, "run is null");
        return new RunnableDisposable(run);
    }

    @yc.e
    public static d h(@yc.e Subscription subscription) {
        Objects.requireNonNull(subscription, "subscription is null");
        return new SubscriptionDisposable(subscription);
    }

    @yc.e
    public static AutoCloseable i(@yc.e final d disposable) {
        Objects.requireNonNull(disposable, "disposable is null");
        return new AutoCloseable() { // from class: io.reactivex.rxjava3.disposables.b
            @Override // java.lang.AutoCloseable
            public final void close() {
                disposable.dispose();
            }
        };
    }
}
