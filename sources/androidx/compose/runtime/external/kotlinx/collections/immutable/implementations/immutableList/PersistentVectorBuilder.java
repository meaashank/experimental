package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.U0;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.r;
import ed.l;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.AbstractC4866h;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4955g;
import kotlin.jvm.internal.C4956h;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nPersistentVectorBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,995:1\n33#2,7:996\n33#2,7:1003\n33#2,7:1011\n33#2,7:1019\n33#2,7:1026\n1#3:1010\n26#4:1018\n*S KotlinDebug\n*F\n+ 1 PersistentVectorBuilder.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder\n*L\n242#1:996,7\n243#1:1003,7\n480#1:1011,7\n746#1:1019,7\n769#1:1026,7\n623#1:1018\n*E\n"})
@r(parameters = 0)
public final class PersistentVectorBuilder<E> extends AbstractC4866h<E> implements PersistentList.Builder<E> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f99584i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public PersistentList<? extends E> f99585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Object[] f99586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public Object[] f99587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f99588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public M.f f99589e = new M.f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Object[] f99590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public Object[] f99591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f99592h;

    public PersistentVectorBuilder(@NotNull PersistentList<? extends E> persistentList, @Nullable Object[] objArr, @NotNull Object[] objArr2, int i10) {
        this.f99585a = persistentList;
        this.f99586b = objArr;
        this.f99587c = objArr2;
        this.f99588d = i10;
        this.f99590f = objArr;
        this.f99591g = objArr2;
        this.f99592h = persistentList.size();
    }

    private final Object[] F(Object[] objArr, int i10, int i11, c cVar) {
        Object[] objArrF;
        int iA = j.a(i11 - 1, i10);
        if (i10 == 5) {
            cVar.f99600a = objArr[iA];
            objArrF = null;
        } else {
            Object obj = objArr[iA];
            G.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrF = F((Object[]) obj, i10 - 5, i11, cVar);
        }
        if (objArrF == null && iA == 0) {
            return null;
        }
        Object[] objArrA = A(objArr);
        objArrA[iA] = objArrF;
        return objArrA;
    }

    private final boolean N(l<? super E, Boolean> lVar) {
        Object[] objArrH;
        int iY = Y();
        c cVar = new c(null);
        if (this.f99590f == null) {
            return O(lVar, iY, cVar) != iY;
        }
        ListIterator<Object[]> listIteratorZ = z(0);
        int iM = 32;
        while (iM == 32 && listIteratorZ.hasNext()) {
            iM = M(lVar, listIteratorZ.next(), 32, cVar);
        }
        if (iM == 32) {
            listIteratorZ.hasNext();
            int iO = O(lVar, iY, cVar);
            if (iO == 0) {
                G(this.f99590f, getSize(), this.f99588d);
            }
            return iO != iY;
        }
        int iPreviousIndex = listIteratorZ.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iL = iM;
        while (listIteratorZ.hasNext()) {
            iL = L(lVar, listIteratorZ.next(), 32, iL, cVar, arrayList2, arrayList);
        }
        int iL2 = L(lVar, this.f99591g, iY, iL, cVar, arrayList2, arrayList);
        Object obj = cVar.f99600a;
        G.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iL2, 32, (Object) null);
        if (arrayList.isEmpty()) {
            objArrH = this.f99590f;
            G.m(objArrH);
        } else {
            objArrH = H(this.f99590f, iPreviousIndex, this.f99588d, arrayList.iterator());
        }
        int size = iPreviousIndex + (arrayList.size() << 5);
        this.f99590f = S(objArrH, size);
        this.f99591g = objArr;
        this.f99592h = size + iL2;
        return true;
    }

    private final Object[] Q(Object[] objArr, int i10, int i11, c cVar) {
        int iA = j.a(i11, i10);
        if (i10 == 0) {
            Object obj = objArr[iA];
            Object[] objArrA = A(objArr);
            C4875q.B0(objArr, objArrA, iA, iA + 1, 32);
            objArrA[31] = cVar.f99600a;
            cVar.f99600a = obj;
            return objArrA;
        }
        int iA2 = objArr[31] == null ? j.a(T() - 1, i10) : 31;
        Object[] objArrA2 = A(objArr);
        int i12 = i10 - 5;
        int i13 = iA + 1;
        if (i13 <= iA2) {
            while (true) {
                Object obj2 = objArrA2[iA2];
                G.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrA2[iA2] = Q((Object[]) obj2, i12, 0, cVar);
                if (iA2 == i13) {
                    break;
                }
                iA2--;
            }
        }
        Object obj3 = objArrA2[iA];
        G.n(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrA2[iA] = Q((Object[]) obj3, i12, i11, cVar);
        return objArrA2;
    }

    private final int T() {
        if (getSize() <= 32) {
            return 0;
        }
        return j.d(getSize());
    }

    private final Object[] g(int i10) {
        if (T() <= i10) {
            return this.f99591g;
        }
        Object[] objArr = this.f99590f;
        G.m(objArr);
        for (int i11 = this.f99588d; i11 > 0; i11 -= 5) {
            Object[] objArr2 = objArr[j.a(i10, i11)];
            G.n(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    private final Object[] v(Object[] objArr, int i10, int i11, Object obj, c cVar) {
        Object obj2;
        int iA = j.a(i11, i10);
        if (i10 == 0) {
            cVar.f99600a = objArr[31];
            Object[] objArrA = A(objArr);
            C4875q.B0(objArr, objArrA, iA + 1, iA, 31);
            objArrA[iA] = obj;
            return objArrA;
        }
        Object[] objArrA2 = A(objArr);
        int i12 = i10 - 5;
        Object obj3 = objArrA2[iA];
        G.n(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrA2[iA] = v((Object[]) obj3, i12, i11, obj, cVar);
        while (true) {
            iA++;
            if (iA >= 32 || (obj2 = objArrA2[iA]) == null) {
                break;
            }
            G.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrA2[iA] = v((Object[]) obj2, i12, 0, cVar.f99600a, cVar);
        }
        return objArrA2;
    }

    public final Object[] A(Object[] objArr) {
        if (objArr == null) {
            return C();
        }
        if (x(objArr)) {
            return objArr;
        }
        Object[] objArrC = C();
        int length = objArr.length;
        C4875q.K0(objArr, objArrC, 0, 0, length > 32 ? 32 : length, 6, null);
        return objArrC;
    }

    public final Object[] B(Object[] objArr, int i10) {
        if (x(objArr)) {
            C4875q.B0(objArr, objArr, i10, 0, 32 - i10);
            return objArr;
        }
        Object[] objArrC = C();
        C4875q.B0(objArr, objArrC, i10, 0, 32 - i10);
        return objArrC;
    }

    public final Object[] C() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f99589e;
        return objArr;
    }

    public final Object[] D(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f99589e;
        return objArr;
    }

    public final Object[] E(Object[] objArr, int i10, int i11) {
        if (!(i11 >= 0)) {
            U0.d("shift should be positive");
            throw null;
        }
        if (i11 == 0) {
            return objArr;
        }
        int iA = j.a(i10, i11);
        Object obj = objArr[iA];
        G.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objE = E((Object[]) obj, i10, i11 - 5);
        if (iA < 31) {
            int i12 = iA + 1;
            if (objArr[i12] != null) {
                if (x(objArr)) {
                    Arrays.fill(objArr, i12, 32, (Object) null);
                }
                Object[] objArrC = C();
                C4875q.B0(objArr, objArrC, 0, 0, i12);
                objArr = objArrC;
            }
        }
        if (objE == objArr[iA]) {
            return objArr;
        }
        Object[] objArrA = A(objArr);
        objArrA[iA] = objE;
        return objArrA;
    }

    public final void G(Object[] objArr, int i10, int i11) {
        if (i11 == 0) {
            this.f99590f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f99591g = objArr;
            this.f99592h = i10;
            this.f99588d = i11;
            return;
        }
        c cVar = new c(null);
        G.m(objArr);
        Object[] objArrF = F(objArr, i11, i10, cVar);
        G.m(objArrF);
        Object obj = cVar.f99600a;
        G.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f99591g = (Object[]) obj;
        this.f99592h = i10;
        if (objArrF[1] == null) {
            this.f99590f = (Object[]) objArrF[0];
            this.f99588d = i11 - 5;
        } else {
            this.f99590f = objArrF;
            this.f99588d = i11;
        }
    }

    public final Object[] H(Object[] objArr, int i10, int i11, Iterator<Object[]> it) {
        if (!it.hasNext()) {
            U0.d("invalid buffersIterator");
            throw null;
        }
        if (!(i11 >= 0)) {
            U0.d("negative shift");
            throw null;
        }
        if (i11 == 0) {
            return it.next();
        }
        Object[] objArrA = A(objArr);
        int iA = j.a(i10, i11);
        int i12 = i11 - 5;
        objArrA[iA] = H((Object[]) objArrA[iA], i10, i12, it);
        while (true) {
            iA++;
            if (iA >= 32 || !it.hasNext()) {
                break;
            }
            objArrA[iA] = H((Object[]) objArrA[iA], 0, i12, it);
        }
        return objArrA;
    }

    public final Object[] I(Object[] objArr, int i10, Object[][] objArr2) {
        Iterator<Object[]> itA = C4956h.a(objArr2);
        int i11 = i10 >> 5;
        int i12 = this.f99588d;
        Object[] objArrH = i11 < (1 << i12) ? H(objArr, i10, i12, itA) : A(objArr);
        while (((C4955g) itA).hasNext()) {
            this.f99588d += 5;
            objArrH = D(objArrH);
            int i13 = this.f99588d;
            H(objArrH, 1 << i13, i13, itA);
        }
        return objArrH;
    }

    public final void J(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int size = getSize() >> 5;
        int i10 = this.f99588d;
        if (size > (1 << i10)) {
            this.f99590f = K(D(objArr), objArr2, this.f99588d + 5);
            this.f99591g = objArr3;
            this.f99588d += 5;
            this.f99592h = getSize() + 1;
            return;
        }
        if (objArr == null) {
            this.f99590f = objArr2;
            this.f99591g = objArr3;
            this.f99592h = getSize() + 1;
        } else {
            this.f99590f = K(objArr, objArr2, i10);
            this.f99591g = objArr3;
            this.f99592h = getSize() + 1;
        }
    }

    public final Object[] K(Object[] objArr, Object[] objArr2, int i10) {
        int iA = j.a(getSize() - 1, i10);
        Object[] objArrA = A(objArr);
        if (i10 == 5) {
            objArrA[iA] = objArr2;
            return objArrA;
        }
        objArrA[iA] = K((Object[]) objArrA[iA], objArr2, i10 - 5);
        return objArrA;
    }

    public final int L(l<? super E, Boolean> lVar, Object[] objArr, int i10, int i11, c cVar, List<Object[]> list, List<Object[]> list2) {
        if (x(objArr)) {
            list.add(objArr);
        }
        Object obj = cVar.f99600a;
        G.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrRemove = objArr2;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj2 = objArr[i12];
            if (!lVar.invoke(obj2).booleanValue()) {
                if (i11 == 32) {
                    objArrRemove = !list.isEmpty() ? list.remove(list.size() - 1) : C();
                    i11 = 0;
                }
                objArrRemove[i11] = obj2;
                i11++;
            }
        }
        cVar.f99600a = objArrRemove;
        if (objArr2 != objArrRemove) {
            list2.add(objArr2);
        }
        return i11;
    }

    public final int M(l<? super E, Boolean> lVar, Object[] objArr, int i10, c cVar) {
        Object[] objArrA = objArr;
        int i11 = i10;
        boolean z10 = false;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z10) {
                    objArrA = A(objArr);
                    z10 = true;
                    i11 = i12;
                }
            } else if (z10) {
                objArrA[i11] = obj;
                i11++;
            }
        }
        cVar.f99600a = objArrA;
        return i11;
    }

    public final int O(l<? super E, Boolean> lVar, int i10, c cVar) {
        int iM = M(lVar, this.f99591g, i10, cVar);
        if (iM == i10) {
            return i10;
        }
        Object obj = cVar.f99600a;
        G.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iM, i10, (Object) null);
        this.f99591g = objArr;
        this.f99592h = getSize() - (i10 - iM);
        return iM;
    }

    public final boolean P(@NotNull l<? super E, Boolean> lVar) {
        boolean zN = N(lVar);
        if (zN) {
            ((AbstractList) this).modCount++;
        }
        return zN;
    }

    public final Object R(Object[] objArr, int i10, int i11, int i12) {
        int size = getSize() - i10;
        if (size == 1) {
            Object obj = this.f99591g[0];
            G(objArr, i10, i11);
            return obj;
        }
        Object[] objArr2 = this.f99591g;
        Object obj2 = objArr2[i12];
        Object[] objArrA = A(objArr2);
        C4875q.B0(objArr2, objArrA, i12, i12 + 1, size);
        objArrA[size - 1] = null;
        this.f99590f = objArr;
        this.f99591g = objArrA;
        this.f99592h = (i10 + size) - 1;
        this.f99588d = i11;
        return obj2;
    }

    public final Object[] S(Object[] objArr, int i10) {
        if (!((i10 & 31) == 0)) {
            U0.d("invalid size");
            throw null;
        }
        if (i10 == 0) {
            this.f99588d = 0;
            return null;
        }
        int i11 = i10 - 1;
        while (true) {
            int i12 = this.f99588d;
            if ((i11 >> i12) != 0) {
                return E(objArr, i11, i12);
            }
            this.f99588d = i12 - 5;
            Object[] objArr2 = objArr[0];
            G.n(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
    }

    public final Object[] U(Object[] objArr, int i10, int i11, E e10, c cVar) {
        int iA = j.a(i11, i10);
        Object[] objArrA = A(objArr);
        if (i10 != 0) {
            Object obj = objArrA[iA];
            G.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrA[iA] = U((Object[]) obj, i10 - 5, i11, e10, cVar);
            return objArrA;
        }
        if (objArrA != objArr) {
            ((AbstractList) this).modCount++;
        }
        cVar.f99600a = objArrA[iA];
        objArrA[iA] = e10;
        return objArrA;
    }

    public final void V(int i10) {
        this.f99588d = i10;
    }

    public final Object[] W(int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        if (this.f99590f == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator<Object[]> listIteratorZ = z(T() >> 5);
        while (listIteratorZ.previousIndex() != i10) {
            Object[] objArrPrevious = listIteratorZ.previous();
            C4875q.B0(objArrPrevious, objArr2, 0, 32 - i11, 32);
            objArr2 = B(objArrPrevious, i11);
            i12--;
            objArr[i12] = objArr2;
        }
        return listIteratorZ.previous();
    }

    public final void X(Collection<? extends E> collection, int i10, Object[] objArr, int i11, Object[][] objArr2, int i12, Object[] objArr3) {
        Object[] objArrC;
        if (!(i12 >= 1)) {
            U0.d("requires at least one nullBuffer");
            throw null;
        }
        Object[] objArrA = A(objArr);
        objArr2[0] = objArrA;
        int i13 = i10 & 31;
        int size = ((collection.size() + i10) - 1) & 31;
        int i14 = (i11 - i13) + size;
        if (i14 < 32) {
            C4875q.B0(objArrA, objArr3, size + 1, i13, i11);
        } else {
            int i15 = i14 - 31;
            if (i12 == 1) {
                objArrC = objArrA;
            } else {
                objArrC = C();
                i12--;
                objArr2[i12] = objArrC;
            }
            int i16 = i11 - i15;
            C4875q.B0(objArrA, objArr3, 0, i16, i11);
            C4875q.B0(objArrA, objArrC, size + 1, i13, i16);
            objArr3 = objArrC;
        }
        Iterator<? extends E> it = collection.iterator();
        h(objArrA, i13, it);
        for (int i17 = 1; i17 < i12; i17++) {
            Object[] objArrC2 = C();
            h(objArrC2, 0, it);
            objArr2[i17] = objArrC2;
        }
        h(objArr3, 0, it);
    }

    public final int Y() {
        return Z(getSize());
    }

    public final int Z(int i10) {
        return i10 <= 32 ? i10 : i10 - j.d(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractC4866h, java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        M.e.b(i10, getSize());
        if (i10 == getSize()) {
            add(e10);
            return;
        }
        ((AbstractList) this).modCount++;
        int iT = T();
        if (i10 >= iT) {
            w(this.f99590f, i10 - iT, e10);
            return;
        }
        c cVar = new c(null);
        Object[] objArr = this.f99590f;
        G.m(objArr);
        w(v(objArr, this.f99588d, i10, e10, cVar), 0, cVar.f99600a);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, @NotNull Collection<? extends E> collection) {
        PersistentVectorBuilder<E> persistentVectorBuilder;
        Collection<? extends E> collection2;
        Object[] objArrC;
        M.e.b(i10, getSize());
        if (i10 == getSize()) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i11 = (i10 >> 5) << 5;
        int size = ((collection.size() + (getSize() - i11)) - 1) / 32;
        if (size == 0) {
            int i12 = i10 & 31;
            int size2 = ((collection.size() + i10) - 1) & 31;
            Object[] objArr = this.f99591g;
            Object[] objArrA = A(objArr);
            C4875q.B0(objArr, objArrA, size2 + 1, i12, Y());
            h(objArrA, i12, collection.iterator());
            this.f99591g = objArrA;
            this.f99592h = collection.size() + getSize();
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iY = Y();
        int iZ = Z(collection.size() + getSize());
        if (i10 >= T()) {
            objArrC = C();
            persistentVectorBuilder = this;
            collection2 = collection;
            persistentVectorBuilder.X(collection2, i10, this.f99591g, iY, objArr2, size, objArrC);
            objArr2 = objArr2;
        } else {
            persistentVectorBuilder = this;
            collection2 = collection;
            if (iZ > iY) {
                int i13 = iZ - iY;
                Object[] objArrB = B(persistentVectorBuilder.f99591g, i13);
                persistentVectorBuilder.t(collection2, i10, i13, objArr2, size, objArrB);
                objArr2 = objArr2;
                objArrC = objArrB;
            } else {
                Object[] objArr3 = persistentVectorBuilder.f99591g;
                objArrC = C();
                int i14 = iY - iZ;
                C4875q.B0(objArr3, objArrC, 0, i14, iY);
                int i15 = 32 - i14;
                Object[] objArrB2 = B(persistentVectorBuilder.f99591g, i15);
                int i16 = size - 1;
                objArr2[i16] = objArrB2;
                persistentVectorBuilder.t(collection2, i10, i15, objArr2, i16, objArrB2);
                persistentVectorBuilder = persistentVectorBuilder;
                collection2 = collection2;
            }
        }
        persistentVectorBuilder.f99590f = I(persistentVectorBuilder.f99590f, i11, objArr2);
        persistentVectorBuilder.f99591g = objArrC;
        persistentVectorBuilder.f99592h = collection2.size() + getSize();
        return true;
    }

    @Override // kotlin.collections.AbstractC4866h
    public E b(int i10) {
        M.e.a(i10, getSize());
        ((AbstractList) this).modCount++;
        int iT = T();
        if (i10 >= iT) {
            return (E) R(this.f99590f, iT, this.f99588d, i10 - iT);
        }
        c cVar = new c(this.f99591g[0]);
        Object[] objArr = this.f99590f;
        G.m(objArr);
        R(Q(objArr, this.f99588d, i10, cVar), iT, this.f99588d, 0);
        return (E) cVar.f99600a;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        M.e.a(i10, getSize());
        return (E) g(i10)[i10 & 31];
    }

    @Override // kotlin.collections.AbstractC4866h
    public int getSize() {
        return this.f99592h;
    }

    public final Object[] h(Object[] objArr, int i10, Iterator<? extends Object> it) {
        while (i10 < 32 && it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return objArr;
    }

    public final int i() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @NotNull
    public Iterator<E> iterator() {
        return listIterator(0);
    }

    @Nullable
    public final Object[] j() {
        return this.f99590f;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator(int i10) {
        M.e.b(i10, getSize());
        return new f(this, i10);
    }

    public final int o() {
        return this.f99588d;
    }

    @NotNull
    public final Object[] q() {
        return this.f99591g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull final Collection<? extends Object> collection) {
        return P(new l<E, Boolean>() { // from class: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder.removeAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(E e10) {
                return Boolean.valueOf(collection.contains(e10));
            }
        });
    }

    @Override // kotlin.collections.AbstractC4866h, java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        M.e.a(i10, getSize());
        if (T() > i10) {
            c cVar = new c(null);
            Object[] objArr = this.f99590f;
            G.m(objArr);
            this.f99590f = U(objArr, this.f99588d, i10, e10, cVar);
            return (E) cVar.f99600a;
        }
        Object[] objArrA = A(this.f99591g);
        if (objArrA != this.f99591g) {
            ((AbstractList) this).modCount++;
        }
        int i11 = i10 & 31;
        E e11 = (E) objArrA[i11];
        objArrA[i11] = e10;
        this.f99591g = objArrA;
        return e11;
    }

    public final void t(Collection<? extends E> collection, int i10, int i11, Object[][] objArr, int i12, Object[] objArr2) {
        Object[] objArr3;
        if (this.f99590f == null) {
            throw new IllegalStateException("root is null");
        }
        int i13 = i10 >> 5;
        Object[] objArrW = W(i13, i11, objArr, i12, objArr2);
        int iT = i12 - (((T() >> 5) - 1) - i13);
        if (iT < i12) {
            Object[] objArr4 = objArr[iT];
            G.m(objArr4);
            objArr3 = objArr4;
        } else {
            objArr3 = objArr2;
        }
        X(collection, i10, objArrW, 32, objArr, iT, objArr3);
    }

    public final void w(Object[] objArr, int i10, E e10) {
        int iY = Y();
        Object[] objArrA = A(this.f99591g);
        if (iY < 32) {
            C4875q.B0(this.f99591g, objArrA, i10 + 1, i10, iY);
            objArrA[i10] = e10;
            this.f99590f = objArr;
            this.f99591g = objArrA;
            this.f99592h = getSize() + 1;
            return;
        }
        Object[] objArr2 = this.f99591g;
        Object obj = objArr2[31];
        C4875q.B0(objArr2, objArrA, i10 + 1, i10, 31);
        objArrA[i10] = e10;
        J(objArr, objArrA, D(obj));
    }

    public final boolean x(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f99589e;
    }

    public final ListIterator<Object[]> z(int i10) {
        Object[] objArr = this.f99590f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iT = T() >> 5;
        M.e.b(i10, iT);
        int i11 = this.f99588d;
        return i11 == 0 ? new g(objArr, i10) : new i(objArr, i10, iT, i11 / 5);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder
    @NotNull
    public PersistentList<E> build() {
        d dVar;
        Object[] objArr = this.f99590f;
        if (objArr == this.f99586b && this.f99591g == this.f99587c) {
            dVar = this.f99585a;
        } else {
            this.f99589e = new M.f();
            this.f99586b = objArr;
            Object[] objArr2 = this.f99591g;
            this.f99587c = objArr2;
            if (objArr != null) {
                G.m(objArr);
                dVar = new d(objArr, this.f99591g, getSize(), this.f99588d);
            } else if (objArr2.length == 0) {
                dVar = j.b();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.f99591g, getSize());
                G.o(objArrCopyOf, "copyOf(this, newSize)");
                dVar = new h(objArrCopyOf);
            }
        }
        this.f99585a = dVar;
        return (PersistentList<E>) dVar;
    }

    @Override // java.util.AbstractList, java.util.List
    @NotNull
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        ((AbstractList) this).modCount++;
        int iY = Y();
        if (iY < 32) {
            Object[] objArrA = A(this.f99591g);
            objArrA[iY] = e10;
            this.f99591g = objArrA;
            this.f99592h = getSize() + 1;
        } else {
            J(this.f99590f, this.f99591g, D(e10));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iY = Y();
        Iterator<? extends E> it = collection.iterator();
        if (32 - iY >= collection.size()) {
            Object[] objArrA = A(this.f99591g);
            h(objArrA, iY, it);
            this.f99591g = objArrA;
            this.f99592h = collection.size() + getSize();
        } else {
            int size = ((collection.size() + iY) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] objArrA2 = A(this.f99591g);
            h(objArrA2, iY, it);
            objArr[0] = objArrA2;
            for (int i10 = 1; i10 < size; i10++) {
                Object[] objArrC = C();
                h(objArrC, 0, it);
                objArr[i10] = objArrC;
            }
            this.f99590f = I(this.f99590f, T(), objArr);
            Object[] objArrC2 = C();
            h(objArrC2, 0, it);
            this.f99591g = objArrC2;
            this.f99592h = collection.size() + getSize();
        }
        return true;
    }
}
