package v6;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: v6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5688a<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K f239856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V f239857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5688a<K, V> f239858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<K, C5688a<K, V>> f239859d;

    public C5688a(K k10, V v10) {
        this.f239856a = k10;
        this.f239857b = v10;
    }

    public C5688a<K, V> a(K k10, V v10) {
        Map<K, C5688a<K, V>> map = this.f239859d;
        if (map == null) {
            this.f239859d = new HashMap();
        } else {
            C5688a<K, V> c5688a = map.get(k10);
            if (c5688a != null) {
                c5688a.o(v10);
                return c5688a;
            }
        }
        C5688a<K, V> c5688a2 = new C5688a<>(k10, v10);
        c5688a2.f239858c = this;
        this.f239859d.put(k10, c5688a2);
        return c5688a2;
    }

    public C5688a<K, V> b(K[] kArr, V v10) {
        return d(kArr, v10, false, false);
    }

    public C5688a<K, V> c(K[] kArr, V v10, boolean z10) {
        return d(kArr, v10, z10, false);
    }

    public C5688a<K, V> d(K[] kArr, V v10, boolean z10, boolean z11) {
        C5688a<K, V> c5688aI = z11 ? i() : this;
        if (kArr.length <= 1) {
            if (kArr.length != 0) {
                return a(kArr[0], v10);
            }
            throw new IllegalArgumentException("addChild(): given path can not be empty");
        }
        if (!z10) {
            C5688a<K, V> c5688aM = c5688aI.m(kArr, 0, kArr.length - 1);
            if (c5688aM == null) {
                return null;
            }
            return c5688aM.a(kArr[kArr.length - 1], v10);
        }
        for (K k10 : kArr) {
            C5688a<K, V> c5688aE = c5688aI.e(k10);
            c5688aI = c5688aE == null ? c5688aI.a(k10, v10) : c5688aE;
        }
        c5688aI.o(v10);
        return c5688aI;
    }

    public C5688a<K, V> e(K k10) {
        Map<K, C5688a<K, V>> map = this.f239859d;
        if (map == null) {
            return null;
        }
        return map.get(k10);
    }

    public K f() {
        return this.f239856a;
    }

    public C5688a<K, V> g() {
        return this.f239858c;
    }

    public List<K> h() {
        LinkedList linkedList = new LinkedList();
        for (C5688a<K, V> c5688a = this; c5688a != null; c5688a = c5688a.f239858c) {
            linkedList.add(c5688a.f239856a);
        }
        Collections.reverse(linkedList);
        return linkedList;
    }

    public C5688a<K, V> i() {
        C5688a<K, V> c5688a = this;
        while (true) {
            C5688a<K, V> c5688a2 = c5688a.f239858c;
            if (c5688a2 == null) {
                return c5688a;
            }
            c5688a = c5688a2;
        }
    }

    public V j() {
        return this.f239857b;
    }

    public C5688a<K, V> k(K k10) {
        Map<K, C5688a<K, V>> map = this.f239859d;
        if (map == null) {
            return null;
        }
        C5688a<K, V> c5688aRemove = map.remove(k10);
        if (c5688aRemove != null) {
            c5688aRemove.l();
            c5688aRemove.f239858c = null;
        }
        return c5688aRemove;
    }

    public void l() {
        Map<K, C5688a<K, V>> map = this.f239859d;
        if (map == null) {
            return;
        }
        for (C5688a<K, V> c5688a : map.values()) {
            c5688a.l();
            c5688a.f239858c = null;
        }
        this.f239859d = null;
    }

    public C5688a<K, V> m(K[] kArr, int i10, int i11) {
        if (i10 < 0 || i11 > kArr.length || i10 > i11) {
            throw new IllegalArgumentException("violet start >= 0 && end <= path.length && start <= end");
        }
        C5688a<K, V> c5688aE = this;
        while (i10 < i11) {
            c5688aE = c5688aE.e(kArr[i10]);
            if (c5688aE == null) {
                return c5688aE;
            }
            i10++;
        }
        return c5688aE;
    }

    public void n(K k10) {
        this.f239856a = k10;
    }

    public void o(V v10) {
        this.f239857b = v10;
    }
}
