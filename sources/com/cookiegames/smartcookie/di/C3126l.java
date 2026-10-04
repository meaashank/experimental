package com.cookiegames.smartcookie.di;

import b4.C2780a;
import javax.inject.Provider;
import p4.InterfaceC5390c;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.di.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3126l implements dagger.internal.e<InterfaceC5390c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<C2780a> f141159b;

    public C3126l(C3121g c3121g, Provider<C2780a> provider) {
        this.f141158a = c3121g;
        this.f141159b = provider;
    }

    public static C3126l a(C3121g c3121g, Provider<C2780a> provider) {
        return new C3126l(c3121g, provider);
    }

    public static InterfaceC5390c c(C3121g c3121g, Provider<C2780a> provider) {
        return c3121g.i(provider.get());
    }

    public static InterfaceC5390c d(C3121g c3121g, C2780a c2780a) {
        return c3121g.i(c2780a);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC5390c get() {
        return c(this.f141158a, this.f141159b);
    }
}
