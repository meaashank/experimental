package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;
import o.C5287b;

/* JADX INFO: renamed from: o.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class C5286a<K, V> extends C5287b<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<K, C5287b.c<K, V>> f222999e = new HashMap<>();

    @Override // o.C5287b
    @Nullable
    public C5287b.c<K, V> c(K k10) {
        return this.f222999e.get(k10);
    }

    public boolean contains(K k10) {
        return this.f222999e.containsKey(k10);
    }

    @Override // o.C5287b
    public V j(@NonNull K k10, @NonNull V v10) {
        C5287b.c<K, V> cVarC = c(k10);
        if (cVarC != null) {
            return cVarC.f223005b;
        }
        this.f222999e.put(k10, i(k10, v10));
        return null;
    }

    @Override // o.C5287b
    public V k(@NonNull K k10) {
        V v10 = (V) super.k(k10);
        this.f222999e.remove(k10);
        return v10;
    }

    @Nullable
    public Map.Entry<K, V> n(K k10) {
        if (contains(k10)) {
            return this.f222999e.get(k10).f223007d;
        }
        return null;
    }
}
