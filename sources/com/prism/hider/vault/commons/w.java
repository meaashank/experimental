package com.prism.hider.vault.commons;

import java.util.Map;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements dagger.internal.e<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Map<String, VaultUI>> f178653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<String[]> f178654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<E> f178655c;

    public w(Provider<Map<String, VaultUI>> provider, Provider<String[]> provider2, Provider<E> provider3) {
        this.f178653a = provider;
        this.f178654b = provider2;
        this.f178655c = provider3;
    }

    public static w a(Provider<Map<String, VaultUI>> provider, Provider<String[]> provider2, Provider<E> provider3) {
        return new w(provider, provider2, provider3);
    }

    public static v c(Map<String, VaultUI> map, String[] strArr, E e10) {
        return new v(map, strArr, e10);
    }

    public static v d(Provider<Map<String, VaultUI>> provider, Provider<String[]> provider2, Provider<E> provider3) {
        return new v(provider.get(), provider2.get(), provider3.get());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return d(this.f178653a, this.f178654b, this.f178655c);
    }
}
