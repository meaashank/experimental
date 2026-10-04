package com.cookiegames.smartcookie.di;

import android.app.Application;
import android.app.DownloadManager;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class t implements dagger.internal.e<DownloadManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Application> f141173b;

    public t(C3121g c3121g, Provider<Application> provider) {
        this.f141172a = c3121g;
        this.f141173b = provider;
    }

    public static t a(C3121g c3121g, Provider<Application> provider) {
        return new t(c3121g, provider);
    }

    public static DownloadManager c(C3121g c3121g, Provider<Application> provider) {
        return c3121g.q(provider.get());
    }

    public static DownloadManager d(C3121g c3121g, Application application) {
        return c3121g.q(application);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public DownloadManager get() {
        return c(this.f141172a, this.f141173b);
    }
}
