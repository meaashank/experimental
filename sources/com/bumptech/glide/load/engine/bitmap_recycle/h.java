package com.bumptech.glide.load.engine.bitmap_recycle;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.bitmap_recycle.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class h<K extends m, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<K, V> f139523a = new a<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<K, a<K, V>> f139524b = new HashMap();

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f139525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<V> f139526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a<K, V> f139527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a<K, V> f139528d;

        public a() {
            this(null);
        }

        public void a(V v10) {
            if (this.f139526b == null) {
                this.f139526b = new ArrayList();
            }
            this.f139526b.add(v10);
        }

        @Nullable
        public V b() {
            int iC = c();
            if (iC > 0) {
                return this.f139526b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f139526b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a(K k10) {
            this.f139528d = this;
            this.f139527c = this;
            this.f139525a = k10;
        }
    }

    public static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f139528d;
        aVar2.f139527c = aVar.f139527c;
        aVar.f139527c.f139528d = aVar2;
    }

    public static <K, V> void g(a<K, V> aVar) {
        aVar.f139527c.f139528d = aVar;
        aVar.f139528d.f139527c = aVar;
    }

    @Nullable
    public V a(K k10) {
        a<K, V> aVar = this.f139524b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            this.f139524b.put(k10, aVar);
        } else {
            k10.a();
        }
        b(aVar);
        return aVar.b();
    }

    public final void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f139523a;
        aVar.f139528d = aVar2;
        a<K, V> aVar3 = aVar2.f139527c;
        aVar.f139527c = aVar3;
        aVar3.f139528d = aVar;
        aVar.f139528d.f139527c = aVar;
    }

    public final void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f139523a;
        aVar.f139528d = aVar2.f139528d;
        aVar.f139527c = aVar2;
        aVar2.f139528d = aVar;
        aVar.f139528d.f139527c = aVar;
    }

    public void d(K k10, V v10) {
        a<K, V> aVar = this.f139524b.get(k10);
        if (aVar == null) {
            aVar = new a<>(k10);
            c(aVar);
            this.f139524b.put(k10, aVar);
        } else {
            k10.a();
        }
        aVar.a(v10);
    }

    @Nullable
    public V f() {
        for (a aVar = this.f139523a.f139528d; !aVar.equals(this.f139523a); aVar = aVar.f139528d) {
            V v10 = (V) aVar.b();
            if (v10 != null) {
                return v10;
            }
            e(aVar);
            this.f139524b.remove(aVar.f139525a);
            ((m) aVar.f139525a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f139523a.f139527c;
        boolean z10 = false;
        while (!aVar.equals(this.f139523a)) {
            sb2.append('{');
            sb2.append(aVar.f139525a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f139527c;
            z10 = true;
        }
        if (z10) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
