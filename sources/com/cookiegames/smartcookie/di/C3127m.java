package com.cookiegames.smartcookie.di;

import android.os.Handler;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.di.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3127m implements dagger.internal.e<Handler> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141160a;

    public C3127m(C3121g c3121g) {
        this.f141160a = c3121g;
    }

    public static C3127m a(C3121g c3121g) {
        return new C3127m(c3121g);
    }

    public static Handler c(C3121g c3121g) {
        return c3121g.j();
    }

    public static Handler d(C3121g c3121g) {
        return c3121g.j();
    }

    public Handler b() {
        return this.f141160a.j();
    }

    @Override // javax.inject.Provider
    public Object get() {
        return this.f141160a.j();
    }
}
