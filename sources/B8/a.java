package B8;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class a<K, V> extends f<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e<K, V> f17392l;

    /* JADX INFO: renamed from: B8.a$a, reason: collision with other inner class name */
    public class C0012a extends e<K, V> {
        public C0012a() {
        }

        @Override // B8.e
        public void a() {
            a.this.clear();
        }

        @Override // B8.e
        public Object b(int i10, int i11) {
            return a.this.f17437b[(i10 << 1) + i11];
        }

        @Override // B8.e
        public Map<K, V> c() {
            return a.this;
        }

        @Override // B8.e
        public int d() {
            return a.this.f17438c;
        }

        @Override // B8.e
        public int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // B8.e
        public int f(Object obj) {
            return a.this.i(obj);
        }

        @Override // B8.e
        public void g(K k10, V v10) {
            a.this.put(k10, v10);
        }

        @Override // B8.e
        public void h(int i10) {
            a.this.m(i10);
        }

        @Override // B8.e
        public V i(int i10, V v10) {
            return a.this.o(i10, v10);
        }
    }

    public a() {
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return r().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return r().m();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f17438c);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public boolean q(Collection<?> collection) {
        return e.j(this, collection);
    }

    public final e<K, V> r() {
        if (this.f17392l == null) {
            this.f17392l = new C0012a();
        }
        return this.f17392l;
    }

    public boolean t(Collection<?> collection) {
        return e.o(this, collection);
    }

    public boolean u(Collection<?> collection) {
        return e.p(this, collection);
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return r().n();
    }

    public a(int i10) {
        super(i10);
    }

    public a(f fVar) {
        super(fVar);
    }
}
