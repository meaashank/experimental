package com.cookiegames.smartcookie.di;

import android.app.Application;
import android.content.res.Resources;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.di.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3128n implements dagger.internal.e<Resources> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Application> f141162b;

    public C3128n(C3121g c3121g, Provider<Application> provider) {
        this.f141161a = c3121g;
        this.f141162b = provider;
    }

    public static C3128n a(C3121g c3121g, Provider<Application> provider) {
        return new C3128n(c3121g, provider);
    }

    public static Resources c(C3121g c3121g, Provider<Application> provider) {
        return c3121g.k(provider.get());
    }

    public static Resources d(C3121g c3121g, Application application) {
        return c3121g.k(application);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Resources get() {
        return c(this.f141161a, this.f141162b);
    }
}
