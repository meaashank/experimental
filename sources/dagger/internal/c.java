package dagger.internal;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes7.dex */
public final class c<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Provider<T> f194922a;

    public void a(Provider<T> delegate) {
        if (delegate == null) {
            throw new IllegalArgumentException();
        }
        if (this.f194922a != null) {
            throw new IllegalStateException();
        }
        this.f194922a = delegate;
    }

    @Override // javax.inject.Provider
    public T get() {
        Provider<T> provider = this.f194922a;
        if (provider != null) {
            return provider.get();
        }
        throw new IllegalStateException();
    }
}
