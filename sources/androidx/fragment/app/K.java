package androidx.fragment.app;

import androidx.annotation.Nullable;
import androidx.lifecycle.p0;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Collection<Fragment> f113671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final Map<String, K> f113672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final Map<String, p0> f113673c;

    public K(@Nullable Collection<Fragment> collection, @Nullable Map<String, K> map, @Nullable Map<String, p0> map2) {
        this.f113671a = collection;
        this.f113672b = map;
        this.f113673c = map2;
    }

    @Nullable
    public Map<String, K> a() {
        return this.f113672b;
    }

    @Nullable
    public Collection<Fragment> b() {
        return this.f113671a;
    }

    @Nullable
    public Map<String, p0> c() {
        return this.f113673c;
    }

    public boolean d(Fragment fragment) {
        Collection<Fragment> collection = this.f113671a;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }
}
