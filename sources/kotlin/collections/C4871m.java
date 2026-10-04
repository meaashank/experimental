package kotlin.collections;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.InterfaceC4887e0;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kotlin.collections.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC4887e0(version = "1.4")
@kotlin.jvm.internal.V({"SMAP\nArrayDeque.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,673:1\n488#1,53:676\n488#1,53:729\n37#2,2:674\n*S KotlinDebug\n*F\n+ 1 ArrayDeque.kt\nkotlin/collections/ArrayDeque\n*L\n482#1:676,53\n485#1:729,53\n46#1:674,2\n*E\n"})
public final class C4871m<E> extends AbstractC4866h<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f217627d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final Object[] f217628e = new Object[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f217629f = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f217630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public Object[] f217631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f217632c;

    /* JADX INFO: renamed from: kotlin.collections.m$a */
    public static final class a {
        public a() {
        }

        public a(C4969v c4969v) {
        }
    }

    public C4871m() {
        this.f217631b = f217628e;
    }

    private final void j(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f217631b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr != f217628e) {
            h(AbstractC4859d.f217603a.e(objArr.length, i10));
            return;
        }
        if (i10 < 10) {
            i10 = 10;
        }
        this.f217631b = new Object[i10];
    }

    public final int A(int i10) {
        return i10 < 0 ? i10 + this.f217631b.length : i10;
    }

    public final void B(int i10, int i11) {
        if (i10 < i11) {
            C4875q.M1(this.f217631b, null, i10, i11);
            return;
        }
        Object[] objArr = this.f217631b;
        C4875q.M1(objArr, null, i10, objArr.length);
        C4875q.M1(this.f217631b, null, 0, i11);
    }

    public final int C(int i10) {
        Object[] objArr = this.f217631b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    public final void D() {
        ((AbstractList) this).modCount++;
    }

    @kotlin.C
    @Nullable
    public final E E() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @kotlin.C
    @Nullable
    public final E F() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    public final void G(int i10, int i11) {
        int iC = C(this.f217630a + (i10 - 1));
        int iC2 = C(this.f217630a + (i11 - 1));
        while (i10 > 0) {
            int i12 = iC + 1;
            int iMin = Math.min(i10, Math.min(i12, iC2 + 1));
            Object[] objArr = this.f217631b;
            int i13 = iC2 - iMin;
            int i14 = iC - iMin;
            C4875q.B0(objArr, objArr, i13 + 1, i14 + 1, i12);
            iC = A(i14);
            iC2 = A(i13);
            i10 -= iMin;
        }
    }

    public final void H(int i10, int i11) {
        int iC = C(this.f217630a + i11);
        int iC2 = C(this.f217630a + i10);
        int size = getSize();
        while (true) {
            size -= i11;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f217631b;
            i11 = Math.min(size, Math.min(objArr.length - iC, objArr.length - iC2));
            Object[] objArr2 = this.f217631b;
            int i12 = iC + i11;
            C4875q.B0(objArr2, objArr2, iC2, iC, i12);
            iC = C(i12);
            iC2 = C(iC2 + i11);
        }
    }

    public final void I(int i10, int i11) {
        removeRange(i10, i11);
    }

    @NotNull
    public final Object[] J() {
        return toArray();
    }

    @NotNull
    public final <T> T[] K(@NotNull T[] array) {
        kotlin.jvm.internal.G.p(array, "array");
        return (T[]) toArray(array);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @kotlin.C
    public boolean add(E e10) {
        addLast(e10);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @kotlin.C
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        D();
        j(elements.size() + getSize());
        g(C(getSize() + this.f217630a), elements);
        return true;
    }

    public final void addFirst(E e10) {
        D();
        j(getSize() + 1);
        int i10 = i(this.f217630a);
        this.f217630a = i10;
        this.f217631b[i10] = e10;
        this.f217632c = getSize() + 1;
    }

    public final void addLast(E e10) {
        D();
        j(getSize() + 1);
        this.f217631b[C(getSize() + this.f217630a)] = e10;
        this.f217632c = getSize() + 1;
    }

    @Override // kotlin.collections.AbstractC4866h
    @kotlin.C
    public E b(int i10) {
        AbstractC4859d.f217603a.b(i10, getSize());
        if (i10 == I.L(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        D();
        int iC = C(this.f217630a + i10);
        E e10 = (E) this.f217631b[iC];
        if (i10 < (getSize() >> 1)) {
            int i11 = this.f217630a;
            if (iC >= i11) {
                Object[] objArr = this.f217631b;
                C4875q.B0(objArr, objArr, i11 + 1, i11, iC);
            } else {
                Object[] objArr2 = this.f217631b;
                C4875q.B0(objArr2, objArr2, 1, 0, iC);
                Object[] objArr3 = this.f217631b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f217630a;
                C4875q.B0(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f217631b;
            int i13 = this.f217630a;
            objArr4[i13] = null;
            this.f217630a = t(i13);
        } else {
            int iC2 = C(I.L(this) + this.f217630a);
            if (iC <= iC2) {
                Object[] objArr5 = this.f217631b;
                C4875q.B0(objArr5, objArr5, iC, iC + 1, iC2 + 1);
            } else {
                Object[] objArr6 = this.f217631b;
                C4875q.B0(objArr6, objArr6, iC, iC + 1, objArr6.length);
                Object[] objArr7 = this.f217631b;
                objArr7[objArr7.length - 1] = objArr7[0];
                C4875q.B0(objArr7, objArr7, 0, 1, iC2 + 1);
            }
            this.f217631b[iC2] = null;
        }
        this.f217632c = getSize() - 1;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            D();
            B(this.f217630a, C(getSize() + this.f217630a));
        }
        this.f217630a = 0;
        this.f217632c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f217631b[this.f217630a];
    }

    public final void g(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f217631b.length;
        while (i10 < length && it.hasNext()) {
            this.f217631b[i10] = it.next();
            i10++;
        }
        int i11 = this.f217630a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f217631b[i12] = it.next();
        }
        this.f217632c = collection.size() + getSize();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        AbstractC4859d.f217603a.b(i10, getSize());
        return (E) this.f217631b[C(this.f217630a + i10)];
    }

    @Override // kotlin.collections.AbstractC4866h
    public int getSize() {
        return this.f217632c;
    }

    public final void h(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f217631b;
        C4875q.B0(objArr2, objArr, 0, this.f217630a, objArr2.length);
        Object[] objArr3 = this.f217631b;
        int length = objArr3.length;
        int i11 = this.f217630a;
        C4875q.B0(objArr3, objArr, length - i11, 0, i11);
        this.f217630a = 0;
        this.f217631b = objArr;
    }

    public final int i(int i10) {
        return i10 == 0 ? B.Oe(this.f217631b) : i10 - 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i10;
        int iC = C(getSize() + this.f217630a);
        int length = this.f217630a;
        if (length < iC) {
            while (length < iC) {
                if (kotlin.jvm.internal.G.g(obj, this.f217631b[length])) {
                    i10 = this.f217630a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f217630a) < iC) {
            return -1;
        }
        int length2 = this.f217631b.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iC; i11++) {
                    if (kotlin.jvm.internal.G.g(obj, this.f217631b[i11])) {
                        length = i11 + this.f217631b.length;
                        i10 = this.f217630a;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.G.g(obj, this.f217631b[length])) {
                i10 = this.f217630a;
                break;
            }
            length++;
        }
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return getSize() == 0;
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.f217631b[C(I.L(this) + this.f217630a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iOe;
        int i10;
        int iC = C(getSize() + this.f217630a);
        int i11 = this.f217630a;
        if (i11 < iC) {
            iOe = iC - 1;
            if (i11 <= iOe) {
                while (!kotlin.jvm.internal.G.g(obj, this.f217631b[iOe])) {
                    if (iOe != i11) {
                        iOe--;
                    }
                }
                i10 = this.f217630a;
                return iOe - i10;
            }
            return -1;
        }
        if (!isEmpty() && this.f217630a >= iC) {
            int i12 = iC - 1;
            while (true) {
                if (-1 >= i12) {
                    iOe = B.Oe(this.f217631b);
                    int i13 = this.f217630a;
                    if (i13 <= iOe) {
                        while (!kotlin.jvm.internal.G.g(obj, this.f217631b[iOe])) {
                            if (iOe != i13) {
                                iOe--;
                            }
                        }
                        i10 = this.f217630a;
                    }
                } else {
                    if (kotlin.jvm.internal.G.g(obj, this.f217631b[i12])) {
                        iOe = i12 + this.f217631b.length;
                        i10 = this.f217630a;
                        break;
                    }
                    i12--;
                }
            }
            return iOe - i10;
        }
        return -1;
    }

    public final boolean o(ed.l<? super E, Boolean> lVar) {
        int iC;
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f217631b.length != 0) {
            int iC2 = C(getSize() + this.f217630a);
            int i10 = this.f217630a;
            if (i10 < iC2) {
                iC = i10;
                while (i10 < iC2) {
                    Object obj = this.f217631b[i10];
                    if (lVar.invoke(obj).booleanValue()) {
                        this.f217631b[iC] = obj;
                        iC++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                C4875q.M1(this.f217631b, null, iC, iC2);
            } else {
                int length = this.f217631b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f217631b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (lVar.invoke(obj2).booleanValue()) {
                        this.f217631b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iC = C(i11);
                for (int i12 = 0; i12 < iC2; i12++) {
                    Object[] objArr2 = this.f217631b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (lVar.invoke(obj3).booleanValue()) {
                        this.f217631b[iC] = obj3;
                        iC = t(iC);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                D();
                this.f217632c = A(iC - this.f217630a);
            }
        }
        return z10;
    }

    @Nullable
    public final E q() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f217631b[this.f217630a];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @kotlin.C
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        b(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @kotlin.C
    public boolean removeAll(@NotNull Collection<?> elements) {
        int iC;
        kotlin.jvm.internal.G.p(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f217631b.length != 0) {
            int iC2 = C(getSize() + this.f217630a);
            int i10 = this.f217630a;
            if (i10 < iC2) {
                iC = i10;
                while (i10 < iC2) {
                    Object obj = this.f217631b[i10];
                    if (elements.contains(obj)) {
                        z10 = true;
                    } else {
                        this.f217631b[iC] = obj;
                        iC++;
                    }
                    i10++;
                }
                C4875q.M1(this.f217631b, null, iC, iC2);
            } else {
                int length = this.f217631b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f217631b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        z11 = true;
                    } else {
                        this.f217631b[i11] = obj2;
                        i11++;
                    }
                    i10++;
                }
                iC = C(i11);
                for (int i12 = 0; i12 < iC2; i12++) {
                    Object[] objArr2 = this.f217631b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        z11 = true;
                    } else {
                        this.f217631b[iC] = obj3;
                        iC = t(iC);
                    }
                }
                z10 = z11;
            }
            if (z10) {
                D();
                this.f217632c = A(iC - this.f217630a);
            }
        }
        return z10;
    }

    @kotlin.C
    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        D();
        Object[] objArr = this.f217631b;
        int i10 = this.f217630a;
        E e10 = (E) objArr[i10];
        objArr[i10] = null;
        this.f217630a = t(i10);
        this.f217632c = getSize() - 1;
        return e10;
    }

    @kotlin.C
    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        D();
        int iC = C(I.L(this) + this.f217630a);
        Object[] objArr = this.f217631b;
        E e10 = (E) objArr[iC];
        objArr[iC] = null;
        this.f217632c = getSize() - 1;
        return e10;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        AbstractC4859d.f217603a.d(i10, i11, getSize());
        int i12 = i11 - i10;
        if (i12 == 0) {
            return;
        }
        if (i12 == getSize()) {
            clear();
            return;
        }
        if (i12 == 1) {
            b(i10);
            return;
        }
        D();
        if (i10 < getSize() - i11) {
            G(i10, i11);
            int iC = C(this.f217630a + i12);
            B(this.f217630a, iC);
            this.f217630a = iC;
        } else {
            H(i10, i11);
            int iC2 = C(getSize() + this.f217630a);
            B(A(iC2 - i12), iC2);
        }
        this.f217632c = getSize() - i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @kotlin.C
    public boolean retainAll(@NotNull Collection<?> elements) {
        int iC;
        kotlin.jvm.internal.G.p(elements, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty() && this.f217631b.length != 0) {
            int iC2 = C(getSize() + this.f217630a);
            int i10 = this.f217630a;
            if (i10 < iC2) {
                iC = i10;
                while (i10 < iC2) {
                    Object obj = this.f217631b[i10];
                    if (elements.contains(obj)) {
                        this.f217631b[iC] = obj;
                        iC++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                C4875q.M1(this.f217631b, null, iC, iC2);
            } else {
                int length = this.f217631b.length;
                boolean z11 = false;
                int i11 = i10;
                while (i10 < length) {
                    Object[] objArr = this.f217631b;
                    Object obj2 = objArr[i10];
                    objArr[i10] = null;
                    if (elements.contains(obj2)) {
                        this.f217631b[i11] = obj2;
                        i11++;
                    } else {
                        z11 = true;
                    }
                    i10++;
                }
                iC = C(i11);
                for (int i12 = 0; i12 < iC2; i12++) {
                    Object[] objArr2 = this.f217631b;
                    Object obj3 = objArr2[i12];
                    objArr2[i12] = null;
                    if (elements.contains(obj3)) {
                        this.f217631b[iC] = obj3;
                        iC = t(iC);
                    } else {
                        z11 = true;
                    }
                }
                z10 = z11;
            }
            if (z10) {
                D();
                this.f217632c = A(iC - this.f217630a);
            }
        }
        return z10;
    }

    @Override // kotlin.collections.AbstractC4866h, java.util.AbstractList, java.util.List
    @kotlin.C
    public E set(int i10, E e10) {
        AbstractC4859d.f217603a.b(i10, getSize());
        int iC = C(this.f217630a + i10);
        Object[] objArr = this.f217631b;
        E e11 = (E) objArr[iC];
        objArr[iC] = e10;
        return e11;
    }

    public final int t(int i10) {
        if (i10 == B.Oe(this.f217631b)) {
            return 0;
        }
        return i10 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[getSize()]);
    }

    @Xc.f
    public final E v(int i10) {
        return (E) this.f217631b[i10];
    }

    @Xc.f
    public final int w(int i10) {
        return C(this.f217630a + i10);
    }

    public final void x(@NotNull ed.p<? super Integer, ? super Object[], L0> structure) {
        int i10;
        kotlin.jvm.internal.G.p(structure, "structure");
        structure.invoke(Integer.valueOf((isEmpty() || (i10 = this.f217630a) < C(getSize() + this.f217630a)) ? this.f217630a : i10 - this.f217631b.length), toArray());
    }

    @Nullable
    public final E z() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.f217631b[C(I.L(this) + this.f217630a)];
    }

    @Override // kotlin.collections.AbstractC4866h, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        AbstractC4859d.f217603a.c(i10, getSize());
        if (i10 == getSize()) {
            addLast(e10);
            return;
        }
        if (i10 == 0) {
            addFirst(e10);
            return;
        }
        D();
        j(getSize() + 1);
        int iC = C(this.f217630a + i10);
        if (i10 < ((getSize() + 1) >> 1)) {
            int i11 = i(iC);
            int i12 = i(this.f217630a);
            int i13 = this.f217630a;
            if (i11 >= i13) {
                Object[] objArr = this.f217631b;
                objArr[i12] = objArr[i13];
                C4875q.B0(objArr, objArr, i13, i13 + 1, i11 + 1);
            } else {
                Object[] objArr2 = this.f217631b;
                C4875q.B0(objArr2, objArr2, i13 - 1, i13, objArr2.length);
                Object[] objArr3 = this.f217631b;
                objArr3[objArr3.length - 1] = objArr3[0];
                C4875q.B0(objArr3, objArr3, 0, 1, i11 + 1);
            }
            this.f217631b[i11] = e10;
            this.f217630a = i12;
        } else {
            int iC2 = C(getSize() + this.f217630a);
            if (iC < iC2) {
                Object[] objArr4 = this.f217631b;
                C4875q.B0(objArr4, objArr4, iC + 1, iC, iC2);
            } else {
                Object[] objArr5 = this.f217631b;
                C4875q.B0(objArr5, objArr5, 1, 0, iC2);
                Object[] objArr6 = this.f217631b;
                objArr6[0] = objArr6[objArr6.length - 1];
                C4875q.B0(objArr6, objArr6, iC + 1, iC, objArr6.length - 1);
            }
            this.f217631b[iC] = e10;
        }
        this.f217632c = getSize() + 1;
    }

    public C4871m(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f217628e;
        } else if (i10 > 0) {
            objArr = new Object[i10];
        } else {
            throw new IllegalArgumentException(android.support.v4.media.c.a("Illegal Capacity: ", i10));
        }
        this.f217631b = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        kotlin.jvm.internal.G.p(array, "array");
        if (array.length < getSize()) {
            array = (T[]) C4873o.a(array, getSize());
        }
        T[] tArr = array;
        int iC = C(getSize() + this.f217630a);
        int i10 = this.f217630a;
        if (i10 < iC) {
            C4875q.K0(this.f217631b, tArr, 0, i10, iC, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f217631b;
            C4875q.B0(objArr, tArr, 0, this.f217630a, objArr.length);
            Object[] objArr2 = this.f217631b;
            C4875q.B0(objArr2, tArr, objArr2.length - this.f217630a, 0, iC);
        }
        H.o(getSize(), tArr);
        return tArr;
    }

    @Override // java.util.AbstractList, java.util.List
    @kotlin.C
    public boolean addAll(int i10, @NotNull Collection<? extends E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        AbstractC4859d.f217603a.c(i10, getSize());
        if (elements.isEmpty()) {
            return false;
        }
        if (i10 == getSize()) {
            return addAll(elements);
        }
        D();
        j(elements.size() + getSize());
        int iC = C(getSize() + this.f217630a);
        int iC2 = C(this.f217630a + i10);
        int size = elements.size();
        if (i10 < ((getSize() + 1) >> 1)) {
            int i11 = this.f217630a;
            int length = i11 - size;
            if (iC2 < i11) {
                Object[] objArr = this.f217631b;
                C4875q.B0(objArr, objArr, length, i11, objArr.length);
                if (size >= iC2) {
                    Object[] objArr2 = this.f217631b;
                    C4875q.B0(objArr2, objArr2, objArr2.length - size, 0, iC2);
                } else {
                    Object[] objArr3 = this.f217631b;
                    C4875q.B0(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f217631b;
                    C4875q.B0(objArr4, objArr4, 0, size, iC2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f217631b;
                C4875q.B0(objArr5, objArr5, length, i11, iC2);
            } else {
                Object[] objArr6 = this.f217631b;
                length += objArr6.length;
                int i12 = iC2 - i11;
                int length2 = objArr6.length - length;
                if (length2 >= i12) {
                    C4875q.B0(objArr6, objArr6, length, i11, iC2);
                } else {
                    C4875q.B0(objArr6, objArr6, length, i11, i11 + length2);
                    Object[] objArr7 = this.f217631b;
                    C4875q.B0(objArr7, objArr7, 0, this.f217630a + length2, iC2);
                }
            }
            this.f217630a = length;
            g(A(iC2 - size), elements);
        } else {
            int i13 = iC2 + size;
            if (iC2 < iC) {
                int i14 = size + iC;
                Object[] objArr8 = this.f217631b;
                if (i14 <= objArr8.length) {
                    C4875q.B0(objArr8, objArr8, i13, iC2, iC);
                } else if (i13 >= objArr8.length) {
                    C4875q.B0(objArr8, objArr8, i13 - objArr8.length, iC2, iC);
                } else {
                    int length3 = iC - (i14 - objArr8.length);
                    C4875q.B0(objArr8, objArr8, 0, length3, iC);
                    Object[] objArr9 = this.f217631b;
                    C4875q.B0(objArr9, objArr9, i13, iC2, length3);
                }
            } else {
                Object[] objArr10 = this.f217631b;
                C4875q.B0(objArr10, objArr10, size, 0, iC);
                Object[] objArr11 = this.f217631b;
                if (i13 >= objArr11.length) {
                    C4875q.B0(objArr11, objArr11, i13 - objArr11.length, iC2, objArr11.length);
                } else {
                    C4875q.B0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f217631b;
                    C4875q.B0(objArr12, objArr12, i13, iC2, objArr12.length - size);
                }
            }
            g(iC2, elements);
        }
        return true;
    }

    public C4871m(@NotNull Collection<? extends E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.f217631b = array;
        this.f217632c = array.length;
        if (array.length == 0) {
            this.f217631b = f217628e;
        }
    }
}
