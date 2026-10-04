package androidx.collection;

import ed.InterfaceC4376a;
import java.util.Iterator;
import kotlin.InterfaceC4850b0;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import kotlin.sequences.InterfaceC5000m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nObjectLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/MutableObjectLongMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ObjectLongMap.kt\nandroidx/collection/ObjectLongMap\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,1158:1\n46#2,5:1159\n1804#3,6:1164\n1956#3:1180\n1820#3:1184\n1956#3:1202\n1820#3:1206\n1956#3:1227\n1820#3:1231\n1780#3:1242\n1804#3,6:1243\n1792#3:1249\n1791#3,4:1250\n1804#3,6:1254\n1714#3,3:1260\n1724#3:1263\n1728#3:1264\n1925#3,3:1265\n1939#3,3:1268\n1865#3:1271\n1853#3:1272\n1847#3:1273\n1860#3:1274\n1948#3:1275\n1814#3:1276\n1770#3:1277\n1812#3:1278\n1770#3:1279\n1780#3:1280\n1804#3,6:1281\n1792#3:1287\n1791#3,4:1288\n1925#3,3:1292\n1956#3:1295\n1847#3:1296\n1770#3:1297\n1714#3,3:1298\n1724#3:1301\n1728#3:1302\n1804#3,6:1303\n1770#3:1309\n1728#3:1310\n1804#3,6:1311\n1804#3,6:1317\n1728#3:1323\n1804#3,6:1324\n1817#3:1330\n1770#3:1331\n1714#3,3:1332\n1724#3:1335\n1728#3:1336\n1780#3:1337\n1804#3,6:1338\n1792#3:1344\n1791#3,4:1345\n1804#3,6:1349\n1804#3,6:1355\n402#4,4:1170\n374#4,6:1174\n384#4,3:1181\n387#4,2:1185\n407#4,2:1187\n390#4,6:1189\n409#4:1195\n374#4,6:1196\n384#4,3:1203\n387#4,9:1207\n228#5,4:1216\n198#5,7:1220\n209#5,3:1228\n212#5,9:1232\n232#5:1241\n*S KotlinDebug\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/MutableObjectLongMap\n*L\n701#1:1159,5\n729#1:1164,6\n805#1:1180\n805#1:1184\n844#1:1202\n844#1:1206\n890#1:1227\n890#1:1231\n901#1:1242\n901#1:1243,6\n901#1:1249\n901#1:1250,4\n912#1:1254,6\n926#1:1260,3\n927#1:1263\n928#1:1264\n935#1:1265,3\n936#1:1268,3\n937#1:1271\n938#1:1272\n938#1:1273\n942#1:1274\n945#1:1275\n954#1:1276\n954#1:1277\n960#1:1278\n960#1:1279\n961#1:1280\n961#1:1281,6\n961#1:1287\n961#1:1288,4\n976#1:1292,3\n977#1:1295\n979#1:1296\n1032#1:1297\n1047#1:1298,3\n1048#1:1301\n1059#1:1302\n1060#1:1303,6\n1070#1:1309\n1073#1:1310\n1074#1:1311,6\n1075#1:1317,6\n1087#1:1323\n1088#1:1324,6\n1130#1:1330\n1130#1:1331\n1132#1:1332,3\n1133#1:1335\n1135#1:1336\n1135#1:1337\n1135#1:1338,6\n1135#1:1344\n1135#1:1345,4\n1149#1:1349,6\n1155#1:1355,6\n805#1:1170,4\n805#1:1174,6\n805#1:1181,3\n805#1:1185,2\n805#1:1187,2\n805#1:1189,6\n805#1:1195\n844#1:1196,6\n844#1:1203,3\n844#1:1207,9\n890#1:1216,4\n890#1:1220,7\n890#1:1228,3\n890#1:1232,9\n890#1:1241\n*E\n"})
public final class H0<K> extends P0<K> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86707f;

    public H0() {
        this(0, 1, null);
    }

    public final void O() {
        int i10 = this.f86817d;
        if (i10 <= 8 || Long.compare((((long) this.f86818e) * 32) ^ Long.MIN_VALUE, (((long) i10) * 25) ^ Long.MIN_VALUE) > 0) {
            k0(S0.y(this.f86817d));
        } else {
            Q();
        }
    }

    public final void P() {
        this.f86818e = 0;
        long[] jArr = this.f86814a;
        if (jArr != S0.f86829e) {
            C4875q.U1(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f86814a;
            int i10 = this.f86817d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        C4875q.M1(this.f86815b, null, 0, this.f86817d);
        U();
    }

    public final void Q() {
        long[] jArr = this.f86814a;
        int i10 = this.f86817d;
        Object[] objArr = this.f86815b;
        long[] jArr2 = this.f86816c;
        S0.a(jArr, i10);
        int i11 = 0;
        int iC = -1;
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
                    int iR = R(i15);
                    int i16 = i15 & i10;
                    if (((iR - i16) & i10) / 8 == ((i11 - i16) & i10) / 8) {
                        jArr[i12] = (((long) (i14 & 127)) << i13) | ((~(255 << i13)) & jArr[i12]);
                        jArr[jArr.length - 1] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i17 = iR >> 3;
                        long j11 = jArr[i17];
                        int i18 = (iR & 7) << 3;
                        if (((j11 >> i18) & 255) == 128) {
                            jArr[i17] = (j11 & (~(255 << i18))) | (((long) (i14 & 127)) << i18);
                            jArr[i12] = (jArr[i12] & (~(255 << i13))) | (128 << i13);
                            objArr[iR] = objArr[i11];
                            objArr[i11] = null;
                            jArr2[iR] = jArr2[i11];
                            jArr2[i11] = 0;
                            iC = i11;
                        } else {
                            jArr[i17] = (((long) (i14 & 127)) << i18) | (j11 & (~(255 << i18)));
                            if (iC == -1) {
                                iC = S0.c(jArr, i11 + 1, i10);
                            }
                            objArr[iC] = objArr[iR];
                            objArr[iR] = objArr[i11];
                            objArr[i11] = objArr[iC];
                            jArr2[iC] = jArr2[iR];
                            jArr2[iR] = jArr2[i11];
                            jArr2[i11] = jArr2[iC];
                            i11--;
                        }
                        jArr[jArr.length - 1] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    }
                }
                i11++;
            }
        }
        U();
    }

    public final int R(int i10) {
        int i11 = this.f86817d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f86814a;
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

    public final int S(K k10) {
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * S0.f86834j;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f86817d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f86814a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * S0.f86835k);
            for (long j13 = (~j12) & (j12 - S0.f86835k) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (kotlin.jvm.internal.G.g(this.f86815b[iNumberOfTrailingZeros], k10)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iR = R(i11);
                if (this.f86707f == 0 && ((this.f86814a[iR >> 3] >> ((iR & 7) << 3)) & 255) != 254) {
                    O();
                    iR = R(i11);
                }
                this.f86818e++;
                int i19 = this.f86707f;
                long[] jArr2 = this.f86814a;
                int i20 = iR >> 3;
                long j14 = jArr2[i20];
                int i21 = (iR & 7) << 3;
                this.f86707f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f86817d;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iR - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iR;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    public final long T(K k10, @NotNull InterfaceC4376a<Long> defaultValue) {
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        int i10 = i(k10);
        if (i10 >= 0) {
            return this.f86816c[i10];
        }
        long jLongValue = defaultValue.invoke().longValue();
        l0(k10, jLongValue);
        return jLongValue;
    }

    public final void U() {
        this.f86707f = S0.q(this.f86817d) - this.f86818e;
    }

    public final void V(int i10) {
        long[] jArr;
        if (i10 == 0) {
            jArr = S0.f86829e;
        } else {
            long[] jArr2 = new long[((i10 + 15) & (-8)) >> 3];
            C4875q.U1(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f86814a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        U();
    }

    public final void W(int i10) {
        int iMax = i10 > 0 ? Math.max(7, S0.z(i10)) : 0;
        this.f86817d = iMax;
        V(iMax);
        this.f86815b = new Object[iMax];
        this.f86816c = new long[iMax];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X(@NotNull ScatterSet<K> keys) {
        kotlin.jvm.internal.G.p(keys, "keys");
        Object[] objArr = keys.f86877b;
        long[] jArr = keys.f86876a;
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
                        g0(objArr[(i10 << 3) + i12]);
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

    public final void Y(@NotNull Iterable<? extends K> keys) {
        kotlin.jvm.internal.G.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            g0(it.next());
        }
    }

    public final void Z(K k10) {
        g0(k10);
    }

    public final void a0(@NotNull InterfaceC5000m<? extends K> keys) {
        kotlin.jvm.internal.G.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            g0(it.next());
        }
    }

    public final void b0(@NotNull K[] keys) {
        kotlin.jvm.internal.G.p(keys, "keys");
        for (K k10 : keys) {
            g0(k10);
        }
    }

    public final void c0(@NotNull P0<K> from) {
        kotlin.jvm.internal.G.p(from, "from");
        f0(from);
    }

    public final long d0(K k10, long j10, long j11) {
        int iS = S(k10);
        if (iS < 0) {
            iS = ~iS;
        } else {
            j11 = this.f86816c[iS];
        }
        this.f86815b[iS] = k10;
        this.f86816c[iS] = j10;
        return j11;
    }

    public final void e0(K k10, long j10) {
        l0(k10, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f0(@NotNull P0<K> from) {
        kotlin.jvm.internal.G.p(from, "from");
        Object[] objArr = from.f86815b;
        long[] jArr = from.f86816c;
        long[] jArr2 = from.f86814a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr2[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        l0(objArr[i13], jArr[i13]);
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

    public final void g0(K k10) {
        int i10 = i(k10);
        if (i10 >= 0) {
            j0(i10);
        }
    }

    public final boolean h0(K k10, long j10) {
        int i10 = i(k10);
        if (i10 < 0 || this.f86816c[i10] != j10) {
            return false;
        }
        j0(i10);
        return true;
    }

    public final void i0(@NotNull ed.p<? super K, ? super Long, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        long[] jArr = this.f86814a;
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
                        if (predicate.invoke(this.f86815b[i13], Long.valueOf(this.f86816c[i13])).booleanValue()) {
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

    @InterfaceC4850b0
    public final void j0(int i10) {
        this.f86818e--;
        long[] jArr = this.f86814a;
        int i11 = this.f86817d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        this.f86815b[i10] = null;
    }

    public final void k0(int i10) {
        int i11;
        long[] jArr = this.f86814a;
        Object[] objArr = this.f86815b;
        long[] jArr2 = this.f86816c;
        int i12 = this.f86817d;
        W(i10);
        long[] jArr3 = this.f86814a;
        Object[] objArr2 = this.f86815b;
        long[] jArr4 = this.f86816c;
        int i13 = this.f86817d;
        int i14 = 0;
        while (i14 < i12) {
            if (((jArr[i14 >> 3] >> ((i14 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i14];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * S0.f86834j;
                int i15 = iHashCode ^ (iHashCode << 16);
                int iR = R(i15 >>> 7);
                i11 = i14;
                long j10 = i15 & 127;
                int i16 = iR >> 3;
                int i17 = (iR & 7) << 3;
                long j11 = (j10 << i17) | (jArr3[i16] & (~(255 << i17)));
                jArr3[i16] = j11;
                jArr3[(((iR - 7) & i13) + (i13 & 7)) >> 3] = j11;
                objArr2[iR] = obj;
                jArr4[iR] = jArr2[i11];
            } else {
                i11 = i14;
            }
            i14 = i11 + 1;
        }
    }

    public final void l0(K k10, long j10) {
        int iS = S(k10);
        if (iS < 0) {
            iS = ~iS;
        }
        this.f86815b[iS] = k10;
        this.f86816c[iS] = j10;
    }

    public final int m0() {
        int i10 = this.f86817d;
        int iZ = S0.z(S0.B(this.f86818e));
        if (iZ >= i10) {
            return 0;
        }
        k0(iZ);
        return i10 - this.f86817d;
    }

    public final void n0(int i10, long j10) {
        long[] jArr = this.f86814a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (j10 << i12);
        int i13 = this.f86817d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (j10 << i16) | (jArr[i15] & (~(255 << i16)));
    }

    public H0(int i10) {
        if (i10 >= 0) {
            W(S0.B(i10));
        } else {
            A.f.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ H0(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
