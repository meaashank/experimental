package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.FieldSet;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class J0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<J0<K, V>.e> f112638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<K, V> f112639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f112640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile J0<K, V>.g f112641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<K, V> f112642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile J0<K, V>.c f112643g;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    public static class a<FieldDescriptorType> extends J0<FieldDescriptorType, Object> {
        public a(int i10) {
            super(i10);
        }

        @Override // androidx.datastore.preferences.protobuf.J0, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((FieldSet.b) obj, obj2);
        }

        @Override // androidx.datastore.preferences.protobuf.J0
        public void v() {
            if (!this.f112640d) {
                for (int i10 = 0; i10 < this.f112638b.size(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> entryM = m(i10);
                    if (((FieldSet.b) entryM.getKey()).m3()) {
                        entryM.setValue(Collections.unmodifiableList((List) entryM.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : q()) {
                    if (((FieldSet.b) entry.getKey()).m3()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.v();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Iterator<Object> f112648a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Iterable<Object> f112649b = new b();

        public static class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f112648a;
            }
        }

        public static <T> Iterable<T> b() {
            return (Iterable<T>) f112649b;
        }
    }

    public class e implements Map.Entry<K, V>, Comparable<J0<K, V>.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f112650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public V f112651b;

        public e(J0 j02, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(J0<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        public final boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f112650a;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b(this.f112650a, entry.getKey()) && b(this.f112651b, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f112651b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f112650a;
            int iHashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f112651b;
            return iHashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            J0.this.i();
            V v11 = this.f112651b;
            this.f112651b = v10;
            return v11;
        }

        public String toString() {
            return this.f112650a + "=" + this.f112651b;
        }

        public e(K k10, V v10) {
            this.f112650a = k10;
            this.f112651b = v10;
        }
    }

    public class g extends AbstractSet<Map.Entry<K, V>> {
        public g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            J0.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            J0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = J0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            J0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return J0.this.size();
        }

        public /* synthetic */ g(J0 j02, a aVar) {
            this();
        }
    }

    public /* synthetic */ J0(int i10, a aVar) {
        this(i10);
    }

    public static <FieldDescriptorType extends FieldSet.b<FieldDescriptorType>> J0<FieldDescriptorType, Object> w(int i10) {
        return new a(i10);
    }

    public static <K extends Comparable<K>, V> J0<K, V> x(int i10) {
        return new J0<>(i10);
    }

    public final V A(int i10) {
        i();
        V value = this.f112638b.remove(i10).getValue();
        if (!this.f112639c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = t().entrySet().iterator();
            this.f112638b.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        i();
        if (!this.f112638b.isEmpty()) {
            this.f112638b.clear();
        }
        if (this.f112639c.isEmpty()) {
            return;
        }
        this.f112639c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return h(comparable) >= 0 || this.f112639c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f112641e == null) {
            this.f112641e = new g();
        }
        return this.f112641e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J0)) {
            return super.equals(obj);
        }
        J0 j02 = (J0) obj;
        int size = size();
        if (size == j02.size()) {
            int iO = o();
            if (iO != j02.o()) {
                return entrySet().equals(j02.entrySet());
            }
            for (int i10 = 0; i10 < iO; i10++) {
                if (m(i10).equals(j02.m(i10))) {
                }
            }
            if (iO != size) {
                return this.f112639c.equals(j02.f112639c);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iH = h(comparable);
        return iH >= 0 ? this.f112638b.get(iH).getValue() : this.f112639c.get(comparable);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(K r5) {
        /*
            r4 = this;
            java.util.List<androidx.datastore.preferences.protobuf.J0<K, V>$e> r0 = r4.f112638b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List<androidx.datastore.preferences.protobuf.J0<K, V>$e> r2 = r4.f112638b
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.J0$e r2 = (androidx.datastore.preferences.protobuf.J0.e) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<androidx.datastore.preferences.protobuf.J0<K, V>$e> r3 = r4.f112638b
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.J0$e r3 = (androidx.datastore.preferences.protobuf.J0.e) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.J0.h(java.lang.Comparable):int");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iO = o();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iO; i10++) {
            iHashCode += this.f112638b.get(i10).hashCode();
        }
        return p() > 0 ? this.f112639c.hashCode() + iHashCode : iHashCode;
    }

    public final void i() {
        if (this.f112640d) {
            throw new UnsupportedOperationException();
        }
    }

    public Set<Map.Entry<K, V>> j() {
        if (this.f112643g == null) {
            this.f112643g = new c();
        }
        return this.f112643g;
    }

    public final void l() {
        i();
        if (!this.f112638b.isEmpty() || (this.f112638b instanceof ArrayList)) {
            return;
        }
        this.f112638b = new ArrayList(this.f112637a);
    }

    public Map.Entry<K, V> m(int i10) {
        return this.f112638b.get(i10);
    }

    public int o() {
        return this.f112638b.size();
    }

    public int p() {
        return this.f112639c.size();
    }

    public Iterable<Map.Entry<K, V>> q() {
        return this.f112639c.isEmpty() ? (Iterable<Map.Entry<K, V>>) d.f112649b : this.f112639c.entrySet();
    }

    public Iterable<Map.Entry<K, V>> r() {
        return this.f112642f.isEmpty() ? (Iterable<Map.Entry<K, V>>) d.f112649b : this.f112642f.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int iH = h(comparable);
        if (iH >= 0) {
            return A(iH);
        }
        if (this.f112639c.isEmpty()) {
            return null;
        }
        return this.f112639c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f112639c.size() + this.f112638b.size();
    }

    public final SortedMap<K, V> t() {
        i();
        if (this.f112639c.isEmpty() && !(this.f112639c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f112639c = treeMap;
            this.f112642f = treeMap.descendingMap();
        }
        return (SortedMap) this.f112639c;
    }

    public boolean u() {
        return this.f112640d;
    }

    public void v() {
        if (this.f112640d) {
            return;
        }
        this.f112639c = this.f112639c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f112639c);
        this.f112642f = this.f112642f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f112642f);
        this.f112640d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        i();
        int iH = h(k10);
        if (iH >= 0) {
            return this.f112638b.get(iH).setValue(v10);
        }
        l();
        int i10 = -(iH + 1);
        if (i10 >= this.f112637a) {
            return t().put(k10, v10);
        }
        int size = this.f112638b.size();
        int i11 = this.f112637a;
        if (size == i11) {
            J0<K, V>.e eVarRemove = this.f112638b.remove(i11 - 1);
            t().put(eVarRemove.getKey(), eVarRemove.getValue());
        }
        this.f112638b.add(i10, new e(k10, v10));
        return null;
    }

    public class b implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f112644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f112645b;

        public b() {
            this.f112644a = J0.this.f112638b.size();
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f112645b == null) {
                this.f112645b = J0.this.f112642f.entrySet().iterator();
            }
            return this.f112645b;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (a().hasNext()) {
                return a().next();
            }
            List list = J0.this.f112638b;
            int i10 = this.f112644a - 1;
            this.f112644a = i10;
            return (Map.Entry) list.get(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f112644a;
            return (i10 > 0 && i10 <= J0.this.f112638b.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(J0 j02, a aVar) {
            this();
        }
    }

    public class c extends J0<K, V>.g {
        public c() {
            super();
        }

        @Override // androidx.datastore.preferences.protobuf.J0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b();
        }

        public /* synthetic */ c(J0 j02, a aVar) {
            this();
        }
    }

    public class f implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f112653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f112654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f112655c;

        public f() {
            this.f112653a = -1;
        }

        public final Iterator<Map.Entry<K, V>> a() {
            if (this.f112655c == null) {
                this.f112655c = J0.this.f112639c.entrySet().iterator();
            }
            return this.f112655c;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f112654b = true;
            int i10 = this.f112653a + 1;
            this.f112653a = i10;
            return i10 < J0.this.f112638b.size() ? J0.this.f112638b.get(this.f112653a) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f112653a + 1 < J0.this.f112638b.size() || (!J0.this.f112639c.isEmpty() && a().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f112654b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f112654b = false;
            J0.this.i();
            if (this.f112653a >= J0.this.f112638b.size()) {
                a().remove();
                return;
            }
            J0 j02 = J0.this;
            int i10 = this.f112653a;
            this.f112653a = i10 - 1;
            j02.A(i10);
        }

        public /* synthetic */ f(J0 j02, a aVar) {
            this();
        }
    }

    public J0(int i10) {
        this.f112637a = i10;
        this.f112638b = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f112639c = map;
        this.f112642f = map;
    }
}
