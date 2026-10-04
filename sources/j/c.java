package J;

import fd.InterfaceC4424g;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class c<K, V> extends b<K, V> implements Map.Entry<K, V>, InterfaceC4424g.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final i<K, V> f53057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public V f53058e;

    public c(@NotNull i<K, V> iVar, K k10, V v10) {
        super(k10, v10);
        this.f53057d = iVar;
        this.f53058e = v10;
    }

    public void b(V v10) {
        this.f53058e = v10;
    }

    @Override // J.b, java.util.Map.Entry
    public V getValue() {
        return this.f53058e;
    }

    @Override // J.b, java.util.Map.Entry
    public V setValue(V v10) {
        V v11 = this.f53058e;
        this.f53058e = v10;
        this.f53057d.d(this.f53055a, v10);
        return v11;
    }
}
