package h6;

import androidx.recyclerview.widget.E;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: h6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C4496b<K, V> implements Iterable<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E<V> f202432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<K, Set<V>> f202433b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC4495a<V, K> f202434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Comparator<V> f202435d;

    /* JADX INFO: renamed from: h6.b$b, reason: collision with other inner class name */
    public class C0743b implements Iterator<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f202438a;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f202438a < C4496b.this.f202432a.C();
        }

        @Override // java.util.Iterator
        public V next() {
            E<V> e10 = C4496b.this.f202432a;
            int i10 = this.f202438a;
            this.f202438a = i10 + 1;
            return e10.n(i10);
        }

        public C0743b() {
            this.f202438a = 0;
        }
    }

    public C4496b(InterfaceC4495a<V, K> interfaceC4495a, Comparator<V> comparator, Class<V> cls) {
        this.f202435d = comparator;
        this.f202434c = interfaceC4495a;
        this.f202432a = new E<>(cls, new a(comparator));
    }

    public int c(V v10) {
        h(v10);
        return this.f202432a.a(v10);
    }

    public void g(Collection<V> collection) {
        Iterator<V> it = collection.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void h(V v10) {
        K kA = this.f202434c.a(v10);
        Set<V> hashSet = this.f202433b.get(kA);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f202433b.put(kA, hashSet);
        }
        hashSet.add(v10);
    }

    public final void i(V v10) {
        K kA = this.f202434c.a(v10);
        Set<V> set = this.f202433b.get(kA);
        if (set == null) {
            return;
        }
        set.remove(v10);
        if (set.isEmpty()) {
            this.f202433b.remove(kA);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<V> iterator() {
        return new C0743b();
    }

    public Set<V> j(K k10) {
        return this.f202433b.get(k10);
    }

    public V k(int i10) {
        return this.f202432a.n(i10);
    }

    public ArrayList<V> n() {
        ArrayList<V> arrayList = new ArrayList<>(this.f202432a.C());
        for (int i10 = 0; i10 < this.f202432a.C(); i10++) {
            arrayList.add(this.f202432a.n(i10));
        }
        return arrayList;
    }

    public int o(V v10) {
        return this.f202432a.o(v10);
    }

    public void q(K k10) {
        Set<V> setRemove = this.f202433b.remove(k10);
        if (setRemove != null) {
            Iterator<V> it = setRemove.iterator();
            while (it.hasNext()) {
                this.f202432a.s(it.next());
            }
        }
    }

    public boolean remove(V v10) {
        i(v10);
        return this.f202432a.s(v10);
    }

    public V s(int i10) {
        i(this.f202432a.n(i10));
        return this.f202432a.u(i10);
    }

    public int size() {
        return this.f202432a.C();
    }

    /* JADX INFO: renamed from: h6.b$a */
    public class a extends E.b<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f202436a;

        public a(Comparator comparator) {
            this.f202436a = comparator;
        }

        @Override // androidx.recyclerview.widget.E.b, java.util.Comparator
        public int compare(V v10, V v11) {
            return this.f202436a.compare(v10, v11);
        }

        @Override // androidx.recyclerview.widget.E.b
        public boolean e(V v10, V v11) {
            return v10 == v11;
        }

        @Override // androidx.recyclerview.widget.E.b
        public boolean f(V v10, V v11) {
            return v10 == v11;
        }

        @Override // androidx.recyclerview.widget.t
        public void b(int i10, int i11) {
        }

        @Override // androidx.recyclerview.widget.t
        public void c(int i10, int i11) {
        }

        @Override // androidx.recyclerview.widget.t
        public void d(int i10, int i11) {
        }

        @Override // androidx.recyclerview.widget.E.b
        public void h(int i10, int i11) {
        }
    }
}
