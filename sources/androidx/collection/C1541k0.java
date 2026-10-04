package androidx.collection;

import ed.InterfaceC4376a;
import kotlin.InterfaceC4850b0;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.collection.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFloatFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/MutableFloatFloatMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 FloatFloatMap.kt\nandroidx/collection/FloatFloatMap\n+ 5 FloatSet.kt\nandroidx/collection/FloatSet\n+ 6 FloatList.kt\nandroidx/collection/FloatList\n+ 7 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1131:1\n46#2,5:1132\n1804#3,6:1137\n1956#3:1153\n1820#3:1157\n1956#3:1175\n1820#3:1179\n1956#3:1200\n1820#3:1204\n1780#3:1222\n1804#3,6:1223\n1792#3:1229\n1791#3,4:1230\n1804#3,6:1234\n1724#3:1243\n1728#3:1244\n1925#3,3:1245\n1939#3,3:1248\n1865#3:1251\n1853#3:1252\n1847#3:1253\n1860#3:1254\n1948#3:1255\n1814#3:1256\n1770#3:1257\n1812#3:1258\n1770#3:1259\n1780#3:1260\n1804#3,6:1261\n1792#3:1267\n1791#3,4:1268\n1925#3,3:1272\n1956#3:1275\n1847#3:1276\n1770#3:1277\n1724#3:1281\n1728#3:1282\n1804#3,6:1283\n1770#3:1289\n1728#3:1290\n1804#3,6:1291\n1804#3,6:1297\n1728#3:1303\n1804#3,6:1304\n1817#3:1310\n1770#3:1311\n1724#3:1315\n1728#3:1316\n1780#3:1317\n1804#3,6:1318\n1792#3:1324\n1791#3,4:1325\n1804#3,6:1329\n1804#3,6:1335\n386#4,4:1143\n358#4,6:1147\n368#4,3:1154\n371#4,2:1158\n390#4,2:1160\n374#4,6:1162\n392#4:1168\n358#4,6:1169\n368#4,3:1176\n371#4,9:1180\n262#5,4:1189\n232#5,7:1193\n243#5,3:1201\n246#5,2:1205\n266#5,2:1207\n249#5,6:1209\n268#5:1215\n250#6,6:1216\n921#7,3:1240\n921#7,3:1278\n921#7,3:1312\n*S KotlinDebug\n*F\n+ 1 FloatFloatMap.kt\nandroidx/collection/MutableFloatFloatMap\n*L\n684#1:1132,5\n712#1:1137,6\n790#1:1153\n790#1:1157\n829#1:1175\n829#1:1179\n856#1:1200\n856#1:1204\n876#1:1222\n876#1:1223,6\n876#1:1229\n876#1:1230,4\n886#1:1234,6\n900#1:1243\n901#1:1244\n908#1:1245,3\n909#1:1248,3\n910#1:1251\n911#1:1252\n911#1:1253\n915#1:1254\n918#1:1255\n927#1:1256\n927#1:1257\n933#1:1258\n933#1:1259\n934#1:1260\n934#1:1261,6\n934#1:1267\n934#1:1268,4\n949#1:1272,3\n950#1:1275\n952#1:1276\n1005#1:1277\n1021#1:1281\n1032#1:1282\n1033#1:1283,6\n1043#1:1289\n1046#1:1290\n1047#1:1291,6\n1048#1:1297,6\n1060#1:1303\n1061#1:1304,6\n1103#1:1310\n1103#1:1311\n1106#1:1315\n1108#1:1316\n1108#1:1317\n1108#1:1318,6\n1108#1:1324\n1108#1:1325,4\n1122#1:1329,6\n1128#1:1335,6\n790#1:1143,4\n790#1:1147,6\n790#1:1154,3\n790#1:1158,2\n790#1:1160,2\n790#1:1162,6\n790#1:1168\n829#1:1169,6\n829#1:1176,3\n829#1:1180,9\n856#1:1189,4\n856#1:1193,7\n856#1:1201,3\n856#1:1205,2\n856#1:1207,2\n856#1:1209,6\n856#1:1215\n865#1:1216,6\n899#1:1240,3\n1020#1:1278,3\n1105#1:1312,3\n*E\n"})
public final class C1541k0 extends AbstractC1546n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86976f;

    public C1541k0() {
        this(0, 1, null);
    }

    public final void O() {
        int i10 = this.f86981d;
        if (i10 <= 8 || Long.compare((((long) this.f86982e) * 32) ^ Long.MIN_VALUE, (((long) i10) * 25) ^ Long.MIN_VALUE) > 0) {
            j0(S0.y(this.f86981d));
        } else {
            Q();
        }
    }

    public final void P() {
        this.f86982e = 0;
        long[] jArr = this.f86978a;
        if (jArr != S0.f86829e) {
            C4875q.U1(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f86978a;
            int i10 = this.f86981d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        U();
    }

    public final void Q() {
        long[] jArr = this.f86978a;
        int i10 = this.f86981d;
        float[] fArr = this.f86979b;
        float[] fArr2 = this.f86980c;
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
                    int iFloatToIntBits = Float.floatToIntBits(fArr[i11]) * S0.f86834j;
                    int i14 = iFloatToIntBits ^ (iFloatToIntBits << 16);
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
                            fArr[iR] = fArr[i11];
                            fArr[i11] = 0.0f;
                            fArr2[iR] = fArr2[i11];
                            fArr2[i11] = 0.0f;
                            iC = i11;
                        } else {
                            jArr[i17] = (((long) (i14 & 127)) << i18) | (j11 & (~(255 << i18)));
                            if (iC == -1) {
                                iC = S0.c(jArr, i11 + 1, i10);
                            }
                            fArr[iC] = fArr[iR];
                            fArr[iR] = fArr[i11];
                            fArr[i11] = fArr[iC];
                            fArr2[iC] = fArr2[iR];
                            fArr2[iR] = fArr2[i11];
                            fArr2[i11] = fArr2[iC];
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
        int i11 = this.f86981d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f86978a;
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

    public final int S(float f10) {
        int iFloatToIntBits = Float.floatToIntBits(f10) * S0.f86834j;
        int i10 = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f86981d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f86978a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i15;
            long j12 = j10 ^ (j11 * S0.f86835k);
            for (long j13 = (~j12) & (j12 - S0.f86835k) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.f86979b[iNumberOfTrailingZeros] == f10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iR = R(i11);
                if (this.f86976f == 0 && ((this.f86978a[iR >> 3] >> ((iR & 7) << 3)) & 255) != 254) {
                    O();
                    iR = R(i11);
                }
                this.f86982e++;
                int i19 = this.f86976f;
                long[] jArr2 = this.f86978a;
                int i20 = iR >> 3;
                long j14 = jArr2[i20];
                int i21 = (iR & 7) << 3;
                this.f86976f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f86981d;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iR - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iR;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final float T(float f10, @NotNull InterfaceC4376a<Float> defaultValue) {
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        int i10 = i(f10);
        if (i10 >= 0) {
            return this.f86980c[i10];
        }
        float fFloatValue = defaultValue.invoke().floatValue();
        k0(f10, fFloatValue);
        return fFloatValue;
    }

    public final void U() {
        this.f86976f = S0.q(this.f86981d) - this.f86982e;
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
        this.f86978a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        U();
    }

    public final void W(int i10) {
        int iMax = i10 > 0 ? Math.max(7, S0.z(i10)) : 0;
        this.f86981d = iMax;
        V(iMax);
        this.f86979b = new float[iMax];
        this.f86980c = new float[iMax];
    }

    public final void X(float f10) {
        f0(f10);
    }

    public final void Y(@NotNull AbstractC1559u keys) {
        kotlin.jvm.internal.G.p(keys, "keys");
        float[] fArr = keys.f86996a;
        int i10 = keys.f86997b;
        for (int i11 = 0; i11 < i10; i11++) {
            f0(fArr[i11]);
        }
    }

    public final void Z(@NotNull A keys) {
        kotlin.jvm.internal.G.p(keys, "keys");
        float[] fArr = keys.f86671b;
        long[] jArr = keys.f86670a;
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
                        f0(fArr[(i10 << 3) + i12]);
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

    public final void a0(@NotNull float[] keys) {
        kotlin.jvm.internal.G.p(keys, "keys");
        for (float f10 : keys) {
            f0(f10);
        }
    }

    public final void b0(@NotNull AbstractC1546n from) {
        kotlin.jvm.internal.G.p(from, "from");
        e0(from);
    }

    public final float c0(float f10, float f11, float f12) {
        int iS = S(f10);
        if (iS < 0) {
            iS = ~iS;
        } else {
            f12 = this.f86980c[iS];
        }
        this.f86979b[iS] = f10;
        this.f86980c[iS] = f11;
        return f12;
    }

    public final void d0(float f10, float f11) {
        k0(f10, f11);
    }

    public final void e0(@NotNull AbstractC1546n from) {
        kotlin.jvm.internal.G.p(from, "from");
        float[] fArr = from.f86979b;
        float[] fArr2 = from.f86980c;
        long[] jArr = from.f86978a;
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
                        k0(fArr[i13], fArr2[i13]);
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

    public final void f0(float f10) {
        int i10 = i(f10);
        if (i10 >= 0) {
            i0(i10);
        }
    }

    public final boolean g0(float f10, float f11) {
        int i10 = i(f10);
        if (i10 < 0 || this.f86980c[i10] != f11) {
            return false;
        }
        i0(i10);
        return true;
    }

    public final void h0(@NotNull ed.p<? super Float, ? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        long[] jArr = this.f86978a;
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
                        if (predicate.invoke(Float.valueOf(this.f86979b[i13]), Float.valueOf(this.f86980c[i13])).booleanValue()) {
                            i0(i13);
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
    public final void i0(int i10) {
        this.f86982e--;
        long[] jArr = this.f86978a;
        int i11 = this.f86981d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
    }

    public final void j0(int i10) {
        long[] jArr;
        C1541k0 c1541k0 = this;
        long[] jArr2 = c1541k0.f86978a;
        float[] fArr = c1541k0.f86979b;
        float[] fArr2 = c1541k0.f86980c;
        int i11 = c1541k0.f86981d;
        W(i10);
        long[] jArr3 = c1541k0.f86978a;
        float[] fArr3 = c1541k0.f86979b;
        float[] fArr4 = c1541k0.f86980c;
        int i12 = c1541k0.f86981d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                float f10 = fArr[i13];
                int iFloatToIntBits = Float.floatToIntBits(f10) * S0.f86834j;
                int i14 = iFloatToIntBits ^ (iFloatToIntBits << 16);
                int iR = c1541k0.R(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iR >> 3;
                int i16 = (iR & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i15] & (~(255 << i16))) | (j10 << i16);
                jArr3[i15] = j11;
                jArr3[(((iR - 7) & i12) + (i12 & 7)) >> 3] = j11;
                fArr3[iR] = f10;
                fArr4[iR] = fArr2[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            c1541k0 = this;
            jArr2 = jArr;
        }
    }

    public final void k0(float f10, float f11) {
        int iS = S(f10);
        if (iS < 0) {
            iS = ~iS;
        }
        this.f86979b[iS] = f10;
        this.f86980c[iS] = f11;
    }

    public final int l0() {
        int i10 = this.f86981d;
        int iZ = S0.z(S0.B(this.f86982e));
        if (iZ >= i10) {
            return 0;
        }
        j0(iZ);
        return i10 - this.f86981d;
    }

    public final void m0(int i10, long j10) {
        long[] jArr = this.f86978a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (j10 << i12);
        int i13 = this.f86981d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (j10 << i16) | (jArr[i15] & (~(255 << i16)));
    }

    public C1541k0(int i10) {
        if (i10 >= 0) {
            W(S0.B(i10));
        } else {
            A.f.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ C1541k0(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
