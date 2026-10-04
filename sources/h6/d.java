package h6;

import androidx.recyclerview.widget.E;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class d<K, V> implements Iterable<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public E<V> f202440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<K, V> f202441b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC4495a<V, K> f202442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Comparator<V> f202443d;

    public class b implements Iterator<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f202446a;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f202446a < d.this.f202440a.C();
        }

        @Override // java.util.Iterator
        public V next() {
            E<V> e10 = d.this.f202440a;
            int i10 = this.f202446a;
            this.f202446a = i10 + 1;
            return e10.n(i10);
        }

        public b() {
            this.f202446a = 0;
        }
    }

    public d(InterfaceC4495a<V, K> interfaceC4495a, Comparator<V> comparator, Class<V> cls) {
        this.f202442c = interfaceC4495a;
        this.f202443d = comparator;
        this.f202440a = new E<>(cls, new a(comparator));
    }

    public int c(V v10) {
        h(v10);
        return this.f202440a.a(v10);
    }

    public void g(Collection<V> collection) {
        Iterator<V> it = collection.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void h(V v10) {
        this.f202441b.put(this.f202442c.a(v10), v10);
    }

    public void i() {
        this.f202440a.i();
        this.f202441b.clear();
    }

    @Override // java.lang.Iterable
    public Iterator<V> iterator() {
        return new b();
    }

    public final void j(V v10) {
        this.f202441b.remove(this.f202442c.a(v10));
    }

    public V k(K k10) {
        return this.f202441b.get(k10);
    }

    public V n(int i10) {
        return this.f202440a.n(i10);
    }

    public ArrayList<V> o() {
        ArrayList<V> arrayList = new ArrayList<>(this.f202440a.C());
        for (int i10 = 0; i10 < this.f202440a.C(); i10++) {
            arrayList.add(this.f202440a.n(i10));
        }
        return arrayList;
    }

    public int q(K k10) {
        return this.f202440a.o(this.f202441b.get(k10));
    }

    public boolean remove(V v10) {
        j(v10);
        return this.f202440a.s(v10);
    }

    public int s(V v10) {
        return this.f202440a.o(v10);
    }

    public int size() {
        return this.f202440a.C();
    }

    public V t(int i10) {
        j(this.f202440a.n(i10));
        return this.f202440a.u(i10);
    }

    public class a extends E.b<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f202444a;

        public a(Comparator comparator) {
            this.f202444a = comparator;
        }

        @Override // androidx.recyclerview.widget.E.b, java.util.Comparator
        public int compare(V v10, V v11) {
            return this.f202444a.compare(v10, v11);
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
