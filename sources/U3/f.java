package U3;

import android.app.Application;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements dagger.internal.e<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Application> f68514a;

    public f(Provider<Application> provider) {
        this.f68514a = provider;
    }

    public static f a(Provider<Application> provider) {
        return new f(provider);
    }

    public static e c(Application application) {
        return new e(application);
    }

    public static e d(Provider<Application> provider) {
        return new e(provider.get());
    }

    public e b() {
        return d(this.f68514a);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return d(this.f68514a);
    }
}
