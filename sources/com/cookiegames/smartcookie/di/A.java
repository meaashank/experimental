package com.cookiegames.smartcookie.di;

import C0.c0;
import android.app.Application;
import android.content.pm.ShortcutManager;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class A implements dagger.internal.e<ShortcutManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Application> f141076b;

    public A(C3121g c3121g, Provider<Application> provider) {
        this.f141075a = c3121g;
        this.f141076b = provider;
    }

    public static A a(C3121g c3121g, Provider<Application> provider) {
        return new A(c3121g, provider);
    }

    public static ShortcutManager c(C3121g c3121g, Provider<Application> provider) {
        return d(c3121g, provider.get());
    }

    public static ShortcutManager d(C3121g c3121g, Application application) {
        ShortcutManager shortcutManagerZ = c3121g.z(application);
        dagger.internal.j.b(shortcutManagerZ, "Cannot return null from a non-@Nullable @Provides method");
        return c0.a(shortcutManagerZ);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ShortcutManager get() {
        return c(this.f141075a, this.f141076b);
    }
}
