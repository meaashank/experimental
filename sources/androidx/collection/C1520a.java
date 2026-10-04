package androidx.collection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: androidx.collection.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1520a<K, V> extends U0<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public C1520a<K, V>.C0172a f86925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public C1520a<K, V>.c f86926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public C1520a<K, V>.e f86927f;

    /* JADX INFO: renamed from: androidx.collection.a$a, reason: collision with other inner class name */
    public final class C0172a extends AbstractSet<Map.Entry<K, V>> {
        public C0172a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NonNull
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C1520a.this.size();
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$b */
    public final class b extends C<K> {
        public b() {
            super(C1520a.this.size());
        }

        @Override // androidx.collection.C
        public K b(int i10) {
            return C1520a.this.i(i10);
        }

        @Override // androidx.collection.C
        public void d(int i10) {
            C1520a.this.l(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$d */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f86931a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f86932b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f86933c;

        public d() {
            this.f86931a = C1520a.this.size() - 1;
        }

        public Map.Entry<K, V> a() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f86932b++;
            this.f86933c = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f86933c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return kotlin.jvm.internal.G.g(entry.getKey(), C1520a.this.i(this.f86932b)) && kotlin.jvm.internal.G.g(entry.getValue(), C1520a.this.o(this.f86932b));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f86933c) {
                return C1520a.this.i(this.f86932b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f86933c) {
                return C1520a.this.o(this.f86932b);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f86932b < this.f86931a;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f86933c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            K kI = C1520a.this.i(this.f86932b);
            V vO = C1520a.this.o(this.f86932b);
            return (kI == null ? 0 : kI.hashCode()) ^ (vO != null ? vO.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            a();
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f86933c) {
                throw new IllegalStateException();
            }
            C1520a.this.l(this.f86932b);
            this.f86932b--;
            this.f86931a--;
            this.f86933c = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (this.f86933c) {
                return C1520a.this.m(this.f86932b, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$f */
    public final class f extends C<V> {
        public f() {
            super(C1520a.this.size());
        }

        @Override // androidx.collection.C
        public V b(int i10) {
            return C1520a.this.o(i10);
        }

        @Override // androidx.collection.C
        public void d(int i10) {
            C1520a.this.l(i10);
        }
    }

    public C1520a() {
    }

    public static <T> boolean q(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.U0, java.util.Map
    public boolean containsKey(@Nullable Object obj) {
        return super.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.U0, java.util.Map
    public boolean containsValue(@Nullable Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Set<Map.Entry<K, V>> entrySet() {
        C1520a<K, V>.C0172a c0172a = this.f86925d;
        if (c0172a != null) {
            return c0172a;
        }
        C1520a<K, V>.C0172a c0172a2 = new C0172a();
        this.f86925d = c0172a2;
        return c0172a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.U0, java.util.Map
    public V get(@Nullable Object obj) {
        return (V) super.get(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Set<K> keySet() {
        C1520a<K, V>.c cVar = this.f86926e;
        if (cVar != null) {
            return cVar;
        }
        C1520a<K, V>.c cVar2 = new c();
        this.f86926e = cVar2;
        return cVar2;
    }

    public boolean p(@NonNull Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public void putAll(@NonNull Map<? extends K, ? extends V> map) {
        b(map.size() + size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean r(@NonNull Collection<?> collection) {
        int size = size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.U0, java.util.Map
    public V remove(@Nullable Object obj) {
        return (V) super.remove(obj);
    }

    public boolean t(@NonNull Collection<?> collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(i(size2))) {
                l(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    @NonNull
    public Collection<V> values() {
        C1520a<K, V>.e eVar = this.f86927f;
        if (eVar != null) {
            return eVar;
        }
        C1520a<K, V>.e eVar2 = new e();
        this.f86927f = eVar2;
        return eVar2;
    }

    public C1520a(int i10) {
        super(i10);
    }

    public C1520a(@Nullable U0 u02) {
        super(u02);
    }

    /* JADX INFO: renamed from: androidx.collection.a$c */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(@NonNull Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C1520a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C1520a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(@NonNull Collection<?> collection) {
            return C1520a.this.p(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C1520a.q(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = C1520a.this.size() - 1; size >= 0; size--) {
                K kI = C1520a.this.i(size);
                iHashCode += kI == null ? 0 : kI.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C1520a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @NonNull
        public Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iF = C1520a.this.f(obj);
            if (iF < 0) {
                return false;
            }
            C1520a.this.l(iF);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(@NonNull Collection<?> collection) {
            return C1520a.this.r(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(@NonNull Collection<?> collection) {
            return C1520a.this.t(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C1520a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        @NonNull
        public <T> T[] toArray(@NonNull T[] tArr) {
            int size = C1520a.this.size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) C1522b.a(tArr, size));
            }
            for (int i10 = 0; i10 < size; i10++) {
                tArr[i10] = C1520a.this.i(i10);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        @Override // java.util.Set, java.util.Collection
        @NonNull
        public Object[] toArray() {
            int size = C1520a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C1520a.this.i(i10);
            }
            return objArr;
        }
    }

    /* JADX INFO: renamed from: androidx.collection.a$e */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(@NonNull Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C1520a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C1520a.this.a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C1520a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @NonNull
        public Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iA = C1520a.this.a(obj);
            if (iA < 0) {
                return false;
            }
            C1520a.this.l(iA);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(@NonNull Collection<?> collection) {
            int size = C1520a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (collection.contains(C1520a.this.o(i10))) {
                    C1520a.this.l(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(@NonNull Collection<?> collection) {
            int size = C1520a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (!collection.contains(C1520a.this.o(i10))) {
                    C1520a.this.l(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return C1520a.this.size();
        }

        @Override // java.util.Collection
        @NonNull
        public <T> T[] toArray(@NonNull T[] tArr) {
            int size = C1520a.this.size();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) C1522b.a(tArr, size));
            }
            for (int i10 = 0; i10 < size; i10++) {
                tArr[i10] = C1520a.this.o(i10);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        @Override // java.util.Collection
        @NonNull
        public Object[] toArray() {
            int size = C1520a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C1520a.this.o(i10);
            }
            return objArr;
        }
    }
}
