package io.reactivex.rxjava3.internal.util;

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
    public final ArrayList<T> f211936a;

    public VolatileSizeArrayList() {
        this.f211936a = new ArrayList<>();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T e10) {
        boolean zAdd = this.f211936a.add(e10);
        lazySet(this.f211936a.size());
        return zAdd;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@yc.e Collection<? extends T> c10) {
        boolean zAddAll = this.f211936a.addAll(c10);
        lazySet(this.f211936a.size());
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f211936a.clear();
        lazySet(0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object o10) {
        return this.f211936a.contains(o10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@yc.e Collection<?> c10) {
        return this.f211936a.containsAll(c10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return obj instanceof VolatileSizeArrayList ? this.f211936a.equals(((VolatileSizeArrayList) obj).f211936a) : this.f211936a.equals(obj);
    }

    @Override // java.util.List
    public T get(int index) {
        return this.f211936a.get(index);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f211936a.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object o10) {
        return this.f211936a.indexOf(o10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return get() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return this.f211936a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object o10) {
        return this.f211936a.lastIndexOf(o10);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return this.f211936a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object o10) {
        boolean zRemove = this.f211936a.remove(o10);
        lazySet(this.f211936a.size());
        return zRemove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@yc.e Collection<?> c10) {
        boolean zRemoveAll = this.f211936a.removeAll(c10);
        lazySet(this.f211936a.size());
        return zRemoveAll;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@yc.e Collection<?> c10) {
        boolean zRetainAll = this.f211936a.retainAll(c10);
        lazySet(this.f211936a.size());
        return zRetainAll;
    }

    @Override // java.util.List
    public T set(int index, T element) {
        return this.f211936a.set(index, element);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return get();
    }

    @Override // java.util.List
    public List<T> subList(int fromIndex, int toIndex) {
        return this.f211936a.subList(fromIndex, toIndex);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f211936a.toArray();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public String toString() {
        return this.f211936a.toString();
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int index) {
        return this.f211936a.listIterator(index);
    }

    @Override // java.util.List, java.util.Collection
    public <E> E[] toArray(@yc.e E[] eArr) {
        return (E[]) this.f211936a.toArray(eArr);
    }

    public VolatileSizeArrayList(int initialCapacity) {
        this.f211936a = new ArrayList<>(initialCapacity);
    }

    @Override // java.util.List
    public void add(int index, T element) {
        this.f211936a.add(index, element);
        lazySet(this.f211936a.size());
    }

    @Override // java.util.List
    public boolean addAll(int index, @yc.e Collection<? extends T> c10) {
        boolean zAddAll = this.f211936a.addAll(index, c10);
        lazySet(this.f211936a.size());
        return zAddAll;
    }

    @Override // java.util.List
    public T remove(int index) {
        T tRemove = this.f211936a.remove(index);
        lazySet(this.f211936a.size());
        return tRemove;
    }
}
