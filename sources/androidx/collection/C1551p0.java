package androidx.collection;

import ed.InterfaceC4376a;
import kotlin.InterfaceC4850b0;
import kotlin.collections.C4875q;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: androidx.collection.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFloatObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/MutableFloatObjectMap\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 FloatObjectMap.kt\nandroidx/collection/FloatObjectMap\n+ 6 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 7 FloatSet.kt\nandroidx/collection/FloatSet\n+ 8 FloatList.kt\nandroidx/collection/FloatList\n*L\n1#1,1118:1\n821#1,2:1276\n821#1,2:1290\n46#2,5:1119\n1804#3,6:1124\n1956#3:1141\n1820#3:1145\n1728#3:1162\n1724#3:1165\n1925#3,3:1170\n1939#3,3:1174\n1865#3:1178\n1853#3:1180\n1847#3:1181\n1860#3:1186\n1948#3:1188\n1728#3:1202\n1724#3:1205\n1925#3,3:1210\n1939#3,3:1214\n1865#3:1218\n1853#3:1220\n1847#3:1221\n1860#3:1226\n1948#3:1228\n1956#3:1243\n1820#3:1247\n1956#3:1268\n1820#3:1272\n1780#3:1293\n1804#3,6:1294\n1792#3:1300\n1791#3,4:1301\n1804#3,6:1305\n1724#3:1314\n1728#3:1315\n1925#3,3:1316\n1939#3,3:1319\n1865#3:1322\n1853#3:1323\n1847#3:1324\n1860#3:1325\n1948#3:1326\n1814#3:1327\n1770#3:1328\n1812#3:1329\n1770#3:1330\n1780#3:1331\n1804#3,6:1332\n1792#3:1338\n1791#3,4:1339\n1925#3,3:1343\n1956#3:1346\n1847#3:1347\n1770#3:1348\n1724#3:1352\n1728#3:1353\n1804#3,6:1354\n1770#3:1360\n1728#3:1361\n1804#3,6:1362\n1804#3,6:1368\n1728#3:1374\n1804#3,6:1375\n1817#3:1381\n1770#3:1382\n1724#3:1386\n1728#3:1387\n1780#3:1388\n1804#3,6:1389\n1792#3:1395\n1791#3,4:1396\n1804#3,6:1400\n1804#3,6:1406\n1#4:1130\n383#5,4:1131\n355#5,6:1135\n365#5,3:1142\n368#5,2:1146\n388#5,2:1148\n371#5,6:1150\n390#5:1156\n620#5:1157\n621#5:1161\n623#5,2:1163\n625#5,4:1166\n629#5:1173\n630#5:1177\n631#5:1179\n632#5,4:1182\n638#5:1187\n639#5,8:1189\n620#5:1197\n621#5:1201\n623#5,2:1203\n625#5,4:1206\n629#5:1213\n630#5:1217\n631#5:1219\n632#5,4:1222\n638#5:1227\n639#5,8:1229\n355#5,6:1237\n365#5,3:1244\n368#5,9:1248\n921#6,3:1158\n921#6,3:1198\n921#6,3:1311\n921#6,3:1349\n921#6,3:1383\n262#7,4:1257\n232#7,7:1261\n243#7,3:1269\n246#7,2:1273\n266#7:1275\n267#7:1278\n249#7,6:1279\n268#7:1285\n250#8,4:1286\n255#8:1292\n*S KotlinDebug\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/MutableFloatObjectMap\n*L\n838#1:1276,2\n847#1:1290,2\n686#1:1119,5\n714#1:1124,6\n767#1:1141\n767#1:1145\n783#1:1162\n783#1:1165\n783#1:1170,3\n783#1:1174,3\n783#1:1178\n783#1:1180\n783#1:1181\n783#1:1186\n783#1:1188\n795#1:1202\n795#1:1205\n795#1:1210,3\n795#1:1214,3\n795#1:1218\n795#1:1220\n795#1:1221\n795#1:1226\n795#1:1228\n809#1:1243\n809#1:1247\n837#1:1268\n837#1:1272\n857#1:1293\n857#1:1294,6\n857#1:1300\n857#1:1301,4\n872#1:1305,6\n887#1:1314\n888#1:1315\n895#1:1316,3\n896#1:1319,3\n897#1:1322\n898#1:1323\n898#1:1324\n902#1:1325\n905#1:1326\n914#1:1327\n914#1:1328\n920#1:1329\n920#1:1330\n921#1:1331\n921#1:1332,6\n921#1:1338\n921#1:1339,4\n936#1:1343,3\n937#1:1346\n939#1:1347\n992#1:1348\n1008#1:1352\n1019#1:1353\n1020#1:1354,6\n1030#1:1360\n1033#1:1361\n1034#1:1362,6\n1035#1:1368,6\n1047#1:1374\n1048#1:1375,6\n1090#1:1381\n1090#1:1382\n1093#1:1386\n1095#1:1387\n1095#1:1388\n1095#1:1389,6\n1095#1:1395\n1095#1:1396,4\n1109#1:1400,6\n1115#1:1406,6\n767#1:1131,4\n767#1:1135,6\n767#1:1142,3\n767#1:1146,2\n767#1:1148,2\n767#1:1150,6\n767#1:1156\n783#1:1157\n783#1:1161\n783#1:1163,2\n783#1:1166,4\n783#1:1173\n783#1:1177\n783#1:1179\n783#1:1182,4\n783#1:1187\n783#1:1189,8\n795#1:1197\n795#1:1201\n795#1:1203,2\n795#1:1206,4\n795#1:1213\n795#1:1217\n795#1:1219\n795#1:1222,4\n795#1:1227\n795#1:1229,8\n809#1:1237,6\n809#1:1244,3\n809#1:1248,9\n783#1:1158,3\n795#1:1198,3\n886#1:1311,3\n1007#1:1349,3\n1092#1:1383,3\n837#1:1257,4\n837#1:1261,7\n837#1:1269,3\n837#1:1273,2\n837#1:1275\n837#1:1278\n837#1:1279,6\n837#1:1285\n846#1:1286,4\n846#1:1292\n*E\n"})
public final class C1551p0<V> extends AbstractC1567y<V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86985f;

    public C1551p0() {
        this(0, 1, null);
    }

    public final void O() {
        int i10 = this.f87012d;
        if (i10 <= 8 || Long.compare((((long) this.f87013e) * 32) ^ Long.MIN_VALUE, (((long) i10) * 25) ^ Long.MIN_VALUE) > 0) {
            i0(S0.y(this.f87012d));
        } else {
            Q();
        }
    }

    public final void P() {
        this.f87013e = 0;
        long[] jArr = this.f87009a;
        if (jArr != S0.f86829e) {
            C4875q.U1(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f87009a;
            int i10 = this.f87012d;
            int i11 = i10 >> 3;
            long j10 = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j10)) | j10;
        }
        C4875q.M1(this.f87011c, null, 0, this.f87012d);
        U();
    }

    public final void Q() {
        long[] jArr = this.f87009a;
        int i10 = this.f87012d;
        float[] fArr = this.f87010b;
        Object[] objArr = this.f87011c;
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
                    int iS = S(i15);
                    int i16 = i15 & i10;
                    if (((iS - i16) & i10) / 8 == ((i11 - i16) & i10) / 8) {
                        jArr[i12] = (((long) (i14 & 127)) << i13) | ((~(255 << i13)) & jArr[i12]);
                        jArr[jArr.length - 1] = (jArr[0] & 72057594037927935L) | Long.MIN_VALUE;
                    } else {
                        int i17 = iS >> 3;
                        long j11 = jArr[i17];
                        int i18 = (iS & 7) << 3;
                        if (((j11 >> i18) & 255) == 128) {
                            jArr[i17] = (j11 & (~(255 << i18))) | (((long) (i14 & 127)) << i18);
                            jArr[i12] = (jArr[i12] & (~(255 << i13))) | (128 << i13);
                            fArr[iS] = fArr[i11];
                            fArr[i11] = 0.0f;
                            objArr[iS] = objArr[i11];
                            objArr[i11] = null;
                            iC = i11;
                        } else {
                            jArr[i17] = (((long) (i14 & 127)) << i18) | (j11 & (~(255 << i18)));
                            if (iC == -1) {
                                iC = S0.c(jArr, i11 + 1, i10);
                            }
                            fArr[iC] = fArr[iS];
                            fArr[iS] = fArr[i11];
                            fArr[i11] = fArr[iC];
                            objArr[iC] = objArr[iS];
                            objArr[iS] = objArr[i11];
                            objArr[i11] = objArr[iC];
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

    public final int R(float f10) {
        int iFloatToIntBits = Float.floatToIntBits(f10) * S0.f86834j;
        int i10 = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.f87012d;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.f87009a;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i15;
            long j12 = j10 ^ (j11 * S0.f86835k);
            for (long j13 = (~j12) & (j12 - S0.f86835k) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i14) & i13;
                if (this.f87010b[iNumberOfTrailingZeros] == f10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iS = S(i11);
                if (this.f86985f == 0 && ((this.f87009a[iS >> 3] >> ((iS & 7) << 3)) & 255) != 254) {
                    O();
                    iS = S(i11);
                }
                this.f87013e++;
                int i19 = this.f86985f;
                long[] jArr2 = this.f87009a;
                int i20 = iS >> 3;
                long j14 = jArr2[i20];
                int i21 = (iS & 7) << 3;
                this.f86985f = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.f87012d;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iS - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return iS;
            }
            i15 = i18 + 8;
            i14 = (i14 + i15) & i13;
        }
    }

    public final int S(int i10) {
        int i11 = this.f87012d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f87009a;
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

    public final V T(float f10, @NotNull InterfaceC4376a<? extends V> defaultValue) {
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        V vN = n(f10);
        if (vN != null) {
            return vN;
        }
        V vInvoke = defaultValue.invoke();
        j0(f10, vInvoke);
        return vInvoke;
    }

    public final void U() {
        this.f86985f = S0.q(this.f87012d) - this.f87013e;
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
        this.f87009a = jArr;
        int i11 = i10 >> 3;
        long j10 = 255 << ((i10 & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j10)) | j10;
        U();
    }

    public final void W(int i10) {
        int iMax = i10 > 0 ? Math.max(7, S0.z(i10)) : 0;
        this.f87012d = iMax;
        V(iMax);
        this.f87010b = new float[iMax];
        this.f87011c = new Object[iMax];
    }

    public final void X(float f10) {
        e0(f10);
    }

    public final void Y(@NotNull AbstractC1559u keys) {
        kotlin.jvm.internal.G.p(keys, "keys");
        float[] fArr = keys.f86996a;
        int i10 = keys.f86997b;
        for (int i11 = 0; i11 < i10; i11++) {
            e0(fArr[i11]);
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
                        e0(fArr[(i10 << 3) + i12]);
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
            e0(f10);
        }
    }

    public final void b0(@NotNull AbstractC1567y<V> from) {
        kotlin.jvm.internal.G.p(from, "from");
        d0(from);
    }

    @Nullable
    public final V c0(float f10, V v10) {
        int iR = R(f10);
        Object[] objArr = this.f87011c;
        V v11 = (V) objArr[iR];
        this.f87010b[iR] = f10;
        objArr[iR] = v10;
        return v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0(@NotNull AbstractC1567y<V> from) {
        kotlin.jvm.internal.G.p(from, "from");
        float[] fArr = from.f87010b;
        Object[] objArr = from.f87011c;
        long[] jArr = from.f87009a;
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
                        j0(fArr[i13], objArr[i13]);
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V e0(float r14) {
        /*
            r13 = this;
            int r0 = java.lang.Float.floatToIntBits(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f87012d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f87009a
            int r5 = r0 >> 3
            r6 = r0 & 7
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
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            float[] r11 = r13.f87010b
            r11 = r11[r10]
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6f
            r10 = -1
        L66:
            if (r10 < 0) goto L6d
            java.lang.Object r14 = r13.h0(r10)
            return r14
        L6d:
            r14 = 0
            return r14
        L6f:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C1551p0.e0(float):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f0(float r17, V r18) {
        /*
            r16 = this;
            r0 = r16
            int r1 = java.lang.Float.floatToIntBits(r17)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0.f87012d
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.f87009a
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L5f
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            float[] r14 = r0.f87010b
            r14 = r14[r10]
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L59
            goto L69
        L59:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L5f:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L7c
            r10 = -1
        L69:
            if (r10 < 0) goto L7b
            java.lang.Object[] r1 = r0.f87011c
            r1 = r1[r10]
            r6 = r18
            boolean r1 = kotlin.jvm.internal.G.g(r1, r6)
            if (r1 == 0) goto L7b
            r0.h0(r10)
            return r11
        L7b:
            return r4
        L7c:
            r6 = r18
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C1551p0.f0(float, java.lang.Object):boolean");
    }

    public final void g0(@NotNull ed.p<? super Float, ? super V, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        long[] jArr = this.f87009a;
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
                        if (predicate.invoke(Float.valueOf(this.f87010b[i13]), this.f87011c[i13]).booleanValue()) {
                            h0(i13);
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
    @Nullable
    public final V h0(int i10) {
        this.f87013e--;
        long[] jArr = this.f87009a;
        int i11 = this.f87012d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j10 = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j10;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j10;
        Object[] objArr = this.f87011c;
        V v10 = (V) objArr[i10];
        objArr[i10] = null;
        return v10;
    }

    public final void i0(int i10) {
        long[] jArr;
        C1551p0<V> c1551p0 = this;
        long[] jArr2 = c1551p0.f87009a;
        float[] fArr = c1551p0.f87010b;
        Object[] objArr = c1551p0.f87011c;
        int i11 = c1551p0.f87012d;
        W(i10);
        long[] jArr3 = c1551p0.f87009a;
        float[] fArr2 = c1551p0.f87010b;
        Object[] objArr2 = c1551p0.f87011c;
        int i12 = c1551p0.f87012d;
        int i13 = 0;
        while (i13 < i11) {
            if (((jArr2[i13 >> 3] >> ((i13 & 7) << 3)) & 255) < 128) {
                float f10 = fArr[i13];
                int iFloatToIntBits = Float.floatToIntBits(f10) * S0.f86834j;
                int i14 = iFloatToIntBits ^ (iFloatToIntBits << 16);
                int iS = c1551p0.S(i14 >>> 7);
                long j10 = i14 & 127;
                int i15 = iS >> 3;
                int i16 = (iS & 7) << 3;
                jArr = jArr2;
                long j11 = (jArr3[i15] & (~(255 << i16))) | (j10 << i16);
                jArr3[i15] = j11;
                jArr3[(((iS - 7) & i12) + (i12 & 7)) >> 3] = j11;
                fArr2[iS] = f10;
                objArr2[iS] = objArr[i13];
            } else {
                jArr = jArr2;
            }
            i13++;
            c1551p0 = this;
            jArr2 = jArr;
        }
    }

    public final void j0(float f10, V v10) {
        int iR = R(f10);
        this.f87010b[iR] = f10;
        this.f87011c[iR] = v10;
    }

    public final int k0() {
        int i10 = this.f87012d;
        int iZ = S0.z(S0.B(this.f87013e));
        if (iZ >= i10) {
            return 0;
        }
        i0(iZ);
        return i10 - this.f87012d;
    }

    public final void l0(int i10, long j10) {
        long[] jArr = this.f87009a;
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        jArr[i11] = (jArr[i11] & (~(255 << i12))) | (j10 << i12);
        int i13 = this.f87012d;
        int i14 = ((i10 - 7) & i13) + (i13 & 7);
        int i15 = i14 >> 3;
        int i16 = (i14 & 7) << 3;
        jArr[i15] = (j10 << i16) | (jArr[i15] & (~(255 << i16)));
    }

    public C1551p0(int i10) {
        if (i10 >= 0) {
            W(S0.B(i10));
        } else {
            A.f.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public /* synthetic */ C1551p0(int i10, int i11, C4969v c4969v) {
        this((i11 & 1) != 0 ? 6 : i10);
    }
}
