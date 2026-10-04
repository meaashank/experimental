package com.prism.gaia.helper.utils;

import java.util.AbstractSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class i<T> extends AbstractSet<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a<T> f165128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T[] f165129b;

    public static final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T[] f165130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f165131b;

        public a(T[] tArr) {
            this.f165130a = tArr;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f165131b != this.f165130a.length;
        }

        @Override // java.util.Iterator
        public T next() {
            T[] tArr = this.f165130a;
            int i10 = this.f165131b;
            this.f165131b = i10 + 1;
            return tArr[i10];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public i(T[] tArr) {
        this.f165129b = tArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<T> iterator() {
        a<T> aVar = this.f165128a;
        if (aVar != null) {
            aVar.f165131b = 0;
            return aVar;
        }
        a<T> aVar2 = new a<>(this.f165129b);
        this.f165128a = aVar2;
        return aVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f165129b.length;
    }
}
