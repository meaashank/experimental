package C4;

import javax.inject.Provider;
import net.i2p.android.ui.I2PAndroidHelper;
import u4.C5645a;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements dagger.internal.e<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<u4.e> f17573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<C5645a> f17574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<I2PAndroidHelper> f17575c;

    public o(Provider<u4.e> provider, Provider<C5645a> provider2, Provider<I2PAndroidHelper> provider3) {
        this.f17573a = provider;
        this.f17574b = provider2;
        this.f17575c = provider3;
    }

    public static o a(Provider<u4.e> provider, Provider<C5645a> provider2, Provider<I2PAndroidHelper> provider3) {
        return new o(provider, provider2, provider3);
    }

    public static n c(u4.e eVar, C5645a c5645a, I2PAndroidHelper i2PAndroidHelper) {
        return new n(eVar, c5645a, i2PAndroidHelper);
    }

    public static n d(Provider<u4.e> provider, Provider<C5645a> provider2, Provider<I2PAndroidHelper> provider3) {
        return new n(provider.get(), provider2.get(), provider3.get());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return d(this.f17573a, this.f17574b, this.f17575c);
    }
}
