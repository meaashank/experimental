package t4;

import bc.InterfaceC2856f;
import javax.inject.Provider;

/* JADX INFO: renamed from: t4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5604b implements InterfaceC2856f<C5603a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<u4.e> f239155a;

    public C5604b(Provider<u4.e> provider) {
        this.f239155a = provider;
    }

    public static InterfaceC2856f<C5603a> a(Provider<u4.e> provider) {
        return new C5604b(provider);
    }

    public static void c(C5603a c5603a, u4.e eVar) {
        c5603a.f239154c = eVar;
    }

    @Override // bc.InterfaceC2856f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void injectMembers(C5603a c5603a) {
        c5603a.f239154c = this.f239155a.get();
    }
}
