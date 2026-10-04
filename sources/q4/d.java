package q4;

import android.app.Application;
import android.net.ConnectivityManager;
import dagger.internal.e;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements e<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<ConnectivityManager> f226810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Application> f226811b;

    public d(Provider<ConnectivityManager> provider, Provider<Application> provider2) {
        this.f226810a = provider;
        this.f226811b = provider2;
    }

    public static d a(Provider<ConnectivityManager> provider, Provider<Application> provider2) {
        return new d(provider, provider2);
    }

    public static c c(ConnectivityManager connectivityManager, Application application) {
        return new c(connectivityManager, application);
    }

    public static c d(Provider<ConnectivityManager> provider, Provider<Application> provider2) {
        return new c(provider.get(), provider2.get());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return d(this.f226810a, this.f226811b);
    }
}
