package com.cookiegames.smartcookie.di;

import android.app.Application;
import android.content.SharedPreferences;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.di.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3122h implements dagger.internal.e<SharedPreferences> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Application> f141151b;

    public C3122h(C3121g c3121g, Provider<Application> provider) {
        this.f141150a = c3121g;
        this.f141151b = provider;
    }

    public static C3122h a(C3121g c3121g, Provider<Application> provider) {
        return new C3122h(c3121g, provider);
    }

    public static SharedPreferences c(C3121g c3121g, Provider<Application> provider) {
        return c3121g.e(provider.get());
    }

    public static SharedPreferences d(C3121g c3121g, Application application) {
        return c3121g.e(application);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharedPreferences get() {
        return c(this.f141150a, this.f141151b);
    }
}
