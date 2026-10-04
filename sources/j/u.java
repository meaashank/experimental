package J;

import androidx.compose.runtime.U0;
import java.util.Arrays;
import kotlin.L0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@V({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n+ 2 ForEachOneBit.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 3 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 4 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,899:1\n10#2,9:900\n10#2,9:916\n10#2,9:925\n61#3,7:909\n84#4:934\n1#5:935\n26#6:936\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode\n*L\n630#1:900,9\n648#1:916,9\n652#1:925,9\n640#1:909,7\n700#1:934\n700#1:935\n897#1:936\n*E\n"})
@androidx.compose.runtime.internal.r(parameters = 0)
public final class u<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f53094f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f53096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final M.f f53098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public Object[] f53099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f53093e = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final u f53095g = new u(0, 0, new Object[0], null);

    public static final class a {
        public a() {
        }

        @NotNull
        public final u a() {
            return u.f53095g;
        }

        public a(C4969v c4969v) {
        }
    }

    @V({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,899:1\n1#2:900\n*E\n"})
    @androidx.compose.runtime.internal.r(parameters = 0)
    public static final class b<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f53100c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public u<K, V> f53101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f53102b;

        public b(@NotNull u<K, V> uVar, int i10) {
            this.f53101a = uVar;
            this.f53102b = i10;
        }

        @NotNull
        public final u<K, V> a() {
            return this.f53101a;
        }

        public final int b() {
            return this.f53102b;
        }

        @NotNull
        public final b<K, V> c(@NotNull ed.l<? super u<K, V>, u<K, V>> lVar) {
            this.f53101a = lVar.invoke(this.f53101a);
            return this;
        }

        public final void d(@NotNull u<K, V> uVar) {
            this.f53101a = uVar;
        }
    }

    public u(int i10, int i11, @NotNull Object[] objArr, @Nullable M.f fVar) {
        this.f53096a = i10;
        this.f53097b = i11;
        this.f53098c = fVar;
        this.f53099d = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u<K, V> A(u<K, V> uVar, M.b bVar, M.f fVar) {
        int i10 = uVar.f53097b;
        Object[] objArr = this.f53099d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + uVar.f53099d.length);
        G.o(objArrCopyOf, "copyOf(this, newSize)");
        int length = this.f53099d.length;
        md.j jVarD1 = md.u.D1(md.u.Y1(0, uVar.f53099d.length), 2);
        int i11 = jVarD1.f221139a;
        int i12 = jVarD1.f221140b;
        int i13 = jVarD1.f221141c;
        if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
            while (true) {
                if (h(uVar.f53099d[i11])) {
                    bVar.f58781a++;
                } else {
                    Object[] objArr2 = uVar.f53099d;
                    objArrCopyOf[length] = objArr2[i11];
                    objArrCopyOf[length + 1] = objArr2[i11 + 1];
                    length += 2;
                }
                if (i11 == i12) {
                    break;
                }
                i11 += i13;
            }
        }
        if (length == this.f53099d.length) {
            return this;
        }
        if (length == uVar.f53099d.length) {
            return uVar;
        }
        if (length == objArrCopyOf.length) {
            return new u<>(0, 0, objArrCopyOf, fVar);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        G.o(objArrCopyOf2, "copyOf(this, newSize)");
        return new u<>(0, 0, objArrCopyOf2, fVar);
    }

    public final u<K, V> B(K k10, f<K, V> fVar) {
        md.j jVarD1 = md.u.D1(md.u.Y1(0, this.f53099d.length), 2);
        int i10 = jVarD1.f221139a;
        int i11 = jVarD1.f221140b;
        int i12 = jVarD1.f221141c;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!G.g(k10, this.f53099d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return D(i10, fVar);
        }
        return this;
    }

    public final u<K, V> C(K k10, V v10, f<K, V> fVar) {
        md.j jVarD1 = md.u.D1(md.u.Y1(0, this.f53099d.length), 2);
        int i10 = jVarD1.f221139a;
        int i11 = jVarD1.f221140b;
        int i12 = jVarD1.f221141c;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (true) {
                if (!G.g(k10, this.f53099d[i10]) || !G.g(v10, a0(i10))) {
                    if (i10 == i11) {
                        break;
                    }
                    i10 += i12;
                } else {
                    return D(i10, fVar);
                }
            }
        }
        return this;
    }

    public final u<K, V> D(int i10, f<K, V> fVar) {
        fVar.setSize(fVar.size() - 1);
        fVar.setOperationResult$runtime_release(a0(i10));
        if (this.f53099d.length == 2) {
            return null;
        }
        if (this.f53098c != fVar.getOwnership()) {
            return new u<>(0, 0, y.h(this.f53099d, i10), fVar.getOwnership());
        }
        this.f53099d = y.h(this.f53099d, i10);
        return this;
    }

    public final u<K, V> E(int i10, K k10, V v10, M.f fVar) {
        int iQ = q(i10);
        if (this.f53098c != fVar) {
            return new u<>(i10 | this.f53096a, this.f53097b, y.g(this.f53099d, iQ, k10, v10), fVar);
        }
        this.f53099d = y.g(this.f53099d, iQ, k10, v10);
        this.f53096a = i10 | this.f53096a;
        return this;
    }

    public final u<K, V> F(int i10, int i11, int i12, K k10, V v10, int i13, M.f fVar) {
        if (this.f53098c != fVar) {
            return new u<>(this.f53096a ^ i11, i11 | this.f53097b, f(i10, i11, i12, k10, v10, i13, fVar), fVar);
        }
        this.f53099d = f(i10, i11, i12, k10, v10, i13, fVar);
        this.f53096a ^= i11;
        this.f53097b |= i11;
        return this;
    }

    @NotNull
    public final u<K, V> G(int i10, K k10, V v10, int i11, @NotNull f<K, V> fVar) {
        f<K, V> fVar2;
        u<K, V> uVarG;
        int iF = 1 << y.f(i10, i11);
        if (t(iF)) {
            int iQ = q(iF);
            if (G.g(k10, this.f53099d[iQ])) {
                fVar.setOperationResult$runtime_release(a0(iQ));
                return a0(iQ) == v10 ? this : P(iQ, v10, fVar);
            }
            fVar.setSize(fVar.size() + 1);
            return F(iQ, iF, i10, k10, v10, i11, fVar.getOwnership());
        }
        if (!u(iF)) {
            fVar.setSize(fVar.size() + 1);
            return E(iF, k10, v10, fVar.getOwnership());
        }
        int iR = R(iF);
        u<K, V> uVarQ = Q(iR);
        if (i11 == 30) {
            uVarG = uVarQ.z(k10, v10, fVar);
            fVar2 = fVar;
        } else {
            fVar2 = fVar;
            uVarG = uVarQ.G(i10, k10, v10, i11 + 5, fVar2);
        }
        return uVarQ == uVarG ? this : O(iR, uVarG, fVar2.getOwnership());
    }

    @NotNull
    public final u<K, V> H(@NotNull u<K, V> uVar, int i10, @NotNull M.b bVar, @NotNull f<K, V> fVar) {
        if (this == uVar) {
            bVar.e(g());
            return this;
        }
        int i11 = i10;
        if (i11 > 30) {
            return A(uVar, bVar, fVar.getOwnership());
        }
        int i12 = this.f53097b | uVar.f53097b;
        int i13 = this.f53096a;
        int i14 = uVar.f53096a;
        int i15 = (i13 ^ i14) & (~i12);
        int i16 = i13 & i14;
        while (i16 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i16);
            if (G.g(this.f53099d[q(iLowestOneBit)], uVar.f53099d[uVar.q(iLowestOneBit)])) {
                i15 |= iLowestOneBit;
            } else {
                i12 |= iLowestOneBit;
            }
            i16 ^= iLowestOneBit;
        }
        int i17 = 0;
        if (!((i12 & i15) == 0)) {
            U0.e("Check failed.");
            throw null;
        }
        u<K, V> uVar2 = (G.g(this.f53098c, fVar.getOwnership()) && this.f53096a == i15 && this.f53097b == i12) ? this : new u<>(i15, i12, new Object[Integer.bitCount(i12) + (Integer.bitCount(i15) * 2)], null);
        int i18 = i12;
        int i19 = 0;
        while (i18 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i18);
            Object[] objArr = uVar2.f53099d;
            objArr[(objArr.length - 1) - i19] = I(uVar, iLowestOneBit2, i11, bVar, fVar);
            i19++;
            i18 ^= iLowestOneBit2;
            i11 = i10;
        }
        while (i15 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i15);
            int i20 = i17 * 2;
            if (uVar.t(iLowestOneBit3)) {
                int iQ = uVar.q(iLowestOneBit3);
                Object[] objArr2 = uVar2.f53099d;
                objArr2[i20] = uVar.f53099d[iQ];
                objArr2[i20 + 1] = uVar.a0(iQ);
                if (t(iLowestOneBit3)) {
                    bVar.f58781a++;
                }
            } else {
                int iQ2 = q(iLowestOneBit3);
                Object[] objArr3 = uVar2.f53099d;
                objArr3[i20] = this.f53099d[iQ2];
                objArr3[i20 + 1] = a0(iQ2);
            }
            i17++;
            i15 ^= iLowestOneBit3;
        }
        return o(uVar2) ? this : uVar.o(uVar2) ? uVar : uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final u<K, V> I(u<K, V> uVar, int i10, int i11, M.b bVar, f<K, V> fVar) {
        if (u(i10)) {
            u<K, V> uVar2 = (u<K, V>) Q(R(i10));
            if (uVar.u(i10)) {
                return uVar2.H(uVar.Q(uVar.R(i10)), i11 + 5, bVar, fVar);
            }
            if (!uVar.t(i10)) {
                return uVar2;
            }
            int iQ = uVar.q(i10);
            Object obj = uVar.f53099d[iQ];
            V vA0 = uVar.a0(iQ);
            int size = fVar.size();
            u<K, V> uVarG = uVar2.G(obj != null ? obj.hashCode() : 0, obj, vA0, i11 + 5, fVar);
            if (fVar.size() == size) {
                bVar.f58781a++;
            }
            return uVarG;
        }
        if (!uVar.u(i10)) {
            int iQ2 = q(i10);
            Object obj2 = this.f53099d[iQ2];
            Object objA0 = a0(iQ2);
            int iQ3 = uVar.q(i10);
            Object obj3 = uVar.f53099d[iQ3];
            return x(obj2 != null ? obj2.hashCode() : 0, obj2, objA0, obj3 != null ? obj3.hashCode() : 0, obj3, uVar.a0(iQ3), i11 + 5, fVar.getOwnership());
        }
        u<K, V> uVarQ = uVar.Q(uVar.R(i10));
        if (!t(i10)) {
            return uVarQ;
        }
        int iQ4 = q(i10);
        Object obj4 = this.f53099d[iQ4];
        int i12 = i11 + 5;
        if (!uVarQ.n(obj4 != null ? obj4.hashCode() : 0, obj4, i12)) {
            return uVarQ.G(obj4 != null ? obj4.hashCode() : 0, obj4, a0(iQ4), i12, fVar);
        }
        bVar.f58781a++;
        return uVarQ;
    }

    @Nullable
    public final u<K, V> J(int i10, K k10, int i11, @NotNull f<K, V> fVar) {
        int iF = 1 << y.f(i10, i11);
        if (t(iF)) {
            int iQ = q(iF);
            if (G.g(k10, this.f53099d[iQ])) {
                return L(iQ, iF, fVar);
            }
        } else if (u(iF)) {
            int iR = R(iF);
            u<K, V> uVarQ = Q(iR);
            return N(uVarQ, i11 == 30 ? uVarQ.B(k10, fVar) : uVarQ.J(i10, k10, i11 + 5, fVar), iR, iF, fVar.getOwnership());
        }
        return this;
    }

    @Nullable
    public final u<K, V> K(int i10, K k10, V v10, int i11, @NotNull f<K, V> fVar) {
        int iF = 1 << y.f(i10, i11);
        if (t(iF)) {
            int iQ = q(iF);
            if (G.g(k10, this.f53099d[iQ]) && G.g(v10, a0(iQ))) {
                return L(iQ, iF, fVar);
            }
        } else if (u(iF)) {
            int iR = R(iF);
            u<K, V> uVarQ = Q(iR);
            return N(uVarQ, i11 == 30 ? uVarQ.C(k10, v10, fVar) : uVarQ.K(i10, k10, v10, i11 + 5, fVar), iR, iF, fVar.getOwnership());
        }
        return this;
    }

    public final u<K, V> L(int i10, int i11, f<K, V> fVar) {
        fVar.setSize(fVar.size() - 1);
        fVar.setOperationResult$runtime_release(a0(i10));
        if (this.f53099d.length == 2) {
            return null;
        }
        if (this.f53098c != fVar.getOwnership()) {
            return new u<>(i11 ^ this.f53096a, this.f53097b, y.h(this.f53099d, i10), fVar.getOwnership());
        }
        this.f53099d = y.h(this.f53099d, i10);
        this.f53096a ^= i11;
        return this;
    }

    public final u<K, V> M(int i10, int i11, M.f fVar) {
        Object[] objArr = this.f53099d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f53098c != fVar) {
            return new u<>(this.f53096a, i11 ^ this.f53097b, y.i(objArr, i10), fVar);
        }
        this.f53099d = y.i(objArr, i10);
        this.f53097b ^= i11;
        return this;
    }

    public final u<K, V> N(u<K, V> uVar, u<K, V> uVar2, int i10, int i11, M.f fVar) {
        return uVar2 == null ? M(i10, i11, fVar) : (this.f53098c == fVar || uVar != uVar2) ? O(i10, uVar2, fVar) : this;
    }

    public final u<K, V> O(int i10, u<K, V> uVar, M.f fVar) {
        Object[] objArr = this.f53099d;
        if (objArr.length == 1 && uVar.f53099d.length == 2 && uVar.f53097b == 0) {
            uVar.f53096a = this.f53097b;
            return uVar;
        }
        if (this.f53098c == fVar) {
            objArr[i10] = uVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        G.o(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = uVar;
        return new u<>(this.f53096a, this.f53097b, objArrCopyOf, fVar);
    }

    public final u<K, V> P(int i10, V v10, f<K, V> fVar) {
        if (this.f53098c == fVar.getOwnership()) {
            this.f53099d[i10 + 1] = v10;
            return this;
        }
        fVar.setModCount$runtime_release(fVar.getModCount$runtime_release() + 1);
        Object[] objArr = this.f53099d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        G.o(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10 + 1] = v10;
        return new u<>(this.f53096a, this.f53097b, objArrCopyOf, fVar.getOwnership());
    }

    @NotNull
    public final u<K, V> Q(int i10) {
        Object obj = this.f53099d[i10];
        G.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (u) obj;
    }

    public final int R(int i10) {
        return (this.f53099d.length - 1) - Integer.bitCount((i10 - 1) & this.f53097b);
    }

    @Nullable
    public final b<K, V> S(int i10, K k10, V v10, int i11) {
        b<K, V> bVarS;
        int iF = 1 << y.f(i10, i11);
        if (t(iF)) {
            int iQ = q(iF);
            if (!G.g(k10, this.f53099d[iQ])) {
                return y(iQ, iF, i10, k10, v10, i11).d();
            }
            if (a0(iQ) == v10) {
                return null;
            }
            return Z(iQ, v10).e();
        }
        if (!u(iF)) {
            return v(iF, k10, v10).d();
        }
        int iR = R(iF);
        u<K, V> uVarQ = Q(iR);
        if (i11 == 30) {
            bVarS = uVarQ.j(k10, v10);
            if (bVarS == null) {
                return null;
            }
        } else {
            bVarS = uVarQ.S(i10, k10, v10, i11 + 5);
            if (bVarS == null) {
                return null;
            }
        }
        bVarS.f53101a = Y(iR, iF, bVarS.f53101a);
        return bVarS;
    }

    @Nullable
    public final u<K, V> T(int i10, K k10, int i11) {
        int iF = 1 << y.f(i10, i11);
        if (t(iF)) {
            int iQ = q(iF);
            if (G.g(k10, this.f53099d[iQ])) {
                return V(iQ, iF);
            }
        } else if (u(iF)) {
            int iR = R(iF);
            u<K, V> uVarQ = Q(iR);
            return X(uVarQ, i11 == 30 ? uVarQ.k(k10) : uVarQ.T(i10, k10, i11 + 5), iR, iF);
        }
        return this;
    }

    @Nullable
    public final u<K, V> U(int i10, K k10, V v10, int i11) {
        int iF = 1 << y.f(i10, i11);
        if (t(iF)) {
            int iQ = q(iF);
            if (G.g(k10, this.f53099d[iQ]) && G.g(v10, a0(iQ))) {
                return V(iQ, iF);
            }
        } else if (u(iF)) {
            int iR = R(iF);
            u<K, V> uVarQ = Q(iR);
            return X(uVarQ, i11 == 30 ? uVarQ.l(k10, v10) : uVarQ.U(i10, k10, v10, i11 + 5), iR, iF);
        }
        return this;
    }

    public final u<K, V> V(int i10, int i11) {
        Object[] objArr = this.f53099d;
        if (objArr.length == 2) {
            return null;
        }
        return new u<>(i11 ^ this.f53096a, this.f53097b, y.h(objArr, i10), null);
    }

    public final u<K, V> W(int i10, int i11) {
        Object[] objArr = this.f53099d;
        if (objArr.length == 1) {
            return null;
        }
        return new u<>(this.f53096a, i11 ^ this.f53097b, y.i(objArr, i10), null);
    }

    public final u<K, V> X(u<K, V> uVar, u<K, V> uVar2, int i10, int i11) {
        return uVar2 == null ? W(i10, i11) : uVar != uVar2 ? Y(i10, i11, uVar2) : this;
    }

    public final u<K, V> Y(int i10, int i11, u<K, V> uVar) {
        Object[] objArr = uVar.f53099d;
        if (objArr.length != 2 || uVar.f53097b != 0) {
            Object[] objArr2 = this.f53099d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            G.o(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[i10] = uVar;
            return new u<>(this.f53096a, this.f53097b, objArrCopyOf, null);
        }
        if (this.f53099d.length == 1) {
            uVar.f53096a = this.f53097b;
            return uVar;
        }
        return new u<>(this.f53096a ^ i11, i11 ^ this.f53097b, y.k(this.f53099d, i10, q(i11), objArr[0], objArr[1]), null);
    }

    public final u<K, V> Z(int i10, V v10) {
        Object[] objArr = this.f53099d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        G.o(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10 + 1] = v10;
        return new u<>(this.f53096a, this.f53097b, objArrCopyOf, null);
    }

    public final void a(ed.s<? super u<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, L0> sVar, int i10, int i11) {
        sVar.p(this, Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.f53096a), Integer.valueOf(this.f53097b));
        int i12 = this.f53097b;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            Q(R(iLowestOneBit)).a(sVar, (Integer.numberOfTrailingZeros(iLowestOneBit) << i11) + i10, i11 + 5);
            i12 -= iLowestOneBit;
        }
    }

    public final V a0(int i10) {
        return (V) this.f53099d[i10 + 1];
    }

    public final void b(@NotNull ed.s<? super u<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, L0> sVar) {
        a(sVar, 0, 0);
    }

    public final b<K, V> d() {
        return new b<>(this, 1);
    }

    public final b<K, V> e() {
        return new b<>(this, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object[] f(int i10, int i11, int i12, K k10, V v10, int i13, M.f fVar) {
        Object obj = this.f53099d[i10];
        return y.j(this.f53099d, i10, R(i11) + 1, x(obj != null ? obj.hashCode() : 0, obj, a0(i10), i12, k10, v10, i13 + 5, fVar));
    }

    public final int g() {
        if (this.f53097b == 0) {
            return this.f53099d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f53096a);
        int length = this.f53099d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += Q(i10).g();
        }
        return iBitCount;
    }

    public final boolean h(K k10) {
        md.j jVarD1 = md.u.D1(md.u.Y1(0, this.f53099d.length), 2);
        int i10 = jVarD1.f221139a;
        int i11 = jVarD1.f221140b;
        int i12 = jVarD1.f221141c;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!G.g(k10, this.f53099d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return true;
        }
        return false;
    }

    public final V i(K k10) {
        md.j jVarD1 = md.u.D1(md.u.Y1(0, this.f53099d.length), 2);
        int i10 = jVarD1.f221139a;
        int i11 = jVarD1.f221140b;
        int i12 = jVarD1.f221141c;
        if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
            return null;
        }
        while (!G.g(k10, this.f53099d[i10])) {
            if (i10 == i11) {
                return null;
            }
            i10 += i12;
        }
        return a0(i10);
    }

    public final b<K, V> j(K k10, V v10) {
        md.j jVarD1 = md.u.D1(md.u.Y1(0, this.f53099d.length), 2);
        int i10 = jVarD1.f221139a;
        int i11 = jVarD1.f221140b;
        int i12 = jVarD1.f221141c;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!G.g(k10, this.f53099d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            if (v10 == a0(i10)) {
                return null;
            }
            Object[] objArr = this.f53099d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            G.o(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[i10 + 1] = v10;
            return new u(0, 0, objArrCopyOf, null).e();
        }
        return new u(0, 0, y.g(this.f53099d, 0, k10, v10), null).d();
    }

    public final u<K, V> k(K k10) {
        md.j jVarD1 = md.u.D1(md.u.Y1(0, this.f53099d.length), 2);
        int i10 = jVarD1.f221139a;
        int i11 = jVarD1.f221140b;
        int i12 = jVarD1.f221141c;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!G.g(k10, this.f53099d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            return m(i10);
        }
        return this;
    }

    public final u<K, V> l(K k10, V v10) {
        md.j jVarD1 = md.u.D1(md.u.Y1(0, this.f53099d.length), 2);
        int i10 = jVarD1.f221139a;
        int i11 = jVarD1.f221140b;
        int i12 = jVarD1.f221141c;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (true) {
                if (!G.g(k10, this.f53099d[i10]) || !G.g(v10, a0(i10))) {
                    if (i10 == i11) {
                        break;
                    }
                    i10 += i12;
                } else {
                    return m(i10);
                }
            }
        }
        return this;
    }

    public final u<K, V> m(int i10) {
        Object[] objArr = this.f53099d;
        if (objArr.length == 2) {
            return null;
        }
        return new u<>(0, 0, y.h(objArr, i10), null);
    }

    public final boolean n(int i10, K k10, int i11) {
        int iF = 1 << y.f(i10, i11);
        if (t(iF)) {
            return G.g(k10, this.f53099d[q(iF)]);
        }
        if (!u(iF)) {
            return false;
        }
        u<K, V> uVarQ = Q(R(iF));
        return i11 == 30 ? uVarQ.h(k10) : uVarQ.n(i10, k10, i11 + 5);
    }

    public final boolean o(u<K, V> uVar) {
        if (this == uVar) {
            return true;
        }
        if (this.f53097b != uVar.f53097b || this.f53096a != uVar.f53096a) {
            return false;
        }
        int length = this.f53099d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f53099d[i10] != uVar.f53099d[i10]) {
                return false;
            }
        }
        return true;
    }

    public final int p() {
        return Integer.bitCount(this.f53096a);
    }

    public final int q(int i10) {
        return Integer.bitCount((i10 - 1) & this.f53096a) * 2;
    }

    @Nullable
    public final V r(int i10, K k10, int i11) {
        int iF = 1 << y.f(i10, i11);
        if (t(iF)) {
            int iQ = q(iF);
            if (G.g(k10, this.f53099d[iQ])) {
                return a0(iQ);
            }
            return null;
        }
        if (!u(iF)) {
            return null;
        }
        u<K, V> uVarQ = Q(R(iF));
        return i11 == 30 ? uVarQ.i(k10) : uVarQ.r(i10, k10, i11 + 5);
    }

    @NotNull
    public final Object[] s() {
        return this.f53099d;
    }

    public final boolean t(int i10) {
        return (i10 & this.f53096a) != 0;
    }

    public final boolean u(int i10) {
        return (i10 & this.f53097b) != 0;
    }

    public final u<K, V> v(int i10, K k10, V v10) {
        return new u<>(i10 | this.f53096a, this.f53097b, y.g(this.f53099d, q(i10), k10, v10), null);
    }

    public final K w(int i10) {
        return (K) this.f53099d[i10];
    }

    public final u<K, V> x(int i10, K k10, V v10, int i11, K k11, V v11, int i12, M.f fVar) {
        if (i12 > 30) {
            return new u<>(0, 0, new Object[]{k10, v10, k11, v11}, fVar);
        }
        int iF = y.f(i10, i12);
        int iF2 = y.f(i11, i12);
        if (iF != iF2) {
            return new u<>((1 << iF) | (1 << iF2), 0, iF < iF2 ? new Object[]{k10, v10, k11, v11} : new Object[]{k11, v11, k10, v10}, fVar);
        }
        return new u<>(0, 1 << iF, new Object[]{x(i10, k10, v10, i11, k11, v11, i12 + 5, fVar)}, fVar);
    }

    public final u<K, V> y(int i10, int i11, int i12, K k10, V v10, int i13) {
        return new u<>(this.f53096a ^ i11, this.f53097b | i11, f(i10, i11, i12, k10, v10, i13, null), null);
    }

    public final u<K, V> z(K k10, V v10, f<K, V> fVar) {
        md.j jVarD1 = md.u.D1(md.u.Y1(0, this.f53099d.length), 2);
        int i10 = jVarD1.f221139a;
        int i11 = jVarD1.f221140b;
        int i12 = jVarD1.f221141c;
        if ((i12 > 0 && i10 <= i11) || (i12 < 0 && i11 <= i10)) {
            while (!G.g(k10, this.f53099d[i10])) {
                if (i10 != i11) {
                    i10 += i12;
                }
            }
            fVar.setOperationResult$runtime_release(a0(i10));
            if (this.f53098c == fVar.getOwnership()) {
                this.f53099d[i10 + 1] = v10;
                return this;
            }
            fVar.setModCount$runtime_release(fVar.getModCount$runtime_release() + 1);
            Object[] objArr = this.f53099d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            G.o(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[i10 + 1] = v10;
            return new u<>(0, 0, objArrCopyOf, fVar.getOwnership());
        }
        fVar.setSize(fVar.size() + 1);
        return new u<>(0, 0, y.g(this.f53099d, 0, k10, v10), fVar.getOwnership());
    }

    public u(int i10, int i11, @NotNull Object[] objArr) {
        this(i10, i11, objArr, null);
    }
}
