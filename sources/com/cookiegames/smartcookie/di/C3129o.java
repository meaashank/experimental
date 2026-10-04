package com.cookiegames.smartcookie.di;

import android.app.Application;
import android.content.SharedPreferences;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.di.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3129o implements dagger.internal.e<SharedPreferences> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Application> f141164b;

    public C3129o(C3121g c3121g, Provider<Application> provider) {
        this.f141163a = c3121g;
        this.f141164b = provider;
    }

    public static C3129o a(C3121g c3121g, Provider<Application> provider) {
        return new C3129o(c3121g, provider);
    }

    public static SharedPreferences c(C3121g c3121g, Provider<Application> provider) {
        return c3121g.l(provider.get());
    }

    public static SharedPreferences d(C3121g c3121g, Application application) {
        return c3121g.l(application);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharedPreferences get() {
        return c(this.f141163a, this.f141164b);
    }
}
