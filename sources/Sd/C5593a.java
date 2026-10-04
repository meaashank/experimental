package sd;

import fd.InterfaceC4418a;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.C4968u;
import kotlin.jvm.internal.G;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rd.InterfaceC5550a;

/* JADX INFO: renamed from: sd.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C5593a<E> implements InterfaceC5550a<E>, Collection<E>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Collection<E> f238617a;

    /* JADX WARN: Multi-variable type inference failed */
    public C5593a(@NotNull Collection<? extends E> impl) {
        G.p(impl, "impl");
        this.f238617a = impl;
    }

    @Override // java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.f238617a.contains(obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        G.p(elements, "elements");
        return this.f238617a.containsAll(elements);
    }

    @Override // java.util.Collection
    public boolean equals(@Nullable Object obj) {
        return this.f238617a.equals(obj);
    }

    public int getSize() {
        return this.f238617a.size();
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f238617a.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f238617a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<E> iterator() {
        return this.f238617a.iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C4968u.a(this);
    }

    @NotNull
    public String toString() {
        return this.f238617a.toString();
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        G.p(array, "array");
        return (T[]) C4968u.b(this, array);
    }
}
