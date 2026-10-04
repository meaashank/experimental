package V5;

import V5.c;
import java.util.Set;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements dagger.internal.e<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<Set<d>> f74623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<Set<e>> f74624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<Set<c.a>> f74625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<Set<f>> f74626d;

    public b(Provider<Set<d>> provider, Provider<Set<e>> provider2, Provider<Set<c.a>> provider3, Provider<Set<f>> provider4) {
        this.f74623a = provider;
        this.f74624b = provider2;
        this.f74625c = provider3;
        this.f74626d = provider4;
    }

    public static b a(Provider<Set<d>> provider, Provider<Set<e>> provider2, Provider<Set<c.a>> provider3, Provider<Set<f>> provider4) {
        return new b(provider, provider2, provider3, provider4);
    }

    public static a c(Set<d> set, Set<e> set2, Set<c.a> set3, Set<f> set4) {
        return new a(set, set2, set3, set4);
    }

    public static a d(Provider<Set<d>> provider, Provider<Set<e>> provider2, Provider<Set<c.a>> provider3, Provider<Set<f>> provider4) {
        return new a(provider.get(), provider2.get(), provider3.get(), provider4.get());
    }

    @Override // javax.inject.Provider
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a get() {
        return d(this.f74623a, this.f74624b, this.f74625c, this.f74626d);
    }
}
