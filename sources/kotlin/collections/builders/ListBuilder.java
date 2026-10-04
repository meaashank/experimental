package kotlin.collections.builders;

import fd.InterfaceC4422e;
import fd.InterfaceC4423f;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.C;
import kotlin.collections.AbstractC4859d;
import kotlin.collections.AbstractC4866h;
import kotlin.collections.C4875q;
import kotlin.collections.H;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@V({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,724:1\n1#2:725\n*E\n"})
public final class ListBuilder<E> extends AbstractC4866h<E> implements List<E>, RandomAccess, Serializable, InterfaceC4422e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f217542d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final ListBuilder f217543e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public E[] f217544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f217545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f217546c;

    public static final class BuilderSubList<E> extends AbstractC4866h<E> implements List<E>, RandomAccess, Serializable, InterfaceC4422e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public E[] f217547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f217548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f217549c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final BuilderSubList<E> f217550d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final ListBuilder<E> f217551e;

        @V({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$BuilderSubList$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,724:1\n1#2:725\n*E\n"})
        public static final class a<E> implements ListIterator<E>, InterfaceC4423f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final BuilderSubList<E> f217552a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f217553b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f217554c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f217555d;

            public a(@NotNull BuilderSubList<E> list, int i10) {
                G.p(list, "list");
                this.f217552a = list;
                this.f217553b = i10;
                this.f217554c = -1;
                this.f217555d = ((AbstractList) list).modCount;
            }

            private final void b() {
                if (((AbstractList) this.f217552a.f217551e).modCount != this.f217555d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator
            public void add(E e10) {
                b();
                BuilderSubList<E> builderSubList = this.f217552a;
                int i10 = this.f217553b;
                this.f217553b = i10 + 1;
                builderSubList.add(i10, e10);
                this.f217554c = -1;
                this.f217555d = ((AbstractList) this.f217552a).modCount;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.f217553b < this.f217552a.f217549c;
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.f217553b > 0;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public E next() {
                b();
                int i10 = this.f217553b;
                BuilderSubList<E> builderSubList = this.f217552a;
                if (i10 >= builderSubList.f217549c) {
                    throw new NoSuchElementException();
                }
                this.f217553b = i10 + 1;
                this.f217554c = i10;
                return builderSubList.f217547a[builderSubList.f217548b + i10];
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.f217553b;
            }

            @Override // java.util.ListIterator
            public E previous() {
                b();
                int i10 = this.f217553b;
                if (i10 <= 0) {
                    throw new NoSuchElementException();
                }
                int i11 = i10 - 1;
                this.f217553b = i11;
                this.f217554c = i11;
                BuilderSubList<E> builderSubList = this.f217552a;
                return builderSubList.f217547a[builderSubList.f217548b + i11];
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.f217553b - 1;
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                b();
                int i10 = this.f217554c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
                }
                this.f217552a.b(i10);
                this.f217553b = this.f217554c;
                this.f217554c = -1;
                this.f217555d = ((AbstractList) this.f217552a).modCount;
            }

            @Override // java.util.ListIterator
            public void set(E e10) {
                b();
                int i10 = this.f217554c;
                if (i10 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
                }
                this.f217552a.set(i10, e10);
            }
        }

        public BuilderSubList(@NotNull E[] backing, int i10, int i11, @Nullable BuilderSubList<E> builderSubList, @NotNull ListBuilder<E> root) {
            G.p(backing, "backing");
            G.p(root, "root");
            this.f217547a = backing;
            this.f217548b = i10;
            this.f217549c = i11;
            this.f217550d = builderSubList;
            this.f217551e = root;
            ((AbstractList) this).modCount = ((AbstractList) root).modCount;
        }

        private final void A() {
            ((AbstractList) this).modCount++;
        }

        private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final void v() {
            if (((AbstractList) this.f217551e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        private final Object writeReplace() throws NotSerializableException {
            if (this.f217551e.f217546c) {
                return new SerializedCollection(this, 0);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        public final E B(int i10) {
            A();
            BuilderSubList<E> builderSubList = this.f217550d;
            this.f217549c--;
            return builderSubList != null ? builderSubList.B(i10) : (E) this.f217551e.H(i10);
        }

        public final void C(int i10, int i11) {
            if (i11 > 0) {
                A();
            }
            BuilderSubList<E> builderSubList = this.f217550d;
            if (builderSubList != null) {
                builderSubList.C(i10, i11);
            } else {
                this.f217551e.I(i10, i11);
            }
            this.f217549c -= i11;
        }

        public final int D(int i10, int i11, Collection<? extends E> collection, boolean z10) {
            BuilderSubList<E> builderSubList = this.f217550d;
            int iD = builderSubList != null ? builderSubList.D(i10, i11, collection, z10) : this.f217551e.J(i10, i11, collection, z10);
            if (iD > 0) {
                A();
            }
            this.f217549c -= iD;
            return iD;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(E e10) {
            w();
            v();
            t(this.f217548b + this.f217549c, e10);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(@NotNull Collection<? extends E> elements) {
            G.p(elements, "elements");
            w();
            v();
            int size = elements.size();
            q(this.f217548b + this.f217549c, elements, size);
            return size > 0;
        }

        @Override // kotlin.collections.AbstractC4866h
        @C
        public E b(int i10) {
            w();
            v();
            AbstractC4859d.f217603a.b(i10, this.f217549c);
            return B(this.f217548b + i10);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            w();
            v();
            C(this.f217548b, this.f217549c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(@Nullable Object obj) {
            v();
            if (obj != this) {
                return (obj instanceof List) && x((List) obj);
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i10) {
            v();
            AbstractC4859d.f217603a.b(i10, this.f217549c);
            return this.f217547a[this.f217548b + i10];
        }

        @Override // kotlin.collections.AbstractC4866h
        public int getSize() {
            v();
            return this.f217549c;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            v();
            return kotlin.collections.builders.b.i(this.f217547a, this.f217548b, this.f217549c);
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            v();
            for (int i10 = 0; i10 < this.f217549c; i10++) {
                if (G.g(this.f217547a[this.f217548b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            v();
            return this.f217549c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        @NotNull
        public Iterator<E> iterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            v();
            for (int i10 = this.f217549c - 1; i10 >= 0; i10--) {
                if (G.g(this.f217547a[this.f217548b + i10], obj)) {
                    return i10;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public ListIterator<E> listIterator() {
            return listIterator(0);
        }

        public final void q(int i10, Collection<? extends E> collection, int i11) {
            A();
            BuilderSubList<E> builderSubList = this.f217550d;
            if (builderSubList != null) {
                builderSubList.q(i10, collection, i11);
            } else {
                this.f217551e.x(i10, collection, i11);
            }
            this.f217547a = (E[]) this.f217551e.f217544a;
            this.f217549c += i11;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            w();
            v();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                b(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(@NotNull Collection<?> elements) {
            G.p(elements, "elements");
            w();
            v();
            return D(this.f217548b, this.f217549c, elements, false) > 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(@NotNull Collection<?> elements) {
            G.p(elements, "elements");
            w();
            v();
            return D(this.f217548b, this.f217549c, elements, true) > 0;
        }

        @Override // kotlin.collections.AbstractC4866h, java.util.AbstractList, java.util.List
        public E set(int i10, E e10) {
            w();
            v();
            AbstractC4859d.f217603a.b(i10, this.f217549c);
            E[] eArr = this.f217547a;
            int i11 = this.f217548b;
            E e11 = eArr[i11 + i10];
            eArr[i11 + i10] = e10;
            return e11;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public List<E> subList(int i10, int i11) {
            AbstractC4859d.f217603a.d(i10, i11, this.f217549c);
            return new BuilderSubList(this.f217547a, this.f217548b + i10, i11 - i10, this, this.f217551e);
        }

        public final void t(int i10, E e10) {
            A();
            BuilderSubList<E> builderSubList = this.f217550d;
            if (builderSubList != null) {
                builderSubList.t(i10, e10);
            } else {
                this.f217551e.z(i10, e10);
            }
            this.f217547a = (E[]) this.f217551e.f217544a;
            this.f217549c++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public <T> T[] toArray(@NotNull T[] array) {
            G.p(array, "array");
            v();
            int length = array.length;
            int i10 = this.f217549c;
            if (length < i10) {
                E[] eArr = this.f217547a;
                int i11 = this.f217548b;
                T[] tArr = (T[]) Arrays.copyOfRange(eArr, i11, i10 + i11, array.getClass());
                G.o(tArr, "copyOfRange(...)");
                return tArr;
            }
            E[] eArr2 = this.f217547a;
            int i12 = this.f217548b;
            C4875q.B0(eArr2, array, 0, i12, i10 + i12);
            H.o(this.f217549c, array);
            return array;
        }

        @Override // java.util.AbstractCollection
        @NotNull
        public String toString() {
            v();
            return kotlin.collections.builders.b.j(this.f217547a, this.f217548b, this.f217549c, this);
        }

        public final void w() {
            if (this.f217551e.f217546c) {
                throw new UnsupportedOperationException();
            }
        }

        public final boolean x(List<?> list) {
            return kotlin.collections.builders.b.h(this.f217547a, this.f217548b, this.f217549c, list);
        }

        public final boolean z() {
            return this.f217551e.f217546c;
        }

        @Override // java.util.AbstractList, java.util.List
        @NotNull
        public ListIterator<E> listIterator(int i10) {
            v();
            AbstractC4859d.f217603a.c(i10, this.f217549c);
            return new a(this, i10);
        }

        @Override // kotlin.collections.AbstractC4866h, java.util.AbstractList, java.util.List
        public void add(int i10, E e10) {
            w();
            v();
            AbstractC4859d.f217603a.c(i10, this.f217549c);
            t(this.f217548b + i10, e10);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i10, @NotNull Collection<? extends E> elements) {
            G.p(elements, "elements");
            w();
            v();
            AbstractC4859d.f217603a.c(i10, this.f217549c);
            int size = elements.size();
            q(this.f217548b + i10, elements, size);
            return size > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        @NotNull
        public Object[] toArray() {
            v();
            E[] eArr = this.f217547a;
            int i10 = this.f217548b;
            return C4875q.l1(eArr, i10, this.f217549c + i10);
        }
    }

    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    @V({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,724:1\n1#2:725\n*E\n"})
    public static final class b<E> implements ListIterator<E>, InterfaceC4423f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ListBuilder<E> f217556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f217557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f217558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f217559d;

        public b(@NotNull ListBuilder<E> list, int i10) {
            G.p(list, "list");
            this.f217556a = list;
            this.f217557b = i10;
            this.f217558c = -1;
            this.f217559d = ((AbstractList) list).modCount;
        }

        private final void b() {
            if (((AbstractList) this.f217556a).modCount != this.f217559d) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            b();
            ListBuilder<E> listBuilder = this.f217556a;
            int i10 = this.f217557b;
            this.f217557b = i10 + 1;
            listBuilder.add(i10, e10);
            this.f217558c = -1;
            this.f217559d = ((AbstractList) this.f217556a).modCount;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f217557b < this.f217556a.f217545b;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f217557b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            b();
            int i10 = this.f217557b;
            ListBuilder<E> listBuilder = this.f217556a;
            if (i10 >= listBuilder.f217545b) {
                throw new NoSuchElementException();
            }
            this.f217557b = i10 + 1;
            this.f217558c = i10;
            return listBuilder.f217544a[i10];
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f217557b;
        }

        @Override // java.util.ListIterator
        public E previous() {
            b();
            int i10 = this.f217557b;
            if (i10 <= 0) {
                throw new NoSuchElementException();
            }
            int i11 = i10 - 1;
            this.f217557b = i11;
            this.f217558c = i11;
            return this.f217556a.f217544a[i11];
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f217557b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            b();
            int i10 = this.f217558c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.f217556a.b(i10);
            this.f217557b = this.f217558c;
            this.f217558c = -1;
            this.f217559d = ((AbstractList) this.f217556a).modCount;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            b();
            int i10 = this.f217558c;
            if (i10 == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.f217556a.set(i10, e10);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.f217546c = true;
        f217543e = listBuilder;
    }

    public ListBuilder() {
        this(0, 1, null);
    }

    private final void B() {
        if (this.f217546c) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean C(List<?> list) {
        return kotlin.collections.builders.b.h(this.f217544a, 0, this.f217545b, list);
    }

    private final void G() {
        ((AbstractList) this).modCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E H(int i10) {
        G();
        E[] eArr = this.f217544a;
        E e10 = eArr[i10];
        C4875q.B0(eArr, eArr, i10, i10 + 1, this.f217545b);
        kotlin.collections.builders.b.f(this.f217544a, this.f217545b - 1);
        this.f217545b--;
        return e10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int i10, int i11) {
        if (i11 > 0) {
            G();
        }
        E[] eArr = this.f217544a;
        C4875q.B0(eArr, eArr, i10, i10 + i11, this.f217545b);
        E[] eArr2 = this.f217544a;
        int i12 = this.f217545b;
        kotlin.collections.builders.b.g(eArr2, i12 - i11, i12);
        this.f217545b -= i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int J(int i10, int i11, Collection<? extends E> collection, boolean z10) {
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = i10 + i12;
            if (collection.contains(this.f217544a[i14]) == z10) {
                E[] eArr = this.f217544a;
                i12++;
                eArr[i13 + i10] = eArr[i14];
                i13++;
            } else {
                i12++;
            }
        }
        int i15 = i11 - i13;
        E[] eArr2 = this.f217544a;
        C4875q.B0(eArr2, eArr2, i10 + i13, i11 + i10, this.f217545b);
        E[] eArr3 = this.f217544a;
        int i16 = this.f217545b;
        kotlin.collections.builders.b.g(eArr3, i16 - i15, i16);
        if (i15 > 0) {
            G();
        }
        this.f217545b -= i15;
        return i15;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f217546c) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(int i10, Collection<? extends E> collection, int i11) {
        G();
        F(i10, i11);
        Iterator<? extends E> it = collection.iterator();
        for (int i12 = 0; i12 < i11; i12++) {
            this.f217544a[i10 + i12] = it.next();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(int i10, E e10) {
        G();
        F(i10, 1);
        this.f217544a[i10] = e10;
    }

    @NotNull
    public final List<E> A() {
        B();
        this.f217546c = true;
        return this.f217545b > 0 ? this : f217543e;
    }

    public final void D(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        E[] eArr = this.f217544a;
        if (i10 > eArr.length) {
            this.f217544a = (E[]) kotlin.collections.builders.b.e(this.f217544a, AbstractC4859d.f217603a.e(eArr.length, i10));
        }
    }

    public final void E(int i10) {
        D(this.f217545b + i10);
    }

    public final void F(int i10, int i11) {
        E(i11);
        E[] eArr = this.f217544a;
        C4875q.B0(eArr, eArr, i10 + i11, i10, this.f217545b);
        this.f217545b += i11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        B();
        z(this.f217545b, e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        G.p(elements, "elements");
        B();
        int size = elements.size();
        x(this.f217545b, elements, size);
        return size > 0;
    }

    @Override // kotlin.collections.AbstractC4866h
    @C
    public E b(int i10) {
        B();
        AbstractC4859d.f217603a.b(i10, this.f217545b);
        return H(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        B();
        I(0, this.f217545b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@Nullable Object obj) {
        if (obj != this) {
            return (obj instanceof List) && C((List) obj);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        AbstractC4859d.f217603a.b(i10, this.f217545b);
        return this.f217544a[i10];
    }

    @Override // kotlin.collections.AbstractC4866h
    public int getSize() {
        return this.f217545b;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return kotlin.collections.builders.b.i(this.f217544a, 0, this.f217545b);
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i10 = 0; i10 < this.f217545b; i10++) {
            if (G.g(this.f217544a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f217545b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i10 = this.f217545b - 1; i10 >= 0; i10--) {
            if (G.g(this.f217544a[i10], obj)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        B();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            b(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<?> elements) {
        G.p(elements, "elements");
        B();
        return J(0, this.f217545b, elements, false) > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<?> elements) {
        G.p(elements, "elements");
        B();
        return J(0, this.f217545b, elements, true) > 0;
    }

    @Override // kotlin.collections.AbstractC4866h, java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        B();
        AbstractC4859d.f217603a.b(i10, this.f217545b);
        E[] eArr = this.f217544a;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        return e11;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public List<E> subList(int i10, int i11) {
        AbstractC4859d.f217603a.d(i10, i11, this.f217545b);
        return new BuilderSubList(this.f217544a, i10, i11 - i10, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        G.p(array, "array");
        int length = array.length;
        int i10 = this.f217545b;
        if (length < i10) {
            T[] tArr = (T[]) Arrays.copyOfRange(this.f217544a, 0, i10, array.getClass());
            G.o(tArr, "copyOfRange(...)");
            return tArr;
        }
        C4875q.B0(this.f217544a, array, 0, 0, i10);
        H.o(this.f217545b, array);
        return array;
    }

    @Override // java.util.AbstractCollection
    @NotNull
    public String toString() {
        return kotlin.collections.builders.b.j(this.f217544a, 0, this.f217545b, this);
    }

    public /* synthetic */ ListBuilder(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 10 : i10);
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i10) {
        AbstractC4859d.f217603a.c(i10, this.f217545b);
        return new b(this, i10);
    }

    public ListBuilder(int i10) {
        this.f217544a = (E[]) kotlin.collections.builders.b.d(i10);
    }

    @Override // kotlin.collections.AbstractC4866h, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        B();
        AbstractC4859d.f217603a.c(i10, this.f217545b);
        z(i10, e10);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, @NotNull Collection<? extends E> elements) {
        G.p(elements, "elements");
        B();
        AbstractC4859d.f217603a.c(i10, this.f217545b);
        int size = elements.size();
        x(i10, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return C4875q.l1(this.f217544a, 0, this.f217545b);
    }
}
