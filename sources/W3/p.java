package W3;

import android.app.Application;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements dagger.internal.e<o> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Application> f76587a;

    public p(Provider<Application> provider) {
        this.f76587a = provider;
    }

    public static p a(Provider<Application> provider) {
        return new p(provider);
    }

    public static o c(Application application) {
        return new o(application);
    }

    public static o d(Provider<Application> provider) {
        return new o(provider.get());
    }

    public o b() {
        return d(this.f76587a);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return d(this.f76587a);
    }
}
