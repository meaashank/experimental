package androidx.collection;

import fd.InterfaceC4425h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.InterfaceC4850b0;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 7 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 8 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 9 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1097:1\n46#2,5:1098\n1#3:1103\n1804#4,6:1104\n1956#4:1127\n1820#4:1131\n1714#4,3:1149\n1728#4:1153\n1724#4:1156\n1925#4,3:1160\n1939#4,3:1164\n1865#4:1168\n1853#4:1170\n1847#4:1171\n1860#4:1176\n1948#4:1178\n1714#4,3:1188\n1728#4:1192\n1724#4:1195\n1925#4,3:1199\n1939#4,3:1203\n1865#4:1207\n1853#4:1209\n1847#4:1210\n1860#4:1215\n1948#4:1217\n1956#4:1243\n1820#4:1247\n1956#4:1271\n1820#4:1275\n1780#4:1285\n1804#4,6:1286\n1792#4:1292\n1791#4,4:1293\n1804#4,6:1297\n1714#4,3:1303\n1724#4:1306\n1728#4:1307\n1925#4,3:1308\n1939#4,3:1311\n1865#4:1314\n1853#4:1315\n1847#4:1316\n1860#4:1317\n1948#4:1318\n1814#4:1319\n1770#4:1320\n1812#4:1321\n1770#4:1322\n1780#4:1323\n1804#4,6:1324\n1792#4:1330\n1791#4,4:1331\n1925#4,3:1335\n1956#4:1338\n1847#4:1339\n1770#4:1340\n1714#4,3:1341\n1724#4:1344\n1728#4:1345\n1804#4,6:1346\n1770#4:1352\n1728#4:1353\n1804#4,6:1354\n1804#4,6:1360\n1728#4:1366\n1804#4,6:1367\n1817#4:1373\n1770#4:1374\n1714#4,3:1375\n1724#4:1378\n1728#4:1379\n1780#4:1380\n1804#4,6:1381\n1792#4:1387\n1791#4,4:1388\n13579#5,2:1110\n13579#5,2:1226\n1855#6,2:1112\n1855#6,2:1230\n1295#7,2:1114\n1295#7,2:1228\n228#8,4:1116\n198#8,7:1120\n209#8,3:1128\n212#8,9:1132\n232#8:1141\n383#8:1148\n384#8:1152\n386#8,2:1154\n388#8,3:1157\n391#8:1163\n392#8:1167\n393#8:1169\n394#8,4:1172\n400#8:1177\n401#8,8:1179\n383#8:1187\n384#8:1191\n386#8,2:1193\n388#8,3:1196\n391#8:1202\n392#8:1206\n393#8:1208\n394#8,4:1211\n400#8:1216\n401#8,8:1218\n228#8,4:1232\n198#8,7:1236\n209#8,3:1244\n212#8,9:1248\n232#8:1257\n198#8,7:1264\n209#8,3:1272\n212#8,9:1276\n305#9,6:1142\n305#9,6:1258\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n480#1:1098,5\n507#1:1104,6\n637#1:1127\n637#1:1131\n657#1:1149,3\n657#1:1153\n657#1:1156\n657#1:1160,3\n657#1:1164,3\n657#1:1168\n657#1:1170\n657#1:1171\n657#1:1176\n657#1:1178\n671#1:1188,3\n671#1:1192\n671#1:1195\n671#1:1199,3\n671#1:1203,3\n671#1:1207\n671#1:1209\n671#1:1210\n671#1:1215\n671#1:1217\n770#1:1243\n770#1:1247\n785#1:1271\n785#1:1275\n799#1:1285\n799#1:1286,6\n799#1:1292\n799#1:1293,4\n808#1:1297,6\n821#1:1303,3\n822#1:1306\n823#1:1307\n830#1:1308,3\n831#1:1311,3\n832#1:1314\n833#1:1315\n833#1:1316\n837#1:1317\n840#1:1318\n849#1:1319\n849#1:1320\n855#1:1321\n855#1:1322\n856#1:1323\n856#1:1324,6\n856#1:1330\n856#1:1331,4\n870#1:1335,3\n871#1:1338\n873#1:1339\n926#1:1340\n941#1:1341,3\n942#1:1344\n953#1:1345\n954#1:1346,6\n964#1:1352\n967#1:1353\n968#1:1354,6\n969#1:1360,6\n978#1:1366\n979#1:1367,6\n1016#1:1373\n1016#1:1374\n1018#1:1375,3\n1019#1:1378\n1021#1:1379\n1021#1:1380\n1021#1:1381,6\n1021#1:1387\n1021#1:1388,4\n610#1:1110,2\n743#1:1226,2\n619#1:1112,2\n761#1:1230,2\n628#1:1114,2\n752#1:1228,2\n637#1:1116,4\n637#1:1120,7\n637#1:1128,3\n637#1:1132,9\n637#1:1141\n657#1:1148\n657#1:1152\n657#1:1154,2\n657#1:1157,3\n657#1:1163\n657#1:1167\n657#1:1169\n657#1:1172,4\n657#1:1177\n657#1:1179,8\n671#1:1187\n671#1:1191\n671#1:1193,2\n671#1:1196,3\n671#1:1202\n671#1:1206\n671#1:1208\n671#1:1211,4\n671#1:1216\n671#1:1218,8\n770#1:1232,4\n770#1:1236,7\n770#1:1244,3\n770#1:1248,9\n770#1:1257\n785#1:1264,7\n785#1:1272,3\n785#1:1276,9\n646#1:1142,6\n779#1:1258,6\n*E\n"})
public final class MutableScatterSet<E> extends ScatterSet<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86785e;

    @kotlin.jvm.internal.V({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1097:1\n198#2,7:1098\n209#2,3:1106\n212#2,9:1110\n1956#3:1105\n1820#3:1109\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper\n*L\n1077#1:1098,7\n1077#1:1106,3\n1077#1:1110,9\n1077#1:1105\n1077#1:1109\n*E\n"})
    public final class MutableSetWrapper extends ScatterSet<E>.SetWrapper implements Set<E>, InterfaceC4425h {
        public MutableSetWrapper() {
            super();
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean add(E e10) {
            return MutableScatterSet.this.C(e10);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean addAll(@NotNull Collection<? extends E> elements) {
            kotlin.jvm.internal.G.p(elements, "elements");
            return MutableScatterSet.this.F(elements);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public void clear() {
            MutableScatterSet.this.K();
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<E> iterator() {
            return new MutableScatterSet$MutableSetWrapper$iterator$1(MutableScatterSet.this);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return MutableScatterSet.this.d0(obj);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean removeAll(@NotNull Collection<? extends Object> elements) {
            kotlin.jvm.internal.G.p(elements, "elements");
            int i10 = MutableScatterSet.this.f86879d;
            Iterator<? extends Object> it = elements.iterator();
            while (it.hasNext()) {
                MutableScatterSet.this.U((E) it.next());
            }
            return i10 != MutableScatterSet.this.f86879d;
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean retainAll(@NotNull Collection<? extends Object> elements) {
            kotlin.jvm.internal.G.p(elements, "elements");
            MutableScatterSet<E> mutableScatterSet = MutableScatterSet.this;
            long[] jArr = mutableScatterSet.f86876a;
            int length = jArr.length - 2;
            if (length < 0) {
                return false;
            }
            int i10 = 0;
            boolean z10 = false;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (!elements.contains(mutableScatterSet.f86877b[i13])) {
                                mutableScatterSet.j0(i13);
                                z10 = true;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        return z10;
                    }
                }
                if (i10 == length) {
                    return z10;
                }
                i10++;
            }
        }
    }

    public MutableScatterSet() {
        this(0, 1, null);
    }

    public final boolean C(E e10) {
        int i10 = this.f86879d;
        this.f86877b[M(e10)] = e10;
        return this.f86879d != i10;
    }

    public final boolean D(@NotNull ObjectList<E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86879d;
        X(elements);
        return i10 != this.f86879d;
    }

    public final boolean E(@NotNull ScatterSet<E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86879d;
        Y(elements);
        return i10 != this.f86879d;
    }

    public final boolean F(@NotNull Iterable<? extends E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86879d;
        Z(elements);
        return i10 != this.f86879d;
    }

    public final boolean G(@NotNull InterfaceC5000m<? extends E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86879d;
        b0(elements);
        return i10 != this.f86879d;
    }

    public final boolean H(@NotNull E[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86879d;
        c0(elements);
        return i10 != this.f86879d;
    }

    public final void I() {
        int i10 = this.f86878c;
        if (i10 <= 8 || Long.compare((((long) this.f86879d) * 32) ^ Long.MIN_VALUE, (((long) i10) * 25) ^ Long.MIN_VALUE) > 0) {
            l0(S0.y(this.f86878c));
        } else {
            L();
        }
    }

    @NotNull
    public final Set<E> J() {
        return new MutableSetWrapper();
    }

    public final void K() {
        this.f86879d = 0;
        long[] jArr = this.f86876a;
        if (jArr != S0.f86829e) {
            C4875q.U1(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f86876a;
            int i10 = this.f86878c;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        C4875q.M1(this.f86877b, null, 0, this.f86878c);
        O();
    }

    public final void L() {
        long[] jArr = this.f86876a;
        int i10 = this.f86878c;
        Object[] objArr = this.f86877b;
        S0.a(jArr, i10);
        int iC = -1;
        int i11 = 0;
        while (i11 != i10) {
            int i12 = i11 >> 3;
            int i13 = (i11 & 7) << 3;
            long j10 = (jArr[i12] >> i13) & 255;
            if (j10 == 128) {
                iC = i11;
                i11++;
            } else {
                if (j10 == 254) {
                    Object obj = objArr[i11];
                    int iHashCode = (obj != null ? obj.hashCode() : 0) * S0.f86834j;
                    int i14 = iHashCode ^ (iHashCode << 16);
                    int i15 = i14 >>> 7;
                    int iN = N(i15);
                    int i16 = i15 & i10;
                    if (((iN - i16) & i10) / 8 == ((i11 - i16) & i10) / 8) {
                        jArr[i12] = (((long) (i14 & 127)) << i13) | ((~(255 << i13)) & jArr[i12]);
                        jArr[jArr.length - 1] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i17 = iN >> 3;
                        long j11 = jArr[i17];
                        int i18 = (iN & 7) << 3;
                        if (((j11 >> i18) & 255) == 128) {
                            jArr[i17] = (((long) (i14 & 127)) << i18) | (j11 & (~(255 << i18)));
                            jArr[i12] = (jArr[i12] & (~(255 << i13))) | (128 << i13);
                            objArr[iN] = objArr[i11];
                            objArr[i11] = null;
                            iC = i11;
                        } else {
                            jArr[i17] = (((long) (i14 & 127)) << i18) | (j11 & (~(255 << i18)));
                            if (iC == -1) {
                                iC = S0.c(jArr, i11 + 1, i10);
                            }
                            objArr[iC] = objArr[iN];
                            objArr[iN] = objArr[i11];
                            objArr[i11] = objArr[iC];
                            i11--;
                        }
                        jArr[jArr.length - 1] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    }
                }
                i11++;
            }
        }
        O();
    }

    public final int M(E e10) {
        int iHashCode = (e10 != null ? e10.hashCode() : 0) * S0.f86834j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f86878c;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f86876a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * S0.f86835k);
            for (long j13 = (~j12) & (j12 - S0.f86835k) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (kotlin.jvm.internal.G.g(this.f86877b[iNumberOfTrailingZeros], e10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iN = N(i11);
                if (this.f86785e == 0 && ((this.f86876a[iN >> 3] >> ((iN & 7) << 3)) & 255) != 254) {
                    I();
                    iN = N(i11);
                }
                this.f86879d++;
                int i19 = this.f86785e;
                long[] jArr2 = this.f86876a;
                int i20 = iN >> 3;
                long j14 = jArr2[i20];
                int i21 = (iN & 7) << 3;
                this.f86785e = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f86878c;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iN - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iN;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final int N(int i10) {
        int i11 = this.f86878c;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f86876a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j10 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final void O() {
        this.f86785e = S0.q(this.f86878c) - this.f86879d;
    }

    public final void P(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = S0.f86829e;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            C4875q.U1(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f86876a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        O();
    }

    public final void Q(int i10) {
        int iMax = i10 > 0 ? Math.max(7, S0.z(i10)) : 0;
        this.f86878c = iMax;
        P(iMax);
        this.f86877b = new Object[iMax];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(@NotNull ObjectList<E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        Object[] objArr = elements.f86809a;
        int i10 = elements.f86810b;
        for (int i11 = 0; i11 < i10; i11++) {
            U(objArr[i11]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(@NotNull ScatterSet<E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        Object[] objArr = elements.f86877b;
        long[] jArr = elements.f86876a;
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
                        U(objArr[(i10 << 3) + i12]);
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

    public final void T(@NotNull Iterable<? extends E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            U(it.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U(E r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f86878c
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f86876a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f86877b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.G.g(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.j0(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.U(java.lang.Object):void");
    }

    public final void V(@NotNull InterfaceC5000m<? extends E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            U(it.next());
        }
    }

    public final void W(@NotNull E[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        for (E e10 : elements) {
            U(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X(@NotNull ObjectList<E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        Object[] objArr = elements.f86809a;
        int i10 = elements.f86810b;
        for (int i11 = 0; i11 < i10; i11++) {
            a0(objArr[i11]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y(@NotNull ScatterSet<E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        Object[] objArr = elements.f86877b;
        long[] jArr = elements.f86876a;
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
                        a0(objArr[(i10 << 3) + i12]);
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

    public final void Z(@NotNull Iterable<? extends E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            a0(it.next());
        }
    }

    public final void a0(E e10) {
        this.f86877b[M(e10)] = e10;
    }

    public final void b0(@NotNull InterfaceC5000m<? extends E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            a0(it.next());
        }
    }

    public final void c0(@NotNull E[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        for (E e10 : elements) {
            a0(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d0(E r18) {
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
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.j0(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.d0(java.lang.Object):boolean");
    }

    public final boolean e0(@NotNull ObjectList<E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86879d;
        R(elements);
        return i10 != this.f86879d;
    }

    public final boolean f0(@NotNull ScatterSet<E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86879d;
        S(elements);
        return i10 != this.f86879d;
    }

    public final boolean g0(@NotNull Iterable<? extends E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86879d;
        T(elements);
        return i10 != this.f86879d;
    }

    public final boolean h0(@NotNull InterfaceC5000m<? extends E> elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86879d;
        V(elements);
        return i10 != this.f86879d;
    }

    public final boolean i0(@NotNull E[] elements) {
        kotlin.jvm.internal.G.p(elements, "elements");
        int i10 = this.f86879d;
        W(elements);
        return i10 != this.f86879d;
    }

    @InterfaceC4850b0
    public final void j0(int i10) {
        this.f86879d--;
        long[] jArr = this.f86876a;
        int i11 = this.f86878c;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f86877b[i10] = null;
    }

    public final void k0(@NotNull ed.l<? super E, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
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
                        int i13 = (i10 << 3) + i12;
                        if (predicate.invoke(objArr[i13]).booleanValue()) {
                            j0(i13);
                        }
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

    public final void l0(int i10) {
        long[] jArr = this.f86876a;
        Object[] objArr = this.f86877b;
        int i11 = this.f86878c;
        Q(i10);
        long[] jArr2 = this.f86876a;
        Object[] objArr2 = this.f86877b;
        int i12 = this.f86878c;
        for (int i13 = 0; i13 < i11; i13++) {
            if (((jArr[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i13];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * S0.f86834j;
                int i14 = iHashCode ^ (iHashCode << 16);
                int iN = N(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iN >> 3;
                int i16 = (iN & 7) << 3;
                long j11 = (jArr2[i15] & (~(255 << i16))) | (j10 << i16);
                jArr2[i15] = j11;
                jArr2[(((iN - 7) & i12) + (i12 & 7)) >> 3] = j11;
                objArr2[iN] = obj;
            }
        }
    }

    @e.D(from = 0)
    public final int m0() {
        int i10 = this.f86878c;
        int iZ = S0.z(S0.B(this.f86879d));
        if (iZ >= i10) {
            return 0;
        }
        l0(iZ);
        return i10 - this.f86878c;
    }

    public MutableScatterSet(int i10) {
        if (i10 >= 0) {
            Q(S0.B(i10));
        } else {
            A.f.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ MutableScatterSet(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
