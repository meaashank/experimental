package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.r;
import ed.l;
import ed.p;
import ed.q;
import fd.InterfaceC4422e;
import fd.InterfaceC4423f;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.InterfaceC4850b0;
import kotlin.L0;
import kotlin.collections.C4875q;
import kotlin.collections.I;
import kotlin.jvm.internal.C4968u;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1220:1\n48#1:1224\n48#1:1225\n523#1:1226\n53#1:1229\n523#1:1230\n48#1:1231\n523#1:1232\n523#1:1233\n523#1:1234\n48#1:1235\n523#1:1236\n48#1:1237\n523#1:1238\n523#1:1239\n523#1:1240\n48#1:1241\n523#1:1242\n48#1:1245\n48#1:1246\n48#1:1247\n523#1:1248\n1864#2,3:1221\n1855#2,2:1227\n1855#2,2:1243\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n249#1:1224\n259#1:1225\n260#1:1226\n292#1:1229\n293#1:1230\n307#1:1231\n308#1:1232\n334#1:1233\n359#1:1234\n595#1:1235\n595#1:1236\n637#1:1237\n637#1:1238\n665#1:1239\n675#1:1240\n768#1:1241\n769#1:1242\n794#1:1245\n821#1:1246\n859#1:1247\n860#1:1248\n185#1:1221,3\n281#1:1227,2\n782#1:1243,2\n*E\n"})
@r(parameters = 0)
public final class c<T> implements RandomAccess {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f99563d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public T[] f99564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public List<T> f99565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f99566c;

