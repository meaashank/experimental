package u4;

import android.content.SharedPreferences;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements dagger.internal.e<C5645a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<SharedPreferences> f239379a;

    public c(Provider<SharedPreferences> provider) {
        this.f239379a = provider;
    }

    public static c a(Provider<SharedPreferences> provider) {
        return new c(provider);
    }

    public static C5645a c(SharedPreferences sharedPreferences) {
        return new C5645a(sharedPreferences);
    }

    public static C5645a d(Provider<SharedPreferences> provider) {
        return new C5645a(provider.get());
    }

    public C5645a b() {
        return d(this.f239379a);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return d(this.f239379a);
    }
}
