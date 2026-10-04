package com.cookiegames.smartcookie.di;

import android.app.Application;
import android.content.ClipboardManager;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements dagger.internal.e<ClipboardManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Application> f141168b;

    public q(C3121g c3121g, Provider<Application> provider) {
        this.f141167a = c3121g;
        this.f141168b = provider;
    }

    public static q a(C3121g c3121g, Provider<Application> provider) {
        return new q(c3121g, provider);
    }

    public static ClipboardManager c(C3121g c3121g, Provider<Application> provider) {
        return c3121g.n(provider.get());
    }

    public static ClipboardManager d(C3121g c3121g, Application application) {
        return c3121g.n(application);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ClipboardManager get() {
        return c(this.f141167a, this.f141168b);
    }
}
