package com.cookiegames.smartcookie.di;

import android.app.Application;
import android.app.NotificationManager;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements dagger.internal.e<NotificationManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Application> f141182b;

    public z(C3121g c3121g, Provider<Application> provider) {
        this.f141181a = c3121g;
        this.f141182b = provider;
    }

    public static z a(C3121g c3121g, Provider<Application> provider) {
        return new z(c3121g, provider);
    }

    public static NotificationManager c(C3121g c3121g, Provider<Application> provider) {
        return c3121g.y(provider.get());
    }

    public static NotificationManager d(C3121g c3121g, Application application) {
        return c3121g.y(application);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public NotificationManager get() {
        return c(this.f141181a, this.f141182b);
    }
}
