package io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class VolatileSizeArrayList<T> extends AtomicInteger implements List<T>, RandomAccess {
    private static final long serialVersionUID = 3972397474470203923L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<T> f207187a;

    public VolatileSizeArrayList() {
        this.f207187a = new ArrayList<>();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        boolean zAdd = this.f207187a.add(t10);
        lazySet(this.f207187a.size());
        return zAdd;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        boolean zAddAll = this.f207187a.addAll(collection);
        lazySet(this.f207187a.size());
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f207187a.clear();
        lazySet(0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f207187a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f207187a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return obj instanceof VolatileSizeArrayList ? this.f207187a.equals(((VolatileSizeArrayList) obj).f207187a) : this.f207187a.equals(obj);
    }

    @Override // java.util.List
    public T get(int i10) {
        return this.f207187a.get(i10);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f207187a.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f207187a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return get() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f207187a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f207187a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return this.f207187a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        boolean zRemove = this.f207187a.remove(obj);
        lazySet(this.f207187a.size());
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean zRemoveAll = this.f207187a.removeAll(collection);
        lazySet(this.f207187a.size());
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean zRetainAll = this.f207187a.retainAll(collection);
        lazySet(this.f207187a.size());
        return zRetainAll;
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        return this.f207187a.set(i10, t10);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return get();
    }

    @Override // java.util.List
    public List<T> subList(int i10, int i11) {
        return this.f207187a.subList(i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f207187a.toArray();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public String toString() {
        return this.f207187a.toString();
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i10) {
        return this.f207187a.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        return (E[]) this.f207187a.toArray(eArr);
    }

    public VolatileSizeArrayList(int i10) {
        this.f207187a = new ArrayList<>(i10);
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        this.f207187a.add(i10, t10);
        lazySet(this.f207187a.size());
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends T> collection) {
        boolean zAddAll = this.f207187a.addAll(i10, collection);
        lazySet(this.f207187a.size());
        return zAddAll;
    }

    @Override // java.util.List
    public T remove(int i10) {
        T tRemove = this.f207187a.remove(i10);
        lazySet(this.f207187a.size());
        return tRemove;
    }
}
