package com.cookiegames.smartcookie.di;

import android.app.Application;
import android.net.ConnectivityManager;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements dagger.internal.e<ConnectivityManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Application> f141170b;

    public r(C3121g c3121g, Provider<Application> provider) {
        this.f141169a = c3121g;
        this.f141170b = provider;
    }

    public static r a(C3121g c3121g, Provider<Application> provider) {
        return new r(c3121g, provider);
    }

    public static ConnectivityManager c(C3121g c3121g, Provider<Application> provider) {
        return c3121g.o(provider.get());
    }

    public static ConnectivityManager d(C3121g c3121g, Application application) {
        return c3121g.o(application);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConnectivityManager get() {
        return c(this.f141169a, this.f141170b);
    }
}
