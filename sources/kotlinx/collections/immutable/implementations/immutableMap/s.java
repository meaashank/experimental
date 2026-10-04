package kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.L0;
import kotlin.collections.AbstractC4864f0;
import kotlin.jvm.internal.C4969v;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.V;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@V({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nkotlinx/collections/immutable/implementations/immutableMap/TrieNode\n+ 2 ForEachOneBit.kt\nkotlinx/collections/immutable/internal/ForEachOneBitKt\n+ 3 TrieNode.kt\nkotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,908:1\n10#2,9:909\n10#2,9:918\n10#2,9:927\n83#3:936\n1#4:937\n1726#5,3:938\n26#6:941\n*S KotlinDebug\n*F\n+ 1 TrieNode.kt\nkotlinx/collections/immutable/implementations/immutableMap/TrieNode\n*L\n614#1:909,9\n631#1:918,9\n635#1:927,9\n683#1:936\n683#1:937\n857#1:938,3\n906#1:941\n*E\n"})
public final class s<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final a f218579e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final s f218580f = new s(0, 0, new Object[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f218581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f218582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ud.g f218583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public Object[] f218584d;

    public static final class a {
        public a() {
        }

        @NotNull
        public final s a() {
            return s.f218580f;
        }

        public a(C4969v c4969v) {
        }
    }

    @V({"SMAP\nTrieNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrieNode.kt\nkotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,908:1\n1#2:909\n*E\n"})
    public static final class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public s<K, V> f218585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f218586b;

        public b(@NotNull s<K, V> node, int i10) {
            G.p(node, "node");
            this.f218585a = node;
            this.f218586b = i10;
        }

        @NotNull
        public final s<K, V> a() {
            return this.f218585a;
        }

        public final int b() {
            return this.f218586b;
        }

        @NotNull
        public final b<K, V> c(@NotNull ed.l<? super s<K, V>, s<K, V>> operation) {
            G.p(operation, "operation");
            d(operation.invoke(this.f218585a));
            return this;
        }

        public final void d(@NotNull s<K, V> sVar) {
            G.p(sVar, "<set-?>");
            this.f218585a = sVar;
        }
    }

    public s(int i10, int i11, @NotNull Object[] buffer, @Nullable ud.g gVar) {
        G.p(buffer, "buffer");
        this.f218581a = i10;
        this.f218582b = i11;
        this.f218583c = gVar;
        this.f218584d = buffer;
    }

    public final s<K, V> A(int i10, int i11, int i12, K k10, V v10, int i13) {
        return new s<>(this.f218581a ^ i11, this.f218582b | i11, f(i10, i11, i12, k10, v10, i13, null));
    }

    public final s<K, V> B(K k10, V v10, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        int iJ = j(k10);
        if (iJ == -1) {
            persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() + 1);
            return new s<>(0, 0, w.g(this.f218584d, 0, k10, v10), persistentHashMapBuilder.f218551b);
        }
        persistentHashMapBuilder.f218553d = c0(iJ);
        if (this.f218583c == persistentHashMapBuilder.f218551b) {
            this.f218584d[iJ + 1] = v10;
            return this;
        }
        persistentHashMapBuilder.f218554e++;
        Object[] objArr = this.f218584d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        G.o(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iJ + 1] = v10;
        return new s<>(0, 0, objArrCopyOf, persistentHashMapBuilder.f218551b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s<K, V> C(s<K, V> sVar, ud.b bVar, ud.g gVar) {
        int i10 = sVar.f218582b;
        Object[] objArr = this.f218584d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + sVar.f218584d.length);
        G.o(objArrCopyOf, "copyOf(...)");
        int length = this.f218584d.length;
        md.j jVarD1 = md.u.D1(md.u.Y1(0, sVar.f218584d.length), 2);
        int i11 = jVarD1.f221139a;
        int i12 = jVarD1.f221140b;
        int i13 = jVarD1.f221141c;
        if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
            while (true) {
                if (h(sVar.f218584d[i11])) {
                    bVar.f239700a++;
                } else {
                    Object[] objArr2 = sVar.f218584d;
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
        if (length == this.f218584d.length) {
            return this;
        }
        if (length == sVar.f218584d.length) {
            return sVar;
        }
        if (length == objArrCopyOf.length) {
            return new s<>(0, 0, objArrCopyOf, gVar);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        G.o(objArrCopyOf2, "copyOf(...)");
        return new s<>(0, 0, objArrCopyOf2, gVar);
    }

    public final s<K, V> D(K k10, V v10, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        int iJ = j(k10);
        return (iJ == -1 || !G.g(v10, c0(iJ))) ? this : F(iJ, persistentHashMapBuilder);
    }

    public final s<K, V> E(K k10, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        int iJ = j(k10);
        return iJ != -1 ? F(iJ, persistentHashMapBuilder) : this;
    }

    public final s<K, V> F(int i10, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.f218553d = c0(i10);
        Object[] objArr = this.f218584d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f218583c != persistentHashMapBuilder.f218551b) {
            return new s<>(0, 0, w.h(objArr, i10), persistentHashMapBuilder.f218551b);
        }
        this.f218584d = w.h(objArr, i10);
        return this;
    }

    public final s<K, V> G(int i10, K k10, V v10, ud.g gVar) {
        int iR = r(i10);
        if (this.f218583c != gVar) {
            return new s<>(i10 | this.f218581a, this.f218582b, w.g(this.f218584d, iR, k10, v10), gVar);
        }
        this.f218584d = w.g(this.f218584d, iR, k10, v10);
        this.f218581a = i10 | this.f218581a;
        return this;
    }

    public final s<K, V> H(int i10, int i11, int i12, K k10, V v10, int i13, ud.g gVar) {
        if (this.f218583c != gVar) {
            return new s<>(this.f218581a ^ i11, i11 | this.f218582b, f(i10, i11, i12, k10, v10, i13, gVar), gVar);
        }
        this.f218584d = f(i10, i11, i12, k10, v10, i13, gVar);
        this.f218581a ^= i11;
        this.f218582b |= i11;
        return this;
    }

    @NotNull
    public final s<K, V> I(int i10, K k10, V v10, int i11, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        PersistentHashMapBuilder<K, V> persistentHashMapBuilder;
        s<K, V> sVarI;
        G.p(mutator, "mutator");
        int iF = 1 << w.f(i10, i11);
        if (v(iF)) {
            int iR = r(iF);
            if (G.g(k10, this.f218584d[iR])) {
                mutator.f218553d = c0(iR);
                return c0(iR) == v10 ? this : R(iR, v10, mutator);
            }
            mutator.setSize(mutator.size() + 1);
            return H(iR, iF, i10, k10, v10, i11, mutator.f218551b);
        }
        if (!w(iF)) {
            mutator.setSize(mutator.size() + 1);
            return G(iF, k10, v10, mutator.f218551b);
        }
        int iT = T(iF);
        s<K, V> sVarS = S(iT);
        if (i11 == 30) {
            sVarI = sVarS.B(k10, v10, mutator);
            persistentHashMapBuilder = mutator;
        } else {
            persistentHashMapBuilder = mutator;
            sVarI = sVarS.I(i10, k10, v10, i11 + 5, persistentHashMapBuilder);
        }
        return sVarS == sVarI ? this : Q(iT, sVarI, persistentHashMapBuilder.f218551b);
    }

    @NotNull
    public final s<K, V> J(@NotNull s<K, V> otherNode, int i10, @NotNull ud.b intersectionCounter, @NotNull PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        PersistentHashMapBuilder<K, V> mutator = persistentHashMapBuilder;
        G.p(otherNode, "otherNode");
        G.p(intersectionCounter, "intersectionCounter");
        G.p(mutator, "mutator");
        if (this == otherNode) {
            intersectionCounter.e(g());
            return this;
        }
        int i11 = i10;
        if (i11 > 30) {
            return C(otherNode, intersectionCounter, mutator.f218551b);
        }
        int i12 = this.f218582b | otherNode.f218582b;
        int i13 = this.f218581a;
        int i14 = otherNode.f218581a;
        int i15 = (i13 ^ i14) & (~i12);
        int i16 = i13 & i14;
        while (i16 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i16);
            if (G.g(this.f218584d[r(iLowestOneBit)], otherNode.f218584d[otherNode.r(iLowestOneBit)])) {
                i15 |= iLowestOneBit;
            } else {
                i12 |= iLowestOneBit;
            }
            i16 ^= iLowestOneBit;
        }
        if ((i12 & i15) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        s<K, V> sVar = (G.g(this.f218583c, mutator.f218551b) && this.f218581a == i15 && this.f218582b == i12) ? this : new s<>(i15, i12, new Object[Integer.bitCount(i12) + (Integer.bitCount(i15) * 2)]);
        int i17 = 0;
        int i18 = i12;
        int i19 = 0;
        while (i18 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i18);
            sVar.f218584d[(r11.length - 1) - i19] = K(otherNode, iLowestOneBit2, i11, intersectionCounter, mutator);
            i19++;
            i18 ^= iLowestOneBit2;
            i11 = i10;
            mutator = persistentHashMapBuilder;
        }
        while (i15 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i15);
            int i20 = i17 * 2;
            if (otherNode.v(iLowestOneBit3)) {
                int iR = otherNode.r(iLowestOneBit3);
                Object[] objArr = sVar.f218584d;
                objArr[i20] = otherNode.f218584d[iR];
                objArr[i20 + 1] = otherNode.c0(iR);
                if (v(iLowestOneBit3)) {
                    intersectionCounter.f239700a++;
                }
            } else {
                int iR2 = r(iLowestOneBit3);
                Object[] objArr2 = sVar.f218584d;
                objArr2[i20] = this.f218584d[iR2];
                objArr2[i20 + 1] = c0(iR2);
            }
            i17++;
            i15 ^= iLowestOneBit3;
        }
        return p(sVar) ? this : otherNode.p(sVar) ? otherNode : sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s<K, V> K(s<K, V> sVar, int i10, int i11, ud.b bVar, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        int iHashCode;
        int i12;
        Object obj;
        Object obj2;
        int i13;
        if (w(i10)) {
            s<K, V> sVar2 = (s<K, V>) S(T(i10));
            if (sVar.w(i10)) {
                return sVar2.J(sVar.S(sVar.T(i10)), i11 + 5, bVar, persistentHashMapBuilder);
            }
            if (!sVar.v(i10)) {
                return sVar2;
            }
            int iR = sVar.r(i10);
            Object obj3 = sVar.f218584d[iR];
            V vC0 = sVar.c0(iR);
            int size = persistentHashMapBuilder.size();
            s<K, V> sVarI = sVar2.I(obj3 != null ? obj3.hashCode() : 0, obj3, vC0, i11 + 5, persistentHashMapBuilder);
            if (persistentHashMapBuilder.size() == size) {
                bVar.f239700a++;
            }
            return sVarI;
        }
        if (!sVar.w(i10)) {
            int iHashCode2 = 0;
            int iR2 = r(i10);
            Object obj4 = this.f218584d[iR2];
            Object objC0 = c0(iR2);
            int iR3 = sVar.r(i10);
            Object obj5 = sVar.f218584d[iR3];
            V vC02 = sVar.c0(iR3);
            int iHashCode3 = obj4 != null ? obj4.hashCode() : 0;
            if (obj5 != null) {
                iHashCode2 = obj5.hashCode();
            }
            return z(iHashCode3, obj4, objC0, iHashCode2, obj5, vC02, i11 + 5, persistentHashMapBuilder.f218551b);
        }
        s<K, V> sVarS = sVar.S(sVar.T(i10));
        if (!v(i10)) {
            return sVarS;
        }
        int iR4 = r(i10);
        Object obj6 = this.f218584d[iR4];
        if (obj6 != null) {
            iHashCode = obj6.hashCode();
            i12 = 0;
        } else {
            iHashCode = 0;
            i12 = 0;
        }
        int i14 = i11 + 5;
        if (sVarS.o(iHashCode, obj6, i14)) {
            bVar.f239700a++;
            return sVarS;
        }
        Object objC02 = c0(iR4);
        if (obj6 != null) {
            int iHashCode4 = obj6.hashCode();
            obj2 = objC02;
            i13 = iHashCode4;
            obj = obj6;
        } else {
            obj = obj6;
            obj2 = objC02;
            i13 = i12;
        }
        return sVarS.I(i13, obj, obj2, i14, persistentHashMapBuilder);
    }

    @Nullable
    public final s<K, V> L(int i10, K k10, int i11, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        G.p(mutator, "mutator");
        int iF = 1 << w.f(i10, i11);
        if (v(iF)) {
            int iR = r(iF);
            if (G.g(k10, this.f218584d[iR])) {
                return N(iR, iF, mutator);
            }
        } else if (w(iF)) {
            int iT = T(iF);
            s<K, V> sVarS = S(iT);
            return P(sVarS, i11 == 30 ? sVarS.E(k10, mutator) : sVarS.L(i10, k10, i11 + 5, mutator), iT, iF, mutator.f218551b);
        }
        return this;
    }

    @Nullable
    public final s<K, V> M(int i10, K k10, V v10, int i11, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        G.p(mutator, "mutator");
        int iF = 1 << w.f(i10, i11);
        if (v(iF)) {
            int iR = r(iF);
            if (G.g(k10, this.f218584d[iR]) && G.g(v10, c0(iR))) {
                return N(iR, iF, mutator);
            }
        } else if (w(iF)) {
            int iT = T(iF);
            s<K, V> sVarS = S(iT);
            return P(sVarS, i11 == 30 ? sVarS.D(k10, v10, mutator) : sVarS.M(i10, k10, v10, i11 + 5, mutator), iT, iF, mutator.f218551b);
        }
        return this;
    }

    public final s<K, V> N(int i10, int i11, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        persistentHashMapBuilder.setSize(persistentHashMapBuilder.size() - 1);
        persistentHashMapBuilder.f218553d = c0(i10);
        Object[] objArr = this.f218584d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f218583c != persistentHashMapBuilder.f218551b) {
            return new s<>(i11 ^ this.f218581a, this.f218582b, w.h(objArr, i10), persistentHashMapBuilder.f218551b);
        }
        this.f218584d = w.h(objArr, i10);
        this.f218581a ^= i11;
        return this;
    }

    public final s<K, V> O(int i10, int i11, ud.g gVar) {
        Object[] objArr = this.f218584d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f218583c != gVar) {
            return new s<>(this.f218581a, i11 ^ this.f218582b, w.i(objArr, i10), gVar);
        }
        this.f218584d = w.i(objArr, i10);
        this.f218582b ^= i11;
        return this;
    }

    public final s<K, V> P(s<K, V> sVar, s<K, V> sVar2, int i10, int i11, ud.g gVar) {
        return sVar2 == null ? O(i10, i11, gVar) : sVar != sVar2 ? Q(i10, sVar2, gVar) : this;
    }

    public final s<K, V> Q(int i10, s<K, V> sVar, ud.g gVar) {
        ud.g gVar2 = sVar.f218583c;
        Object[] objArr = this.f218584d;
        if (objArr.length == 1 && sVar.f218584d.length == 2 && sVar.f218582b == 0) {
            sVar.f218581a = this.f218582b;
            return sVar;
        }
        if (this.f218583c == gVar) {
            objArr[i10] = sVar;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        G.o(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10] = sVar;
        return new s<>(this.f218581a, this.f218582b, objArrCopyOf, gVar);
    }

    public final s<K, V> R(int i10, V v10, PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        if (this.f218583c == persistentHashMapBuilder.f218551b) {
            this.f218584d[i10 + 1] = v10;
            return this;
        }
        persistentHashMapBuilder.f218554e++;
        Object[] objArr = this.f218584d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        G.o(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 + 1] = v10;
        return new s<>(this.f218581a, this.f218582b, objArrCopyOf, persistentHashMapBuilder.f218551b);
    }

    @NotNull
    public final s<K, V> S(int i10) {
        Object obj = this.f218584d[i10];
        G.n(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (s) obj;
    }

    public final int T(int i10) {
        return (this.f218584d.length - 1) - Integer.bitCount((i10 - 1) & this.f218582b);
    }

    @Nullable
    public final b<K, V> U(int i10, K k10, V v10, int i11) {
        b<K, V> bVarU;
        int iF = 1 << w.f(i10, i11);
        if (v(iF)) {
            int iR = r(iF);
            if (!G.g(k10, this.f218584d[iR])) {
                return A(iR, iF, i10, k10, v10, i11).d();
            }
            if (c0(iR) == v10) {
                return null;
            }
            return b0(iR, v10).e();
        }
        if (!w(iF)) {
            return x(iF, k10, v10).d();
        }
        int iT = T(iF);
        s<K, V> sVarS = S(iT);
        if (i11 == 30) {
            bVarU = sVarS.k(k10, v10);
            if (bVarU == null) {
                return null;
            }
        } else {
            bVarU = sVarS.U(i10, k10, v10, i11 + 5);
            if (bVarU == null) {
                return null;
            }
        }
        bVarU.f218585a = a0(iT, iF, bVarU.f218585a);
        return bVarU;
    }

    @Nullable
    public final s<K, V> V(int i10, K k10, int i11) {
        int iF = 1 << w.f(i10, i11);
        if (v(iF)) {
            int iR = r(iF);
            if (G.g(k10, this.f218584d[iR])) {
                return X(iR, iF);
            }
        } else if (w(iF)) {
            int iT = T(iF);
            s<K, V> sVarS = S(iT);
            return Z(sVarS, i11 == 30 ? sVarS.l(k10) : sVarS.V(i10, k10, i11 + 5), iT, iF);
        }
        return this;
    }

    @Nullable
    public final s<K, V> W(int i10, K k10, V v10, int i11) {
        int iF = 1 << w.f(i10, i11);
        if (v(iF)) {
            int iR = r(iF);
            if (G.g(k10, this.f218584d[iR]) && G.g(v10, c0(iR))) {
                return X(iR, iF);
            }
        } else if (w(iF)) {
            int iT = T(iF);
            s<K, V> sVarS = S(iT);
            return Z(sVarS, i11 == 30 ? sVarS.m(k10, v10) : sVarS.W(i10, k10, v10, i11 + 5), iT, iF);
        }
        return this;
    }

    public final s<K, V> X(int i10, int i11) {
        Object[] objArr = this.f218584d;
        if (objArr.length == 2) {
            return null;
        }
        return new s<>(i11 ^ this.f218581a, this.f218582b, w.h(objArr, i10));
    }

    public final s<K, V> Y(int i10, int i11) {
        Object[] objArr = this.f218584d;
        if (objArr.length == 1) {
            return null;
        }
        return new s<>(this.f218581a, i11 ^ this.f218582b, w.i(objArr, i10));
    }

    public final s<K, V> Z(s<K, V> sVar, s<K, V> sVar2, int i10, int i11) {
        return sVar2 == null ? Y(i10, i11) : sVar != sVar2 ? a0(i10, i11, sVar2) : this;
    }

    public final void a(ed.s<? super s<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, L0> sVar, int i10, int i11) {
        sVar.p(this, Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(this.f218581a), Integer.valueOf(this.f218582b));
        int i12 = this.f218582b;
        while (i12 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i12);
            S(T(iLowestOneBit)).a(sVar, (Integer.numberOfTrailingZeros(iLowestOneBit) << i11) + i10, i11 + 5);
            i12 -= iLowestOneBit;
        }
    }

    public final s<K, V> a0(int i10, int i11, s<K, V> sVar) {
        Object[] objArr = sVar.f218584d;
        if (objArr.length != 2 || sVar.f218582b != 0) {
            Object[] objArr2 = this.f218584d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            G.o(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i10] = sVar;
            return new s<>(this.f218581a, this.f218582b, objArrCopyOf);
        }
        if (this.f218584d.length == 1) {
            sVar.f218581a = this.f218582b;
            return sVar;
        }
        return new s<>(this.f218581a ^ i11, i11 ^ this.f218582b, w.k(this.f218584d, i10, r(i11), objArr[0], objArr[1]));
    }

    public final void b(@NotNull ed.s<? super s<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, L0> visitor) {
        G.p(visitor, "visitor");
        a(visitor, 0, 0);
    }

    public final s<K, V> b0(int i10, V v10) {
        Object[] objArr = this.f218584d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        G.o(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i10 + 1] = v10;
        return new s<>(this.f218581a, this.f218582b, objArrCopyOf);
    }

    public final V c0(int i10) {
        return (V) this.f218584d[i10 + 1];
    }

    public final b<K, V> d() {
        return new b<>(this, 1);
    }

    public final b<K, V> e() {
        return new b<>(this, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object[] f(int i10, int i11, int i12, K k10, V v10, int i13, ud.g gVar) {
        Object obj = this.f218584d[i10];
        return w.j(this.f218584d, i10, T(i11) + 1, z(obj != null ? obj.hashCode() : 0, obj, c0(i10), i12, k10, v10, i13 + 5, gVar));
    }

    public final int g() {
        if (this.f218582b == 0) {
            return this.f218584d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f218581a);
        int length = this.f218584d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += S(i10).g();
        }
        return iBitCount;
    }

    public final boolean h(K k10) {
        return j(k10) != -1;
    }

    public final V i(K k10) {
        int iJ = j(k10);
        if (iJ != -1) {
            return c0(iJ);
        }
        return null;
    }

    public final int j(Object obj) {
        md.j jVarD1 = md.u.D1(md.u.Y1(0, this.f218584d.length), 2);
        int i10 = jVarD1.f221139a;
        int i11 = jVarD1.f221140b;
        int i12 = jVarD1.f221141c;
        if ((i12 <= 0 || i10 > i11) && (i12 >= 0 || i11 > i10)) {
            return -1;
        }
        while (!G.g(obj, this.f218584d[i10])) {
            if (i10 == i11) {
                return -1;
            }
            i10 += i12;
        }
        return i10;
    }

    public final b<K, V> k(K k10, V v10) {
        int iJ = j(k10);
        if (iJ == -1) {
            return new s(0, 0, w.g(this.f218584d, 0, k10, v10)).d();
        }
        if (v10 == c0(iJ)) {
            return null;
        }
        Object[] objArr = this.f218584d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        G.o(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[iJ + 1] = v10;
        return new s(0, 0, objArrCopyOf).e();
    }

    public final s<K, V> l(K k10) {
        int iJ = j(k10);
        return iJ != -1 ? n(iJ) : this;
    }

    public final s<K, V> m(K k10, V v10) {
        int iJ = j(k10);
        return (iJ == -1 || !G.g(v10, c0(iJ))) ? this : n(iJ);
    }

    public final s<K, V> n(int i10) {
        Object[] objArr = this.f218584d;
        if (objArr.length == 2) {
            return null;
        }
        return new s<>(0, 0, w.h(objArr, i10));
    }

    public final boolean o(int i10, K k10, int i11) {
        int iF = 1 << w.f(i10, i11);
        if (v(iF)) {
            return G.g(k10, this.f218584d[r(iF)]);
        }
        if (!w(iF)) {
            return false;
        }
        s<K, V> sVarS = S(T(iF));
        return i11 == 30 ? sVarS.h(k10) : sVarS.o(i10, k10, i11 + 5);
    }

    public final boolean p(s<K, V> sVar) {
        if (this == sVar) {
            return true;
        }
        if (this.f218582b != sVar.f218582b || this.f218581a != sVar.f218581a) {
            return false;
        }
        int length = this.f218584d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f218584d[i10] != sVar.f218584d[i10]) {
                return false;
            }
        }
        return true;
    }

    public final int q() {
        return Integer.bitCount(this.f218581a);
    }

    public final int r(int i10) {
        return Integer.bitCount((i10 - 1) & this.f218581a) * 2;
    }

    public final <K1, V1> boolean s(@NotNull s<K1, V1> that, @NotNull ed.p<? super V, ? super V1, Boolean> equalityComparator) {
        int i10;
        G.p(that, "that");
        G.p(equalityComparator, "equalityComparator");
        if (this == that) {
            return true;
        }
        int i11 = this.f218581a;
        if (i11 != that.f218581a || (i10 = this.f218582b) != that.f218582b) {
            return false;
        }
        if (i11 == 0 && i10 == 0) {
            Object[] objArr = this.f218584d;
            if (objArr.length != that.f218584d.length) {
                return false;
            }
            Iterable iterableD1 = md.u.D1(md.u.Y1(0, objArr.length), 2);
            if ((iterableD1 instanceof Collection) && ((Collection) iterableD1).isEmpty()) {
                return true;
            }
            Iterator it = iterableD1.iterator();
            while (it.hasNext()) {
                int iNextInt = ((AbstractC4864f0) it).nextInt();
                Object obj = that.f218584d[iNextInt];
                V1 v1C0 = that.c0(iNextInt);
                int iJ = j(obj);
                if (!(iJ != -1 ? equalityComparator.invoke(c0(iJ), v1C0).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        int iBitCount = Integer.bitCount(i11) * 2;
        md.j jVarD1 = md.u.D1(md.u.Y1(0, iBitCount), 2);
        int i12 = jVarD1.f221139a;
        int i13 = jVarD1.f221140b;
        int i14 = jVarD1.f221141c;
        if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
            while (G.g(this.f218584d[i12], that.f218584d[i12]) && equalityComparator.invoke(c0(i12), that.c0(i12)).booleanValue()) {
                if (i12 != i13) {
                    i12 += i14;
                }
            }
            return false;
        }
        int length = this.f218584d.length;
        while (iBitCount < length) {
            if (!S(iBitCount).s(that.S(iBitCount), equalityComparator)) {
                return false;
            }
            iBitCount++;
        }
        return true;
    }

    @Nullable
    public final V t(int i10, K k10, int i11) {
        int iF = 1 << w.f(i10, i11);
        if (v(iF)) {
            int iR = r(iF);
            if (G.g(k10, this.f218584d[iR])) {
                return c0(iR);
            }
            return null;
        }
        if (!w(iF)) {
            return null;
        }
        s<K, V> sVarS = S(T(iF));
        return i11 == 30 ? sVarS.i(k10) : sVarS.t(i10, k10, i11 + 5);
    }

    @NotNull
    public final Object[] u() {
        return this.f218584d;
    }

    public final boolean v(int i10) {
        return (i10 & this.f218581a) != 0;
    }

    public final boolean w(int i10) {
        return (i10 & this.f218582b) != 0;
    }

    public final s<K, V> x(int i10, K k10, V v10) {
        return new s<>(i10 | this.f218581a, this.f218582b, w.g(this.f218584d, r(i10), k10, v10));
    }

    public final K y(int i10) {
        return (K) this.f218584d[i10];
    }

    public final s<K, V> z(int i10, K k10, V v10, int i11, K k11, V v11, int i12, ud.g gVar) {
        if (i12 > 30) {
            return new s<>(0, 0, new Object[]{k10, v10, k11, v11}, gVar);
        }
        int iF = w.f(i10, i12);
        int iF2 = w.f(i11, i12);
        if (iF != iF2) {
            return new s<>((1 << iF) | (1 << iF2), 0, iF < iF2 ? new Object[]{k10, v10, k11, v11} : new Object[]{k11, v11, k10, v10}, gVar);
        }
        return new s<>(0, 1 << iF, new Object[]{z(i10, k10, v10, i11, k11, v11, i12 + 5, gVar)}, gVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(int i10, int i11, @NotNull Object[] buffer) {
        this(i10, i11, buffer, null);
        G.p(buffer, "buffer");
    }
}