    @V({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1220:1\n523#2:1221\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n*L\n967#1:1221\n*E\n"})
    public static final class a<T> implements List<T>, InterfaceC4422e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final c<T> f99567a;

        public a(@NotNull c<T> cVar) {
            this.f99567a = cVar;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            this.f99567a.b(t10);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i10, @NotNull Collection<? extends T> collection) {
            return this.f99567a.g(i10, collection);
        }

        public T b(int i10) {
            d.f(this, i10);
            return this.f99567a.l0(i10);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f99567a.q();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f99567a.s(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> collection) {
            return this.f99567a.v(collection);
        }

        @Override // java.util.List
        public T get(int i10) {
            d.f(this, i10);
            return this.f99567a.f99564a[i10];
        }

        public int getSize() {
            return this.f99567a.f99566c;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f99567a.R(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f99567a.U();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return new C0241c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f99567a.Y(obj);
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator() {
            return new C0241c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return b(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@NotNull Collection<? extends Object> collection) {
            return this.f99567a.j0(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@NotNull Collection<? extends Object> collection) {
            return this.f99567a.o0(collection);
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            d.f(this, i10);
            return this.f99567a.q0(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.f99567a.f99566c;
        }

        @Override // java.util.List
        @NotNull
        public List<T> subList(int i10, int i11) {
            d.g(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return C4968u.a(this);
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            this.f99567a.a(i10, t10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@NotNull Collection<? extends T> collection) {
            c<T> cVar = this.f99567a;
            return cVar.g(cVar.f99566c, collection);
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator(int i10) {
            return new C0241c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f99567a.h0(obj);
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C4968u.b(this, tArr);
        }
    }

    @V({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1220:1\n1855#2,2:1221\n1855#2,2:1223\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n*L\n1039#1:1221,2\n1121#1:1223,2\n*E\n"})
    public static final class b<T> implements List<T>, InterfaceC4422e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<T> f99568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f99569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f99570c;

        public b(@NotNull List<T> list, int i10, int i11) {
            this.f99568a = list;
            this.f99569b = i10;
            this.f99570c = i11;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(T t10) {
            List<T> list = this.f99568a;
            int i10 = this.f99570c;
            this.f99570c = i10 + 1;
            list.add(i10, t10);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i10, @NotNull Collection<? extends T> collection) {
            this.f99568a.addAll(i10 + this.f99569b, collection);
            this.f99570c = collection.size() + this.f99570c;
            return collection.size() > 0;
        }

        public T b(int i10) {
            d.f(this, i10);
            this.f99570c--;
            return this.f99568a.remove(i10 + this.f99569b);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.f99570c - 1;
            int i11 = this.f99569b;
            if (i11 <= i10) {
                while (true) {
                    this.f99568a.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f99570c = this.f99569b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i10 = this.f99570c;
            for (int i11 = this.f99569b; i11 < i10; i11++) {
                if (G.g(this.f99568a.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> collection) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public T get(int i10) {
            d.f(this, i10);
            return this.f99568a.get(i10 + this.f99569b);
        }

        public int getSize() {
            return this.f99570c - this.f99569b;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f99570c;
            for (int i11 = this.f99569b; i11 < i10; i11++) {
                if (G.g(this.f99568a.get(i11), obj)) {
                    return i11 - this.f99569b;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f99570c == this.f99569b;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<T> iterator() {
            return new C0241c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f99570c - 1;
            int i11 = this.f99569b;
            if (i11 > i10) {
                return -1;
            }
            while (!G.g(this.f99568a.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f99569b;
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator() {
            return new C0241c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ T remove(int i10) {
            return b(i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(@NotNull Collection<? extends Object> collection) {
            int i10 = this.f99570c;
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f99570c;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(@NotNull Collection<? extends Object> collection) {
            int i10 = this.f99570c;
            int i11 = i10 - 1;
            int i12 = this.f99569b;
            if (i12 <= i11) {
                while (true) {
                    if (!collection.contains(this.f99568a.get(i11))) {
                        this.f99568a.remove(i11);
                        this.f99570c--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f99570c;
        }

        @Override // java.util.List
        public T set(int i10, T t10) {
            d.f(this, i10);
            return this.f99568a.set(i10 + this.f99569b, t10);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.List
        @NotNull
        public List<T> subList(int i10, int i11) {
            d.g(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return C4968u.a(this);
        }

        @Override // java.util.List
        public void add(int i10, T t10) {
            this.f99568a.add(i10 + this.f99569b, t10);
            this.f99570c++;
        }

        @Override // java.util.List
        @NotNull
        public ListIterator<T> listIterator(int i10) {
            return new C0241c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = this.f99570c;
            for (int i11 = this.f99569b; i11 < i10; i11++) {
                if (G.g(this.f99568a.get(i11), obj)) {
                    this.f99568a.remove(i11);
                    this.f99570c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C4968u.b(this, tArr);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(@NotNull Collection<? extends T> collection) {
            this.f99568a.addAll(this.f99570c, collection);
            this.f99570c = collection.size() + this.f99570c;
            return collection.size() > 0;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.collection.c$c, reason: collision with other inner class name */
    public static final class C0241c<T> implements ListIterator<T>, InterfaceC4423f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<T> f99571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f99572b;

        public C0241c(@NotNull List<T> list, int i10) {
            this.f99571a = list;
            this.f99572b = i10;
        }

        @Override // java.util.ListIterator
        public void add(T t10) {
            this.f99571a.add(this.f99572b, t10);
            this.f99572b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f99572b < this.f99571a.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f99572b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            List<T> list = this.f99571a;
            int i10 = this.f99572b;
            this.f99572b = i10 + 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f99572b;
        }

        @Override // java.util.ListIterator
        public T previous() {
            int i10 = this.f99572b - 1;
            this.f99572b = i10;
            return this.f99571a.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f99572b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.f99572b - 1;
            this.f99572b = i10;
            this.f99571a.remove(i10);
        }

        @Override // java.util.ListIterator
        public void set(T t10) {
            this.f99571a.set(this.f99572b, t10);
        }
    }

    @InterfaceC4850b0
    public c(@NotNull T[] tArr, int i10) {
        this.f99564a = tArr;
        this.f99566c = i10;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void N() {
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    public final T A(@NotNull l<? super T, Boolean> lVar) {
        int i10 = this.f99566c;
        if (i10 > 0) {
            T[] tArr = this.f99564a;
            int i11 = 0;
            do {
                ?? r32 = (Object) tArr[i11];
                if (lVar.invoke(r32).booleanValue()) {
                    return r32;
                }
                i11++;
            } while (i11 < i10);
        }
        v0();
        throw null;
    }

    @Nullable
    public final T B() {
        if (U()) {
            return null;
        }
        return this.f99564a[0];
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    @Nullable
    public final T C(@NotNull l<? super T, Boolean> lVar) {
        int i10 = this.f99566c;
        if (i10 <= 0) {
            return null;
        }
        T[] tArr = this.f99564a;
        int i11 = 0;
        do {
            ?? r32 = (Object) tArr[i11];
            if (lVar.invoke(r32).booleanValue()) {
                return r32;
            }
            i11++;
        } while (i11 < i10);
        return null;
    }

    public final <R> R D(R r10, @NotNull p<? super R, ? super T, ? extends R> pVar) {
        int i10 = this.f99566c;
        if (i10 > 0) {
            T[] tArr = this.f99564a;
            int i11 = 0;
            do {
                r10 = pVar.invoke(r10, tArr[i11]);
                i11++;
            } while (i11 < i10);
        }
        return r10;
    }

    public final <R> R E(R r10, @NotNull q<? super Integer, ? super R, ? super T, ? extends R> qVar) {
        int i10 = this.f99566c;
        if (i10 > 0) {
            T[] tArr = this.f99564a;
            int i11 = 0;
            do {
                r10 = qVar.invoke(Integer.valueOf(i11), r10, tArr[i11]);
                i11++;
            } while (i11 < i10);
        }
        return r10;
    }

    public final <R> R F(R r10, @NotNull p<? super T, ? super R, ? extends R> pVar) {
        int i10 = this.f99566c;
        if (i10 > 0) {
            int i11 = i10 - 1;
            T[] tArr = this.f99564a;
            do {
                r10 = pVar.invoke(tArr[i11], r10);
                i11--;
            } while (i11 >= 0);
        }
        return r10;
    }

    public final <R> R G(R r10, @NotNull q<? super Integer, ? super T, ? super R, ? extends R> qVar) {
        int i10 = this.f99566c;
        if (i10 > 0) {
            int i11 = i10 - 1;
            T[] tArr = this.f99564a;
            do {
                r10 = qVar.invoke(Integer.valueOf(i11), tArr[i11], r10);
                i11--;
            } while (i11 >= 0);
        }
        return r10;
    }

    public final void H(@NotNull l<? super T, L0> lVar) {
        int i10 = this.f99566c;
        if (i10 > 0) {
            T[] tArr = this.f99564a;
            int i11 = 0;
            do {
                lVar.invoke(tArr[i11]);
                i11++;
            } while (i11 < i10);
        }
    }

    public final void I(@NotNull p<? super Integer, ? super T, L0> pVar) {
        int i10 = this.f99566c;
        if (i10 > 0) {
            T[] tArr = this.f99564a;
            int i11 = 0;
            do {
                pVar.invoke(Integer.valueOf(i11), tArr[i11]);
                i11++;
            } while (i11 < i10);
        }
    }

    public final void J(@NotNull l<? super T, L0> lVar) {
        int i10 = this.f99566c;
        if (i10 > 0) {
            int i11 = i10 - 1;
            T[] tArr = this.f99564a;
            do {
                lVar.invoke(tArr[i11]);
                i11--;
            } while (i11 >= 0);
        }
    }

    public final void K(@NotNull p<? super Integer, ? super T, L0> pVar) {
        int i10 = this.f99566c;
        if (i10 > 0) {
            int i11 = i10 - 1;
            T[] tArr = this.f99564a;
            do {
                pVar.invoke(Integer.valueOf(i11), tArr[i11]);
                i11--;
            } while (i11 >= 0);
        }
    }

    public final T L(int i10) {
        return this.f99564a[i10];
    }

    @NotNull
    public final T[] M() {
        return this.f99564a;
    }

    @NotNull
    public final md.l O() {
        return new md.l(0, this.f99566c - 1, 1);
    }

    public final int P() {
        return this.f99566c - 1;
    }

    public final int Q() {
        return this.f99566c;
    }

    public final int R(T t10) {
        int i10 = this.f99566c;
        if (i10 <= 0) {
            return -1;
        }
        T[] tArr = this.f99564a;
        int i11 = 0;
        while (!G.g(t10, tArr[i11])) {
            i11++;
            if (i11 >= i10) {
                return -1;
            }
        }
        return i11;
    }

    public final int S(@NotNull l<? super T, Boolean> lVar) {
        int i10 = this.f99566c;
        if (i10 <= 0) {
            return -1;
        }
        T[] tArr = this.f99564a;
        int i11 = 0;
        while (!lVar.invoke(tArr[i11]).booleanValue()) {
            i11++;
            if (i11 >= i10) {
                return -1;
            }
        }
        return i11;
    }

    public final int T(@NotNull l<? super T, Boolean> lVar) {
        int i10 = this.f99566c;
        if (i10 <= 0) {
            return -1;
        }
        int i11 = i10 - 1;
        T[] tArr = this.f99564a;
        while (!lVar.invoke(tArr[i11]).booleanValue()) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
        }
        return i11;
    }

    public final boolean U() {
        return this.f99566c == 0;
    }

    public final boolean V() {
        return this.f99566c != 0;
    }

    public final T W() {
        if (U()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return this.f99564a[this.f99566c - 1];
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    public final T X(@NotNull l<? super T, Boolean> lVar) {
        int i10 = this.f99566c;
        if (i10 > 0) {
            int i11 = i10 - 1;
            T[] tArr = this.f99564a;
            do {
                ?? r22 = (Object) tArr[i11];
                if (lVar.invoke(r22).booleanValue()) {
                    return r22;
                }
                i11--;
            } while (i11 >= 0);
        }
        v0();
        throw null;
    }

    public final int Y(T t10) {
        int i10 = this.f99566c;
        if (i10 <= 0) {
            return -1;
        }
        int i11 = i10 - 1;
        T[] tArr = this.f99564a;
        while (!G.g(t10, tArr[i11])) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
        }
        return i11;
    }

    @Nullable
    public final T Z() {
        if (U()) {
            return null;
        }
        return this.f99564a[this.f99566c - 1];
    }

    public final void a(int i10, T t10) {
        y(this.f99566c + 1);
        T[] tArr = this.f99564a;
        int i11 = this.f99566c;
        if (i10 != i11) {
            C4875q.B0(tArr, tArr, i10 + 1, i10, i11);
        }
        tArr[i10] = t10;
        this.f99566c++;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    @Nullable
    public final T a0(@NotNull l<? super T, Boolean> lVar) {
        int i10 = this.f99566c;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        T[] tArr = this.f99564a;
        do {
            ?? r22 = (Object) tArr[i11];
            if (lVar.invoke(r22).booleanValue()) {
                return r22;
            }
            i11--;
        } while (i11 >= 0);
        return null;
    }

    public final boolean b(T t10) {
        y(this.f99566c + 1);
        T[] tArr = this.f99564a;
        int i10 = this.f99566c;
        tArr[i10] = t10;
        this.f99566c = i10 + 1;
        return true;
    }

    public final <R> R[] b0(l<? super T, ? extends R> lVar) {
        G.P();
        throw null;
    }

    public final boolean c(int i10, @NotNull c<T> cVar) {
        if (cVar.U()) {
            return false;
        }
        y(this.f99566c + cVar.f99566c);
        T[] tArr = this.f99564a;
        int i11 = this.f99566c;
        if (i10 != i11) {
            C4875q.B0(tArr, tArr, cVar.f99566c + i10, i10, i11);
        }
        C4875q.B0(cVar.f99564a, tArr, i10, 0, cVar.f99566c);
        this.f99566c += cVar.f99566c;
        return true;
    }

    public final <R> R[] c0(p<? super Integer, ? super T, ? extends R> pVar) {
        G.P();
        throw null;
    }

    public final <R> c<R> d0(p<? super Integer, ? super T, ? extends R> pVar) {
        G.P();
        throw null;
    }

    public final <R> c<R> e0(l<? super T, ? extends R> lVar) {
        G.P();
        throw null;
    }

    public final void f0(T t10) {
        h0(t10);
    }

    public final boolean g(int i10, @NotNull Collection<? extends T> collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        y(collection.size() + this.f99566c);
        T[] tArr = this.f99564a;
        if (i10 != this.f99566c) {
            C4875q.B0(tArr, tArr, collection.size() + i10, i10, this.f99566c);
        }
        for (T t10 : collection) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                I.b0();
                throw null;
            }
            tArr[i11 + i10] = t10;
            i11 = i12;
        }
        this.f99566c = collection.size() + this.f99566c;
        return true;
    }

    public final void g0(T t10) {
        b(t10);
    }

    public final boolean h(int i10, @NotNull List<? extends T> list) {
        if (list.isEmpty()) {
            return false;
        }
        y(list.size() + this.f99566c);
        T[] tArr = this.f99564a;
        if (i10 != this.f99566c) {
            C4875q.B0(tArr, tArr, list.size() + i10, i10, this.f99566c);
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            tArr[i10 + i11] = list.get(i11);
        }
        this.f99566c = list.size() + this.f99566c;
        return true;
    }

    public final boolean h0(T t10) {
        int iR = R(t10);
        if (iR < 0) {
            return false;
        }
        l0(iR);
        return true;
    }

    public final boolean i(@NotNull c<T> cVar) {
        return c(this.f99566c, cVar);
    }

    public final boolean i0(@NotNull c<T> cVar) {
        int i10 = this.f99566c;
        int i11 = cVar.f99566c - 1;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                h0(cVar.f99564a[i12]);
                if (i12 == i11) {
                    break;
                }
                i12++;
            }
        }
        return i10 != this.f99566c;
    }

    public final boolean j(@NotNull Collection<? extends T> collection) {
        return g(this.f99566c, collection);
    }

    public final boolean j0(@NotNull Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = this.f99566c;
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            h0(it.next());
        }
        return i10 != this.f99566c;
    }

    public final boolean k(@NotNull List<? extends T> list) {
        return h(this.f99566c, list);
    }

    public final boolean k0(@NotNull List<? extends T> list) {
        int i10 = this.f99566c;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            h0(list.get(i11));
        }
        return i10 != this.f99566c;
    }

    public final boolean l(@NotNull T[] tArr) {
        if (tArr.length == 0) {
            return false;
        }
        y(this.f99566c + tArr.length);
        C4875q.K0(tArr, this.f99564a, this.f99566c, 0, 0, 12, null);
        this.f99566c += tArr.length;
        return true;
    }

    public final T l0(int i10) {
        T[] tArr = this.f99564a;
        T t10 = tArr[i10];
        int i11 = this.f99566c;
        if (i10 != i11 - 1) {
            C4875q.B0(tArr, tArr, i10, i10 + 1, i11);
        }
        int i12 = this.f99566c - 1;
        this.f99566c = i12;
        tArr[i12] = null;
        return t10;
    }

    public final void m0(@NotNull l<? super T, Boolean> lVar) {
        int i10 = this.f99566c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (lVar.invoke(this.f99564a[i12]).booleanValue()) {
                i11++;
            } else if (i11 > 0) {
                T[] tArr = this.f99564a;
                tArr[i12 - i11] = tArr[i12];
            }
        }
        int i13 = i10 - i11;
        C4875q.M1(this.f99564a, null, i13, i10);
        this.f99566c = i13;
    }

    public final boolean n(@NotNull l<? super T, Boolean> lVar) {
        int i10 = this.f99566c;
        if (i10 > 0) {
            T[] tArr = this.f99564a;
            int i11 = 0;
            while (!lVar.invoke(tArr[i11]).booleanValue()) {
                i11++;
                if (i11 >= i10) {
                }
            }
            return true;
        }
        return false;
    }

    public final void n0(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f99566c;
            if (i11 < i12) {
                T[] tArr = this.f99564a;
                C4875q.B0(tArr, tArr, i10, i11, i12);
            }
            int i13 = this.f99566c;
            int i14 = i13 - (i11 - i10);
            int i15 = i13 - 1;
            if (i14 <= i15) {
                int i16 = i14;
                while (true) {
                    this.f99564a[i16] = null;
                    if (i16 == i15) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f99566c = i14;
        }
    }

    @NotNull
    public final List<T> o() {
        List<T> list = this.f99565b;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.f99565b = aVar;
        return aVar;
    }

    public final boolean o0(@NotNull Collection<? extends T> collection) {
        int i10 = this.f99566c;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!collection.contains(this.f99564a[i11])) {
                l0(i11);
            }
        }
        return i10 != this.f99566c;
    }

    public final boolean p0(@NotNull l<? super T, Boolean> lVar) {
        int i10 = this.f99566c;
        if (i10 <= 0) {
            return false;
        }
        int i11 = i10 - 1;
        T[] tArr = this.f99564a;
        while (!lVar.invoke(tArr[i11]).booleanValue()) {
            i11--;
            if (i11 < 0) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        T[] tArr = this.f99564a;
        int i10 = this.f99566c;
        while (true) {
            i10--;
            if (-1 >= i10) {
                this.f99566c = 0;
                return;
            }
            tArr[i10] = null;
        }
    }

    public final T q0(int i10, T t10) {
        T[] tArr = this.f99564a;
        T t11 = tArr[i10];
        tArr[i10] = t10;
        return t11;
    }

    public final void r0(@NotNull T[] tArr) {
        this.f99564a = tArr;
    }

    public final boolean s(T t10) {
        int i10 = this.f99566c - 1;
        if (i10 >= 0) {
            for (int i11 = 0; !G.g(this.f99564a[i11], t10); i11++) {
                if (i11 != i10) {
                }
            }
            return true;
        }
        return false;
    }

    @InterfaceC4850b0
    public final void s0(int i10) {
        this.f99566c = i10;
    }

    public final boolean t(@NotNull c<T> cVar) {
        int i10 = new md.l(0, cVar.f99566c - 1, 1).f221140b;
        if (i10 >= 0) {
            for (int i11 = 0; s(cVar.f99564a[i11]); i11++) {
                if (i11 != i10) {
                }
            }
            return false;
        }
        return true;
    }

    public final void t0(@NotNull Comparator<T> comparator) {
        C4875q.i4(this.f99564a, comparator, 0, this.f99566c);
    }

    public final int u0(@NotNull l<? super T, Integer> lVar) {
        int i10 = this.f99566c;
        int iIntValue = 0;
        if (i10 > 0) {
            T[] tArr = this.f99564a;
            int i11 = 0;
            do {
                iIntValue += lVar.invoke(tArr[i11]).intValue();
                i11++;
            } while (i11 < i10);
        }
        return iIntValue;
    }

    public final boolean v(@NotNull Collection<? extends T> collection) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!s(it.next())) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC4850b0
    @NotNull
    public final Void v0() {
        throw new NoSuchElementException("MutableVector contains no element matching the predicate.");
    }

    public final boolean w(@NotNull List<? extends T> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!s(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean x(@NotNull c<T> cVar) {
        int i10 = cVar.f99566c;
        int i11 = this.f99566c;
        if (i10 != i11) {
            return false;
        }
        int i12 = i11 - 1;
        if (i12 >= 0) {
            for (int i13 = 0; G.g(cVar.f99564a[i13], this.f99564a[i13]); i13++) {
                if (i13 != i12) {
                }
            }
            return false;
        }
        return true;
    }

    public final void y(int i10) {
        T[] tArr = this.f99564a;
        if (tArr.length < i10) {
            T[] tArr2 = (T[]) Arrays.copyOf(tArr, Math.max(i10, tArr.length * 2));
            G.o(tArr2, "copyOf(this, newSize)");
            this.f99564a = tArr2;
        }
    }

    public final T z() {
        if (U()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return this.f99564a[0];
    }
}
