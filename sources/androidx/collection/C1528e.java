package androidx.collection;

import fd.InterfaceC4419b;
import fd.InterfaceC4425h;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4955g;
import kotlin.jvm.internal.C4956h;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.collection.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nArraySet.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n+ 2 ArraySet.kt\nandroidx/collection/ArraySetKt\n*L\n1#1,300:1\n304#2,10:301\n317#2,14:311\n334#2:325\n339#2:326\n345#2:327\n350#2:328\n355#2,61:329\n420#2,17:390\n440#2,6:407\n450#2,60:413\n518#2,9:473\n531#2,22:482\n557#2,7:504\n568#2,19:511\n591#2,6:530\n601#2,6:536\n611#2,5:542\n620#2,8:547\n*S KotlinDebug\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n*L\n98#1:301,10\n108#1:311,14\n118#1:325\n128#1:326\n138#1:327\n145#1:328\n157#1:329,61\n167#1:390,17\n177#1:407,6\n188#1:413,60\n197#1:473,9\n224#1:482,22\n231#1:504,7\n240#1:511,19\n267#1:530,6\n276#1:536,6\n286#1:542,5\n297#1:547,8\n*E\n"})
public final class C1528e<E> implements Collection<E>, Set<E>, InterfaceC4419b, InterfaceC4425h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public int[] f86949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public Object[] f86950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86951c;

    /* JADX INFO: renamed from: androidx.collection.e$a */
    public final class a extends C<E> {
        public a() {
            super(C1528e.this.f86951c);
        }

        @Override // androidx.collection.C
        public E b(int i10) {
            return (E) C1528e.this.f86950b[i10];
        }

        @Override // androidx.collection.C
        public void d(int i10) {
            C1528e.this.q(i10);
        }
    }

    @dd.k
    public C1528e() {
        this(0, 1, null);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int iN;
        int i11 = this.f86951c;
        if (e10 == null) {
            iN = C1532g.p(this);
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iN = C1532g.n(this, e10, iHashCode);
        }
        if (iN >= 0) {
            return false;
        }
        int i12 = ~iN;
        int[] iArr = this.f86949a;
        if (i11 >= iArr.length) {
            int i13 = 8;
            if (i11 >= 8) {
                i13 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f86950b;
            C1532g.d(this, i13);
            if (i11 != this.f86951c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f86949a;
            if (!(iArr2.length == 0)) {
                C4875q.I0(iArr, iArr2, 0, 0, iArr.length, 6, null);
                C4875q.K0(objArr, this.f86950b, 0, 0, objArr.length, 6, null);
            }
        }
        if (i12 < i11) {
            int[] iArr3 = this.f86949a;
            int i14 = i12 + 1;
            C4875q.z0(iArr3, iArr3, i14, i12, i11);
            Object[] objArr2 = this.f86950b;
            C4875q.B0(objArr2, objArr2, i14, i12, i11);
        }
        int i15 = this.f86951c;
        if (i11 == i15) {
            int[] iArr4 = this.f86949a;
            if (i12 < iArr4.length) {
                iArr4[i12] = i10;
                this.f86950b[i12] = e10;
                this.f86951c = i15 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        g(elements.size() + this.f86951c);
        Iterator<? extends E> it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(@NotNull C1528e<? extends E> array) {
        kotlin.jvm.internal.G.p(array, "array");
        int i10 = array.f86951c;
        g(this.f86951c + i10);
        if (this.f86951c != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                add(array.f86950b[i11]);
            }
            return;
        }
        if (i10 > 0) {
            C4875q.I0(array.f86949a, this.f86949a, 0, 0, i10, 6, null);
            C4875q.K0(array.f86950b, this.f86950b, 0, 0, i10, 6, null);
            if (this.f86951c != 0) {
                throw new ConcurrentModificationException();
            }
            this.f86951c = i10;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (this.f86951c != 0) {
            v(A.a.f11a);
            t(A.a.f13c);
            this.f86951c = 0;
        }
        if (this.f86951c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@NotNull Collection<? extends Object> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f86951c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i10 = this.f86951c;
            for (int i11 = 0; i11 < i10; i11++) {
                if (!((Set) obj).contains(this.f86950b[i11])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public final void g(int i10) {
        int i11 = this.f86951c;
        int[] iArr = this.f86949a;
        if (iArr.length < i10) {
            Object[] objArr = this.f86950b;
            C1532g.d(this, i10);
            int i12 = this.f86951c;
            if (i12 > 0) {
                C4875q.I0(iArr, this.f86949a, 0, 0, i12, 6, null);
                C4875q.K0(objArr, this.f86950b, 0, 0, this.f86951c, 6, null);
            }
        }
        if (this.f86951c != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public int getSize() {
        return this.f86951c;
    }

    @NotNull
    public final Object[] h() {
        return this.f86950b;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f86949a;
        int i10 = this.f86951c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @NotNull
    public final int[] i() {
        return this.f86949a;
    }

    public final int indexOf(@Nullable Object obj) {
        return obj == null ? C1532g.p(this) : C1532g.n(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f86951c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public Iterator<E> iterator() {
        return new a();
    }

    public final int j() {
        return this.f86951c;
    }

    public final boolean o(@NotNull C1528e<? extends E> array) {
        kotlin.jvm.internal.G.p(array, "array");
        int i10 = array.f86951c;
        int i11 = this.f86951c;
        for (int i12 = 0; i12 < i10; i12++) {
            remove(array.f86950b[i12]);
        }
        return i11 != this.f86951c;
    }

    public final E q(int i10) {
        int[] iArr;
        Object[] objArr;
        int i11 = this.f86951c;
        Object[] objArr2 = this.f86950b;
        E e10 = (E) objArr2[i10];
        if (i11 <= 1) {
            clear();
            return e10;
        }
        int i12 = i11 - 1;
        int[] iArr2 = this.f86949a;
        if (iArr2.length <= 8 || i11 >= iArr2.length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                C4875q.z0(iArr2, iArr2, i10, i13, i11);
                Object[] objArr3 = this.f86950b;
                C4875q.B0(objArr3, objArr3, i10, i13, i11);
            }
            this.f86950b[i12] = null;
        } else {
            C1532g.d(this, i11 > 8 ? i11 + (i11 >> 1) : 8);
            if (i10 > 0) {
                C4875q.I0(iArr2, this.f86949a, 0, 0, i10, 6, null);
                iArr = iArr2;
                objArr = objArr2;
                C4875q.K0(objArr, this.f86950b, 0, 0, i10, 6, null);
            } else {
                iArr = iArr2;
                objArr = objArr2;
            }
            if (i10 < i12) {
                int i14 = i10 + 1;
                C4875q.z0(iArr, this.f86949a, i10, i14, i11);
                C4875q.B0(objArr, this.f86950b, i10, i14, i11);
            }
        }
        if (i11 != this.f86951c) {
            throw new ConcurrentModificationException();
        }
        this.f86951c = i12;
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        q(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@NotNull Collection<? extends Object> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        Iterator<? extends Object> it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@NotNull Collection<? extends Object> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        boolean z10 = false;
        for (int i10 = this.f86951c - 1; -1 < i10; i10--) {
            if (!kotlin.collections.U.a2(elements, this.f86950b[i10])) {
                q(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f86951c;
    }

    public final void t(@NotNull Object[] objArr) {
        kotlin.jvm.internal.G.p(objArr, "<set-?>");
        this.f86950b = objArr;
    }

    @Override // java.util.Collection, java.util.Set
    @NotNull
    public final Object[] toArray() {
        return C4875q.l1(this.f86950b, 0, this.f86951c);
    }

    @NotNull
    public String toString() {
        if (isEmpty()) {
            return Ib.b.f53002g;
        }
        StringBuilder sb2 = new StringBuilder(this.f86951c * 14);
        sb2.append('{');
        int i10 = this.f86951c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(U6.j.f68738d);
            }
            Object obj = this.f86950b[i11];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Set)");
            }
        }
        return C1526d.a(sb2, '}', "StringBuilder(capacity).…builderAction).toString()");
    }

    public final void v(@NotNull int[] iArr) {
        kotlin.jvm.internal.G.p(iArr, "<set-?>");
        this.f86949a = iArr;
    }

    public final void w(int i10) {
        this.f86951c = i10;
    }

    public final E x(int i10) {
        return (E) this.f86950b[i10];
    }

    @dd.k
    public C1528e(int i10) {
        this.f86949a = A.a.f11a;
        this.f86950b = A.a.f13c;
        if (i10 > 0) {
            C1532g.d(this, i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    @NotNull
    public final <T> T[] toArray(@NotNull T[] array) {
        kotlin.jvm.internal.G.p(array, "array");
        T[] tArr = (T[]) C1530f.a(array, this.f86951c);
        C4875q.B0(this.f86950b, tArr, 0, 0, this.f86951c);
        return tArr;
    }

    public /* synthetic */ C1528e(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public C1528e(@Nullable C1528e<? extends E> c1528e) {
        this(0);
        if (c1528e != null) {
            b(c1528e);
        }
    }

    public C1528e(@Nullable Collection<? extends E> collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1528e(@Nullable E[] eArr) {
        this(0);
        if (eArr == null) {
            return;
        }
        Iterator itA = C4956h.a(eArr);
        while (true) {
            C4955g c4955g = (C4955g) itA;
            if (!c4955g.hasNext()) {
                return;
            } else {
                add(c4955g.next());
            }
        }
    }
}
