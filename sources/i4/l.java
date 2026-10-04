package i4;

import android.app.Application;
import android.content.res.Resources;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements dagger.internal.e<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<g4.b> f202843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Application> f202844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<Y3.h> f202845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<Resources> f202846d;

    public l(Provider<g4.b> provider, Provider<Application> provider2, Provider<Y3.h> provider3, Provider<Resources> provider4) {
        this.f202843a = provider;
        this.f202844b = provider2;
        this.f202845c = provider3;
        this.f202846d = provider4;
    }

    public static l a(Provider<g4.b> provider, Provider<Application> provider2, Provider<Y3.h> provider3, Provider<Resources> provider4) {
        return new l(provider, provider2, provider3, provider4);
    }

    public static k c(g4.b bVar, Application application, Y3.h hVar, Resources resources) {
        return new k(bVar, application, hVar, resources);
    }

    public static k d(Provider<g4.b> provider, Provider<Application> provider2, Provider<Y3.h> provider3, Provider<Resources> provider4) {
        return new k(provider.get(), provider2.get(), provider3.get(), provider4.get());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return d(this.f202843a, this.f202844b, this.f202845c, this.f202846d);
    }
}
