package u4;

import android.content.SharedPreferences;
import b4.C2781b;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements dagger.internal.e<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<SharedPreferences> f239603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<C2781b> f239604b;

    public h(Provider<SharedPreferences> provider, Provider<C2781b> provider2) {
        this.f239603a = provider;
        this.f239604b = provider2;
    }

    public static h a(Provider<SharedPreferences> provider, Provider<C2781b> provider2) {
        return new h(provider, provider2);
    }

    public static e c(SharedPreferences sharedPreferences, C2781b c2781b) {
        return new e(sharedPreferences, c2781b);
    }

    public static e d(Provider<SharedPreferences> provider, Provider<C2781b> provider2) {
        return new e(provider.get(), provider2.get());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return d(this.f239603a, this.f239604b);
    }
}
