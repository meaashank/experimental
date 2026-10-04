package com.cookiegames.smartcookie.view;

import javax.inject.Provider;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.view.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3238j implements dagger.internal.e<C3237i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<u4.e> f148466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<p0> f148467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<C3230b> f148468c;

    public C3238j(Provider<u4.e> provider, Provider<p0> provider2, Provider<C3230b> provider3) {
        this.f148466a = provider;
        this.f148467b = provider2;
        this.f148468c = provider3;
    }

    public static C3238j a(Provider<u4.e> provider, Provider<p0> provider2, Provider<C3230b> provider3) {
        return new C3238j(provider, provider2, provider3);
    }

    public static C3237i c(u4.e eVar, p0 p0Var, C3230b c3230b) {
        return new C3237i(eVar, p0Var, c3230b);
    }

    public static C3237i d(Provider<u4.e> provider, Provider<p0> provider2, Provider<C3230b> provider3) {
        return new C3237i(provider.get(), provider2.get(), provider3.get());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3237i get() {
        return d(this.f148466a, this.f148467b, this.f148468c);
    }
}
