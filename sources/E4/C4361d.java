package e4;

import android.app.Application;
import javax.inject.Provider;
import p4.InterfaceC5390c;

/* JADX INFO: renamed from: e4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4361d implements dagger.internal.e<C4360c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Application> f200240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC5390c> f200241b;

    public C4361d(Provider<Application> provider, Provider<InterfaceC5390c> provider2) {
        this.f200240a = provider;
        this.f200241b = provider2;
    }

    public static C4361d a(Provider<Application> provider, Provider<InterfaceC5390c> provider2) {
        return new C4361d(provider, provider2);
    }

    public static C4360c c(Application application, InterfaceC5390c interfaceC5390c) {
        return new C4360c(application, interfaceC5390c);
    }

    public static C4360c d(Provider<Application> provider, Provider<InterfaceC5390c> provider2) {
        return new C4360c(provider.get(), provider2.get());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4360c get() {
        return d(this.f200240a, this.f200241b);
    }
}
