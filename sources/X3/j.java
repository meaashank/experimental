package X3;

import android.app.Application;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements dagger.internal.e<i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Application> f76777a;

    public j(Provider<Application> provider) {
        this.f76777a = provider;
    }

    public static j a(Provider<Application> provider) {
        return new j(provider);
    }

    public static i c(Application application) {
        return new i(application);
    }

    public static i d(Provider<Application> provider) {
        return new i(provider.get());
    }

    public i b() {
        return d(this.f76777a);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return d(this.f76777a);
    }
}
