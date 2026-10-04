package dagger.internal;

import bc.InterfaceC2854d;

/* JADX INFO: loaded from: classes7.dex */
public final class g<T> implements e<T>, InterfaceC2854d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g<Object> f194927b = new g<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f194928a;

    public g(T instance) {
        this.f194928a = instance;
    }

    public static <T> e<T> a(T instance) {
        j.b(instance, "instance cannot be null");
        return new g(instance);
    }

    public static <T> e<T> b(T instance) {
        return instance == null ? f194927b : new g(instance);
    }

    public static <T> g<T> c() {
        return (g<T>) f194927b;
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.f194928a;
    }
}
