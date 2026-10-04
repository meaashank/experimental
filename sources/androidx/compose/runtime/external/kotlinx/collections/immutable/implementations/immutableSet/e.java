package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.internal.r;
import java.util.Arrays;
import kotlin.collections.B;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n+ 2 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt\n+ 3 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,851:1\n54#2,13:852\n50#2,17:865\n50#2,17:882\n50#2,10:918\n60#2,7:929\n50#2,10:945\n60#2,7:956\n10#3,5:899\n15#3,4:905\n10#3,9:909\n10#3,9:936\n10#3,9:965\n1#4:904\n53#5:928\n53#5:955\n12541#6,2:963\n26#7:974\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode\n*L\n297#1:852,13\n324#1:865,17\n347#1:882,17\n594#1:918,10\n594#1:929,7\n701#1:945,10\n701#1:956,7\n423#1:899,5\n423#1:905,4\n525#1:909,9\n621#1:936,9\n717#1:965,9\n594#1:928\n701#1:955\n710#1:963,2\n849#1:974\n*E\n"})
@r(parameters = 0)
public final class e<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f99654e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f99656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public Object[] f99657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public M.f f99658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f99653d = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final e f99655f = new e(0, new Object[0], null);

    public static final class a {
        public a() {
        }

        @NotNull
        public final e a() {
            return e.f99655f;
        }

        public a(C4969v c4969v) {
        }
    }

    public e(int i10, @NotNull Object[] objArr, @Nullable M.f fVar) {
        this.f99656a = i10;
        this.f99657b = objArr;
        this.f99658c = fVar;
    }

    public final Object A(e<E> eVar, M.b bVar, M.f fVar) {
        if (this == eVar) {
            bVar.e(this.f99657b.length);
            return f99655f;
        }
        Object[] objArr = G.g(fVar, this.f99658c) ? this.f99657b : new Object[this.f99657b.length];
        Object[] objArr2 = this.f99657b;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr2.length; i11++) {
            if (!B.B8(eVar.f99657b, objArr2[i11])) {
                objArr[i10] = objArr2[i11];
                i10++;
            }
        }
        bVar.e(this.f99657b.length - i10);
        if (i10 == 0) {
            return f99655f;
        }
        if (i10 == 1) {
            return objArr[0];
        }
        if (i10 == this.f99657b.length) {
            return this;
        }
        if (i10 == objArr.length) {
            return new e(0, objArr, fVar);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i10);
        G.o(objArrCopyOf, "copyOf(this, newSize)");
        return new e(0, objArrCopyOf, fVar);
    }

    public final e<E> B(int i10, M.f fVar) {
        if (this.f99658c != fVar) {
            return new e<>(0, TrieNodeKt.g(this.f99657b, i10), fVar);
        }
        this.f99657b = TrieNodeKt.g(this.f99657b, i10);
        return this;
    }

    public final Object C(e<E> eVar, M.b bVar, M.f fVar) {
        if (this == eVar) {
            bVar.e(this.f99657b.length);
            return this;
        }
        Object[] objArr = G.g(fVar, this.f99658c) ? this.f99657b : new Object[Math.min(this.f99657b.length, eVar.f99657b.length)];
        Object[] objArr2 = this.f99657b;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr2.length; i11++) {
            if (B.B8(eVar.f99657b, objArr2[i11])) {
                objArr[i10] = objArr2[i11];
                i10++;
            }
        }
        bVar.e(i10);
        if (i10 == 0) {
            return f99655f;
        }
        if (i10 == 1) {
            return objArr[0];
        }
        if (i10 == this.f99657b.length) {
            return this;
        }
        if (i10 == eVar.f99657b.length) {
            return eVar;
        }
        if (i10 == objArr.length) {
            return new e(0, objArr, fVar);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i10);
        G.o(objArrCopyOf, "copyOf(this, newSize)");
        return new e(0, objArrCopyOf, fVar);
    }

    public final e<E> D(int i10, int i11, E e10, int i12, M.f fVar) {
        if (this.f99658c == fVar) {
            this.f99657b[i10] = s(i10, i11, e10, i12, fVar);
            return this;
        }
        Object[] objArr = this.f99657b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        G.o(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = s(i10, i11, e10, i12, fVar);
        return new e<>(this.f99656a, objArrCopyOf, fVar);
    }

    @NotNull
    public final e<E> E(int i10, E e10, int i11, @NotNull b<?> bVar) {
        int iF = 1 << TrieNodeKt.f(i10, i11);
        if (!p(iF)) {
            int iQ = q(iF);
            Object obj = this.f99657b[iQ];
            if (obj instanceof e) {
                e<E> eVarJ = J(iQ);
                e<E> eVarZ = i11 == 30 ? eVarJ.z(e10, bVar) : eVarJ.E(i10, e10, i11 + 5, bVar);
                M.f fVar = this.f99658c;
                M.f fVar2 = bVar.f99640b;
                if (fVar == fVar2 || eVarJ != eVarZ) {
                    return I(iQ, eVarZ, fVar2);
                }
            } else if (G.g(e10, obj)) {
                bVar.o(bVar.getSize() - 1);
                return G(iQ, iF, bVar.f99640b);
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object F(@org.jetbrains.annotations.NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e<E> r18, int r19, @org.jetbrains.annotations.NotNull M.b r20, @org.jetbrains.annotations.NotNull androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.b<?> r21) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e.F(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.e, int, M.b, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.b):java.lang.Object");
    }

    public final e<E> G(int i10, int i11, M.f fVar) {
        if (this.f99658c != fVar) {
            return new e<>(i11 ^ this.f99656a, TrieNodeKt.g(this.f99657b, i10), fVar);
        }
        this.f99657b = TrieNodeKt.g(this.f99657b, i10);
        this.f99656a ^= i11;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object H(@NotNull e<E> eVar, int i10, @NotNull M.b bVar, @NotNull b<?> bVar2) {
        if (this == eVar) {
            bVar.e(d());
            return this;
        }
        if (i10 > 30) {
            return C(eVar, bVar, bVar2.f99640b);
        }
        int i11 = this.f99656a & eVar.f99656a;
        if (i11 == 0) {
            return f99655f;
        }
        e<E> eVar2 = (G.g(this.f99658c, bVar2.f99640b) && i11 == this.f99656a) ? this : new e<>(i11, new Object[Integer.bitCount(i11)], bVar2.f99640b);
        int i12 = i11;
        int i13 = 0;
        int i14 = 0;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            int iQ = q(iLowestOneBit);
            int iQ2 = eVar.q(iLowestOneBit);
            Object objH = this.f99657b[iQ];
            Object obj = eVar.f99657b[iQ2];
            boolean z10 = objH instanceof e;
            boolean z11 = obj instanceof e;
            if (z10 && z11) {
                G.n(objH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                G.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                objH = ((e) objH).H((e) obj, i10 + 5, bVar, bVar2);
            } else if (z10) {
                G.n(objH, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                if (((e) objH).i(obj != null ? obj.hashCode() : 0, obj, i10 + 5)) {
                    bVar.e(1);
                    objH = obj;
                } else {
                    objH = f99655f;
                }
            } else if (z11) {
                G.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                if (((e) obj).i(objH != null ? objH.hashCode() : 0, objH, i10 + 5)) {
                    bVar.e(1);
                } else {
                    objH = f99655f;
                }
            } else if (G.g(objH, obj)) {
                bVar.e(1);
            } else {
                objH = f99655f;
            }
            if (objH != f99655f) {
                i13 |= iLowestOneBit;
            }
            eVar2.f99657b[i14] = objH;
            i14++;
            i12 ^= iLowestOneBit;
        }
        int i15 = 0;
        int iBitCount = Integer.bitCount(i13);
        if (i13 == 0) {
            return f99655f;
        }
        if (i13 == i11) {
            return eVar2.l(this) ? this : eVar2.l(eVar) ? eVar : eVar2;
        }
        if (iBitCount == 1 && i10 != 0) {
            Object obj2 = eVar2.f99657b[eVar2.q(i13)];
            return obj2 instanceof e ? new e(i13, new Object[]{obj2}, bVar2.f99640b) : obj2;
        }
        Object[] objArr = new Object[iBitCount];
        Object[] objArr2 = eVar2.f99657b;
        for (int i16 = 0; i16 < objArr2.length; i16++) {
            Object obj3 = objArr2[i16];
            f99653d.getClass();
            if (obj3 != f99655f) {
                objArr[i15] = objArr2[i16];
                i15++;
            }
        }
        return new e(i13, objArr, bVar2.f99640b);
    }

    public final e<E> I(int i10, e<E> eVar, M.f fVar) {
        Object[] objArr = eVar.f99657b;
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (!(obj instanceof e)) {
                if (this.f99657b.length == 1) {
                    eVar.f99656a = this.f99656a;
                    return eVar;
                }
                eVar = (e<E>) obj;
            }
        }
        if (this.f99658c == fVar) {
            this.f99657b[i10] = eVar;
            return this;
        }
        Object[] objArr2 = this.f99657b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        G.o(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = eVar;
        return new e<>(this.f99656a, objArrCopyOf, fVar);
    }

    public final e<E> J(int i10) {
        Object obj = this.f99657b[i10];
        G.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (e) obj;
    }

    @NotNull
    public final e<E> K(int i10, E e10, int i11) {
        int iF = 1 << TrieNodeKt.f(i10, i11);
        if (!p(iF)) {
            int iQ = q(iF);
            Object obj = this.f99657b[iQ];
            if (obj instanceof e) {
                e<E> eVarJ = J(iQ);
                e<E> eVarG = i11 == 30 ? eVarJ.g(e10) : eVarJ.K(i10, e10, i11 + 5);
                if (eVarJ != eVarG) {
                    return P(iQ, eVarG);
                }
            } else if (G.g(e10, obj)) {
                return L(iQ, iF);
            }
        }
        return this;
    }

    public final e<E> L(int i10, int i11) {
        return new e<>(i11 ^ this.f99656a, TrieNodeKt.g(this.f99657b, i10), null);
    }

    public final void M(int i10) {
        this.f99656a = i10;
    }

    public final void N(@NotNull Object[] objArr) {
        this.f99657b = objArr;
    }

    public final void O(@Nullable M.f fVar) {
        this.f99658c = fVar;
    }

    public final e<E> P(int i10, e<E> eVar) {
        Object[] objArr = eVar.f99657b;
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (!(obj instanceof e)) {
                if (this.f99657b.length == 1) {
                    eVar.f99656a = this.f99656a;
                    return eVar;
                }
                eVar = (e<E>) obj;
            }
        }
        Object[] objArr2 = this.f99657b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        G.o(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = eVar;
        return new e<>(this.f99656a, objArrCopyOf, null);
    }

    @NotNull
    public final e<E> b(int i10, E e10, int i11) {
        int iF = 1 << TrieNodeKt.f(i10, i11);
        if (p(iF)) {
            return c(iF, e10);
        }
        int iQ = q(iF);
        Object obj = this.f99657b[iQ];
        if (obj instanceof e) {
            e<E> eVarJ = J(iQ);
            e<E> eVarE = i11 == 30 ? eVarJ.e(e10) : eVarJ.b(i10, e10, i11 + 5);
            if (eVarJ != eVarE) {
                return P(iQ, eVarE);
            }
        } else if (!G.g(e10, obj)) {
            return t(iQ, i10, e10, i11);
        }
        return this;
    }

    public final e<E> c(int i10, E e10) {
        return new e<>(i10 | this.f99656a, TrieNodeKt.c(this.f99657b, q(i10), e10), null);
    }

    public final int d() {
        if (this.f99656a == 0) {
            return this.f99657b.length;
        }
        int iD = 0;
        for (Object obj : this.f99657b) {
            iD += obj instanceof e ? ((e) obj).d() : 1;
        }
        return iD;
    }

    public final e<E> e(E e10) {
        return B.B8(this.f99657b, e10) ? this : new e<>(0, TrieNodeKt.c(this.f99657b, 0, e10), null);
    }

    public final boolean f(E e10) {
        return B.B8(this.f99657b, e10);
    }

    public final e<E> g(E e10) {
        int iBg = B.bg(this.f99657b, e10);
        return iBg != -1 ? h(iBg) : this;
    }

    public final e<E> h(int i10) {
        return new e<>(0, TrieNodeKt.g(this.f99657b, i10), null);
    }

    public final boolean i(int i10, E e10, int i11) {
        int iF = 1 << TrieNodeKt.f(i10, i11);
        if (p(iF)) {
            return false;
        }
        int iQ = q(iF);
        Object obj = this.f99657b[iQ];
        if (!(obj instanceof e)) {
            return G.g(e10, obj);
        }
        e<E> eVarJ = J(iQ);
        return i11 == 30 ? B.B8(eVarJ.f99657b, e10) : eVarJ.i(i10, e10, i11 + 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(@NotNull e<E> eVar, int i10) {
        if (this == eVar) {
            return true;
        }
        if (i10 > 30) {
            for (Object obj : eVar.f99657b) {
                if (!B.B8(this.f99657b, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i11 = this.f99656a;
        int i12 = eVar.f99656a;
        int i13 = i11 & i12;
        if (i13 != i12) {
            return false;
        }
        while (i13 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i13);
            int iQ = q(iLowestOneBit);
            int iQ2 = eVar.q(iLowestOneBit);
            Object obj2 = this.f99657b[iQ];
            Object obj3 = eVar.f99657b[iQ2];
            boolean z10 = obj2 instanceof e;
            boolean z11 = obj3 instanceof e;
            if (z10 && z11) {
                G.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                G.n(obj3, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((e) obj2).j((e) obj3, i10 + 5)) {
                    return false;
                }
            } else if (z10) {
                G.n(obj2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((e) obj2).i(obj3 != null ? obj3.hashCode() : 0, obj3, i10 + 5)) {
                    return false;
                }
            } else if (z11 || !G.g(obj2, obj3)) {
                return false;
            }
            i13 ^= iLowestOneBit;
        }
        return true;
    }

    public final E k(int i10) {
        return (E) this.f99657b[i10];
    }

    public final boolean l(e<E> eVar) {
        if (this == eVar) {
            return true;
        }
        if (this.f99656a != eVar.f99656a) {
            return false;
        }
        int length = this.f99657b.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f99657b[i10] != eVar.f99657b[i10]) {
                return false;
            }
        }
        return true;
    }

    public final int m() {
        return this.f99656a;
    }

    @NotNull
    public final Object[] n() {
        return this.f99657b;
    }

    @Nullable
    public final M.f o() {
        return this.f99658c;
    }

    public final boolean p(int i10) {
        return (i10 & this.f99656a) == 0;
    }

    public final int q(int i10) {
        return Integer.bitCount((i10 - 1) & this.f99656a);
    }

    public final e<E> r(int i10, E e10, int i11, E e11, int i12, M.f fVar) {
        if (i12 > 30) {
            return new e<>(0, new Object[]{e10, e11}, fVar);
        }
        int iF = TrieNodeKt.f(i10, i12);
        int iF2 = TrieNodeKt.f(i11, i12);
        if (iF != iF2) {
            return new e<>((1 << iF) | (1 << iF2), iF < iF2 ? new Object[]{e10, e11} : new Object[]{e11, e10}, fVar);
        }
        return new e<>(1 << iF, new Object[]{r(i10, e10, i11, e11, i12 + 5, fVar)}, fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final e<E> s(int i10, int i11, E e10, int i12, M.f fVar) {
        Object obj = this.f99657b[i10];
        return r(obj != null ? obj.hashCode() : 0, obj, i11, e10, i12 + 5, fVar);
    }

    public final e<E> t(int i10, int i11, E e10, int i12) {
        Object[] objArr = this.f99657b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        G.o(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = s(i10, i11, e10, i12, null);
        return new e<>(this.f99656a, objArrCopyOf, null);
    }

    @NotNull
    public final e<E> u(int i10, E e10, int i11, @NotNull b<?> bVar) {
        int iF = 1 << TrieNodeKt.f(i10, i11);
        if (p(iF)) {
            bVar.o(bVar.getSize() + 1);
            return w(iF, e10, bVar.f99640b);
        }
        int iQ = q(iF);
        Object obj = this.f99657b[iQ];
        if (obj instanceof e) {
            e<E> eVarJ = J(iQ);
            e<E> eVarX = i11 == 30 ? eVarJ.x(e10, bVar) : eVarJ.u(i10, e10, i11 + 5, bVar);
            if (eVarJ != eVarX) {
                return I(iQ, eVarX, bVar.f99640b);
            }
        } else if (!G.g(e10, obj)) {
            bVar.o(bVar.getSize() + 1);
            return D(iQ, i10, e10, i11, bVar.f99640b);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final e<E> v(@NotNull e<E> eVar, int i10, @NotNull M.b bVar, @NotNull b<?> bVar2) {
        Object objR;
        Object[] objArr;
        if (this == eVar) {
            bVar.f58781a = d() + bVar.f58781a;
            return this;
        }
        if (i10 > 30) {
            return y(eVar, bVar, bVar2.f99640b);
        }
        int i11 = this.f99656a;
        int i12 = eVar.f99656a | i11;
        e<E> eVar2 = (i12 == i11 && G.g(this.f99658c, bVar2.f99640b)) ? this : new e<>(i12, new Object[Integer.bitCount(i12)], bVar2.f99640b);
        int i13 = i12;
        int i14 = 0;
        while (i13 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i13);
            int iQ = q(iLowestOneBit);
            int iQ2 = eVar.q(iLowestOneBit);
            Object[] objArr2 = eVar2.f99657b;
            if (p(iLowestOneBit)) {
                objR = eVar.f99657b[iQ2];
            } else if (eVar.p(iLowestOneBit)) {
                objR = this.f99657b[iQ];
            } else {
                objR = this.f99657b[iQ];
                Object obj = eVar.f99657b[iQ2];
                boolean z10 = objR instanceof e;
                boolean z11 = obj instanceof e;
                if (z10 && z11) {
                    G.n(objR, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    G.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    objR = ((e) objR).v((e) obj, i10 + 5, bVar, bVar2);
                } else if (z10) {
                    G.n(objR, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    e eVar3 = (e) objR;
                    int size = bVar2.getSize();
                    objR = eVar3.u(obj != null ? obj.hashCode() : 0, obj, i10 + 5, bVar2);
                    if (bVar2.getSize() == size) {
                        bVar.f58781a++;
                    }
                } else if (z11) {
                    G.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    e eVar4 = (e) obj;
                    int size2 = bVar2.getSize();
                    objR = eVar4.u(objR != null ? objR.hashCode() : 0, objR, i10 + 5, bVar2);
                    if (bVar2.getSize() == size2) {
                        bVar.f58781a++;
                    }
                } else if (G.g(objR, obj)) {
                    bVar.f58781a++;
                } else {
                    objArr = objArr2;
                    objR = r(objR != null ? objR.hashCode() : 0, objR, obj != null ? obj.hashCode() : 0, obj, i10 + 5, bVar2.f99640b);
                    objArr[i14] = objR;
                    i14++;
                    i13 ^= iLowestOneBit;
                }
            }
            objArr = objArr2;
            objArr[i14] = objR;
            i14++;
            i13 ^= iLowestOneBit;
        }
        return l(eVar2) ? this : eVar.l(eVar2) ? eVar : eVar2;
    }

    public final e<E> w(int i10, E e10, M.f fVar) {
        int iQ = q(i10);
        if (this.f99658c != fVar) {
            return new e<>(i10 | this.f99656a, TrieNodeKt.c(this.f99657b, iQ, e10), fVar);
        }
        this.f99657b = TrieNodeKt.c(this.f99657b, iQ, e10);
        this.f99656a = i10 | this.f99656a;
        return this;
    }

    public final e<E> x(E e10, b<?> bVar) {
        if (B.B8(this.f99657b, e10)) {
            return this;
        }
        bVar.o(bVar.getSize() + 1);
        if (this.f99658c != bVar.f99640b) {
            return new e<>(0, TrieNodeKt.c(this.f99657b, 0, e10), bVar.f99640b);
        }
        this.f99657b = TrieNodeKt.c(this.f99657b, 0, e10);
        return this;
    }

    public final e<E> y(e<E> eVar, M.b bVar, M.f fVar) {
        if (this == eVar) {
            bVar.e(this.f99657b.length);
            return this;
        }
        Object[] objArr = this.f99657b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + eVar.f99657b.length);
        G.o(objArrCopyOf, "copyOf(this, newSize)");
        Object[] objArr2 = eVar.f99657b;
        int length = this.f99657b.length;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr2.length; i11++) {
            if (!B.B8(this.f99657b, objArr2[i11])) {
                objArrCopyOf[length + i10] = objArr2[i11];
                i10++;
            }
        }
        int length2 = i10 + this.f99657b.length;
        bVar.e(objArrCopyOf.length - length2);
        if (length2 == this.f99657b.length) {
            return this;
        }
        if (length2 == eVar.f99657b.length) {
            return eVar;
        }
        if (length2 != objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length2);
            G.o(objArrCopyOf, "copyOf(this, newSize)");
        }
        if (!G.g(this.f99658c, fVar)) {
            return new e<>(0, objArrCopyOf, fVar);
        }
        this.f99657b = objArrCopyOf;
        return this;
    }

    public final e<E> z(E e10, b<?> bVar) {
        int iBg = B.bg(this.f99657b, e10);
        if (iBg == -1) {
            return this;
        }
        bVar.o(bVar.getSize() - 1);
        return B(iBg, bVar.f99640b);
    }

    public e(int i10, @NotNull Object[] objArr) {
        this(i10, objArr, null);
    }
}
