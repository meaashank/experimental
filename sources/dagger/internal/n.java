package dagger.internal;

import bc.InterfaceC2854d;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class n<T> implements Provider<T>, InterfaceC2854d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f194939c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ boolean f194940d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Provider<T> f194941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f194942b = f194939c;

    public n(Provider<T> provider) {
        this.f194941a = provider;
    }

    public static <P extends Provider<T>, T> Provider<T> a(P provider) {
        if ((provider instanceof n) || (provider instanceof d)) {
            return provider;
        }
        provider.getClass();
        return new n(provider);
    }

    @Override // javax.inject.Provider
    public T get() {
        T t10 = (T) this.f194942b;
        if (t10 != f194939c) {
            return t10;
        }
        Provider<T> provider = this.f194941a;
        if (provider == null) {
            return (T) this.f194942b;
        }
        T t11 = provider.get();
        this.f194942b = t11;
        this.f194941a = null;
        return t11;
    }
}
