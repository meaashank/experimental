package K;

import fd.InterfaceC4424g;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class b<K, V> extends J.b<K, V> implements Map.Entry<K, V>, InterfaceC4424g.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<K, a<V>> f58286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public a<V> f58287e;

    public b(@NotNull Map<K, a<V>> map, K k10, @NotNull a<V> aVar) {
        super(k10, aVar.f58283a);
        this.f58286d = map;
        this.f58287e = aVar;
    }

    @Override // J.b, java.util.Map.Entry
    public V getValue() {
        return this.f58287e.f58283a;
    }

    @Override // J.b, java.util.Map.Entry
    public V setValue(V v10) {
        a<V> aVar = this.f58287e;
        V v11 = aVar.f58283a;
        a<V> aVarH = aVar.h(v10);
        this.f58287e = aVarH;
        this.f58286d.put(this.f53055a, aVarH);
        return v11;
    }
}
