package com.cookiegames.smartcookie.di;

import android.app.Application;
import android.view.WindowManager;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class E implements dagger.internal.e<WindowManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Application> f141142b;

    public E(C3121g c3121g, Provider<Application> provider) {
        this.f141141a = c3121g;
        this.f141142b = provider;
    }

    public static E a(C3121g c3121g, Provider<Application> provider) {
        return new E(c3121g, provider);
    }

    public static WindowManager c(C3121g c3121g, Provider<Application> provider) {
        return c3121g.F(provider.get());
    }

    public static WindowManager d(C3121g c3121g, Application application) {
        return c3121g.F(application);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public WindowManager get() {
        return c(this.f141141a, this.f141142b);
    }
}
