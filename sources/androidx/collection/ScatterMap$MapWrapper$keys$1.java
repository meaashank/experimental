package androidx.collection;

import fd.InterfaceC4418a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.C4968u;
import kotlin.sequences.C5004q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [K] */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$keys$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1980:1\n1726#2,3:1981\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMap$MapWrapper$keys$1\n*L\n733#1:1981,3\n*E\n"})
public final class ScatterMap$MapWrapper$keys$1<K> implements Set<K>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScatterMap<K, V> f86854a;

    public ScatterMap$MapWrapper$keys$1(ScatterMap<K, V> scatterMap) {
        this.f86854a = scatterMap;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(K k10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends K> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f86854a.g((K) obj);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        Collection<? extends Object> collection = elements;
        ScatterMap<K, V> scatterMap = this.f86854a;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!scatterMap.g((K) it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.f86854a.f86841e;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f86854a.x();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<K> iterator() {
        return C5004q.a(new ScatterMap$MapWrapper$keys$1$iterator$1(this.f86854a, null));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f86854a.f86841e;
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return C4968u.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.G.p(array, "array");
        return (T[]) C4968u.b(this, array);
    }
}
