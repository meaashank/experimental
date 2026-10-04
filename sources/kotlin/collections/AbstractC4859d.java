package kotlin.collections;

import androidx.collection.C1545m0;
import androidx.compose.foundation.text.C1758e;
import fd.InterfaceC4418a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.InterfaceC4887e0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.collections.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.1")
@kotlin.jvm.internal.V({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,181:1\n363#2,7:182\n391#2,7:189\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:182,7\n29#1:189,7\n*E\n"})
public abstract class AbstractC4859d<E> extends AbstractC4855b<E> implements List<E>, InterfaceC4418a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f217603a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f217604b = 2147483639;

    /* JADX INFO: renamed from: kotlin.collections.d$a */
    public static final class a {
        public a() {
        }

        public final void a(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                StringBuilder sbA = C1545m0.a("startIndex: ", i10, ", endIndex: ", i11, ", size: ");
                sbA.append(i12);
                throw new IndexOutOfBoundsException(sbA.toString());
            }
            if (i10 > i11) {
                throw new IllegalArgumentException(C1758e.a("startIndex: ", i10, " > endIndex: ", i11));
            }
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException(C1758e.a("index: ", i10, ", size: ", i11));
            }
        }

        public final void c(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException(C1758e.a("index: ", i10, ", size: ", i11));
            }
        }

        public final void d(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                StringBuilder sbA = C1545m0.a("fromIndex: ", i10, ", toIndex: ", i11, ", size: ");
                sbA.append(i12);
                throw new IndexOutOfBoundsException(sbA.toString());
            }
            if (i10 > i11) {
                throw new IllegalArgumentException(C1758e.a("fromIndex: ", i10, " > toIndex: ", i11));
            }
        }

        public final int e(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - AbstractC4859d.f217604b <= 0) {
                return i12;
            }
            if (i11 > 2147483639) {
                return Integer.MAX_VALUE;
            }
            return AbstractC4859d.f217604b;
        }

        public final boolean f(@NotNull Collection<?> c10, @NotNull Collection<?> other) {
            kotlin.jvm.internal.G.p(c10, "c");
            kotlin.jvm.internal.G.p(other, "other");
            if (c10.size() != other.size()) {
                return false;
            }
            Iterator<?> it = other.iterator();
            Iterator<?> it2 = c10.iterator();
            while (it2.hasNext()) {
                if (!kotlin.jvm.internal.G.g(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int g(@NotNull Collection<?> c10) {
            kotlin.jvm.internal.G.p(c10, "c");
            Iterator<?> it = c10.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        public a(C4969v c4969v) {
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.d$b */
    public class b implements Iterator<E>, InterfaceC4418a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f217605a;

        public b() {
        }

        public final int b() {
            return this.f217605a;
        }

        public final void d(int i10) {
            this.f217605a = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f217605a < AbstractC4859d.this.getSize();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC4859d<E> abstractC4859d = AbstractC4859d.this;
            int i10 = this.f217605a;
            this.f217605a = i10 + 1;
            return abstractC4859d.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.d$c */
    public class c extends AbstractC4859d<E>.b implements ListIterator<E>, InterfaceC4418a {
        public c(int i10) {
            super();
            AbstractC4859d.f217603a.c(i10, AbstractC4859d.this.getSize());
            this.f217605a = i10;
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f217605a > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f217605a;
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC4859d<E> abstractC4859d = AbstractC4859d.this;
            int i10 = this.f217605a - 1;
            this.f217605a = i10;
            return abstractC4859d.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f217605a - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: kotlin.collections.d$d, reason: collision with other inner class name */
    public static final class C0822d<E> extends AbstractC4859d<E> implements RandomAccess {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final AbstractC4859d<E> f217608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f217609d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f217610e;

        /* JADX WARN: Multi-variable type inference failed */
        public C0822d(@NotNull AbstractC4859d<? extends E> list, int i10, int i11) {
            kotlin.jvm.internal.G.p(list, "list");
            this.f217608c = list;
            this.f217609d = i10;
            AbstractC4859d.f217603a.d(i10, i11, list.getSize());
            this.f217610e = i11 - i10;
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List
        public E get(int i10) {
            AbstractC4859d.f217603a.b(i10, this.f217610e);
            return this.f217608c.get(this.f217609d + i10);
        }

        @Override // kotlin.collections.AbstractC4859d, kotlin.collections.AbstractC4855b
        public int getSize() {
            return this.f217610e;
        }

        @Override // kotlin.collections.AbstractC4859d, java.util.List, H.c
        @NotNull
        public List<E> subList(int i10, int i11) {
            AbstractC4859d.f217603a.d(i10, i11, this.f217610e);
            AbstractC4859d<E> abstractC4859d = this.f217608c;
            int i12 = this.f217609d;
            return new C0822d(abstractC4859d, i10 + i12, i12 + i11);
        }
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f217603a.f(this, (Collection) obj);
        }
        return false;
    }

    public abstract E get(int i10);

    @Override // kotlin.collections.AbstractC4855b
    public abstract int getSize();

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f217603a.g(this);
    }

    public int indexOf(Object obj) {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (kotlin.jvm.internal.G.g(it.next(), obj)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractC4855b, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (kotlin.jvm.internal.G.g(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @NotNull
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public List<E> subList(int i10, int i11) {
        return new C0822d(this, i10, i11);
    }

    @NotNull
    public ListIterator<E> listIterator(int i10) {
        return new c(i10);
    }
}
