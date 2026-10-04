package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import fd.InterfaceC4418a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.C4968u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.L
@androidx.compose.runtime.internal.r(parameters = 0)
public final class B implements List<a>, InterfaceC4418a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f91534b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<a> f91535a;

    @androidx.compose.foundation.L
    public interface a {
        int getIndex();

        @Nullable
        Object getKey();
    }

    public B(List<a> list) {
        this.f91535a = list;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends a> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void b(int i10, a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f91535a.contains((a) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        return this.f91535a.containsAll(collection);
    }

    public boolean g(a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int getSize() {
        return this.f91535a.size();
    }

    public boolean h(@NotNull a aVar) {
        return this.f91535a.contains(aVar);
    }

    @Override // java.util.List
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a get(int i10) {
        return this.f91535a.get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof a)) {
            return -1;
        }
        return this.f91535a.indexOf((a) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f91535a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<a> iterator() {
        return this.f91535a.iterator();
    }

    public int j(@NotNull a aVar) {
        return this.f91535a.indexOf(aVar);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof a)) {
            return -1;
        }
        return this.f91535a.lastIndexOf((a) obj);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<a> listIterator() {
        return this.f91535a.listIterator();
    }

    public int o(@NotNull a aVar) {
        return this.f91535a.lastIndexOf(aVar);
    }

    public final void q(@NotNull a aVar) {
        this.f91535a.add(aVar);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ a remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<a> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ a set(int i10, a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f91535a.size();
    }

    @Override // java.util.List
    public void sort(Comparator<? super a> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<a> subList(int i10, int i11) {
        return this.f91535a.subList(i10, i11);
    }

    public final void t(@NotNull a aVar) {
        this.f91535a.remove(aVar);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return C4968u.a(this);
    }

    public a v(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public a w(int i10, a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends a> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<a> listIterator(int i10) {
        return this.f91535a.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C4968u.b(this, tArr);
    }

    public B() {
        this(new SnapshotStateList());
    }
}
