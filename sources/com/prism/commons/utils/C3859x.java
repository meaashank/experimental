package com.prism.commons.utils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.prism.commons.utils.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C3859x<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<K, K<V>> f162164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public K<V> f162165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f162166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f162167d;

    public C3859x(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("FixedLruCache: capacity must > 0");
        }
        this.f162164a = new HashMap<>(i10);
        K k10 = (K<V>) new K(null);
        this.f162165b = k10;
        k10.f162039b = k10;
        k10.f162040c = k10;
        this.f162166c = 0;
        this.f162167d = i10;
    }

    public final void a(K k10, V v10) {
        K<V> k11 = new K<>(v10);
        k11.b(this.f162165b);
        this.f162164a.put(k10, k11);
        this.f162166c++;
    }

    public final V b(K<V> k10) {
        k10.d();
        this.f162166c--;
        return k10.f162038a;
    }

    public V c(K k10) {
        K<V> k11 = this.f162164a.get(k10);
        if (k11 != null) {
            return k11.f162038a;
        }
        return null;
    }

    public V d(K k10, V v10) {
        K<V> kRemove = this.f162164a.remove(k10);
        if (kRemove == null && this.f162166c == this.f162167d) {
            kRemove = this.f162165b.f162039b;
        }
        if (kRemove != null) {
            return g(kRemove, k10, v10);
        }
        a(k10, v10);
        return null;
    }

    public V e(K k10) {
        K<V> kRemove = this.f162164a.remove(k10);
        if (kRemove != null) {
            return b(kRemove);
        }
        return null;
    }

    public int f() {
        return this.f162166c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V g(K<V> k10, K k11, V v10) {
        V v11 = k10.f162038a;
        k10.f162038a = v10;
        k10.d();
        k10.b(this.f162165b);
        this.f162164a.put(k11, k10);
        return v11;
    }

    public Collection<V> h() {
        LinkedList linkedList = new LinkedList();
        Iterator<K<V>> it = this.f162164a.values().iterator();
        while (it.hasNext()) {
            V v10 = it.next().f162038a;
            if (v10 != null) {
                linkedList.add(v10);
            }
        }
        return linkedList;
    }
}
