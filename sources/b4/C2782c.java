package b4;

import android.content.Context;
import dagger.internal.e;
import javax.inject.Provider;

/* JADX INFO: renamed from: b4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2782c implements e<C2781b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Context> f120797a;

    public C2782c(Provider<Context> provider) {
        this.f120797a = provider;
    }

    public static C2782c a(Provider<Context> provider) {
        return new C2782c(provider);
    }

    public static C2781b c(Context context) {
        return new C2781b(context);
    }

    public static C2781b d(Provider<Context> provider) {
        return new C2781b(provider.get());
    }

    public C2781b b() {
        return d(this.f120797a);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return d(this.f120797a);
    }
}
