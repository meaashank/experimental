package com.cookiegames.smartcookie.di;

import android.app.Application;
import android.content.res.AssetManager;
import javax.inject.Provider;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.di.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3130p implements dagger.internal.e<AssetManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Application> f141166b;

    public C3130p(C3121g c3121g, Provider<Application> provider) {
        this.f141165a = c3121g;
        this.f141166b = provider;
    }

    public static C3130p a(C3121g c3121g, Provider<Application> provider) {
        return new C3130p(c3121g, provider);
    }

    public static AssetManager c(C3121g c3121g, Provider<Application> provider) {
        return c3121g.m(provider.get());
    }

    public static AssetManager d(C3121g c3121g, Application application) {
        return c3121g.m(application);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public AssetManager get() {
        return c(this.f141165a, this.f141166b);
    }
}
