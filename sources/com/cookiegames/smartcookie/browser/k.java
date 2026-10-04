package com.cookiegames.smartcookie.browser;

import android.app.Application;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements dagger.internal.e<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<u4.e> f141031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Application> f141032b;

    public k(Provider<u4.e> provider, Provider<Application> provider2) {
        this.f141031a = provider;
        this.f141032b = provider2;
    }

    public static k a(Provider<u4.e> provider, Provider<Application> provider2) {
        return new k(provider, provider2);
    }

    public static j c(u4.e eVar, Application application) {
        return new j(eVar, application);
    }

    public static j d(Provider<u4.e> provider, Provider<Application> provider2) {
        return new j(provider.get(), provider2.get());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public j get() {
        return d(this.f141031a, this.f141032b);
    }
}
