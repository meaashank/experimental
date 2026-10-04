package U3;

import android.content.SharedPreferences;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements dagger.internal.e<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<SharedPreferences> f68520a;

    public i(Provider<SharedPreferences> provider) {
        this.f68520a = provider;
    }

    public static i a(Provider<SharedPreferences> provider) {
        return new i(provider);
    }

    public static h c(SharedPreferences sharedPreferences) {
        return new h(sharedPreferences);
    }

    public static h d(Provider<SharedPreferences> provider) {
        return new h(provider.get());
    }

    public h b() {
        return d(this.f68520a);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return d(this.f68520a);
    }
}
