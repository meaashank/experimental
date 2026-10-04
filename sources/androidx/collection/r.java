package androidx.collection;

import ed.InterfaceC4376a;
import java.util.NoSuchElementException;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFloatIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/FloatIntMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 3 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1131:1\n358#1,6:1134\n368#1,3:1141\n371#1,9:1145\n358#1,6:1154\n368#1,3:1161\n371#1,9:1165\n358#1,6:1174\n368#1,3:1181\n371#1,9:1185\n386#1,4:1194\n358#1,6:1198\n368#1,3:1205\n371#1,2:1209\n390#1,2:1211\n374#1,6:1213\n392#1:1219\n386#1,4:1220\n358#1,6:1224\n368#1,3:1231\n371#1,2:1235\n390#1,2:1237\n374#1,6:1239\n392#1:1245\n386#1,4:1246\n358#1,6:1250\n368#1,3:1257\n371#1,2:1261\n390#1,2:1263\n374#1,6:1265\n392#1:1271\n411#1,3:1272\n358#1,6:1275\n368#1,3:1282\n371#1,2:1286\n414#1,2:1288\n374#1,6:1290\n416#1:1296\n386#1,4:1297\n358#1,6:1301\n368#1,3:1308\n371#1,2:1312\n390#1,2:1314\n374#1,6:1316\n392#1:1322\n386#1,4:1323\n358#1,6:1327\n368#1,3:1334\n371#1,2:1338\n390#1,2:1340\n374#1,6:1342\n392#1:1348\n386#1,4:1349\n358#1,6:1353\n368#1,3:1360\n371#1,2:1364\n390#1,2:1366\n374#1,6:1368\n392#1:1374\n386#1,4:1375\n358#1,6:1379\n368#1,3:1386\n371#1,2:1390\n390#1,2:1392\n374#1,6:1394\n392#1:1400\n386#1,4:1401\n358#1,6:1405\n368#1,3:1412\n371#1,2:1416\n390#1,2:1418\n374#1,6:1420\n392#1:1426\n386#1,4:1427\n358#1,6:1431\n368#1,3:1438\n371#1,2:1442\n390#1,2:1444\n374#1,6:1446\n392#1:1452\n520#1,11:1469\n386#1,4:1480\n358#1,6:1484\n368#1,3:1491\n371#1,2:1495\n390#1:1497\n531#1,10:1498\n391#1:1508\n374#1,6:1509\n392#1:1515\n541#1,2:1516\n520#1,11:1518\n386#1,4:1529\n358#1,6:1533\n368#1,3:1540\n371#1,2:1544\n390#1:1546\n531#1,10:1547\n391#1:1557\n374#1,6:1558\n392#1:1564\n541#1,2:1565\n520#1,11:1567\n386#1,4:1578\n358#1,6:1582\n368#1,3:1589\n371#1,2:1593\n390#1:1595\n531#1,10:1596\n391#1:1606\n374#1,6:1607\n392#1:1613\n541#1,2:1614\n520#1,11:1616\n386#1,4:1627\n358#1,6:1631\n368#1,3:1638\n371#1,2:1642\n390#1:1644\n531#1,10:1645\n391#1:1655\n374#1,6:1656\n392#1:1662\n541#1,2:1663\n520#1,11:1665\n386#1,4:1676\n358#1,6:1680\n368#1,3:1687\n371#1,2:1691\n390#1:1693\n531#1,10:1694\n391#1:1704\n374#1,6:1705\n392#1:1711\n541#1,2:1712\n1956#2:1132\n1820#2:1133\n1956#2:1140\n1820#2:1144\n1956#2:1160\n1820#2:1164\n1956#2:1180\n1820#2:1184\n1956#2:1204\n1820#2:1208\n1956#2:1230\n1820#2:1234\n1956#2:1256\n1820#2:1260\n1956#2:1281\n1820#2:1285\n1956#2:1307\n1820#2:1311\n1956#2:1333\n1820#2:1337\n1956#2:1359\n1820#2:1363\n1956#2:1385\n1820#2:1389\n1956#2:1411\n1820#2:1415\n1956#2:1437\n1820#2:1441\n1728#2:1456\n1724#2:1457\n1925#2,3:1458\n1939#2,3:1461\n1865#2:1464\n1853#2:1465\n1847#2:1466\n1860#2:1467\n1948#2:1468\n1956#2:1490\n1820#2:1494\n1956#2:1539\n1820#2:1543\n1956#2:1588\n1820#2:1592\n1956#2:1637\n1820#2:1641\n1956#2:1686\n1820#2:1690\n921#3,3:1453\n*S KotlinDebug\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/FloatIntMap\n*L\n389#1:1134,6\n389#1:1141,3\n389#1:1145,9\n401#1:1154,6\n401#1:1161,3\n401#1:1165,9\n413#1:1174,6\n413#1:1181,3\n413#1:1185,9\n422#1:1194,4\n422#1:1198,6\n422#1:1205,3\n422#1:1209,2\n422#1:1211,2\n422#1:1213,6\n422#1:1219\n432#1:1220,4\n432#1:1224,6\n432#1:1231,3\n432#1:1235,2\n432#1:1237,2\n432#1:1239,6\n432#1:1245\n448#1:1246,4\n448#1:1250,6\n448#1:1257,3\n448#1:1261,2\n448#1:1263,2\n448#1:1265,6\n448#1:1271\n471#1:1272,3\n471#1:1275,6\n471#1:1282,3\n471#1:1286,2\n471#1:1288,2\n471#1:1290,6\n471#1:1296\n495#1:1297,4\n495#1:1301,6\n495#1:1308,3\n495#1:1312,2\n495#1:1314,2\n495#1:1316,6\n495#1:1322\n530#1:1323,4\n530#1:1327,6\n530#1:1334,3\n530#1:1338,2\n530#1:1340,2\n530#1:1342,6\n530#1:1348\n530#1:1349,4\n530#1:1353,6\n530#1:1360,3\n530#1:1364,2\n530#1:1366,2\n530#1:1368,6\n530#1:1374\n551#1:1375,4\n551#1:1379,6\n551#1:1386,3\n551#1:1390,2\n551#1:1392,2\n551#1:1394,6\n551#1:1400\n577#1:1401,4\n577#1:1405,6\n577#1:1412,3\n577#1:1416,2\n577#1:1418,2\n577#1:1420,6\n577#1:1426\n599#1:1427,4\n599#1:1431,6\n599#1:1438,3\n599#1:1442,2\n599#1:1444,2\n599#1:1446,6\n599#1:1452\n-1#1:1469,11\n-1#1:1480,4\n-1#1:1484,6\n-1#1:1491,3\n-1#1:1495,2\n-1#1:1497\n-1#1:1498,10\n-1#1:1508\n-1#1:1509,6\n-1#1:1515\n-1#1:1516,2\n-1#1:1518,11\n-1#1:1529,4\n-1#1:1533,6\n-1#1:1540,3\n-1#1:1544,2\n-1#1:1546\n-1#1:1547,10\n-1#1:1557\n-1#1:1558,6\n-1#1:1564\n-1#1:1565,2\n-1#1:1567,11\n-1#1:1578,4\n-1#1:1582,6\n-1#1:1589,3\n-1#1:1593,2\n-1#1:1595\n-1#1:1596,10\n-1#1:1606\n-1#1:1607,6\n-1#1:1613\n-1#1:1614,2\n-1#1:1616,11\n-1#1:1627,4\n-1#1:1631,6\n-1#1:1638,3\n-1#1:1642,2\n-1#1:1644\n-1#1:1645,10\n-1#1:1655\n-1#1:1656,6\n-1#1:1662\n-1#1:1663,2\n-1#1:1665,11\n-1#1:1676,4\n-1#1:1680,6\n-1#1:1687,3\n-1#1:1691,2\n-1#1:1693\n-1#1:1694,10\n-1#1:1704\n-1#1:1705,6\n-1#1:1711\n-1#1:1712,2\n363#1:1132\n370#1:1133\n389#1:1140\n389#1:1144\n401#1:1160\n401#1:1164\n413#1:1180\n413#1:1184\n422#1:1204\n422#1:1208\n432#1:1230\n432#1:1234\n448#1:1256\n448#1:1260\n471#1:1281\n471#1:1285\n495#1:1307\n495#1:1311\n530#1:1333\n530#1:1337\n530#1:1359\n530#1:1363\n551#1:1385\n551#1:1389\n577#1:1411\n577#1:1415\n599#1:1437\n599#1:1441\n619#1:1456\n622#1:1457\n626#1:1458,3\n627#1:1461,3\n628#1:1464\n629#1:1465\n629#1:1466\n633#1:1467\n636#1:1468\n-1#1:1490\n-1#1:1494\n-1#1:1539\n-1#1:1543\n-1#1:1588\n-1#1:1592\n-1#1:1637\n-1#1:1641\n-1#1:1686\n-1#1:1690\n618#1:1453,3\n*E\n"})
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public long[] f86988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @NotNull
    public float[] f86989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    @NotNull
    public int[] f86990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    public int f86991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dd.g
    public int f86992e;

    public /* synthetic */ r(C4969v c4969v) {
        this();
    }

    public static /* synthetic */ String L(r rVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return rVar.I(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public static /* synthetic */ String M(r rVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.p pVar, int i11, Object obj) {
        long[] jArr;
        long[] jArr2;
        int i12;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        CharSequence separator = (i11 & 1) != 0 ? U6.j.f68738d : charSequence;
        CharSequence prefix = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence postfix = (i11 & 4) == 0 ? charSequence3 : "";
        int i13 = (i11 & 8) != 0 ? -1 : i10;
        CharSequence charSequence5 = (i11 & 16) != 0 ? "..." : charSequence4;
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        StringBuilder sbA = C1542l.a(charSequence5, "truncated", pVar, "transform", prefix);
        float[] fArr = rVar.f86989b;
        int[] iArr = rVar.f86990c;
        long[] jArr3 = rVar.f86988a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i14 = 0;
            int i15 = 0;
            loop0: while (true) {
                long j10 = jArr3[i14];
                int i16 = i14;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8;
                    int i18 = 8 - ((~(i16 - length)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j10 & 255) < 128) {
                            int i20 = (i16 << 3) + i19;
                            float f10 = fArr[i20];
                            int i21 = iArr[i20];
                            if (i15 == i13) {
                                sbA.append(charSequence5);
                                break loop0;
                            }
                            if (i15 != 0) {
                                sbA.append(separator);
                            }
                            i12 = i17;
                            Float fValueOf = Float.valueOf(f10);
                            jArr2 = jArr3;
                            sbA.append((CharSequence) pVar.invoke(fValueOf, Integer.valueOf(i21)));
                            i15++;
                        } else {
                            jArr2 = jArr3;
                            i12 = i17;
                        }
                        j10 >>= i12;
                        i19++;
                        i17 = i12;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i18 != i17) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i16 == length) {
                    break;
                }
                i14 = i16 + 1;
                jArr3 = jArr;
            }
            sbA.append(postfix);
        } else {
            sbA.append(postfix);
        }
        String string = sbA.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @InterfaceC4850b0
    public static /* synthetic */ void p() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void q() {
    }

    @InterfaceC4850b0
    public static /* synthetic */ void u() {
    }

    public static /* synthetic */ void v() {
    }

    public static /* synthetic */ void w() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[PHI: r10
      0x007d: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x002b, B:20:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    @dd.k
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A(@org.jetbrains.annotations.NotNull ed.p<? super java.lang.Float, ? super java.lang.Integer, ? extends java.lang.CharSequence> r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "transform"
            kotlin.jvm.internal.G.p(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ""
            r2.<init>(r3)
            float[] r4 = r0.f86989b
            int[] r5 = r0.f86990c
            long[] r6 = r0.f86988a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L82
            r9 = 0
            r10 = 0
        L1d:
            r11 = r6[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L7d
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L37:
            if (r15 >= r13) goto L7a
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L71
            int r16 = r9 << 3
            int r16 = r16 + r15
            r17 = r4[r16]
            r16 = r5[r16]
            r8 = -1
            if (r10 != r8) goto L54
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L85
        L54:
            if (r10 == 0) goto L5b
            java.lang.String r8 = ", "
            r2.append(r8)
        L5b:
            java.lang.Float r8 = java.lang.Float.valueOf(r17)
            r17 = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)
            java.lang.Object r8 = r1.invoke(r8, r14)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r2.append(r8)
            int r10 = r10 + 1
            goto L73
        L71:
            r17 = r14
        L73:
            long r11 = r11 >> r17
            int r15 = r15 + 1
            r14 = r17
            goto L37
        L7a:
            r8 = r14
            if (r13 != r8) goto L82
        L7d:
            if (r9 == r7) goto L82
            int r9 = r9 + 1
            goto L1d
        L82:
            r2.append(r3)
        L85:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.G.o(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.r.A(ed.p):java.lang.String");
    }

    @dd.k
    @NotNull
    public final String B(@NotNull CharSequence separator) {
        kotlin.jvm.internal.G.p(separator, "separator");
        return L(this, separator, null, null, 0, null, 30, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0087 A[PHI: r11
      0x0087: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0035, B:20:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    @dd.k
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String C(@org.jetbrains.annotations.NotNull java.lang.CharSequence r22, @org.jetbrains.annotations.NotNull ed.p<? super java.lang.Float, ? super java.lang.Integer, ? extends java.lang.CharSequence> r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.String r3 = "separator"
            kotlin.jvm.internal.G.p(r1, r3)
            java.lang.String r3 = "transform"
            kotlin.jvm.internal.G.p(r2, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ""
            r3.<init>(r4)
            float[] r5 = r0.f86989b
            int[] r6 = r0.f86990c
            long[] r7 = r0.f86988a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L8e
            r10 = 0
            r11 = 0
        L24:
            r12 = r7[r10]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L87
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L41:
            if (r9 >= r14) goto L84
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r12 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L79
            int r17 = r10 << 3
            int r17 = r17 + r9
            r18 = r5[r17]
            r17 = r6[r17]
            r19 = r15
            r15 = -1
            if (r11 != r15) goto L60
            java.lang.String r1 = "..."
            r3.append(r1)
            goto L91
        L60:
            if (r11 == 0) goto L65
            r3.append(r1)
        L65:
            java.lang.Float r15 = java.lang.Float.valueOf(r18)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            java.lang.Object r0 = r2.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.append(r0)
            int r11 = r11 + 1
            goto L7b
        L79:
            r19 = r15
        L7b:
            long r12 = r12 >> r19
            int r9 = r9 + 1
            r0 = r21
            r15 = r19
            goto L41
        L84:
            r0 = r15
            if (r14 != r0) goto L8e
        L87:
            if (r10 == r8) goto L8e
            int r10 = r10 + 1
            r0 = r21
            goto L24
        L8e:
            r3.append(r4)
        L91:
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.G.o(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.r.C(java.lang.CharSequence, ed.p):java.lang.String");
    }

    @dd.k
    @NotNull
    public final String D(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        return L(this, separator, prefix, null, 0, null, 28, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[PHI: r10
      0x0080: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0030, B:20:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    @dd.k
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String E(@org.jetbrains.annotations.NotNull java.lang.CharSequence r21, @org.jetbrains.annotations.NotNull java.lang.CharSequence r22, @org.jetbrains.annotations.NotNull ed.p<? super java.lang.Float, ? super java.lang.Integer, ? extends java.lang.CharSequence> r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r23
            java.lang.String r3 = "separator"
            kotlin.jvm.internal.G.p(r1, r3)
            java.lang.String r3 = "prefix"
            java.lang.String r4 = "transform"
            r5 = r22
            java.lang.StringBuilder r3 = androidx.collection.C1542l.a(r5, r3, r2, r4, r5)
            float[] r4 = r0.f86989b
            int[] r5 = r0.f86990c
            long[] r6 = r0.f86988a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L85
            r9 = 0
            r10 = 0
        L22:
            r11 = r6[r9]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L80
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L3c:
            if (r15 >= r13) goto L7d
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L74
            int r16 = r9 << 3
            int r16 = r16 + r15
            r17 = r4[r16]
            r16 = r5[r16]
            r8 = -1
            if (r10 != r8) goto L59
            java.lang.String r1 = "..."
            r3.append(r1)
            goto L8a
        L59:
            if (r10 == 0) goto L5e
            r3.append(r1)
        L5e:
            java.lang.Float r8 = java.lang.Float.valueOf(r17)
            r17 = r14
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)
            java.lang.Object r8 = r2.invoke(r8, r14)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r3.append(r8)
            int r10 = r10 + 1
            goto L76
        L74:
            r17 = r14
        L76:
            long r11 = r11 >> r17
            int r15 = r15 + 1
            r14 = r17
            goto L3c
        L7d:
            r8 = r14
            if (r13 != r8) goto L85
        L80:
            if (r9 == r7) goto L85
            int r9 = r9 + 1
            goto L22
        L85:
            java.lang.String r1 = ""
            r3.append(r1)
        L8a:
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.G.o(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.r.E(java.lang.CharSequence, java.lang.CharSequence, ed.p):java.lang.String");
    }

    @dd.k
    @NotNull
    public final String F(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        return L(this, separator, prefix, postfix, 0, null, 24, null);
    }

    @dd.k
    @NotNull
    public final String G(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        return L(this, separator, prefix, postfix, i10, null, 16, null);
    }

    @dd.k
    @NotNull
    public final String H(@NotNull CharSequence charSequence, @NotNull CharSequence prefix, @NotNull CharSequence charSequence2, int i10, @NotNull ed.p<? super Float, ? super Integer, ? extends CharSequence> pVar) {
        int i11;
        CharSequence separator = charSequence;
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        StringBuilder sbA = C1542l.a(charSequence2, "postfix", pVar, "transform", prefix);
        float[] fArr = this.f86989b;
        int[] iArr = this.f86990c;
        long[] jArr = this.f86988a;
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
                            int i17 = (i12 << 3) + i16;
                            float f10 = fArr[i17];
                            int i18 = iArr[i17];
                            i11 = i14;
                            if (i13 == i10) {
                                sbA.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i13 != 0) {
                                sbA.append(separator);
                            }
                            sbA.append(pVar.invoke(Float.valueOf(f10), Integer.valueOf(i18)));
                            i13++;
                        } else {
                            i11 = i14;
                        }
                        j10 >>= i11;
                        i16++;
                        separator = charSequence;
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
                separator = charSequence;
            }
            sbA.append(charSequence2);
        } else {
            sbA.append(charSequence2);
        }
        String string = sbA.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dd.k
    @NotNull
    public final String I(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence charSequence, int i10, @NotNull CharSequence charSequence2) {
        float[] fArr;
        float[] fArr2;
        int i11;
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        StringBuilder sbA = C1544m.a(charSequence, "postfix", charSequence2, "truncated", prefix);
        float[] fArr3 = this.f86989b;
        int[] iArr = this.f86990c;
        long[] jArr = this.f86988a;
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
                            int i17 = (i12 << 3) + i16;
                            i11 = i14;
                            float f10 = fArr3[i17];
                            int i18 = iArr[i17];
                            fArr2 = fArr3;
                            if (i13 == i10) {
                                sbA.append(charSequence2);
                                break loop0;
                            }
                            if (i13 != 0) {
                                sbA.append(separator);
                            }
                            sbA.append(f10);
                            sbA.append(SignatureVisitor.INSTANCEOF);
                            sbA.append(i18);
                            i13++;
                        } else {
                            fArr2 = fArr3;
                            i11 = i14;
                        }
                        j10 >>= i11;
                        i16++;
                        fArr3 = fArr2;
                        i14 = i11;
                    }
                    fArr = fArr3;
                    if (i15 != i14) {
                        break;
                    }
                } else {
                    fArr = fArr3;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                fArr3 = fArr;
            }
            sbA.append(charSequence);
        } else {
            sbA.append(charSequence);
        }
        String string = sbA.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0091 A[PHI: r12
      0x0091: PHI (r12v2 int) = (r12v1 int), (r12v3 int) binds: [B:6:0x0042, B:19:0x008f] A[DONT_GENERATE, DONT_INLINE]] */
    @dd.k
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String J(@org.jetbrains.annotations.NotNull java.lang.CharSequence r22, @org.jetbrains.annotations.NotNull java.lang.CharSequence r23, @org.jetbrains.annotations.NotNull java.lang.CharSequence r24, int r25, @org.jetbrains.annotations.NotNull java.lang.CharSequence r26, @org.jetbrains.annotations.NotNull ed.p<? super java.lang.Float, ? super java.lang.Integer, ? extends java.lang.CharSequence> r27) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r26
            r5 = r27
            java.lang.String r6 = "separator"
            kotlin.jvm.internal.G.p(r1, r6)
            java.lang.String r6 = "prefix"
            kotlin.jvm.internal.G.p(r2, r6)
            java.lang.String r6 = "postfix"
            kotlin.jvm.internal.G.p(r3, r6)
            java.lang.String r6 = "truncated"
            java.lang.String r7 = "transform"
            java.lang.StringBuilder r2 = androidx.collection.C1542l.a(r4, r6, r5, r7, r2)
            float[] r6 = r0.f86989b
            int[] r7 = r0.f86990c
            long[] r8 = r0.f86988a
            int r9 = r8.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto L9a
            r11 = 0
            r12 = 0
        L30:
            r13 = r8[r11]
            r15 = r11
            long r10 = ~r13
            r16 = 7
            long r10 = r10 << r16
            long r10 = r10 & r13
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r16
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 == 0) goto L91
            int r11 = r15 - r9
            int r10 = ~r11
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r16 = r11
            r11 = 0
        L50:
            if (r11 >= r10) goto L8d
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r13 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L84
            int r17 = r15 << 3
            int r17 = r17 + r11
            r18 = r6[r17]
            r17 = r7[r17]
            r0 = r25
            if (r12 != r0) goto L6c
            r2.append(r4)
            goto L9d
        L6c:
            if (r12 == 0) goto L71
            r2.append(r1)
        L71:
            java.lang.Float r0 = java.lang.Float.valueOf(r18)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            java.lang.Object r0 = r5.invoke(r0, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.append(r0)
            int r12 = r12 + 1
        L84:
            long r13 = r13 >> r16
            int r11 = r11 + 1
            r0 = r21
            r1 = r22
            goto L50
        L8d:
            r0 = r16
            if (r10 != r0) goto L9a
        L91:
            if (r15 == r9) goto L9a
            int r11 = r15 + 1
            r0 = r21
            r1 = r22
            goto L30
        L9a:
            r2.append(r3)
        L9d:
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.G.o(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.r.J(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, ed.p):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[PHI: r11
      0x008c: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x003a, B:20:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    @dd.k
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String K(@org.jetbrains.annotations.NotNull java.lang.CharSequence r21, @org.jetbrains.annotations.NotNull java.lang.CharSequence r22, @org.jetbrains.annotations.NotNull java.lang.CharSequence r23, @org.jetbrains.annotations.NotNull ed.p<? super java.lang.Float, ? super java.lang.Integer, ? extends java.lang.CharSequence> r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            java.lang.String r5 = "separator"
            kotlin.jvm.internal.G.p(r1, r5)
            java.lang.String r5 = "prefix"
            kotlin.jvm.internal.G.p(r2, r5)
            java.lang.String r5 = "postfix"
            java.lang.String r6 = "transform"
            java.lang.StringBuilder r2 = androidx.collection.C1542l.a(r3, r5, r4, r6, r2)
            float[] r5 = r0.f86989b
            int[] r6 = r0.f86990c
            long[] r7 = r0.f86988a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L93
            r10 = 0
            r11 = 0
        L29:
            r12 = r7[r10]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L8c
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L46:
            if (r9 >= r14) goto L89
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r12 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L7e
            int r16 = r10 << 3
            int r16 = r16 + r9
            r17 = r5[r16]
            r16 = r6[r16]
            r18 = r15
            r15 = -1
            if (r11 != r15) goto L65
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L96
        L65:
            if (r11 == 0) goto L6a
            r2.append(r1)
        L6a:
            java.lang.Float r15 = java.lang.Float.valueOf(r17)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)
            java.lang.Object r0 = r4.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.append(r0)
            int r11 = r11 + 1
            goto L80
        L7e:
            r18 = r15
        L80:
            long r12 = r12 >> r18
            int r9 = r9 + 1
            r0 = r20
            r15 = r18
            goto L46
        L89:
            r0 = r15
            if (r14 != r0) goto L93
        L8c:
            if (r10 == r8) goto L93
            int r10 = r10 + 1
            r0 = r20
            goto L29
        L93:
            r2.append(r3)
        L96:
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.G.o(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.r.K(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, ed.p):java.lang.String");
    }

    public final boolean N() {
        return this.f86992e == 0;
    }

    public final boolean a(@NotNull ed.p<? super Float, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        float[] fArr = this.f86989b;
        int[] iArr = this.f86990c;
        long[] jArr = this.f86988a;
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
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (!predicate.invoke(Float.valueOf(fArr[i13]), Integer.valueOf(iArr[i13])).booleanValue()) {
                            return false;
                        }
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
        return this.f86992e != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(@org.jetbrains.annotations.NotNull ed.p<? super java.lang.Float, ? super java.lang.Integer, java.lang.Boolean> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.G.p(r1, r2)
            float[] r2 = r0.f86989b
            int[] r3 = r0.f86990c
            long[] r4 = r0.f86988a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L63
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5e
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L5c
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L58
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            r13 = r3[r13]
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object r13 = r1.invoke(r14, r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L58
            r1 = 1
            return r1
        L58:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L5c:
            if (r10 != r11) goto L63
        L5e:
            if (r7 == r5) goto L63
            int r7 = r7 + 1
            goto L16
        L63:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.r.c(ed.p):boolean");
    }

    public final boolean d(float f10) {
        return i(f10) >= 0;
    }

    public final boolean e(float f10) {
        return i(f10) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof androidx.collection.r
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            androidx.collection.r r1 = (androidx.collection.r) r1
            int r3 = r1.f86992e
            int r5 = r0.f86992e
            if (r3 == r5) goto L17
            return r4
        L17:
            float[] r3 = r0.f86989b
            int[] r5 = r0.f86990c
            long[] r6 = r0.f86988a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L61
            r8 = r4
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L5c
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L5a
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L56
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r15 = r1.n(r15)
            if (r14 == r15) goto L56
            return r4
        L56:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L5a:
            if (r11 != r12) goto L61
        L5c:
            if (r8 == r7) goto L61
            int r8 = r8 + 1
            goto L23
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.r.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(int r15) {
        /*
            r14 = this;
            int[] r0 = r14.f86990c
            long[] r1 = r14.f86988a
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L44
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
            if (r7 == 0) goto L3f
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L25:
            if (r9 >= r7) goto L3d
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L39
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            if (r15 != r10) goto L39
            r15 = 1
            return r15
        L39:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L25
        L3d:
            if (r7 != r8) goto L44
        L3f:
            if (r4 == r2) goto L44
            int r4 = r4 + 1
            goto Lb
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.r.f(int):boolean");
    }

    public final int g() {
        return this.f86992e;
    }

    public final int h(@NotNull ed.p<? super Float, ? super Integer, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        float[] fArr = this.f86989b;
        int[] iArr = this.f86990c;
        long[] jArr = this.f86988a;
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
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        if (predicate.invoke(Float.valueOf(fArr[i14]), Integer.valueOf(iArr[i14])).booleanValue()) {
                            i11++;
                        }
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

    public int hashCode() {
        float[] fArr = this.f86989b;
        int[] iArr = this.f86990c;
        long[] jArr = this.f86988a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iFloatToIntBits = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        iFloatToIntBits += iArr[i13] ^ Float.floatToIntBits(fArr[i13]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iFloatToIntBits;
                }
            }
            if (i10 == length) {
                return iFloatToIntBits;
            }
            i10++;
        }
    }

    @InterfaceC4850b0
    public final int i(float f10) {
        int iFloatToIntBits = Float.floatToIntBits(f10) * S0.f86834j;
        int i10 = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i11 = i10 & 127;
        int i12 = this.f86991d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f86988a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * S0.f86835k) ^ j10;
            for (long j12 = (~j11) & (j11 - S0.f86835k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f86989b[iNumberOfTrailingZeros] == f10) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    public final void j(@NotNull ed.p<? super Float, ? super Integer, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        float[] fArr = this.f86989b;
        int[] iArr = this.f86990c;
        long[] jArr = this.f86988a;
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
                        block.invoke(Float.valueOf(fArr[i13]), Integer.valueOf(iArr[i13]));
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
    public final void k(@NotNull ed.l<? super Integer, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        long[] jArr = this.f86988a;
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

    public final void l(@NotNull ed.l<? super Float, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        float[] fArr = this.f86989b;
        long[] jArr = this.f86988a;
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
                        block.invoke(Float.valueOf(fArr[(i10 << 3) + i12]));
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

    public final void m(@NotNull ed.l<? super Integer, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        int[] iArr = this.f86990c;
        long[] jArr = this.f86988a;
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
                        block.invoke(Integer.valueOf(iArr[(i10 << 3) + i12]));
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

    public final int n(float f10) {
        int i10 = i(f10);
        if (i10 >= 0) {
            return this.f86990c[i10];
        }
        throw new NoSuchElementException("Cannot find value for key " + f10);
    }

    public final int o() {
        return this.f86991d;
    }

    public final int r(float f10, int i10) {
        int i11 = i(f10);
        return i11 >= 0 ? this.f86990c[i11] : i10;
    }

    public final int s(float f10, @NotNull InterfaceC4376a<Integer> defaultValue) {
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        int i10 = i(f10);
        return i10 < 0 ? defaultValue.invoke().intValue() : this.f86990c[i10];
    }

    public final int t() {
        return this.f86992e;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[PHI: r8
      0x0068: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:19:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            boolean r1 = r0.x()
            if (r1 == 0) goto Lb
            java.lang.String r1 = "{}"
            return r1
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            float[] r2 = r0.f86989b
            int[] r3 = r0.f86990c
            long[] r4 = r0.f86988a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6d
            r6 = 0
            r7 = r6
            r8 = r7
        L20:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L68
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L3a:
            if (r13 >= r11) goto L66
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L62
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f86992e
            if (r8 >= r14) goto L62
            java.lang.String r14 = ", "
            r1.append(r14)
        L62:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3a
        L66:
            if (r11 != r12) goto L6d
        L68:
            if (r7 == r5) goto L6d
            int r7 = r7 + 1
            goto L20
        L6d:
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r3 = "s.append('}').toString()"
            java.lang.String r1 = androidx.collection.C1526d.a(r1, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.r.toString():java.lang.String");
    }

    public final boolean x() {
        return this.f86992e == 0;
    }

    public final boolean y() {
        return this.f86992e != 0;
    }

    @dd.k
    @NotNull
    public final String z() {
        return L(this, null, null, null, 0, null, 31, null);
    }

    public r() {
        this.f86988a = S0.f86829e;
        this.f86989b = B.g();
        this.f86990c = P.b();
    }
}
