package androidx.compose.ui.text.font;

import androidx.compose.runtime.InterfaceC1924k0;
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
@InterfaceC1924k0
@kotlin.jvm.internal.V({"SMAP\nFontFamily.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamily.kt\nandroidx/compose/ui/text/font/FontListFontFamily\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n1#2:269\n*E\n"})
public final class D extends AbstractC2322t implements List<InterfaceC2324v>, InterfaceC4418a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f104477k = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final List<InterfaceC2324v> f104478j;

    /* JADX WARN: Multi-variable type inference failed */
    public D(@NotNull List<? extends InterfaceC2324v> list) {
        super(false);
        this.f104478j = list;
        if (list.isEmpty()) {
            throw new IllegalStateException("At least one font should be passed to FontFamily");
        }
    }

    public int A(@NotNull InterfaceC2324v interfaceC2324v) {
        return this.f104478j.indexOf(interfaceC2324v);
    }

    public int B(@NotNull InterfaceC2324v interfaceC2324v) {
        return this.f104478j.lastIndexOf(interfaceC2324v);
    }

    public InterfaceC2324v C(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public InterfaceC2324v D(int i10, InterfaceC2324v interfaceC2324v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i10, InterfaceC2324v interfaceC2324v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends InterfaceC2324v> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof InterfaceC2324v)) {
            return false;
        }
        return this.f104478j.contains((InterfaceC2324v) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NotNull Collection<? extends Object> collection) {
        return this.f104478j.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D) && kotlin.jvm.internal.G.g(this.f104478j, ((D) obj).f104478j);
    }

    public int getSize() {
        return this.f104478j.size();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f104478j.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof InterfaceC2324v)) {
            return -1;
        }
        return this.f104478j.indexOf((InterfaceC2324v) obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f104478j.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public Iterator<InterfaceC2324v> iterator() {
        return this.f104478j.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof InterfaceC2324v)) {
            return -1;
        }
        return this.f104478j.lastIndexOf((InterfaceC2324v) obj);
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<InterfaceC2324v> listIterator() {
        return this.f104478j.listIterator();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ InterfaceC2324v remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<InterfaceC2324v> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ InterfaceC2324v set(int i10, InterfaceC2324v interfaceC2324v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f104478j.size();
    }

    @Override // java.util.List
    public void sort(Comparator<? super InterfaceC2324v> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public List<InterfaceC2324v> subList(int i10, int i11) {
        return this.f104478j.subList(i10, i11);
    }

    public void t(int i10, InterfaceC2324v interfaceC2324v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return C4968u.a(this);
    }

    @NotNull
    public String toString() {
        return "FontListFontFamily(fonts=" + this.f104478j + ')';
    }

    public boolean v(InterfaceC2324v interfaceC2324v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean w(@NotNull InterfaceC2324v interfaceC2324v) {
        return this.f104478j.contains(interfaceC2324v);
    }

    @Override // java.util.List
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public InterfaceC2324v get(int i10) {
        return this.f104478j.get(i10);
    }

    @NotNull
    public final List<InterfaceC2324v> z() {
        return this.f104478j;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends InterfaceC2324v> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public ListIterator<InterfaceC2324v> listIterator(int i10) {
        return this.f104478j.listIterator(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) C4968u.b(this, tArr);
    }
}
