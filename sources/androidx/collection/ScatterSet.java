package androidx.collection;

import fd.InterfaceC4418a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4968u;
import kotlin.jvm.internal.C4969v;
import kotlin.sequences.C5004q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1097:1\n228#1,4:1098\n198#1,7:1102\n209#1,3:1110\n212#1,9:1114\n232#1:1123\n228#1,4:1124\n198#1,7:1128\n209#1,3:1136\n212#1,9:1140\n232#1:1149\n228#1,4:1150\n198#1,7:1154\n209#1,3:1162\n212#1,9:1166\n232#1:1175\n198#1,7:1178\n209#1,3:1186\n212#1,9:1190\n228#1,4:1199\n198#1,7:1203\n209#1,3:1211\n212#1,9:1215\n232#1:1224\n228#1,4:1225\n198#1,7:1229\n209#1,3:1237\n212#1,9:1241\n232#1:1250\n228#1,4:1251\n198#1,7:1255\n209#1,3:1263\n212#1,9:1267\n232#1:1276\n383#1:1277\n384#1:1281\n386#1,2:1283\n388#1,3:1286\n391#1:1292\n392#1:1296\n393#1:1298\n394#1,4:1301\n400#1:1306\n401#1,8:1308\n228#1,4:1316\n198#1,7:1320\n209#1,3:1328\n212#1,9:1332\n232#1:1341\n228#1,4:1342\n198#1,7:1346\n209#1,3:1354\n212#1,9:1358\n232#1:1367\n228#1,4:1368\n198#1,7:1372\n209#1,3:1380\n212#1,9:1384\n232#1:1393\n1956#2:1109\n1820#2:1113\n1956#2:1135\n1820#2:1139\n1956#2:1161\n1820#2:1165\n1956#2:1176\n1820#2:1177\n1956#2:1185\n1820#2:1189\n1956#2:1210\n1820#2:1214\n1956#2:1236\n1820#2:1240\n1956#2:1262\n1820#2:1266\n1714#2,3:1278\n1728#2:1282\n1724#2:1285\n1925#2,3:1289\n1939#2,3:1293\n1865#2:1297\n1853#2:1299\n1847#2:1300\n1860#2:1305\n1948#2:1307\n1956#2:1327\n1820#2:1331\n1956#2:1353\n1820#2:1357\n1956#2:1379\n1820#2:1383\n1714#2,3:1394\n1728#2:1397\n1724#2:1398\n1925#2,3:1399\n1939#2,3:1402\n1865#2:1405\n1853#2:1406\n1847#2:1407\n1860#2:1408\n1948#2:1409\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n161#1:1098,4\n161#1:1102,7\n161#1:1110,3\n161#1:1114,9\n161#1:1123\n177#1:1124,4\n177#1:1128,7\n177#1:1136,3\n177#1:1140,9\n177#1:1149\n191#1:1150,4\n191#1:1154,7\n191#1:1162,3\n191#1:1166,9\n191#1:1175\n231#1:1178,7\n231#1:1186,3\n231#1:1190,9\n243#1:1199,4\n243#1:1203,7\n243#1:1211,3\n243#1:1215,9\n243#1:1224\n255#1:1225,4\n255#1:1229,7\n255#1:1237,3\n255#1:1241,9\n255#1:1250\n272#1:1251,4\n272#1:1255,7\n272#1:1263,3\n272#1:1267,9\n272#1:1276\n281#1:1277\n281#1:1281\n281#1:1283,2\n281#1:1286,3\n281#1:1292\n281#1:1296\n281#1:1298\n281#1:1301,4\n281#1:1306\n281#1:1308,8\n304#1:1316,4\n304#1:1320,7\n304#1:1328,3\n304#1:1332,9\n304#1:1341\n330#1:1342,4\n330#1:1346,7\n330#1:1354,3\n330#1:1358,9\n330#1:1367\n356#1:1368,4\n356#1:1372,7\n356#1:1380,3\n356#1:1384,9\n356#1:1393\n161#1:1109\n161#1:1113\n177#1:1135\n177#1:1139\n191#1:1161\n191#1:1165\n204#1:1176\n211#1:1177\n231#1:1185\n231#1:1189\n243#1:1210\n243#1:1214\n255#1:1236\n255#1:1240\n272#1:1262\n272#1:1266\n281#1:1278,3\n281#1:1282\n281#1:1285\n281#1:1289,3\n281#1:1293,3\n281#1:1297\n281#1:1299\n281#1:1300\n281#1:1305\n281#1:1307\n304#1:1327\n304#1:1331\n330#1:1353\n330#1:1357\n356#1:1379\n356#1:1383\n383#1:1394,3\n384#1:1397\n387#1:1398\n390#1:1399,3\n391#1:1402,3\n392#1:1405\n393#1:1406\n393#1:1407\n397#1:1408\n400#1:1409\n*E\n"})
public abstract class ScatterSet<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public long[] f86876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @NotNull
    public Object[] f86877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    public int f86878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    public int f86879d;

    @kotlin.jvm.internal.V({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1097:1\n1855#2,2:1098\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper\n*L\n428#1:1098,2\n*E\n"})
    public class SetWrapper implements Set<E>, InterfaceC4418a {
        public SetWrapper() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return ScatterSet.this.e(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(@NotNull Collection<? extends Object> elements) {
            kotlin.jvm.internal.G.p(elements, "elements");
            ScatterSet<E> scatterSet = ScatterSet.this;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!scatterSet.e((E) it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int getSize() {
            return ScatterSet.this.f86879d;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return ScatterSet.this.r();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<E> iterator() {
            return C5004q.a(new ScatterSet$SetWrapper$iterator$1(ScatterSet.this, null));
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return C4968u.a(this);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] array) {
            kotlin.jvm.internal.G.p(array, "array");
            return (T[]) C4968u.b(this, array);
        }
    }

    public /* synthetic */ ScatterSet(C4969v c4969v) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String A(ScatterSet scatterSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.l lVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = U6.j.f68738d;
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        ed.l lVar2 = lVar;
        return scatterSet.z(charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    @InterfaceC4850b0
    public static /* synthetic */ void o() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void p() {
    }

    public final boolean B() {
        return this.f86879d == 0;
    }

    public final boolean a(@NotNull ed.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Object[] objArr = this.f86877b;
        long[] jArr = this.f86876a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128 && !predicate.invoke(objArr[(i10 << 3) + i12]).booleanValue()) {
                        return false;
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean b() {
        return this.f86879d != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(@org.jetbrains.annotations.NotNull ed.l<? super E, java.lang.Boolean> r15) {
        /*
            r14 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.G.p(r15, r0)
            java.lang.Object[] r0 = r14.f86877b
            long[] r1 = r14.f86876a
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L53
            r4 = r3
        L10:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4e
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2a:
            if (r9 >= r7) goto L4c
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L48
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.Object r10 = r15.invoke(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L48
            r15 = 1
            return r15
        L48:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2a
        L4c:
            if (r7 != r8) goto L53
        L4e:
            if (r4 == r2) goto L53
            int r4 = r4 + 1
            goto L10
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.c(ed.l):boolean");
    }

    @NotNull
    public final Set<E> d() {
        return new SetWrapper();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f86878c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f86876a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f86877b
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.G.g(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.e(java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof androidx.collection.ScatterSet
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            androidx.collection.ScatterSet r1 = (androidx.collection.ScatterSet) r1
            int r3 = r1.f86879d
            int r5 = r0.f86879d
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f86877b
            long[] r5 = r0.f86876a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5d
            r7 = r4
        L21:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L58
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3b:
            if (r12 >= r10) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L52
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.e(r13)
            if (r13 != 0) goto L52
            return r4
        L52:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3b
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r7 == r6) goto L5d
            int r7 = r7 + 1
            goto L21
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.equals(java.lang.Object):boolean");
    }

    @e.D(from = 0)
    public final int f() {
        return this.f86879d;
    }

    @e.D(from = 0)
    public final int g(@NotNull ed.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Object[] objArr = this.f86877b;
        long[] jArr = this.f86876a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128 && predicate.invoke(objArr[(i10 << 3) + i13]).booleanValue()) {
                        i11++;
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 == length) {
                return i11;
            }
            i10++;
        }
    }

    public final int h(E e10) {
        int i10 = 0;
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * S0.f86834j;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f86878c;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f86876a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * S0.f86835k) ^ j10;
            for (long j12 = (~j11) & (j11 - S0.f86835k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.G.g(this.f86877b[iNumberOfTrailingZeros], e10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    public int hashCode() {
        Object[] objArr = this.f86877b;
        long[] jArr = this.f86876a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        Object obj = objArr[(i10 << 3) + i12];
                        iHashCode += obj != null ? obj.hashCode() : 0;
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final E i() {
        /*
            r14 = this;
            java.lang.Object[] r0 = r14.f86877b
            long[] r1 = r14.f86876a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L41
            r3 = 0
            r4 = r3
        Lb:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L3c
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L25:
            if (r9 >= r7) goto L3a
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L36
            int r1 = r4 << 3
            int r1 = r1 + r9
            r0 = r0[r1]
            return r0
        L36:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L25
        L3a:
            if (r7 != r8) goto L41
        L3c:
            if (r4 == r2) goto L41
            int r4 = r4 + 1
            goto Lb
        L41:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "The ScatterSet is empty"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.i():java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Type inference failed for: r10v5, types: [E, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final E j(@org.jetbrains.annotations.NotNull ed.l<? super E, java.lang.Boolean> r15) {
        /*
            r14 = this;
            java.lang.String r0 = "predicate"
            kotlin.jvm.internal.G.p(r15, r0)
            java.lang.Object[] r0 = r14.f86877b
            long[] r1 = r14.f86876a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L52
            r3 = 0
            r4 = r3
        L10:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4d
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2a:
            if (r9 >= r7) goto L4b
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L47
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.Object r11 = r15.invoke(r10)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L47
            return r10
        L47:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2a
        L4b:
            if (r7 != r8) goto L52
        L4d:
            if (r4 == r2) goto L52
            int r4 = r4 + 1
            goto L10
        L52:
            java.util.NoSuchElementException r15 = new java.util.NoSuchElementException
            java.lang.String r0 = "Could not find a match"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.j(ed.l):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [E, java.lang.Object] */
    @Nullable
    public final E k(@NotNull ed.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Object[] objArr = this.f86877b;
        long[] jArr = this.f86876a;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        ?? r10 = (Object) objArr[(i10 << 3) + i12];
                        if (predicate.invoke(r10).booleanValue()) {
                            return r10;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return null;
                }
            }
            if (i10 == length) {
                return null;
            }
            i10++;
        }
    }

    public final void l(@NotNull ed.l<? super E, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        Object[] objArr = this.f86877b;
        long[] jArr = this.f86876a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @InterfaceC4850b0
    public final void m(@NotNull ed.l<? super Integer, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        long[] jArr = this.f86876a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        C1540k.a(i10 << 3, i12, block);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @e.D(from = 0)
    public final int n() {
        return this.f86878c;
    }

    @e.D(from = 0)
    public final int q() {
        return this.f86879d;
    }

    public final boolean r() {
        return this.f86879d == 0;
    }

    public final boolean s() {
        return this.f86879d != 0;
    }

    @dd.k
    @NotNull
    public final String t() {
        return A(this, null, null, null, 0, null, null, 63, null);
    }

    @NotNull
    public String toString() {
        return A(this, null, "[", "]", 0, null, new ed.l<E, CharSequence>(this) { // from class: androidx.collection.ScatterSet.toString.1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ ScatterSet<E> f86891d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.f86891d = this;
            }

            @Override // ed.l
            @NotNull
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(E e10) {
                return e10 == this.f86891d ? "(this)" : String.valueOf(e10);
            }
        }, 25, null);
    }

    @dd.k
    @NotNull
    public final String u(@NotNull CharSequence separator) {
        kotlin.jvm.internal.G.p(separator, "separator");
        return A(this, separator, null, null, 0, null, null, 62, null);
    }

    @dd.k
    @NotNull
    public final String v(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        return A(this, separator, prefix, null, 0, null, null, 60, null);
    }

    @dd.k
    @NotNull
    public final String w(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        return A(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    @dd.k
    @NotNull
    public final String x(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        return A(this, separator, prefix, postfix, i10, null, null, 48, null);
    }

    @dd.k
    @NotNull
    public final String y(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence truncated) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        kotlin.jvm.internal.G.p(truncated, "truncated");
        return A(this, separator, prefix, postfix, i10, truncated, null, 32, null);
    }

    @dd.k
    @NotNull
    public final String z(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence charSequence, int i10, @NotNull CharSequence charSequence2, @Nullable ed.l<? super E, ? extends CharSequence> lVar) {
        int i11;
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        StringBuilder sbA = C1544m.a(charSequence, "postfix", charSequence2, "truncated", prefix);
        Object[] objArr = this.f86877b;
        long[] jArr = this.f86876a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i12 = 0;
            int i13 = 0;
            loop0: while (true) {
                long j10 = jArr[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8;
                    int i15 = 8 - ((~(i12 - length)) >>> 31);
                    int i16 = 0;
                    while (i16 < i15) {
                        if ((j10 & 255) < 128) {
                            i11 = i14;
                            Object obj = objArr[(i12 << 3) + i16];
                            if (i13 == i10) {
                                sbA.append(charSequence2);
                                break loop0;
                            }
                            if (i13 != 0) {
                                sbA.append(separator);
                            }
                            if (lVar == null) {
                                sbA.append(obj);
                            } else {
                                sbA.append(lVar.invoke(obj));
                            }
                            i13++;
                        } else {
                            i11 = i14;
                        }
                        j10 >>= i11;
                        i16++;
                        i14 = i11;
                    }
                    if (i15 != i14) {
                        break;
                    }
                }
                if (i12 == length) {
                    break;
                }
                i12++;
            }
            sbA.append(charSequence);
        } else {
            sbA.append(charSequence);
        }
        String string = sbA.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public ScatterSet() {
        this.f86876a = S0.f86829e;
        this.f86877b = A.a.f13c;
    }
}
