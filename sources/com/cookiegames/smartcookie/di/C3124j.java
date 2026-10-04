package com.cookiegames.smartcookie.di;

import android.app.Application;
import android.content.SharedPreferences;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.di.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3124j implements dagger.internal.e<SharedPreferences> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Application> f141155b;

    public C3124j(C3121g c3121g, Provider<Application> provider) {
        this.f141154a = c3121g;
        this.f141155b = provider;
    }

    public static C3124j a(C3121g c3121g, Provider<Application> provider) {
        return new C3124j(c3121g, provider);
    }

    public static SharedPreferences c(C3121g c3121g, Provider<Application> provider) {
        return c3121g.g(provider.get());
    }

    public static SharedPreferences d(C3121g c3121g, Application application) {
        return c3121g.g(application);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharedPreferences get() {
        return c(this.f141154a, this.f141155b);
    }
}
