package androidx.collection;

import ed.InterfaceC4376a;
import kotlin.InterfaceC4850b0;
import kotlin.jvm.internal.C4969v;
import org.jetbrains.annotations.NotNull;
import org.objectweb.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: androidx.collection.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.V({"SMAP\nFloatObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/FloatObjectMap\n+ 2 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1118:1\n620#1:1119\n621#1:1123\n623#1,2:1125\n625#1,4:1128\n629#1:1135\n630#1:1139\n631#1:1141\n632#1,4:1144\n638#1:1149\n639#1,8:1151\n620#1:1159\n621#1:1163\n623#1,2:1165\n625#1,4:1168\n629#1:1175\n630#1:1179\n631#1:1181\n632#1,4:1184\n638#1:1189\n639#1,8:1191\n355#1,6:1201\n365#1,3:1208\n368#1,9:1212\n355#1,6:1221\n365#1,3:1228\n368#1,9:1232\n355#1,6:1241\n365#1,3:1248\n368#1,9:1252\n383#1,4:1261\n355#1,6:1265\n365#1,3:1272\n368#1,2:1276\n388#1,2:1278\n371#1,6:1280\n390#1:1286\n383#1,4:1287\n355#1,6:1291\n365#1,3:1298\n368#1,2:1302\n388#1,2:1304\n371#1,6:1306\n390#1:1312\n383#1,4:1313\n355#1,6:1317\n365#1,3:1324\n368#1,2:1328\n388#1,2:1330\n371#1,6:1332\n390#1:1338\n620#1:1339\n621#1:1343\n623#1,2:1345\n625#1,4:1348\n629#1:1355\n630#1:1359\n631#1:1361\n632#1,4:1364\n638#1:1369\n639#1,8:1371\n620#1:1379\n621#1:1383\n623#1,2:1385\n625#1,4:1388\n629#1:1395\n630#1:1399\n631#1:1401\n632#1,4:1404\n638#1:1409\n639#1,8:1411\n409#1,3:1419\n355#1,6:1422\n365#1,3:1429\n368#1,2:1433\n413#1,2:1435\n371#1,6:1437\n415#1:1443\n383#1,4:1444\n355#1,6:1448\n365#1,3:1455\n368#1,2:1459\n388#1,2:1461\n371#1,6:1463\n390#1:1469\n383#1,4:1470\n355#1,6:1474\n365#1,3:1481\n368#1,2:1485\n388#1,2:1487\n371#1,6:1489\n390#1:1495\n383#1,4:1496\n355#1,6:1500\n365#1,3:1507\n368#1,2:1511\n388#1,2:1513\n371#1,6:1515\n390#1:1521\n383#1,4:1522\n355#1,6:1526\n365#1,3:1533\n368#1,2:1537\n388#1,2:1539\n371#1,6:1541\n390#1:1547\n383#1,4:1548\n355#1,6:1552\n365#1,3:1559\n368#1,2:1563\n388#1,2:1565\n371#1,6:1567\n390#1:1573\n383#1,4:1574\n355#1,6:1578\n365#1,3:1585\n368#1,2:1589\n388#1,2:1591\n371#1,6:1593\n390#1:1599\n519#1,11:1616\n383#1,4:1627\n355#1,6:1631\n365#1,3:1638\n368#1,2:1642\n388#1:1644\n530#1,10:1645\n389#1:1655\n371#1,6:1656\n390#1:1662\n540#1,2:1663\n519#1,11:1665\n383#1,4:1676\n355#1,6:1680\n365#1,3:1687\n368#1,2:1691\n388#1:1693\n530#1,10:1694\n389#1:1704\n371#1,6:1705\n390#1:1711\n540#1,2:1712\n519#1,11:1714\n383#1,4:1725\n355#1,6:1729\n365#1,3:1736\n368#1,2:1740\n388#1:1742\n530#1,10:1743\n389#1:1753\n371#1,6:1754\n390#1:1760\n540#1,2:1761\n519#1,11:1763\n383#1,4:1774\n355#1,6:1778\n365#1,3:1785\n368#1,2:1789\n388#1:1791\n530#1,10:1792\n389#1:1802\n371#1,6:1803\n390#1:1809\n540#1,2:1810\n519#1,11:1812\n383#1,4:1823\n355#1,6:1827\n365#1,3:1834\n368#1,2:1838\n388#1:1840\n530#1,10:1841\n389#1:1851\n371#1,6:1852\n390#1:1858\n540#1,2:1859\n921#2,3:1120\n921#2,3:1160\n921#2,3:1340\n921#2,3:1380\n921#2,3:1600\n1728#3:1124\n1724#3:1127\n1925#3,3:1132\n1939#3,3:1136\n1865#3:1140\n1853#3:1142\n1847#3:1143\n1860#3:1148\n1948#3:1150\n1728#3:1164\n1724#3:1167\n1925#3,3:1172\n1939#3,3:1176\n1865#3:1180\n1853#3:1182\n1847#3:1183\n1860#3:1188\n1948#3:1190\n1956#3:1199\n1820#3:1200\n1956#3:1207\n1820#3:1211\n1956#3:1227\n1820#3:1231\n1956#3:1247\n1820#3:1251\n1956#3:1271\n1820#3:1275\n1956#3:1297\n1820#3:1301\n1956#3:1323\n1820#3:1327\n1728#3:1344\n1724#3:1347\n1925#3,3:1352\n1939#3,3:1356\n1865#3:1360\n1853#3:1362\n1847#3:1363\n1860#3:1368\n1948#3:1370\n1728#3:1384\n1724#3:1387\n1925#3,3:1392\n1939#3,3:1396\n1865#3:1400\n1853#3:1402\n1847#3:1403\n1860#3:1408\n1948#3:1410\n1956#3:1428\n1820#3:1432\n1956#3:1454\n1820#3:1458\n1956#3:1480\n1820#3:1484\n1956#3:1506\n1820#3:1510\n1956#3:1532\n1820#3:1536\n1956#3:1558\n1820#3:1562\n1956#3:1584\n1820#3:1588\n1728#3:1603\n1724#3:1604\n1925#3,3:1605\n1939#3,3:1608\n1865#3:1611\n1853#3:1612\n1847#3:1613\n1860#3:1614\n1948#3:1615\n1956#3:1637\n1820#3:1641\n1956#3:1686\n1820#3:1690\n1956#3:1735\n1820#3:1739\n1956#3:1784\n1820#3:1788\n1956#3:1833\n1820#3:1837\n*S KotlinDebug\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/FloatObjectMap\n*L\n322#1:1119\n322#1:1123\n322#1:1125,2\n322#1:1128,4\n322#1:1135\n322#1:1139\n322#1:1141\n322#1:1144,4\n322#1:1149\n322#1:1151,8\n332#1:1159\n332#1:1163\n332#1:1165,2\n332#1:1168,4\n332#1:1175\n332#1:1179\n332#1:1181\n332#1:1184,4\n332#1:1189\n332#1:1191,8\n386#1:1201,6\n386#1:1208,3\n386#1:1212,9\n399#1:1221,6\n399#1:1228,3\n399#1:1232,9\n411#1:1241,6\n411#1:1248,3\n411#1:1252,9\n421#1:1261,4\n421#1:1265,6\n421#1:1272,3\n421#1:1276,2\n421#1:1278,2\n421#1:1280,6\n421#1:1286\n431#1:1287,4\n431#1:1291,6\n431#1:1298,3\n431#1:1302,2\n431#1:1304,2\n431#1:1306,6\n431#1:1312\n447#1:1313,4\n447#1:1317,6\n447#1:1324,3\n447#1:1328,2\n447#1:1330,2\n447#1:1332,6\n447#1:1338\n457#1:1339\n457#1:1343\n457#1:1345,2\n457#1:1348,4\n457#1:1355\n457#1:1359\n457#1:1361\n457#1:1364,4\n457#1:1369\n457#1:1371,8\n463#1:1379\n463#1:1383\n463#1:1385,2\n463#1:1388,4\n463#1:1395\n463#1:1399\n463#1:1401\n463#1:1404,4\n463#1:1409\n463#1:1411,8\n470#1:1419,3\n470#1:1422,6\n470#1:1429,3\n470#1:1433,2\n470#1:1435,2\n470#1:1437,6\n470#1:1443\n494#1:1444,4\n494#1:1448,6\n494#1:1455,3\n494#1:1459,2\n494#1:1461,2\n494#1:1463,6\n494#1:1469\n529#1:1470,4\n529#1:1474,6\n529#1:1481,3\n529#1:1485,2\n529#1:1487,2\n529#1:1489,6\n529#1:1495\n529#1:1496,4\n529#1:1500,6\n529#1:1507,3\n529#1:1511,2\n529#1:1513,2\n529#1:1515,6\n529#1:1521\n550#1:1522,4\n550#1:1526,6\n550#1:1533,3\n550#1:1537,2\n550#1:1539,2\n550#1:1541,6\n550#1:1547\n576#1:1548,4\n576#1:1552,6\n576#1:1559,3\n576#1:1563,2\n576#1:1565,2\n576#1:1567,6\n576#1:1573\n602#1:1574,4\n602#1:1578,6\n602#1:1585,3\n602#1:1589,2\n602#1:1591,2\n602#1:1593,6\n602#1:1599\n-1#1:1616,11\n-1#1:1627,4\n-1#1:1631,6\n-1#1:1638,3\n-1#1:1642,2\n-1#1:1644\n-1#1:1645,10\n-1#1:1655\n-1#1:1656,6\n-1#1:1662\n-1#1:1663,2\n-1#1:1665,11\n-1#1:1676,4\n-1#1:1680,6\n-1#1:1687,3\n-1#1:1691,2\n-1#1:1693\n-1#1:1694,10\n-1#1:1704\n-1#1:1705,6\n-1#1:1711\n-1#1:1712,2\n-1#1:1714,11\n-1#1:1725,4\n-1#1:1729,6\n-1#1:1736,3\n-1#1:1740,2\n-1#1:1742\n-1#1:1743,10\n-1#1:1753\n-1#1:1754,6\n-1#1:1760\n-1#1:1761,2\n-1#1:1763,11\n-1#1:1774,4\n-1#1:1778,6\n-1#1:1785,3\n-1#1:1789,2\n-1#1:1791\n-1#1:1792,10\n-1#1:1802\n-1#1:1803,6\n-1#1:1809\n-1#1:1810,2\n-1#1:1812,11\n-1#1:1823,4\n-1#1:1827,6\n-1#1:1834,3\n-1#1:1838,2\n-1#1:1840\n-1#1:1841,10\n-1#1:1851\n-1#1:1852,6\n-1#1:1858\n-1#1:1859,2\n322#1:1120,3\n332#1:1160,3\n457#1:1340,3\n463#1:1380,3\n620#1:1600,3\n322#1:1124\n322#1:1127\n322#1:1132,3\n322#1:1136,3\n322#1:1140\n322#1:1142\n322#1:1143\n322#1:1148\n322#1:1150\n332#1:1164\n332#1:1167\n332#1:1172,3\n332#1:1176,3\n332#1:1180\n332#1:1182\n332#1:1183\n332#1:1188\n332#1:1190\n360#1:1199\n367#1:1200\n386#1:1207\n386#1:1211\n399#1:1227\n399#1:1231\n411#1:1247\n411#1:1251\n421#1:1271\n421#1:1275\n431#1:1297\n431#1:1301\n447#1:1323\n447#1:1327\n457#1:1344\n457#1:1347\n457#1:1352,3\n457#1:1356,3\n457#1:1360\n457#1:1362\n457#1:1363\n457#1:1368\n457#1:1370\n463#1:1384\n463#1:1387\n463#1:1392,3\n463#1:1396,3\n463#1:1400\n463#1:1402\n463#1:1403\n463#1:1408\n463#1:1410\n470#1:1428\n470#1:1432\n494#1:1454\n494#1:1458\n529#1:1480\n529#1:1484\n529#1:1506\n529#1:1510\n550#1:1532\n550#1:1536\n576#1:1558\n576#1:1562\n602#1:1584\n602#1:1588\n621#1:1603\n624#1:1604\n628#1:1605,3\n629#1:1608,3\n630#1:1611\n631#1:1612\n631#1:1613\n635#1:1614\n638#1:1615\n-1#1:1637\n-1#1:1641\n-1#1:1686\n-1#1:1690\n-1#1:1735\n-1#1:1739\n-1#1:1784\n-1#1:1788\n-1#1:1833\n-1#1:1837\n*E\n"})
public abstract class AbstractC1567y<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dd.g
    @NotNull
    public long[] f87009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dd.g
    @NotNull
    public float[] f87010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dd.g
    @NotNull
    public Object[] f87011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dd.g
    public int f87012d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dd.g
    public int f87013e;

    public /* synthetic */ AbstractC1567y(C4969v c4969v) {
        this();
    }

    public static /* synthetic */ String L(AbstractC1567y abstractC1567y, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
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
        return abstractC1567y.I(charSequence, charSequence2, charSequence6, i10, charSequence5);
    }

    public static /* synthetic */ String M(AbstractC1567y abstractC1567y, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, ed.p pVar, int i11, Object obj) {
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
        float[] fArr = abstractC1567y.f87010b;
        Object[] objArr = abstractC1567y.f87011c;
        long[] jArr3 = abstractC1567y.f87009a;
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
                            i12 = i17;
                            Object obj2 = objArr[i20];
                            if (i15 == i13) {
                                sbA.append(charSequence5);
                                break loop0;
                            }
                            if (i15 != 0) {
                                sbA.append(separator);
                            }
                            jArr2 = jArr3;
                            sbA.append((CharSequence) pVar.invoke(Float.valueOf(f10), obj2));
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
    public final java.lang.String A(@org.jetbrains.annotations.NotNull ed.p<? super java.lang.Float, ? super V, ? extends java.lang.CharSequence> r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "transform"
            kotlin.jvm.internal.G.p(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ""
            r2.<init>(r3)
            float[] r4 = r0.f87010b
            java.lang.Object[] r5 = r0.f87011c
            long[] r6 = r0.f87009a
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
            r17 = r4[r16]
            r8 = r5[r16]
            r16 = r14
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
            java.lang.Float r14 = java.lang.Float.valueOf(r17)
            java.lang.Object r8 = r1.invoke(r14, r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r2.append(r8)
            int r10 = r10 + 1
            goto L6f
        L6d:
            r16 = r14
        L6f:
            long r11 = r11 >> r16
            int r15 = r15 + 1
            r14 = r16
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.AbstractC1567y.A(ed.p):java.lang.String");
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
    public final java.lang.String C(@org.jetbrains.annotations.NotNull java.lang.CharSequence r22, @org.jetbrains.annotations.NotNull ed.p<? super java.lang.Float, ? super V, ? extends java.lang.CharSequence> r23) {
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
            float[] r5 = r0.f87010b
            java.lang.Object[] r6 = r0.f87011c
            long[] r7 = r0.f87009a
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
            r18 = r5[r17]
            r19 = r15
            r15 = r6[r17]
            r0 = -1
            if (r11 != r0) goto L60
            java.lang.String r0 = "..."
            r3.append(r0)
            goto L8d
        L60:
            if (r11 == 0) goto L65
            r3.append(r1)
        L65:
            java.lang.Float r0 = java.lang.Float.valueOf(r18)
            java.lang.Object r0 = r2.invoke(r0, r15)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3.append(r0)
            int r11 = r11 + 1
            goto L77
        L75:
            r19 = r15
        L77:
            long r12 = r12 >> r19
            int r9 = r9 + 1
            r0 = r21
            r15 = r19
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.AbstractC1567y.C(java.lang.CharSequence, ed.p):java.lang.String");
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
    public final java.lang.String E(@org.jetbrains.annotations.NotNull java.lang.CharSequence r21, @org.jetbrains.annotations.NotNull java.lang.CharSequence r22, @org.jetbrains.annotations.NotNull ed.p<? super java.lang.Float, ? super V, ? extends java.lang.CharSequence> r23) {
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
            float[] r4 = r0.f87010b
            java.lang.Object[] r5 = r0.f87011c
            long[] r6 = r0.f87009a
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
            r17 = r4[r16]
            r8 = r5[r16]
            r16 = r14
            r14 = -1
            if (r10 != r14) goto L5b
            java.lang.String r1 = "..."
            r3.append(r1)
            goto L86
        L5b:
            if (r10 == 0) goto L60
            r3.append(r1)
        L60:
            java.lang.Float r14 = java.lang.Float.valueOf(r17)
            java.lang.Object r8 = r2.invoke(r14, r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r3.append(r8)
            int r10 = r10 + 1
            goto L72
        L70:
            r16 = r14
        L72:
            long r11 = r11 >> r16
            int r15 = r15 + 1
            r14 = r16
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.AbstractC1567y.E(java.lang.CharSequence, java.lang.CharSequence, ed.p):java.lang.String");
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
    public final java.lang.String H(@org.jetbrains.annotations.NotNull java.lang.CharSequence r21, @org.jetbrains.annotations.NotNull java.lang.CharSequence r22, @org.jetbrains.annotations.NotNull java.lang.CharSequence r23, int r24, @org.jetbrains.annotations.NotNull ed.p<? super java.lang.Float, ? super V, ? extends java.lang.CharSequence> r25) {
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
            float[] r5 = r0.f87010b
            java.lang.Object[] r6 = r0.f87011c
            long[] r7 = r0.f87009a
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
            r17 = r5[r16]
            r18 = r15
            r15 = r6[r16]
            r0 = r24
            if (r11 != r0) goto L66
            java.lang.String r0 = "..."
            r2.append(r0)
            goto L93
        L66:
            if (r11 == 0) goto L6b
            r2.append(r1)
        L6b:
            java.lang.Float r0 = java.lang.Float.valueOf(r17)
            java.lang.Object r0 = r4.invoke(r0, r15)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.append(r0)
            int r11 = r11 + 1
            goto L7d
        L7b:
            r18 = r15
        L7d:
            long r12 = r12 >> r18
            int r9 = r9 + 1
            r0 = r20
            r15 = r18
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.AbstractC1567y.H(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, ed.p):java.lang.String");
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
        float[] fArr3 = this.f87010b;
        Object[] objArr = this.f87011c;
        long[] jArr = this.f87009a;
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
                            Object obj = objArr[i17];
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
                            sbA.append(obj);
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

    @dd.k
    @NotNull
    public final String J(@NotNull CharSequence charSequence, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10, @NotNull CharSequence charSequence2, @NotNull ed.p<? super Float, ? super V, ? extends CharSequence> pVar) {
        float[] fArr;
        float[] fArr2;
        CharSequence separator = charSequence;
        kotlin.jvm.internal.G.p(separator, "separator");
        kotlin.jvm.internal.G.p(prefix, "prefix");
        kotlin.jvm.internal.G.p(postfix, "postfix");
        StringBuilder sbA = C1542l.a(charSequence2, "truncated", pVar, "transform", prefix);
        float[] fArr3 = this.f87010b;
        Object[] objArr = this.f87011c;
        long[] jArr = this.f87009a;
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
                            float f10 = fArr3[i16];
                            Object obj = objArr[i16];
                            fArr2 = fArr3;
                            if (i12 == i10) {
                                sbA.append(charSequence2);
                                break loop0;
                            }
                            if (i12 != 0) {
                                sbA.append(separator);
                            }
                            sbA.append(pVar.invoke(Float.valueOf(f10), obj));
                            i12++;
                        } else {
                            fArr2 = fArr3;
                        }
                        j10 >>= 8;
                        i15++;
                        separator = charSequence;
                        fArr3 = fArr2;
                    }
                    fArr = fArr3;
                    if (i14 != 8) {
                        break;
                    }
                } else {
                    fArr = fArr3;
                }
                if (i13 == length) {
                    break;
                }
                i11 = i13 + 1;
                separator = charSequence;
                fArr3 = fArr;
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
    public final java.lang.String K(@org.jetbrains.annotations.NotNull java.lang.CharSequence r21, @org.jetbrains.annotations.NotNull java.lang.CharSequence r22, @org.jetbrains.annotations.NotNull java.lang.CharSequence r23, @org.jetbrains.annotations.NotNull ed.p<? super java.lang.Float, ? super V, ? extends java.lang.CharSequence> r24) {
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
            float[] r5 = r0.f87010b
            java.lang.Object[] r6 = r0.f87011c
            long[] r7 = r0.f87009a
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
            r17 = r5[r16]
            r18 = r15
            r15 = r6[r16]
            r0 = -1
            if (r11 != r0) goto L65
            java.lang.String r0 = "..."
            r2.append(r0)
            goto L92
        L65:
            if (r11 == 0) goto L6a
            r2.append(r1)
        L6a:
            java.lang.Float r0 = java.lang.Float.valueOf(r17)
            java.lang.Object r0 = r4.invoke(r0, r15)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.append(r0)
            int r11 = r11 + 1
            goto L7c
        L7a:
            r18 = r15
        L7c:
            long r12 = r12 >> r18
            int r9 = r9 + 1
            r0 = r20
            r15 = r18
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.AbstractC1567y.K(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, ed.p):java.lang.String");
    }

    public final boolean N() {
        return this.f87013e == 0;
    }

    public final boolean a(@NotNull ed.p<? super Float, ? super V, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        float[] fArr = this.f87010b;
        Object[] objArr = this.f87011c;
        long[] jArr = this.f87009a;
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
                        if (!predicate.invoke(Float.valueOf(fArr[i13]), objArr[i13]).booleanValue()) {
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
        return this.f87013e != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(@org.jetbrains.annotations.NotNull ed.p<? super java.lang.Float, ? super V, java.lang.Boolean> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.G.p(r1, r2)
            float[] r2 = r0.f87010b
            java.lang.Object[] r3 = r0.f87011c
            long[] r4 = r0.f87009a
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
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.AbstractC1567y.c(ed.p):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(float r17) {
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
            if (r6 == 0) goto L6d
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            return r11
        L6c:
            return r4
        L6d:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.AbstractC1567y.d(float):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(float r17) {
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
            if (r6 == 0) goto L6d
            r10 = -1
        L69:
            if (r10 < 0) goto L6c
            return r11
        L6c:
            return r4
        L6d:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.AbstractC1567y.e(float):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
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
            boolean r3 = r1 instanceof androidx.collection.AbstractC1567y
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            androidx.collection.y r1 = (androidx.collection.AbstractC1567y) r1
            int r3 = r1.f87013e
            int r5 = r0.f87013e
            if (r3 == r5) goto L17
            return r4
        L17:
            float[] r3 = r0.f87010b
            java.lang.Object[] r5 = r0.f87011c
            long[] r6 = r0.f87009a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L74
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
            if (r11 == 0) goto L6f
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L6d
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L69
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            if (r14 != 0) goto L5e
            java.lang.Object r14 = r1.n(r15)
            if (r14 != 0) goto L5d
            boolean r14 = r1.e(r15)
            if (r14 != 0) goto L69
        L5d:
            return r4
        L5e:
            java.lang.Object r15 = r1.n(r15)
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L69
            return r4
        L69:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L6d:
            if (r11 != r12) goto L74
        L6f:
            if (r8 == r7) goto L74
            int r8 = r8 + 1
            goto L23
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.AbstractC1567y.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(V r15) {
        /*
            r14 = this;
            java.lang.Object[] r0 = r14.f87011c
            long[] r1 = r14.f87009a
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L48
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
            if (r7 == 0) goto L43
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L25:
            if (r9 >= r7) goto L41
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L3d
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            boolean r10 = kotlin.jvm.internal.G.g(r15, r10)
            if (r10 == 0) goto L3d
            r15 = 1
            return r15
        L3d:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L25
        L41:
            if (r7 != r8) goto L48
        L43:
            if (r4 == r2) goto L48
            int r4 = r4 + 1
            goto Lb
        L48:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.AbstractC1567y.f(java.lang.Object):boolean");
    }

    public final int g() {
        return this.f87013e;
    }

    public final int h(@NotNull ed.p<? super Float, ? super V, Boolean> predicate) {
        kotlin.jvm.internal.G.p(predicate, "predicate");
        float[] fArr = this.f87010b;
        Object[] objArr = this.f87011c;
        long[] jArr = this.f87009a;
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
                        if (predicate.invoke(Float.valueOf(fArr[i14]), objArr[i14]).booleanValue()) {
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
        float[] fArr = this.f87010b;
        Object[] objArr = this.f87011c;
        long[] jArr = this.f87009a;
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
                        int i13 = (i10 << 3) + i12;
                        float f10 = fArr[i13];
                        Object obj = objArr[i13];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Float.floatToIntBits(f10);
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

    public final int i(float f10) {
        int iFloatToIntBits = Float.floatToIntBits(f10) * S0.f86834j;
        int i10 = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i11 = i10 & 127;
        int i12 = this.f87012d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f87009a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * S0.f86835k) ^ j10;
            for (long j12 = (~j11) & (j11 - S0.f86835k) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.f87010b[iNumberOfTrailingZeros] == f10) {
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

    public final void j(@NotNull ed.p<? super Float, ? super V, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        float[] fArr = this.f87010b;
        Object[] objArr = this.f87011c;
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
                        block.invoke(Float.valueOf(fArr[i13]), objArr[i13]);
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
        float[] fArr = this.f87010b;
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

    public final void m(@NotNull ed.l<? super V, kotlin.L0> block) {
        kotlin.jvm.internal.G.p(block, "block");
        Object[] objArr = this.f87011c;
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
    public final V n(float r14) {
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
            java.lang.Object[] r14 = r13.f87011c
            r14 = r14[r10]
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.AbstractC1567y.n(float):java.lang.Object");
    }

    public final int o() {
        return this.f87012d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V r(float r14, V r15) {
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
            if (r4 == 0) goto L6e
            r10 = -1
        L66:
            if (r10 < 0) goto L6d
            java.lang.Object[] r14 = r13.f87011c
            r14 = r14[r10]
            return r14
        L6d:
            return r15
        L6e:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.AbstractC1567y.r(float, java.lang.Object):java.lang.Object");
    }

    public final V s(float f10, @NotNull InterfaceC4376a<? extends V> defaultValue) {
        kotlin.jvm.internal.G.p(defaultValue, "defaultValue");
        V vN = n(f10);
        return vN == null ? defaultValue.invoke() : vN;
    }

    public final int t() {
        return this.f87013e;
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
            float[] r2 = r0.f87010b
            java.lang.Object[] r3 = r0.f87011c
            long[] r4 = r0.f87009a
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
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            if (r14 != r0) goto L58
            java.lang.String r14 = "(this)"
        L58:
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f87013e
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.AbstractC1567y.toString():java.lang.String");
    }

    public final boolean x() {
        return this.f87013e == 0;
    }

    public final boolean y() {
        return this.f87013e != 0;
    }

    @dd.k
    @NotNull
    public final String z() {
        return L(this, null, null, null, 0, null, 31, null);
    }

    public AbstractC1567y() {
        this.f87009a = S0.f86829e;
        this.f87010b = B.g();
        this.f87011c = A.a.f13c;
    }
}
