package kotlinx.collections.immutable.implementations.immutableSet;

import java.util.Arrays;
import kotlin.collections.B;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ud.g;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nkotlinx/collections/immutable/implementations/immutableSet/TrieNode\n+ 2 TrieNode.kt\nkotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt\n+ 3 ForEachOneBit.kt\nkotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TrieNode.kt\nkotlinx/collections/immutable/implementations/immutableSet/TrieNodeKt$filterTo$1\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,790:1\n54#2,13:791\n50#2,17:804\n50#2,17:821\n50#2,10:857\n60#2,7:868\n50#2,10:884\n60#2,7:895\n10#3,5:838\n15#3,4:844\n10#3,9:848\n10#3,9:875\n10#3,9:904\n1#4:843\n53#5:867\n53#5:894\n12271#6,2:902\n26#7:913\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nkotlinx/collections/immutable/implementations/immutableSet/TrieNode\n*L\n239#1:791,13\n261#1:804,17\n284#1:821,17\n531#1:857,10\n531#1:868,7\n638#1:884,10\n638#1:895,7\n360#1:838,5\n360#1:844,4\n462#1:848,9\n558#1:875,9\n654#1:904,9\n531#1:867\n638#1:894\n647#1:902,2\n788#1:913\n*E\n"})
public final class d<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f218613d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final d f218614e = new d(0, new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f218615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public Object[] f218616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public g f218617c;

    public static final class a {
        public a() {
        }

        @NotNull
        public final d a() {
            return d.f218614e;
        }

        public a(C4969v c4969v) {
        }
    }

    public d(int i10, @NotNull Object[] buffer, @Nullable g gVar) {
        G.p(buffer, "buffer");
        this.f218615a = i10;
        this.f218616b = buffer;
        this.f218617c = gVar;
    }

    public final Object A(d<E> dVar, ud.b bVar, g gVar) {
        if (this == dVar) {
            bVar.e(this.f218616b.length);
            return f218614e;
        }
        Object[] objArr = gVar == this.f218617c ? this.f218616b : new Object[this.f218616b.length];
        Object[] objArr2 = this.f218616b;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr2.length; i11++) {
            if (!B.B8(dVar.f218616b, objArr2[i11])) {
                objArr[i10] = objArr2[i11];
                i10++;
            }
        }
        bVar.e(this.f218616b.length - i10);
        if (i10 == 0) {
            return f218614e;
        }
        if (i10 == 1) {
            return objArr[0];
        }
        if (i10 == this.f218616b.length) {
            return this;
        }
        if (i10 == objArr.length) {
            return M(0, objArr, gVar);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i10);
        G.o(objArrCopyOf, "copyOf(...)");
        return M(0, objArrCopyOf, gVar);
    }

    public final Object B(d<E> dVar, ud.b bVar, g gVar) {
        if (this == dVar) {
            bVar.e(this.f218616b.length);
            return this;
        }
        Object[] objArr = gVar == this.f218617c ? this.f218616b : new Object[Math.min(this.f218616b.length, dVar.f218616b.length)];
        Object[] objArr2 = this.f218616b;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr2.length; i11++) {
            if (B.B8(dVar.f218616b, objArr2[i11])) {
                objArr[i10] = objArr2[i11];
                i10++;
            }
        }
        bVar.e(i10);
        if (i10 == 0) {
            return f218614e;
        }
        if (i10 == 1) {
            return objArr[0];
        }
        if (i10 == this.f218616b.length) {
            return this;
        }
        if (i10 == dVar.f218616b.length) {
            return dVar;
        }
        if (i10 == objArr.length) {
            return M(0, objArr, gVar);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i10);
        G.o(objArrCopyOf, "copyOf(...)");
        return M(0, objArrCopyOf, gVar);
    }

    @NotNull
    public final d<E> C(int i10, E e10, int i11, @NotNull b<?> mutator) {
        G.p(mutator, "mutator");
        int iF = 1 << TrieNodeKt.f(i10, i11);
        if (!q(iF)) {
            int iR = r(iF);
            Object obj = this.f218616b[iR];
            if (obj instanceof d) {
                d<E> dVarF = F(iR);
                d<E> dVarZ = i11 == 30 ? dVarF.z(e10, mutator) : dVarF.C(i10, e10, i11 + 5, mutator);
                g gVar = dVarF.f218617c;
                g gVar2 = mutator.f218606b;
                if (gVar == gVar2 || dVarF != dVarZ) {
                    return e(iR, dVarZ, gVar2);
                }
            } else if (G.g(e10, obj)) {
                mutator.o(mutator.getSize() - 1);
                return H(iR, iF, mutator.f218606b);
            }
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D(@org.jetbrains.annotations.NotNull kotlinx.collections.immutable.implementations.immutableSet.d<E> r18, int r19, @org.jetbrains.annotations.NotNull ud.b r20, @org.jetbrains.annotations.NotNull kotlinx.collections.immutable.implementations.immutableSet.b<?> r21) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.collections.immutable.implementations.immutableSet.d.D(kotlinx.collections.immutable.implementations.immutableSet.d, int, ud.b, kotlinx.collections.immutable.implementations.immutableSet.b):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object E(@NotNull d<E> otherNode, int i10, @NotNull ud.b intersectionSizeRef, @NotNull b<?> mutator) {
        G.p(otherNode, "otherNode");
        G.p(intersectionSizeRef, "intersectionSizeRef");
        G.p(mutator, "mutator");
        if (this == otherNode) {
            intersectionSizeRef.e(d());
            return this;
        }
        if (i10 > 30) {
            return B(otherNode, intersectionSizeRef, mutator.f218606b);
        }
        int i11 = this.f218615a & otherNode.f218615a;
        if (i11 == 0) {
            return f218614e;
        }
        d<E> dVar = (G.g(this.f218617c, mutator.f218606b) && i11 == this.f218615a) ? this : new d<>(i11, new Object[Integer.bitCount(i11)], mutator.f218606b);
        int i12 = i11;
        int i13 = 0;
        int i14 = 0;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            int iR = r(iLowestOneBit);
            int iR2 = otherNode.r(iLowestOneBit);
            Object objE = this.f218616b[iR];
            Object obj = otherNode.f218616b[iR2];
            boolean z10 = objE instanceof d;
            boolean z11 = obj instanceof d;
            if (z10 && z11) {
                G.n(objE, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                G.n(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                objE = ((d) objE).E((d) obj, i10 + 5, intersectionSizeRef, mutator);
            } else if (z10) {
                G.n(objE, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                if (((d) objE).j(obj != null ? obj.hashCode() : 0, obj, i10 + 5)) {
                    intersectionSizeRef.e(1);
                    objE = obj;
                } else {
                    objE = f218614e;
                }
            } else if (z11) {
                G.n(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda$9$lambda$8>");
                if (((d) obj).j(objE != null ? objE.hashCode() : 0, objE, i10 + 5)) {
                    intersectionSizeRef.e(1);
                } else {
                    objE = f218614e;
                }
            } else if (G.g(objE, obj)) {
                intersectionSizeRef.e(1);
            } else {
                objE = f218614e;
            }
            if (objE != f218614e) {
                i13 |= iLowestOneBit;
            }
            dVar.f218616b[i14] = objE;
            i14++;
            i12 ^= iLowestOneBit;
        }
        int i15 = 0;
        int iBitCount = Integer.bitCount(i13);
        if (i13 == 0) {
            return f218614e;
        }
        if (i13 == i11) {
            return dVar.m(this) ? this : dVar.m(otherNode) ? otherNode : dVar;
        }
        if (iBitCount == 1 && i10 != 0) {
            Object obj2 = dVar.f218616b[dVar.r(i13)];
            return obj2 instanceof d ? new d(i13, new Object[]{obj2}, mutator.f218606b) : obj2;
        }
        Object[] objArr = new Object[iBitCount];
        Object[] objArr2 = dVar.f218616b;
        for (int i16 = 0; i16 < objArr2.length; i16++) {
            Object obj3 = objArr2[i16];
            f218613d.getClass();
            if (obj3 != f218614e) {
                objArr[i15] = objArr2[i16];
                i15++;
            }
        }
        return new d(i13, objArr, mutator.f218606b);
    }

    public final d<E> F(int i10) {
        Object obj = this.f218616b[i10];
        G.n(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        return (d) obj;
    }

    @NotNull
    public final d<E> G(int i10, E e10, int i11) {
        int iF = 1 << TrieNodeKt.f(i10, i11);
        if (!q(iF)) {
            int iR = r(iF);
            Object obj = this.f218616b[iR];
            if (obj instanceof d) {
                d<E> dVarF = F(iR);
                d<E> dVarH = i11 == 30 ? dVarF.h(e10) : dVarF.G(i10, e10, i11 + 5);
                if (dVarF != dVarH) {
                    return e(iR, dVarH, null);
                }
            } else if (G.g(e10, obj)) {
                return H(iR, iF, null);
            }
        }
        return this;
    }

    public final d<E> H(int i10, int i11, g gVar) {
        return M(i11 ^ this.f218615a, TrieNodeKt.g(this.f218616b, i10), gVar);
    }

    public final void I(int i10) {
        this.f218615a = i10;
    }

    public final void J(@NotNull Object[] objArr) {
        G.p(objArr, "<set-?>");
        this.f218616b = objArr;
    }

    public final d<E> K(int i10, Object obj, g gVar) {
        g gVar2 = this.f218617c;
        if (gVar2 != null && gVar2 == gVar) {
            this.f218616b[i10] = obj;
            return this;
        }
        Object[] objArr = this.f218616b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        G.o(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = obj;
        return new d<>(this.f218615a, objArrCopyOf, gVar);
    }

    public final void L(@Nullable g gVar) {
        this.f218617c = gVar;
    }

    public final d<E> M(int i10, Object[] objArr, g gVar) {
        g gVar2 = this.f218617c;
        if (gVar2 == null || gVar2 != gVar) {
            return new d<>(i10, objArr, gVar);
        }
        this.f218615a = i10;
        this.f218616b = objArr;
        return this;
    }

    @NotNull
    public final d<E> b(int i10, E e10, int i11) {
        int iF = 1 << TrieNodeKt.f(i10, i11);
        if (q(iF)) {
            return c(iF, e10, null);
        }
        int iR = r(iF);
        Object obj = this.f218616b[iR];
        if (obj instanceof d) {
            d<E> dVarF = F(iR);
            d<E> dVarF2 = i11 == 30 ? dVarF.f(e10) : dVarF.b(i10, e10, i11 + 5);
            if (dVarF != dVarF2) {
                return K(iR, dVarF2, null);
            }
        } else if (!G.g(e10, obj)) {
            return u(iR, i10, e10, i11, null);
        }
        return this;
    }

    public final d<E> c(int i10, E e10, g gVar) {
        return M(i10 | this.f218615a, TrieNodeKt.c(this.f218616b, r(i10), e10), gVar);
    }

    public final int d() {
        if (this.f218615a == 0) {
            return this.f218616b.length;
        }
        int iD = 0;
        for (Object obj : this.f218616b) {
            iD += obj instanceof d ? ((d) obj).d() : 1;
        }
        return iD;
    }

    public final d<E> e(int i10, d<E> dVar, g gVar) {
        Object[] objArr = dVar.f218616b;
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (!(obj instanceof d)) {
                if (this.f218616b.length == 1) {
                    dVar.f218615a = this.f218615a;
                    return dVar;
                }
                dVar = (d<E>) obj;
            }
        }
        return K(i10, dVar, gVar);
    }

    public final d<E> f(E e10) {
        return B.B8(this.f218616b, e10) ? this : M(0, TrieNodeKt.c(this.f218616b, 0, e10), null);
    }

    public final boolean g(E e10) {
        return B.B8(this.f218616b, e10);
    }

    public final d<E> h(E e10) {
        int iBg = B.bg(this.f218616b, e10);
        return iBg != -1 ? i(iBg, null) : this;
    }

    public final d<E> i(int i10, g gVar) {
        return M(0, TrieNodeKt.g(this.f218616b, i10), gVar);
    }

    public final boolean j(int i10, E e10, int i11) {
        int iF = 1 << TrieNodeKt.f(i10, i11);
        if (q(iF)) {
            return false;
        }
        int iR = r(iF);
        Object obj = this.f218616b[iR];
        if (!(obj instanceof d)) {
            return G.g(e10, obj);
        }
        d<E> dVarF = F(iR);
        return i11 == 30 ? B.B8(dVarF.f218616b, e10) : dVarF.j(i10, e10, i11 + 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(@NotNull d<E> otherNode, int i10) {
        G.p(otherNode, "otherNode");
        if (this == otherNode) {
            return true;
        }
        if (i10 > 30) {
            for (Object obj : otherNode.f218616b) {
                if (!B.B8(this.f218616b, obj)) {
                    return false;
                }
            }
            return true;
        }
        int i11 = this.f218615a;
        int i12 = otherNode.f218615a;
        int i13 = i11 & i12;
        if (i13 != i12) {
            return false;
        }
        while (i13 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i13);
            int iR = r(iLowestOneBit);
            int iR2 = otherNode.r(iLowestOneBit);
            Object obj2 = this.f218616b[iR];
            Object obj3 = otherNode.f218616b[iR2];
            boolean z10 = obj2 instanceof d;
            boolean z11 = obj3 instanceof d;
            if (z10 && z11) {
                G.n(obj2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                G.n(obj3, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((d) obj2).k((d) obj3, i10 + 5)) {
                    return false;
                }
            } else if (z10) {
                G.n(obj2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda$13>");
                if (!((d) obj2).j(obj3 != null ? obj3.hashCode() : 0, obj3, i10 + 5)) {
                    return false;
                }
            } else if (z11 || !G.g(obj2, obj3)) {
                return false;
            }
            i13 ^= iLowestOneBit;
        }
        return true;
    }

    public final E l(int i10) {
        return (E) this.f218616b[i10];
    }

    public final boolean m(d<E> dVar) {
        if (this == dVar) {
            return true;
        }
        if (this.f218615a != dVar.f218615a) {
            return false;
        }
        int length = this.f218616b.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f218616b[i10] != dVar.f218616b[i10]) {
                return false;
            }
        }
        return true;
    }

    public final int n() {
        return this.f218615a;
    }

    @NotNull
    public final Object[] o() {
        return this.f218616b;
    }

    @Nullable
    public final g p() {
        return this.f218617c;
    }

    public final boolean q(int i10) {
        return (i10 & this.f218615a) == 0;
    }

    public final int r(int i10) {
        return Integer.bitCount((i10 - 1) & this.f218615a);
    }

    public final d<E> s(int i10, E e10, int i11, E e11, int i12, g gVar) {
        if (i12 > 30) {
            return new d<>(0, new Object[]{e10, e11}, gVar);
        }
        int iF = TrieNodeKt.f(i10, i12);
        int iF2 = TrieNodeKt.f(i11, i12);
        if (iF != iF2) {
            return new d<>((1 << iF) | (1 << iF2), iF < iF2 ? new Object[]{e10, e11} : new Object[]{e11, e10}, gVar);
        }
        return new d<>(1 << iF, new Object[]{s(i10, e10, i11, e11, i12 + 5, gVar)}, gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final d<E> t(int i10, int i11, E e10, int i12, g gVar) {
        Object obj = this.f218616b[i10];
        return s(obj != null ? obj.hashCode() : 0, obj, i11, e10, i12 + 5, gVar);
    }

    public final d<E> u(int i10, int i11, E e10, int i12, g gVar) {
        return K(i10, t(i10, i11, e10, i12, gVar), gVar);
    }

    @NotNull
    public final d<E> v(int i10, E e10, int i11, @NotNull b<?> mutator) {
        G.p(mutator, "mutator");
        int iF = 1 << TrieNodeKt.f(i10, i11);
        if (q(iF)) {
            mutator.o(mutator.getSize() + 1);
            return c(iF, e10, mutator.f218606b);
        }
        int iR = r(iF);
        Object obj = this.f218616b[iR];
        if (obj instanceof d) {
            d<E> dVarF = F(iR);
            d<E> dVarX = i11 == 30 ? dVarF.x(e10, mutator) : dVarF.v(i10, e10, i11 + 5, mutator);
            if (dVarF != dVarX) {
                return K(iR, dVarX, mutator.f218606b);
            }
        } else if (!G.g(e10, obj)) {
            mutator.o(mutator.getSize() + 1);
            return u(iR, i10, e10, i11, mutator.f218606b);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final d<E> w(@NotNull d<E> otherNode, int i10, @NotNull ud.b intersectionSizeRef, @NotNull b<?> mutator) {
        Object objS;
        Object[] objArr;
        G.p(otherNode, "otherNode");
        G.p(intersectionSizeRef, "intersectionSizeRef");
        G.p(mutator, "mutator");
        if (this == otherNode) {
            intersectionSizeRef.f239700a = d() + intersectionSizeRef.f239700a;
            return this;
        }
        if (i10 > 30) {
            return y(otherNode, intersectionSizeRef, mutator.f218606b);
        }
        int i11 = this.f218615a;
        int i12 = otherNode.f218615a | i11;
        d<E> dVar = (i12 == i11 && G.g(this.f218617c, mutator.f218606b)) ? this : new d<>(i12, new Object[Integer.bitCount(i12)], mutator.f218606b);
        int i13 = i12;
        int i14 = 0;
        while (i13 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i13);
            int iR = r(iLowestOneBit);
            int iR2 = otherNode.r(iLowestOneBit);
            Object[] objArr2 = dVar.f218616b;
            if (q(iLowestOneBit)) {
                objS = otherNode.f218616b[iR2];
            } else if (otherNode.q(iLowestOneBit)) {
                objS = this.f218616b[iR];
            } else {
                objS = this.f218616b[iR];
                Object obj = otherNode.f218616b[iR2];
                boolean z10 = objS instanceof d;
                boolean z11 = obj instanceof d;
                if (z10 && z11) {
                    G.n(objS, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    G.n(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    objS = ((d) objS).w((d) obj, i10 + 5, intersectionSizeRef, mutator);
                } else if (z10) {
                    G.n(objS, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    d dVar2 = (d) objS;
                    int size = mutator.getSize();
                    objS = dVar2.v(obj != null ? obj.hashCode() : 0, obj, i10 + 5, mutator);
                    if (mutator.getSize() == size) {
                        intersectionSizeRef.f239700a++;
                    }
                } else if (z11) {
                    G.n(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda$6>");
                    d dVar3 = (d) obj;
                    int size2 = mutator.getSize();
                    objS = dVar3.v(objS != null ? objS.hashCode() : 0, objS, i10 + 5, mutator);
                    if (mutator.getSize() == size2) {
                        intersectionSizeRef.f239700a++;
                    }
                } else if (G.g(objS, obj)) {
                    intersectionSizeRef.f239700a++;
                } else {
                    objArr = objArr2;
                    objS = s(objS != null ? objS.hashCode() : 0, objS, obj != null ? obj.hashCode() : 0, obj, i10 + 5, mutator.f218606b);
                    objArr[i14] = objS;
                    i14++;
                    i13 ^= iLowestOneBit;
                }
            }
            objArr = objArr2;
            objArr[i14] = objS;
            i14++;
            i13 ^= iLowestOneBit;
        }
        return m(dVar) ? this : otherNode.m(dVar) ? otherNode : dVar;
    }

    public final d<E> x(E e10, b<?> bVar) {
        if (B.B8(this.f218616b, e10)) {
            return this;
        }
        bVar.o(bVar.getSize() + 1);
        return M(0, TrieNodeKt.c(this.f218616b, 0, e10), bVar.f218606b);
    }

    public final d<E> y(d<E> dVar, ud.b bVar, g gVar) {
        if (this == dVar) {
            bVar.e(this.f218616b.length);
            return this;
        }
        Object[] objArr = this.f218616b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + dVar.f218616b.length);
        G.o(objArrCopyOf, "copyOf(...)");
        Object[] objArr2 = dVar.f218616b;
        int length = this.f218616b.length;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr2.length; i11++) {
            if (!B.B8(this.f218616b, objArr2[i11])) {
                objArrCopyOf[length + i10] = objArr2[i11];
                i10++;
            }
        }
        int length2 = i10 + this.f218616b.length;
        bVar.e(objArrCopyOf.length - length2);
        if (length2 == this.f218616b.length) {
            return this;
        }
        if (length2 == dVar.f218616b.length) {
            return dVar;
        }
        if (length2 != objArrCopyOf.length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length2);
            G.o(objArrCopyOf, "copyOf(...)");
        }
        return M(0, objArrCopyOf, gVar);
    }

    public final d<E> z(E e10, b<?> bVar) {
        int iBg = B.bg(this.f218616b, e10);
        if (iBg == -1) {
            return this;
        }
        bVar.o(bVar.getSize() - 1);
        return i(iBg, bVar.f218606b);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(int i10, @NotNull Object[] buffer) {
        this(i10, buffer, null);
        G.p(buffer, "buffer");
    }
}
