package com.cookiegames.smartcookie.di;

import android.app.Application;
import android.content.Context;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.di.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3123i implements dagger.internal.e<Context> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Application> f141153b;

    public C3123i(C3121g c3121g, Provider<Application> provider) {
        this.f141152a = c3121g;
        this.f141153b = provider;
    }

    public static C3123i a(C3121g c3121g, Provider<Application> provider) {
        return new C3123i(c3121g, provider);
    }

    public static Context c(C3121g c3121g, Provider<Application> provider) {
        return c3121g.f(provider.get());
    }

    public static Context d(C3121g c3121g, Application application) {
        return c3121g.f(application);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return c(this.f141152a, this.f141153b);
    }
}
