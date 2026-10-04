package androidx.collection;

import ed.InterfaceC4376a;
import java.util.NoSuchElementException;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nObjectFloatMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectFloatMap.kt\nandroidx/collection/ObjectFloatMap\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1158:1\n374#1,6:1161\n384#1,3:1168\n387#1,9:1172\n374#1,6:1181\n384#1,3:1188\n387#1,9:1192\n374#1,6:1201\n384#1,3:1208\n387#1,9:1212\n402#1,4:1221\n374#1,6:1225\n384#1,3:1232\n387#1,2:1236\n407#1,2:1238\n390#1,6:1240\n409#1:1246\n402#1,4:1247\n374#1,6:1251\n384#1,3:1258\n387#1,2:1262\n407#1,2:1264\n390#1,6:1266\n409#1:1272\n402#1,4:1273\n374#1,6:1277\n384#1,3:1284\n387#1,2:1288\n407#1,2:1290\n390#1,6:1292\n409#1:1298\n429#1,3:1299\n374#1,6:1302\n384#1,3:1309\n387#1,2:1313\n432#1,2:1315\n390#1,6:1317\n434#1:1323\n402#1,4:1324\n374#1,6:1328\n384#1,3:1335\n387#1,2:1339\n407#1,2:1341\n390#1,6:1343\n409#1:1349\n402#1,4:1350\n374#1,6:1354\n384#1,3:1361\n387#1,2:1365\n407#1,2:1367\n390#1,6:1369\n409#1:1375\n402#1,4:1376\n374#1,6:1380\n384#1,3:1387\n387#1,2:1391\n407#1,2:1393\n390#1,6:1395\n409#1:1401\n402#1,4:1402\n374#1,6:1406\n384#1,3:1413\n387#1,2:1417\n407#1,2:1419\n390#1,6:1421\n409#1:1427\n402#1,4:1428\n374#1,6:1432\n384#1,3:1439\n387#1,2:1443\n407#1,2:1445\n390#1,6:1447\n409#1:1453\n402#1,4:1454\n374#1,6:1458\n384#1,3:1465\n387#1,2:1469\n407#1,2:1471\n390#1,6:1473\n409#1:1479\n538#1,11:1496\n402#1,4:1507\n374#1,6:1511\n384#1,3:1518\n387#1,2:1522\n407#1:1524\n549#1,10:1525\n408#1:1535\n390#1,6:1536\n409#1:1542\n559#1,2:1543\n538#1,11:1545\n402#1,4:1556\n374#1,6:1560\n384#1,3:1567\n387#1,2:1571\n407#1:1573\n549#1,10:1574\n408#1:1584\n390#1,6:1585\n409#1:1591\n559#1,2:1592\n538#1,11:1594\n402#1,4:1605\n374#1,6:1609\n384#1,3:1616\n387#1,2:1620\n407#1:1622\n549#1,10:1623\n408#1:1633\n390#1,6:1634\n409#1:1640\n559#1,2:1641\n538#1,11:1643\n402#1,4:1654\n374#1,6:1658\n384#1,3:1665\n387#1,2:1669\n407#1:1671\n549#1,10:1672\n408#1:1682\n390#1,6:1683\n409#1:1689\n559#1,2:1690\n538#1,11:1692\n402#1,4:1703\n374#1,6:1707\n384#1,3:1714\n387#1,2:1718\n407#1:1720\n549#1,10:1721\n408#1:1731\n390#1,6:1732\n409#1:1738\n559#1,2:1739\n1956#2:1159\n1820#2:1160\n1956#2:1167\n1820#2:1171\n1956#2:1187\n1820#2:1191\n1956#2:1207\n1820#2:1211\n1956#2:1231\n1820#2:1235\n1956#2:1257\n1820#2:1261\n1956#2:1283\n1820#2:1287\n1956#2:1308\n1820#2:1312\n1956#2:1334\n1820#2:1338\n1956#2:1360\n1820#2:1364\n1956#2:1386\n1820#2:1390\n1956#2:1412\n1820#2:1416\n1956#2:1438\n1820#2:1442\n1956#2:1464\n1820#2:1468\n1714#2,3:1480\n1728#2:1483\n1724#2:1484\n1925#2,3:1485\n1939#2,3:1488\n1865#2:1491\n1853#2:1492\n1847#2:1493\n1860#2:1494\n1948#2:1495\n1956#2:1517\n1820#2:1521\n1956#2:1566\n1820#2:1570\n1956#2:1615\n1820#2:1619\n1956#2:1664\n1820#2:1668\n1956#2:1713\n1820#2:1717\n*S KotlinDebug\n*F\n+ 1 ObjectFloatMap.kt\nandroidx/collection/ObjectFloatMap\n*L\n405#1:1161,6\n405#1:1168,3\n405#1:1172,9\n418#1:1181,6\n418#1:1188,3\n418#1:1192,9\n431#1:1201,6\n431#1:1208,3\n431#1:1212,9\n440#1:1221,4\n440#1:1225,6\n440#1:1232,3\n440#1:1236,2\n440#1:1238,2\n440#1:1240,6\n440#1:1246\n450#1:1247,4\n450#1:1251,6\n450#1:1258,3\n450#1:1262,2\n450#1:1264,2\n450#1:1266,6\n450#1:1272\n466#1:1273,4\n466#1:1277,6\n466#1:1284,3\n466#1:1288,2\n466#1:1290,2\n466#1:1292,6\n466#1:1298\n489#1:1299,3\n489#1:1302,6\n489#1:1309,3\n489#1:1313,2\n489#1:1315,2\n489#1:1317,6\n489#1:1323\n513#1:1324,4\n513#1:1328,6\n513#1:1335,3\n513#1:1339,2\n513#1:1341,2\n513#1:1343,6\n513#1:1349\n548#1:1350,4\n548#1:1354,6\n548#1:1361,3\n548#1:1365,2\n548#1:1367,2\n548#1:1369,6\n548#1:1375\n548#1:1376,4\n548#1:1380,6\n548#1:1387,3\n548#1:1391,2\n548#1:1393,2\n548#1:1395,6\n548#1:1401\n569#1:1402,4\n569#1:1406,6\n569#1:1413,3\n569#1:1417,2\n569#1:1419,2\n569#1:1421,6\n569#1:1427\n598#1:1428,4\n598#1:1432,6\n598#1:1439,3\n598#1:1443,2\n598#1:1445,2\n598#1:1447,6\n598#1:1453\n620#1:1454,4\n620#1:1458,6\n620#1:1465,3\n620#1:1469,2\n620#1:1471,2\n620#1:1473,6\n620#1:1479\n-1#1:1496,11\n-1#1:1507,4\n-1#1:1511,6\n-1#1:1518,3\n-1#1:1522,2\n-1#1:1524\n-1#1:1525,10\n-1#1:1535\n-1#1:1536,6\n-1#1:1542\n-1#1:1543,2\n-1#1:1545,11\n-1#1:1556,4\n-1#1:1560,6\n-1#1:1567,3\n-1#1:1571,2\n-1#1:1573\n-1#1:1574,10\n-1#1:1584\n-1#1:1585,6\n-1#1:1591\n-1#1:1592,2\n-1#1:1594,11\n-1#1:1605,4\n-1#1:1609,6\n-1#1:1616,3\n-1#1:1620,2\n-1#1:1622\n-1#1:1623,10\n-1#1:1633\n-1#1:1634,6\n-1#1:1640\n-1#1:1641,2\n-1#1:1643,11\n-1#1:1654,4\n-1#1:1658,6\n-1#1:1665,3\n-1#1:1669,2\n-1#1:1671\n-1#1:1672,10\n-1#1:1682\n-1#1:1683,6\n-1#1:1689\n-1#1:1690,2\n-1#1:1692,11\n-1#1:1703,4\n-1#1:1707,6\n-1#1:1714,3\n-1#1:1718,2\n-1#1:1720\n-1#1:1721,10\n-1#1:1731\n-1#1:1732,6\n-1#1:1738\n-1#1:1739,2\n379#1:1159\n386#1:1160\n405#1:1167\n405#1:1171\n418#1:1187\n418#1:1191\n431#1:1207\n431#1:1211\n440#1:1231\n440#1:1235\n450#1:1257\n450#1:1261\n466#1:1283\n466#1:1287\n489#1:1308\n489#1:1312\n513#1:1334\n513#1:1338\n548#1:1360\n548#1:1364\n548#1:1386\n548#1:1390\n569#1:1412\n569#1:1416\n598#1:1438\n598#1:1442\n620#1:1464\n620#1:1468\n639#1:1480,3\n640#1:1483\n643#1:1484\n647#1:1485,3\n648#1:1488,3\n649#1:1491\n650#1:1492\n650#1:1493\n654#1:1494\n657#1:1495\n-1#1:1517\n-1#1:1521\n-1#1:1566\n-1#1:1570\n-1#1:1615\n-1#1:1619\n-1#1:1664\n-1#1:1668\n-1#1:1713\n-1#1:1717\n*E\n"})
public abstract class I0<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public long[] f86710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @NotNull
    public Object[] f86711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    @NotNull
    public float[] f86712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    public int f86713d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dd.g
    public int f86714e;

    public /* synthetic */ I0(C4969v c4969v) {
        this();
    }

    public static /* synthetic */ String L(I0 i02, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return i02.I(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public static /* synthetic */ String M(I0 i02, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.p pVar, int i11, Object obj) {
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
        Object[] objArr = i02.f86711b;
        float[] fArr = i02.f86712c;
        long[] jArr3 = i02.f86710a;
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
                            i12 = i17;
                            Object obj2 = objArr[i20];
                            float f10 = fArr[i20];
                            if (i15 == i13) {
                                sbA.append(charSequence5);
                                break loop0;
                            }
                            if (i15 != 0) {
                                sbA.append(separator);
                            }
                            jArr2 = jArr3;
                            sbA.append((CharSequence) pVar.invoke(obj2, Float.valueOf(f10)));
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079 A[PHI: r10
      0x0079: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x002b, B:20:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    @dd.k
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A(@org.jetbrains.annotations.NotNull ed.p<? super K, ? super java.lang.Float, ? extends java.lang.CharSequence> r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "transform"
            kotlin.jvm.internal.G.p(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ""
            r2.<init>(r3)
            java.lang.Object[] r4 = r0.f86711b
            float[] r5 = r0.f86712c
            long[] r6 = r0.f86710a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7e
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
            if (r13 == 0) goto L79
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L37:
            if (r15 >= r13) goto L76
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L6d
            int r16 = r9 << 3
            int r16 = r16 + r15
            r8 = r4[r16]
            r16 = r5[r16]
            r18 = r14
            r14 = -1
            if (r10 != r14) goto L56
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L81
        L56:
            if (r10 == 0) goto L5d
            java.lang.String r14 = ", "
            r2.append(r14)
        L5d:
            java.lang.Float r14 = java.lang.Float.valueOf(r16)
            java.lang.Object r8 = r1.invoke(r8, r14)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r2.append(r8)
            int r10 = r10 + 1
            goto L6f
        L6d:
            r18 = r14
        L6f:
            long r11 = r11 >> r18
            int r15 = r15 + 1
            r14 = r18
            goto L37
        L76:
            r8 = r14
            if (r13 != r8) goto L7e
        L79:
            if (r9 == r7) goto L7e
            int r9 = r9 + 1
            goto L1d
        L7e:
            r2.append(r3)
        L81:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.G.o(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.I0.A(ed.p):java.lang.String");
    }

    @dd.k
    @NotNull
    public final String B(@NotNull CharSequence separator) {
        kotlin.jvm.internal.G.p(separator, "separator");
        return L(this, separator, null, null, 0, null, 30, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083 A[PHI: r11
      0x0083: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0035, B:20:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    @dd.k
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String C(@org.jetbrains.annotations.NotNull java.lang.CharSequence r22, @org.jetbrains.annotations.NotNull ed.p<? super K, ? super java.lang.Float, ? extends java.lang.CharSequence> r23) {
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
            java.lang.Object[] r5 = r0.f86711b
            float[] r6 = r0.f86712c
            long[] r7 = r0.f86710a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L8a
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
            if (r14 == 0) goto L83
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L41:
            if (r9 >= r14) goto L80
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r12 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto L75
            int r17 = r10 << 3
            int r17 = r17 + r9
            r18 = r15
            r15 = r5[r17]
            r17 = r6[r17]
            r0 = -1
            if (r11 != r0) goto L60
            java.lang.String r0 = "..."
            r3.append(r0)
            goto L8d
        L60:
            if (r11 == 0) goto L65
            r3.append(r1)
        L65:
            java.lang.Float r0 = java.lang.Float.valueOf(r17)
            java.lang.Object r0 = r2.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.append(r0)
            int r11 = r11 + 1
            goto L77
        L75:
            r18 = r15
        L77:
            long r12 = r12 >> r18
            int r9 = r9 + 1
            r0 = r21
            r15 = r18
            goto L41
        L80:
            r0 = r15
            if (r14 != r0) goto L8a
        L83:
            if (r10 == r8) goto L8a
            int r10 = r10 + 1
            r0 = r21
            goto L24
        L8a:
            r3.append(r4)
        L8d:
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.G.o(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.I0.C(java.lang.CharSequence, ed.p):java.lang.String");
    }

    @dd.k
    @NotNull
    public final String D(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        return L(this, separator, prefix, null, 0, null, 28, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[PHI: r10
      0x007c: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0030, B:20:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    @dd.k
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String E(@org.jetbrains.annotations.NotNull java.lang.CharSequence r21, @org.jetbrains.annotations.NotNull java.lang.CharSequence r22, @org.jetbrains.annotations.NotNull ed.p<? super K, ? super java.lang.Float, ? extends java.lang.CharSequence> r23) {
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
            java.lang.Object[] r4 = r0.f86711b
            float[] r5 = r0.f86712c
            long[] r6 = r0.f86710a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L81
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
            if (r13 == 0) goto L7c
            int r13 = r9 - r7
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L3c:
            if (r15 >= r13) goto L79
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L70
            int r16 = r9 << 3
            int r16 = r16 + r15
            r8 = r4[r16]
            r16 = r5[r16]
            r17 = r14
            r14 = -1
            if (r10 != r14) goto L5b
            java.lang.String r1 = "..."
            r3.append(r1)
            goto L86
        L5b:
            if (r10 == 0) goto L60
            r3.append(r1)
        L60:
            java.lang.Float r14 = java.lang.Float.valueOf(r16)
            java.lang.Object r8 = r2.invoke(r8, r14)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r3.append(r8)
            int r10 = r10 + 1
            goto L72
        L70:
            r17 = r14
        L72:
            long r11 = r11 >> r17
            int r15 = r15 + 1
            r14 = r17
            goto L3c
        L79:
            r8 = r14
            if (r13 != r8) goto L81
        L7c:
            if (r9 == r7) goto L81
            int r9 = r9 + 1
            goto L22
        L81:
            java.lang.String r1 = ""
            r3.append(r1)
        L86:
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.G.o(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.I0.E(java.lang.CharSequence, java.lang.CharSequence, ed.p):java.lang.String");
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[PHI: r11
      0x0089: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x003a, B:20:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    @dd.k
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String H(@org.jetbrains.annotations.NotNull java.lang.CharSequence r21, @org.jetbrains.annotations.NotNull java.lang.CharSequence r22, @org.jetbrains.annotations.NotNull java.lang.CharSequence r23, int r24, @org.jetbrains.annotations.NotNull ed.p<? super K, ? super java.lang.Float, ? extends java.lang.CharSequence> r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r25
            java.lang.String r5 = "separator"
            kotlin.jvm.internal.G.p(r1, r5)
            java.lang.String r5 = "prefix"
            kotlin.jvm.internal.G.p(r2, r5)
            java.lang.String r5 = "postfix"
            java.lang.String r6 = "transform"
            java.lang.StringBuilder r2 = androidx.collection.C1542l.a(r3, r5, r4, r6, r2)
            java.lang.Object[] r5 = r0.f86711b
            float[] r6 = r0.f86712c
            long[] r7 = r0.f86710a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L90
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
            if (r14 == 0) goto L89
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L46:
            if (r9 >= r14) goto L86
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r12 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L7b
            int r16 = r10 << 3
            int r16 = r16 + r9
            r17 = r15
            r15 = r5[r16]
            r16 = r6[r16]
            r0 = r24
            if (r11 != r0) goto L66
            java.lang.String r0 = "..."
            r2.append(r0)
            goto L93
        L66:
            if (r11 == 0) goto L6b
            r2.append(r1)
        L6b:
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r4.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.append(r0)
            int r11 = r11 + 1
            goto L7d
        L7b:
            r17 = r15
        L7d:
            long r12 = r12 >> r17
            int r9 = r9 + 1
            r0 = r20
            r15 = r17
            goto L46
        L86:
            r0 = r15
            if (r14 != r0) goto L90
        L89:
            if (r10 == r8) goto L90
            int r10 = r10 + 1
            r0 = r20
            goto L29
        L90:
            r2.append(r3)
        L93:
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.G.o(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.I0.H(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, ed.p):java.lang.String");
    }

    @dd.k
    @NotNull
    public final String I(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence charSequence, int i10, @NotNull CharSequence charSequence2) {
        Object[] objArr;
        Object[] objArr2;
        int i11;
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        StringBuilder sbA = C1544m.a(charSequence, "postfix", charSequence2, "truncated", prefix);
        Object[] objArr3 = this.f86711b;
        float[] fArr = this.f86712c;
        long[] jArr = this.f86710a;
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
                            Object obj = objArr3[i17];
                            float f10 = fArr[i17];
                            objArr2 = objArr3;
                            if (i13 == i10) {
                                sbA.append(charSequence2);
                                break loop0;
                            }
                            if (i13 != 0) {
                                sbA.append(separator);
                            }
                            sbA.append(obj);
                            sbA.append(SignatureVisitor.INSTANCEOF);
                            sbA.append(f10);
                            i13++;
                        } else {
                            objArr2 = objArr3;
                            i11 = i14;
                        }
                        j10 >>= i11;
                        i16++;
                        objArr3 = objArr2;
                        i14 = i11;
                    }
                    objArr = objArr3;
                    if (i15 != i14) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i12 == length) {
                    break;
                }
                i12++;
                objArr3 = objArr;
            }
            sbA.append(charSequence);
        } else {
            sbA.append(charSequence);
        }
        String string = sbA.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @dd.k
    @NotNull
    public final String J(@NotNull CharSequence charSequence, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence charSequence2, @NotNull ed.p<? super K, ? super Float, ? extends CharSequence> pVar) {
        Object[] objArr;
        Object[] objArr2;
        CharSequence separator = charSequence;
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        StringBuilder sbA = C1542l.a(charSequence2, "truncated", pVar, "transform", prefix);
        Object[] objArr3 = this.f86711b;
        float[] fArr = this.f86712c;
        long[] jArr = this.f86710a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            loop0: while (true) {
                long j10 = jArr[i11];
                int i13 = i11;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j10 & 255) < 128) {
                            int i16 = (i13 << 3) + i15;
                            Object obj = objArr3[i16];
                            float f10 = fArr[i16];
                            objArr2 = objArr3;
                            if (i12 == i10) {
                                sbA.append(charSequence2);
                                break loop0;
                            }
                            if (i12 != 0) {
                                sbA.append(separator);
                            }
                            sbA.append(pVar.invoke(obj, Float.valueOf(f10)));
                            i12++;
                        } else {
                            objArr2 = objArr3;
                        }
                        j10 >>= 8;
                        i15++;
                        separator = charSequence;
                        objArr3 = objArr2;
                    }
                    objArr = objArr3;
                    if (i14 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr3;
                }
                if (i13 == length) {
                    break;
                }
                i11 = i13 + 1;
                separator = charSequence;
                objArr3 = objArr;
            }
            sbA.append(postfix);
        } else {
            sbA.append(postfix);
        }
        String string = sbA.toString();
        kotlin.jvm.internal.G.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0088 A[PHI: r11
      0x0088: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x003a, B:20:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    @dd.k
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String K(@org.jetbrains.annotations.NotNull java.lang.CharSequence r21, @org.jetbrains.annotations.NotNull java.lang.CharSequence r22, @org.jetbrains.annotations.NotNull java.lang.CharSequence r23, @org.jetbrains.annotations.NotNull ed.p<? super K, ? super java.lang.Float, ? extends java.lang.CharSequence> r24) {
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
            java.lang.Object[] r5 = r0.f86711b
            float[] r6 = r0.f86712c
            long[] r7 = r0.f86710a
            int r8 = r7.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L8f
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
            if (r14 == 0) goto L88
            int r14 = r10 - r8
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r9 = 0
        L46:
            if (r9 >= r14) goto L85
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r12 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L7a
            int r16 = r10 << 3
            int r16 = r16 + r9
            r17 = r15
            r15 = r5[r16]
            r16 = r6[r16]
            r0 = -1
            if (r11 != r0) goto L65
            java.lang.String r0 = "..."
            r2.append(r0)
            goto L92
        L65:
            if (r11 == 0) goto L6a
            r2.append(r1)
        L6a:
            java.lang.Float r0 = java.lang.Float.valueOf(r16)
            java.lang.Object r0 = r4.invoke(r15, r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.append(r0)
            int r11 = r11 + 1
            goto L7c
        L7a:
            r17 = r15
        L7c:
            long r12 = r12 >> r17
            int r9 = r9 + 1
            r0 = r20
            r15 = r17
            goto L46
        L85:
            r0 = r15
            if (r14 != r0) goto L8f
        L88:
            if (r10 == r8) goto L8f
            int r10 = r10 + 1
            r0 = r20
            goto L29
        L8f:
            r2.append(r3)
        L92:
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.G.o(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.I0.K(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, ed.p):java.lang.String");
    }

    public final boolean N() {
        return this.f86714e == 0;
    }

    public final boolean a(@NotNull ed.p<? super K, ? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Object[] objArr = this.f86711b;
        float[] fArr = this.f86712c;
        long[] jArr = this.f86710a;
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
                        if (!predicate.invoke(objArr[i13], Float.valueOf(fArr[i13])).booleanValue()) {
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
        return this.f86714e != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(@org.jetbrains.annotations.NotNull ed.p<? super K, ? super java.lang.Float, java.lang.Boolean> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.G.p(r1, r2)
            java.lang.Object[] r2 = r0.f86711b
            float[] r3 = r0.f86712c
            long[] r4 = r0.f86710a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L5f
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
            if (r10 == 0) goto L5a
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L58
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L54
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            r13 = r3[r13]
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            java.lang.Object r13 = r1.invoke(r14, r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L54
            r1 = 1
            return r1
        L54:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L58:
            if (r10 != r11) goto L5f
        L5a:
            if (r7 == r5) goto L5f
            int r7 = r7 + 1
            goto L16
        L5f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.I0.c(ed.p):boolean");
    }

    public final boolean d(K k10) {
        return i(k10) >= 0;
    }

    public final boolean e(K k10) {
        return i(k10) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
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
            boolean r3 = r1 instanceof androidx.collection.I0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            androidx.collection.I0 r1 = (androidx.collection.I0) r1
            int r3 = r1.f86714e
            int r5 = r0.f86714e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f86711b
            float[] r5 = r0.f86712c
            long[] r6 = r0.f86710a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L64
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
            if (r11 == 0) goto L5f
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L5d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L59
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            float r15 = r1.n(r15)
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 != 0) goto L58
            goto L59
        L58:
            return r4
        L59:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L5d:
            if (r11 != r12) goto L64
        L5f:
            if (r8 == r7) goto L64
            int r8 = r8 + 1
            goto L23
        L64:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.I0.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(float r15) {
        /*
            r14 = this;
            float[] r0 = r14.f86712c
            long[] r1 = r14.f86710a
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L46
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
            if (r7 == 0) goto L41
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L25:
            if (r9 >= r7) goto L3f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            int r10 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r10 != 0) goto L3b
            r15 = 1
            return r15
        L3b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L25
        L3f:
            if (r7 != r8) goto L46
        L41:
            if (r4 == r2) goto L46
            int r4 = r4 + 1
            goto Lb
        L46:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.I0.f(float):boolean");
    }

    public final int g() {
        return this.f86714e;
    }

    public final int h(@NotNull ed.p<? super K, ? super Float, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        Object[] objArr = this.f86711b;
        float[] fArr = this.f86712c;
        long[] jArr = this.f86710a;
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
                        if (predicate.invoke(objArr[i14], Float.valueOf(fArr[i14])).booleanValue()) {
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
        Object[] objArr = this.f86711b;
        float[] fArr = this.f86712c;
        long[] jArr = this.f86710a;
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
                        Object obj = objArr[i13];
                        iFloatToIntBits += Float.floatToIntBits(fArr[i13]) ^ (obj != null ? obj.hashCode() : 0);
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
    public final int i(K k10) {
        int i10 = 0;
        int iHashCode = (k10 != null ? k10.hashCode() : 0) * S0.f86834j;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f86713d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f86710a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * S0.f86835k) ^ j10;
            for (long j12 = (~j11) & (j11 - S0.f86835k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (kotlin.jvm.internal.G.g(this.f86711b[iNumberOfTrailingZeros], k10)) {
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

    public final void j(@NotNull ed.p<? super K, ? super Float, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        Object[] objArr = this.f86711b;
        float[] fArr = this.f86712c;
        long[] jArr = this.f86710a;
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
                        block.invoke(objArr[i13], Float.valueOf(fArr[i13]));
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
        long[] jArr = this.f86710a;
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

    public final void l(@NotNull ed.l<? super K, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        Object[] objArr = this.f86711b;
        long[] jArr = this.f86710a;
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

    public final void m(@NotNull ed.l<? super Float, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        float[] fArr = this.f86712c;
        long[] jArr = this.f86710a;
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

    public final float n(K k10) {
        int i10 = i(k10);
        if (i10 >= 0) {
            return this.f86712c[i10];
        }
        throw new NoSuchElementException("There is no key " + k10 + " in the map");
    }

    public final int o() {
        return this.f86713d;
    }

    public final float r(K k10, float f10) {
        int i10 = i(k10);
        return i10 >= 0 ? this.f86712c[i10] : f10;
    }

    public final float s(K k10, @NotNull InterfaceC4376a<Float> defaultValue) {
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        int i10 = i(k10);
        return i10 >= 0 ? this.f86712c[i10] : defaultValue.invoke().floatValue();
    }

    public final int t() {
        return this.f86714e;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006c A[PHI: r8
      0x006c: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002e, B:22:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
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
            java.lang.Object[] r2 = r0.f86711b
            float[] r3 = r0.f86712c
            long[] r4 = r0.f86710a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L71
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
            if (r11 == 0) goto L6c
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L3a:
            if (r13 >= r11) goto L6a
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L66
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            if (r15 != r0) goto L50
            java.lang.String r15 = "(this)"
        L50:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f86714e
            if (r8 >= r14) goto L66
            java.lang.String r14 = ", "
            r1.append(r14)
        L66:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3a
        L6a:
            if (r11 != r12) goto L71
        L6c:
            if (r7 == r5) goto L71
            int r7 = r7 + 1
            goto L20
        L71:
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r3 = "s.append('}').toString()"
            java.lang.String r1 = androidx.collection.C1526d.a(r1, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.I0.toString():java.lang.String");
    }

    public final boolean x() {
        return this.f86714e == 0;
    }

    public final boolean y() {
        return this.f86714e != 0;
    }

    @dd.k
    @NotNull
    public final String z() {
        return L(this, null, null, null, 0, null, 31, null);
    }

    public I0() {
        this.f86710a = S0.f86829e;
        this.f86711b = A.a.f13c;
        this.f86712c = B.g();
    }
}
