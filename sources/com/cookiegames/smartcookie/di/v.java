package com.cookiegames.smartcookie.di;

import android.app.Application;
import android.view.inputmethod.InputMethodManager;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements dagger.internal.e<InputMethodManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3121g f141176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Application> f141177b;

    public v(C3121g c3121g, Provider<Application> provider) {
        this.f141176a = c3121g;
        this.f141177b = provider;
    }

    public static v a(C3121g c3121g, Provider<Application> provider) {
        return new v(c3121g, provider);
    }

    public static InputMethodManager c(C3121g c3121g, Provider<Application> provider) {
        return c3121g.u(provider.get());
    }

    public static InputMethodManager d(C3121g c3121g, Application application) {
        return c3121g.u(application);
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InputMethodManager get() {
        return c(this.f141176a, this.f141177b);
    }
}
