package y3;

import androidx.collection.C1520a;
import androidx.collection.U0;

/* JADX INFO: renamed from: y3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5813b<K, V> extends C1520a<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f241053g;

    @Override // androidx.collection.U0, java.util.Map
    public void clear() {
        this.f241053g = 0;
        super.clear();
    }

    @Override // androidx.collection.U0, java.util.Map
    public int hashCode() {
        if (this.f241053g == 0) {
            this.f241053g = super.hashCode();
        }
        return this.f241053g;
    }

    @Override // androidx.collection.U0
    public void j(U0<? extends K, ? extends V> u02) {
        this.f241053g = 0;
        super.j(u02);
    }

    @Override // androidx.collection.U0
    public V l(int i10) {
        this.f241053g = 0;
        return (V) super.l(i10);
    }

    @Override // androidx.collection.U0
    public V m(int i10, V v10) {
        this.f241053g = 0;
        return (V) super.m(i10, v10);
    }

    @Override // androidx.collection.U0, java.util.Map
    public V put(K k10, V v10) {
        this.f241053g = 0;
        return (V) super.put(k10, v10);
    }
}
