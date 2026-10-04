package androidx.databinding;

import androidx.collection.C1520a;
import androidx.databinding.w;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class u<K, V> extends C1520a<K, V> implements w<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient s f112295g;

    @Override // androidx.collection.U0, java.util.Map
    public void clear() {
        if (isEmpty()) {
            return;
        }
        super.clear();
        u(null);
    }

    @Override // androidx.databinding.w
    public void d3(w.a<? extends w<K, V>, K, V> aVar) {
        s sVar = this.f112295g;
        if (sVar != null) {
            sVar.n(aVar);
        }
    }

    @Override // androidx.databinding.w
    public void g(w.a<? extends w<K, V>, K, V> aVar) {
        if (this.f112295g == null) {
            this.f112295g = new s();
        }
        this.f112295g.a(aVar);
    }

    @Override // androidx.collection.U0
    public V l(int i10) {
        K kI = i(i10);
        V v10 = (V) super.l(i10);
        if (v10 != null) {
            u(kI);
        }
        return v10;
    }

    @Override // androidx.collection.U0
    public V m(int i10, V v10) {
        K kI = i(i10);
        V v11 = (V) super.m(i10, v10);
        u(kI);
        return v11;
    }

    @Override // androidx.collection.U0, java.util.Map
    public V put(K k10, V v10) {
        super.put(k10, v10);
        u(k10);
        return v10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.C1520a
    public boolean r(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            int iF = f(it.next());
            if (iF >= 0) {
                l(iF);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // androidx.collection.C1520a
    public boolean t(Collection<?> collection) {
        boolean z10 = false;
        for (int size = size() - 1; size >= 0; size--) {
            if (!collection.contains(i(size))) {
                l(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void u(Object obj) {
        s sVar = this.f112295g;
        if (sVar != null) {
            sVar.i(this, 0, obj);
        }
    }
}
