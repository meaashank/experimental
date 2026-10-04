package com.prism.gaia.server.am;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class j<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B8.g<B8.a<K, V>> f166911a = new B8.g<>();

    public static class a<K, V> implements Iterator<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j<K, V> f166912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f166913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f166914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public B8.a<K, V> f166915d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f166916e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f166917f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public K f166918g;

        public int a() {
            return this.f166913b;
        }

        public K b() {
            return this.f166918g;
        }

        public final void c() {
            int i10 = this.f166916e;
            if (i10 < 0) {
                int i11 = this.f166914c + 1;
                this.f166914c = i11;
                if (i11 < this.f166912a.f166911a.r()) {
                    this.f166913b = this.f166912a.f166911a.j(this.f166914c);
                    this.f166915d = this.f166912a.f166911a.s(this.f166914c);
                    this.f166916e = 0;
                    return;
                }
                return;
            }
            if (i10 < this.f166915d.size()) {
                int i12 = this.f166916e + 1;
                this.f166916e = i12;
                if (i12 == this.f166915d.size()) {
                    this.f166916e = -1;
                    c();
                }
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f166914c < this.f166912a.f166911a.r() && this.f166916e < this.f166915d.size();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!hasNext()) {
                return null;
            }
            this.f166917f = this.f166913b;
            this.f166918g = this.f166915d.j(this.f166916e);
            V vP = this.f166915d.p(this.f166916e);
            c();
            return vP;
        }

        @Override // java.util.Iterator
        public void remove() {
            K k10 = this.f166918g;
            if (k10 != null) {
                this.f166912a.e(k10, this.f166917f);
            }
            if (this.f166913b == this.f166917f) {
                this.f166916e--;
            }
        }

        public a(j<K, V> jVar) {
            this.f166912a = jVar;
            this.f166914c = -1;
            this.f166916e = -1;
            c();
        }
    }

    public V b(K k10, int i10) {
        B8.a<K, V> aVarF = this.f166911a.f(i10);
        if (aVarF == null) {
            return null;
        }
        return aVarF.get(k10);
    }

    public a<K, V> c() {
        return new a<>(this);
    }

    public void d(K k10, int i10, V v10) {
        B8.a<K, V> aVarF = this.f166911a.f(i10);
        if (aVarF == null) {
            aVarF = new B8.a<>();
            this.f166911a.k(i10, aVarF);
        }
        aVarF.put(k10, v10);
    }

    public V e(K k10, int i10) {
        B8.a<K, V> aVarF = this.f166911a.f(i10);
        if (aVarF == null) {
            return null;
        }
        V vRemove = aVarF.remove(k10);
        if (aVarF.size() == 0) {
            this.f166911a.l(i10);
        }
        return vRemove;
    }

    public int f() {
        int iR = this.f166911a.r();
        int size = 0;
        while (true) {
            int i10 = iR - 1;
            if (iR <= 0) {
                return size;
            }
            size += this.f166911a.s(i10).size();
            iR = i10;
        }
    }
}
