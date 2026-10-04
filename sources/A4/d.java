package A4;

import bc.InterfaceC2856f;
import javax.inject.Provider;
import u4.e;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements InterfaceC2856f<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<e> f2348a;

    public d(Provider<e> provider) {
        this.f2348a = provider;
    }

    public static InterfaceC2856f<c> a(Provider<e> provider) {
        return new d(provider);
    }

    public static void c(c cVar, e eVar) {
        cVar.f2346d = eVar;
    }

    @Override // bc.InterfaceC2856f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(c cVar) {
        cVar.f2346d = this.f2348a.get();
    }
}
