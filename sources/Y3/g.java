package Y3;

import android.app.Application;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements dagger.internal.e<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Application> f79140a;

    public g(Provider<Application> provider) {
        this.f79140a = provider;
    }

    public static g a(Provider<Application> provider) {
        return new g(provider);
    }

    public static f c(Application application) {
        return new f(application);
    }

    public static f d(Provider<Application> provider) {
        return new f(provider.get());
    }

    public f b() {
        return d(this.f79140a);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return d(this.f79140a);
    }
}
