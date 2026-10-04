package dagger.internal;

import bc.InterfaceC2854d;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class d<T> implements Provider<T>, InterfaceC2854d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f194923c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ boolean f194924d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Provider<T> f194925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f194926b = f194923c;

    public d(Provider<T> provider) {
        this.f194925a = provider;
    }

    public static <P extends Provider<T>, T> InterfaceC2854d<T> a(P provider) {
        if (provider instanceof InterfaceC2854d) {
            return (InterfaceC2854d) provider;
        }
        provider.getClass();
        return new d(provider);
    }

    public static <P extends Provider<T>, T> Provider<T> b(P delegate) {
        delegate.getClass();
        return delegate instanceof d ? delegate : new d(delegate);
    }

    public static Object c(Object currentInstance, Object newInstance) {
        if (currentInstance == f194923c || (currentInstance instanceof i) || currentInstance == newInstance) {
            return newInstance;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + currentInstance + " & " + newInstance + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t10;
        T t11 = (T) this.f194926b;
        Object obj = f194923c;
        if (t11 != obj) {
            return t11;
        }
        synchronized (this) {
            try {
                t10 = (T) this.f194926b;
                if (t10 == obj) {
                    t10 = this.f194925a.get();
                    c(this.f194926b, t10);
                    this.f194926b = t10;
                    this.f194925a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t10;
    }
}
