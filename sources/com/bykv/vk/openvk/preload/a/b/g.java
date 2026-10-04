package com.bykv.vk.openvk.preload.a.b;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Comparator<Comparable> f140279d = new Comparator<Comparable>() { // from class: com.bykv.vk.openvk.preload.a.b.g.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static /* synthetic */ boolean f140280i = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f140281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f140282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final d<K, V> f140283c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Comparator<? super K> f140284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d<K, V> f140285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g<K, V>.a f140286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private g<K, V>.b f140287h;

    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && g.this.a((Map.Entry<?, ?>) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new g<K, V>.c<Map.Entry<K, V>>() { // from class: com.bykv.vk.openvk.preload.a.b.g.a.1
                {
                    g gVar = g.this;
                }

                @Override // java.util.Iterator
                public final /* synthetic */ Object next() {
                    return a();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            d<K, V> dVarA;
            if (!(obj instanceof Map.Entry) || (dVarA = g.this.a((Map.Entry<?, ?>) obj)) == null) {
                return false;
            }
            g.this.a((d) dVarA, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return g.this.f140281a;
        }
    }

    public final class b extends AbstractSet<K> {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<K> iterator() {
            return new g<K, V>.c<K>() { // from class: com.bykv.vk.openvk.preload.a.b.g.b.1
                {
                    g gVar = g.this;
                }

                @Override // java.util.Iterator
                public final K next() {
                    return a().f140301f;
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return g.this.a(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return g.this.f140281a;
        }
    }

    public abstract class c<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d<K, V> f140292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d<K, V> f140293b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f140294c;

        public c() {
            this.f140292a = g.this.f140283c.f140299d;
            this.f140294c = g.this.f140282b;
        }

        public final d<K, V> a() {
            d<K, V> dVar = this.f140292a;
            g gVar = g.this;
            if (dVar == gVar.f140283c) {
                throw new NoSuchElementException();
            }
            if (gVar.f140282b != this.f140294c) {
                throw new ConcurrentModificationException();
            }
            this.f140292a = dVar.f140299d;
            this.f140293b = dVar;
            return dVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f140292a != g.this.f140283c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            d<K, V> dVar = this.f140293b;
            if (dVar == null) {
                throw new IllegalStateException();
            }
            g.this.a((d) dVar, true);
            this.f140293b = null;
            this.f140294c = g.this.f140282b;
        }
    }

    public g() {
        this(f140279d);
    }

    private d<K, V> a(K k10, boolean z10) {
        int iCompareTo;
        d<K, V> dVar;
        Comparator<? super K> comparator = this.f140284e;
        d<K, V> dVar2 = this.f140285f;
        if (dVar2 != null) {
            Comparable comparable = comparator == f140279d ? (Comparable) k10 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(dVar2.f140301f) : comparator.compare(k10, dVar2.f140301f);
                if (iCompareTo != 0) {
                    d<K, V> dVar3 = iCompareTo < 0 ? dVar2.f140297b : dVar2.f140298c;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar2 = dVar3;
                } else {
                    return dVar2;
                }
            }
        } else {
            iCompareTo = 0;
        }
        if (!z10) {
            return null;
        }
        d<K, V> dVar4 = this.f140283c;
        if (dVar2 != null) {
            dVar = new d<>(dVar2, k10, dVar4, dVar4.f140300e);
            if (iCompareTo < 0) {
                dVar2.f140297b = dVar;
            } else {
                dVar2.f140298c = dVar;
            }
            b(dVar2, true);
        } else {
            if (comparator == f140279d && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName().concat(" is not Comparable"));
            }
            dVar = new d<>(dVar2, k10, dVar4, dVar4.f140300e);
            this.f140285f = dVar;
        }
        this.f140281a++;
        this.f140282b++;
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d<K, V> b(Object obj) {
        if (obj != 0) {
            try {
                return a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f140285f = null;
        this.f140281a = 0;
        this.f140282b++;
        d<K, V> dVar = this.f140283c;
        dVar.f140300e = dVar;
        dVar.f140299d = dVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        g<K, V>.a aVar = this.f140286g;
        if (aVar != null) {
            return aVar;
        }
        g<K, V>.a aVar2 = new a();
        this.f140286g = aVar2;
        return aVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        d<K, V> dVarB = b(obj);
        if (dVarB != null) {
            return dVarB.f140302g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        g<K, V>.b bVar = this.f140287h;
        if (bVar != null) {
            return bVar;
        }
        g<K, V>.b bVar2 = new b();
        this.f140287h = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        d<K, V> dVarA = a((Object) k10, true);
        V v11 = dVarA.f140302g;
        dVarA.f140302g = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        d<K, V> dVarA = a(obj);
        if (dVarA != null) {
            return dVarA.f140302g;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f140281a;
    }

    private g(Comparator<? super K> comparator) {
        this.f140281a = 0;
        this.f140282b = 0;
        this.f140283c = new d<>();
        this.f140284e = comparator == null ? f140279d : comparator;
    }

    private void b(d<K, V> dVar, boolean z10) {
        while (dVar != null) {
            d<K, V> dVar2 = dVar.f140297b;
            d<K, V> dVar3 = dVar.f140298c;
            int i10 = dVar2 != null ? dVar2.f140303h : 0;
            int i11 = dVar3 != null ? dVar3.f140303h : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                d<K, V> dVar4 = dVar3.f140297b;
                d<K, V> dVar5 = dVar3.f140298c;
                int i13 = (dVar4 != null ? dVar4.f140303h : 0) - (dVar5 != null ? dVar5.f140303h : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    a((d) dVar);
                } else {
                    if (!f140280i && i13 != 1) {
                        throw new AssertionError();
                    }
                    b((d) dVar3);
                    a((d) dVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                d<K, V> dVar6 = dVar2.f140297b;
                d<K, V> dVar7 = dVar2.f140298c;
                int i14 = (dVar6 != null ? dVar6.f140303h : 0) - (dVar7 != null ? dVar7.f140303h : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    b((d) dVar);
                } else {
                    if (!f140280i && i14 != -1) {
                        throw new AssertionError();
                    }
                    a((d) dVar2);
                    b((d) dVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                dVar.f140303h = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                if (!f140280i && i12 != -1 && i12 != 1) {
                    throw new AssertionError();
                }
                dVar.f140303h = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            dVar = dVar.f140296a;
        }
    }

    public static final class d<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        d<K, V> f140296a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d<K, V> f140297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        d<K, V> f140298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        d<K, V> f140299d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        d<K, V> f140300e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final K f140301f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        V f140302g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f140303h;

        public d() {
            this.f140301f = null;
            this.f140300e = this;
            this.f140299d = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k10 = this.f140301f;
                if (k10 != null ? k10.equals(entry.getKey()) : entry.getKey() == null) {
                    V v10 = this.f140302g;
                    if (v10 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v10.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f140301f;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f140302g;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k10 = this.f140301f;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f140302g;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v10) {
            V v11 = this.f140302g;
            this.f140302g = v10;
            return v11;
        }

        public final String toString() {
            return this.f140301f + "=" + this.f140302g;
        }

        public d(d<K, V> dVar, K k10, d<K, V> dVar2, d<K, V> dVar3) {
            this.f140296a = dVar;
            this.f140301f = k10;
            this.f140303h = 1;
            this.f140299d = dVar2;
            this.f140300e = dVar3;
            dVar3.f140299d = this;
            dVar2.f140300e = this;
        }
    }

    public final d<K, V> a(Map.Entry<?, ?> entry) {
        d<K, V> dVarB = b(entry.getKey());
        if (dVarB == null) {
            return null;
        }
        V v10 = dVarB.f140302g;
        Object value = entry.getValue();
        if (v10 == value || (v10 != null && v10.equals(value))) {
            return dVarB;
        }
        return null;
    }

    public final void a(d<K, V> dVar, boolean z10) {
        int i10;
        if (z10) {
            d<K, V> dVar2 = dVar.f140300e;
            dVar2.f140299d = dVar.f140299d;
            dVar.f140299d.f140300e = dVar2;
        }
        d<K, V> dVar3 = dVar.f140297b;
        d<K, V> dVar4 = dVar.f140298c;
        d<K, V> dVar5 = dVar.f140296a;
        int i11 = 0;
        if (dVar3 != null && dVar4 != null) {
            if (dVar3.f140303h > dVar4.f140303h) {
                d<K, V> dVar6 = dVar3.f140298c;
                while (true) {
                    d<K, V> dVar7 = dVar6;
                    dVar4 = dVar3;
                    dVar3 = dVar7;
                    if (dVar3 == null) {
                        break;
                    } else {
                        dVar6 = dVar3.f140298c;
                    }
                }
            } else {
                while (true) {
                    d<K, V> dVar8 = dVar4.f140297b;
                    if (dVar8 == null) {
                        break;
                    } else {
                        dVar4 = dVar8;
                    }
                }
            }
            a((d) dVar4, false);
            d<K, V> dVar9 = dVar.f140297b;
            if (dVar9 != null) {
                i10 = dVar9.f140303h;
                dVar4.f140297b = dVar9;
                dVar9.f140296a = dVar4;
                dVar.f140297b = null;
            } else {
                i10 = 0;
            }
            d<K, V> dVar10 = dVar.f140298c;
            if (dVar10 != null) {
                i11 = dVar10.f140303h;
                dVar4.f140298c = dVar10;
                dVar10.f140296a = dVar4;
                dVar.f140298c = null;
            }
            dVar4.f140303h = Math.max(i10, i11) + 1;
            a(dVar, dVar4);
            return;
        }
        if (dVar3 != null) {
            a(dVar, dVar3);
            dVar.f140297b = null;
        } else if (dVar4 != null) {
            a(dVar, dVar4);
            dVar.f140298c = null;
        } else {
            a(dVar, (d) null);
        }
        b(dVar5, false);
        this.f140281a--;
        this.f140282b++;
    }

    private void b(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.f140297b;
        d<K, V> dVar3 = dVar.f140298c;
        d<K, V> dVar4 = dVar2.f140297b;
        d<K, V> dVar5 = dVar2.f140298c;
        dVar.f140297b = dVar5;
        if (dVar5 != null) {
            dVar5.f140296a = dVar;
        }
        a(dVar, dVar2);
        dVar2.f140298c = dVar;
        dVar.f140296a = dVar2;
        int iMax = Math.max(dVar3 != null ? dVar3.f140303h : 0, dVar5 != null ? dVar5.f140303h : 0) + 1;
        dVar.f140303h = iMax;
        dVar2.f140303h = Math.max(iMax, dVar4 != null ? dVar4.f140303h : 0) + 1;
    }

    public final d<K, V> a(Object obj) {
        d<K, V> dVarB = b(obj);
        if (dVarB != null) {
            a((d) dVarB, true);
        }
        return dVarB;
    }

    private void a(d<K, V> dVar, d<K, V> dVar2) {
        d<K, V> dVar3 = dVar.f140296a;
        dVar.f140296a = null;
        if (dVar2 != null) {
            dVar2.f140296a = dVar3;
        }
        if (dVar3 != null) {
            if (dVar3.f140297b == dVar) {
                dVar3.f140297b = dVar2;
                return;
            } else {
                if (!f140280i && dVar3.f140298c != dVar) {
                    throw new AssertionError();
                }
                dVar3.f140298c = dVar2;
                return;
            }
        }
        this.f140285f = dVar2;
    }

    private void a(d<K, V> dVar) {
        d<K, V> dVar2 = dVar.f140297b;
        d<K, V> dVar3 = dVar.f140298c;
        d<K, V> dVar4 = dVar3.f140297b;
        d<K, V> dVar5 = dVar3.f140298c;
        dVar.f140298c = dVar4;
        if (dVar4 != null) {
            dVar4.f140296a = dVar;
        }
        a(dVar, dVar3);
        dVar3.f140297b = dVar;
        dVar.f140296a = dVar3;
        int iMax = Math.max(dVar2 != null ? dVar2.f140303h : 0, dVar4 != null ? dVar4.f140303h : 0) + 1;
        dVar.f140303h = iMax;
        dVar3.f140303h = Math.max(iMax, dVar5 != null ? dVar5.f140303h : 0) + 1;
    }
}
