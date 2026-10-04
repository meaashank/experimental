package com.cookiegames.smartcookie.di;

import android.app.Application;
import javax.inject.Provider;
import net.i2p.android.ui.I2PAndroidHelper;

/* JADX INFO: renamed from: com.cookiegames.smartcookie.di.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3125k implements dagger.internal.e<I2PAndroidHelper> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Application> f141157b;

    public C3125k(C3121g c3121g, Provider<Application> provider) {
        this.f141156a = c3121g;
        this.f141157b = provider;
    }

    public static C3125k a(C3121g c3121g, Provider<Application> provider) {
        return new C3125k(c3121g, provider);
    }

    public static I2PAndroidHelper c(C3121g c3121g, Provider<Application> provider) {
        return c3121g.h(provider.get());
    }

    public static I2PAndroidHelper d(C3121g c3121g, Application application) {
        return c3121g.h(application);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public I2PAndroidHelper get() {
        return c(this.f141156a, this.f141157b);
    }
}
