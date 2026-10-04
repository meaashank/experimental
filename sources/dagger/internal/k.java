package dagger.internal;

import bc.InterfaceC2854d;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class k<T> implements Provider<InterfaceC2854d<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ boolean f194930b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<T> f194931a;

    public k(Provider<T> provider) {
        this.f194931a = provider;
    }

    public static <T> Provider<InterfaceC2854d<T>> a(Provider<T> provider) {
        provider.getClass();
        return new k(provider);
    }

    public InterfaceC2854d<T> b() {
        return d.a(this.f194931a);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return d.a(this.f194931a);
    }
}
