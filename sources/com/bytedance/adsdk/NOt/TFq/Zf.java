package com.bytedance.adsdk.NOt.TFq;

import K9.h;
import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import com.bytedance.adsdk.NOt.Mm;
import com.bytedance.adsdk.NOt.aT;
import com.bytedance.adsdk.NOt.mZ.mZ.TFq;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class Zf {
    private static Map<String, Object> NOt(JsonReader jsonReader) throws IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("lottie_back")) {
                HashMap map2 = new HashMap();
                map.put("lottie_back", map2);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("hd")) {
                        map2.put("hd", Integer.valueOf(jsonReader.nextInt()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return map;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static com.bytedance.adsdk.NOt.Mm ZRu(JsonReader jsonReader) throws IOException {
        float f10;
        float fZRu = com.bytedance.adsdk.NOt.Ht.Ht.ZRu();
        LongSparseArray<com.bytedance.adsdk.NOt.mZ.mZ.TFq> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArray<com.bytedance.adsdk.NOt.mZ.uR> sparseArray = new SparseArray<>();
        Mm.mZ mZVar = new Mm.mZ();
        Mm.ZRu zRu = new Mm.ZRu();
        Mm.NOt nOt = new Mm.NOt();
        com.bytedance.adsdk.NOt.Mm mm = new com.bytedance.adsdk.NOt.Mm();
        jsonReader.beginObject();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        String strNextString = null;
        int iNextInt = 0;
        int iNextInt2 = 0;
        float fNextDouble3 = 0.0f;
        while (jsonReader.hasNext()) {
            float f11 = fNextDouble;
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b10 = -1;
            switch (strNextName.hashCode()) {
                case -1408207997:
                    f10 = fNextDouble3;
                    if (strNextName.equals("assets")) {
                        b10 = 0;
                    }
                    break;
                case -1109732030:
                    f10 = fNextDouble3;
                    if (strNextName.equals("layers")) {
                        b10 = 1;
                    }
                    break;
                case -865448777:
                    f10 = fNextDouble3;
                    if (strNextName.equals("globalEvent")) {
                        b10 = 2;
                    }
                    break;
                case 104:
                    f10 = fNextDouble3;
                    if (strNextName.equals(h.f58477a)) {
                        b10 = 3;
                    }
                    break;
                case 118:
                    f10 = fNextDouble3;
                    if (strNextName.equals("v")) {
                        b10 = 4;
                    }
                    break;
                case 119:
                    f10 = fNextDouble3;
                    if (strNextName.equals("w")) {
                        b10 = 5;
                    }
                    break;
                case 3208:
                    f10 = fNextDouble3;
                    if (strNextName.equals("dl")) {
                        b10 = 6;
                    }
                    break;
                case 3276:
                    f10 = fNextDouble3;
                    if (strNextName.equals("fr")) {
                        b10 = 7;
                    }
                    break;
                case 3292:
                    f10 = fNextDouble3;
                    if (strNextName.equals("gc")) {
                        b10 = 8;
                    }
                    break;
                case 3367:
                    f10 = fNextDouble3;
                    if (strNextName.equals("ip")) {
                        b10 = 9;
                    }
                    break;
                case 3553:
                    f10 = fNextDouble3;
                    if (strNextName.equals("op")) {
                        b10 = 10;
                    }
                    break;
                case 94623709:
                    f10 = fNextDouble3;
                    if (strNextName.equals("chars")) {
                        b10 = 11;
                    }
                    break;
                case 97615364:
                    f10 = fNextDouble3;
                    if (strNextName.equals("fonts")) {
                        b10 = 12;
                    }
                    break;
                case 110364485:
                    f10 = fNextDouble3;
                    if (strNextName.equals("timer")) {
                        b10 = 13;
                    }
                    break;
                case 839250809:
                    f10 = fNextDouble3;
                    if (strNextName.equals("markers")) {
                        b10 = Ascii.SO;
                    }
                    break;
                default:
                    f10 = fNextDouble3;
                    break;
            }
            switch (b10) {
                case 0:
                    ZRu(jsonReader, mm, map, map2);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 1:
                    ZRu(jsonReader, mm, arrayList, longSparseArray);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 2:
                    ZRu(jsonReader, nOt);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 3:
                    iNextInt = jsonReader.nextInt();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 4:
                    String[] strArrSplit = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.NOt.Ht.Ht.ZRu(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        mm.ZRu("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 5:
                    iNextInt2 = jsonReader.nextInt();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 6:
                    strNextString = jsonReader.nextString();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 7:
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 8:
                    ZRu(jsonReader, zRu);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 9:
                    fNextDouble = (float) jsonReader.nextDouble();
                    fNextDouble3 = f10;
                    break;
                case 10:
                    fNextDouble3 = ((float) jsonReader.nextDouble()) - 0.01f;
                    fNextDouble = f11;
                    break;
                case 11:
                    ZRu(jsonReader, mm, sparseArray);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 12:
                    ZRu(jsonReader, map3);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 13:
                    ZRu(jsonReader, mZVar);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 14:
                    ZRu(jsonReader, arrayList2);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                default:
                    jsonReader.skipValue();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
            }
        }
        jsonReader.endObject();
        mm.ZRu(new Rect(0, 0, (int) (iNextInt2 * fZRu), (int) (iNextInt * fZRu)), fNextDouble, fNextDouble3, fNextDouble2, arrayList, longSparseArray, map, map2, sparseArray, map3, arrayList2, mZVar, strNextString, zRu, nOt);
        return mm;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<com.bytedance.adsdk.NOt.aT.ZRu> mZ(android.util.JsonReader r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lc4
            r0.<init>()     // Catch: java.lang.Exception -> Lc4
        L5:
            boolean r1 = r10.hasNext()     // Catch: java.lang.Exception -> Lc4
            if (r1 == 0) goto Lc3
            com.bytedance.adsdk.NOt.aT$ZRu r1 = new com.bytedance.adsdk.NOt.aT$ZRu     // Catch: java.lang.Exception -> Lc4
            r1.<init>()     // Catch: java.lang.Exception -> Lc4
            r10.beginObject()     // Catch: java.lang.Exception -> Lc4
        L13:
            boolean r2 = r10.hasNext()     // Catch: java.lang.Exception -> Lc4
            if (r2 == 0) goto Lbb
            java.lang.String r2 = r10.nextName()     // Catch: java.lang.Exception -> Lc4
            int r3 = r2.hashCode()     // Catch: java.lang.Exception -> Lc4
            r4 = 99
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 5
            r9 = 1
            if (r3 == r4) goto L71
            r4 = 102(0x66, float:1.43E-43)
            if (r3 == r4) goto L67
            r4 = 108(0x6c, float:1.51E-43)
            if (r3 == r4) goto L5d
            r4 = 115(0x73, float:1.61E-43)
            if (r3 == r4) goto L53
            r4 = 3153(0xc51, float:4.418E-42)
            if (r3 == r4) goto L49
            r4 = 3449(0xd79, float:4.833E-42)
            if (r3 == r4) goto L3f
            goto L7b
        L3f:
            java.lang.String r3 = "le"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lc4
            if (r2 == 0) goto L7b
            r2 = r9
            goto L7c
        L49:
            java.lang.String r3 = "bs"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lc4
            if (r2 == 0) goto L7b
            r2 = r8
            goto L7c
        L53:
            java.lang.String r3 = "s"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lc4
            if (r2 == 0) goto L7b
            r2 = r7
            goto L7c
        L5d:
            java.lang.String r3 = "l"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lc4
            if (r2 == 0) goto L7b
            r2 = 0
            goto L7c
        L67:
            java.lang.String r3 = "f"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lc4
            if (r2 == 0) goto L7b
            r2 = r6
            goto L7c
        L71:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> Lc4
            if (r2 == 0) goto L7b
            r2 = r5
            goto L7c
        L7b:
            r2 = -1
        L7c:
            if (r2 == 0) goto Lb3
            if (r2 == r9) goto Lab
            if (r2 == r7) goto La3
            if (r2 == r5) goto L9b
            if (r2 == r6) goto L93
            if (r2 == r8) goto L8c
            r10.skipValue()     // Catch: java.lang.Exception -> Lc4
            goto L13
        L8c:
            int r2 = r10.nextInt()     // Catch: java.lang.Exception -> Lc4
            r1.Ht = r2     // Catch: java.lang.Exception -> Lc4
            goto L13
        L93:
            java.lang.String r2 = r10.nextString()     // Catch: java.lang.Exception -> Lc4
            r1.uR = r2     // Catch: java.lang.Exception -> Lc4
            goto L13
        L9b:
            java.lang.String r2 = r10.nextString()     // Catch: java.lang.Exception -> Lc4
            r1.mZ = r2     // Catch: java.lang.Exception -> Lc4
            goto L13
        La3:
            int r2 = r10.nextInt()     // Catch: java.lang.Exception -> Lc4
            r1.TFq = r2     // Catch: java.lang.Exception -> Lc4
            goto L13
        Lab:
            int r2 = r10.nextInt()     // Catch: java.lang.Exception -> Lc4
            r1.NOt = r2     // Catch: java.lang.Exception -> Lc4
            goto L13
        Lb3:
            int r2 = r10.nextInt()     // Catch: java.lang.Exception -> Lc4
            r1.ZRu = r2     // Catch: java.lang.Exception -> Lc4
            goto L13
        Lbb:
            r10.endObject()     // Catch: java.lang.Exception -> Lc4
            r0.add(r1)     // Catch: java.lang.Exception -> Lc4
            goto L5
        Lc3:
            return r0
        Lc4:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.NOt.TFq.Zf.mZ(android.util.JsonReader):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ZRu(android.util.JsonReader r6, com.bytedance.adsdk.NOt.Mm.NOt r7) {
        /*
            r6.beginObject()     // Catch: java.lang.Exception -> L79
        L3:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L76
            java.lang.String r0 = r6.nextName()     // Catch: java.lang.Exception -> L79
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L79
            r2 = 3239(0xca7, float:4.539E-42)
            r3 = 1
            r4 = 0
            r5 = -1
            if (r1 == r2) goto L28
            r2 = 3237004(0x31648c, float:4.536009E-39)
            if (r1 == r2) goto L1e
            goto L32
        L1e:
            java.lang.String r1 = "inel"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L32
            r0 = r4
            goto L33
        L28:
            java.lang.String r1 = "el"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L32
            r0 = r3
            goto L33
        L32:
            r0 = r5
        L33:
            if (r0 == 0) goto L42
            if (r0 == r3) goto L3b
            r6.skipValue()     // Catch: java.lang.Exception -> L79
            goto L3
        L3b:
            java.lang.String r0 = r6.nextString()     // Catch: java.lang.Exception -> L79
            r7.ZRu = r0     // Catch: java.lang.Exception -> L79
            goto L3
        L42:
            int[] r0 = new int[]{r5, r5}     // Catch: java.lang.Exception -> L79
            int[][] r1 = new int[r3][]     // Catch: java.lang.Exception -> L79
            r1[r4] = r0     // Catch: java.lang.Exception -> L79
            r7.NOt = r1     // Catch: java.lang.Exception -> L79
            r6.beginArray()     // Catch: java.lang.Exception -> L79
            boolean r0 = r6.hasNext()     // Catch: java.lang.Exception -> L79
            if (r0 == 0) goto L72
            r6.beginArray()     // Catch: java.lang.Exception -> L79
            r0 = r4
        L59:
            r1 = 2
            if (r0 >= r1) goto L6f
            boolean r1 = r6.hasNext()     // Catch: java.lang.Exception -> L79
            if (r1 == 0) goto L6c
            int[][] r1 = r7.NOt     // Catch: java.lang.Exception -> L79
            r1 = r1[r4]     // Catch: java.lang.Exception -> L79
            int r2 = r6.nextInt()     // Catch: java.lang.Exception -> L79
            r1[r0] = r2     // Catch: java.lang.Exception -> L79
        L6c:
            int r0 = r0 + 1
            goto L59
        L6f:
            r6.endArray()     // Catch: java.lang.Exception -> L79
        L72:
            r6.endArray()     // Catch: java.lang.Exception -> L79
            goto L3
        L76:
            r6.endObject()     // Catch: java.lang.Exception -> L79
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.NOt.TFq.Zf.ZRu(android.util.JsonReader, com.bytedance.adsdk.NOt.Mm$NOt):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ZRu(android.util.JsonReader r5, com.bytedance.adsdk.NOt.Mm.ZRu r6) {
        /*
            r5.beginObject()     // Catch: java.lang.Exception -> L61
        L3:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L5e
            java.lang.String r0 = r5.nextName()     // Catch: java.lang.Exception -> L61
            int r1 = r0.hashCode()     // Catch: java.lang.Exception -> L61
            r2 = 3139(0xc43, float:4.399E-42)
            r3 = 1
            r4 = 2
            if (r1 == r2) goto L34
            r2 = 3232(0xca0, float:4.529E-42)
            if (r1 == r2) goto L2a
            r2 = 3666(0xe52, float:5.137E-42)
            if (r1 == r2) goto L20
            goto L3e
        L20:
            java.lang.String r1 = "se"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L3e
            r0 = 0
            goto L3f
        L2a:
            java.lang.String r1 = "ee"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L3e
            r0 = r4
            goto L3f
        L34:
            java.lang.String r1 = "be"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L3e
            r0 = r3
            goto L3f
        L3e:
            r0 = -1
        L3f:
            if (r0 == 0) goto L57
            if (r0 == r3) goto L50
            if (r0 == r4) goto L49
            r5.skipValue()     // Catch: java.lang.Exception -> L61
            goto L3
        L49:
            java.util.Map r0 = NOt(r5)     // Catch: java.lang.Exception -> L61
            r6.mZ = r0     // Catch: java.lang.Exception -> L61
            goto L3
        L50:
            java.util.Map r0 = NOt(r5)     // Catch: java.lang.Exception -> L61
            r6.NOt = r0     // Catch: java.lang.Exception -> L61
            goto L3
        L57:
            int r0 = r5.nextInt()     // Catch: java.lang.Exception -> L61
            r6.ZRu = r0     // Catch: java.lang.Exception -> L61
            goto L3
        L5e:
            r5.endObject()     // Catch: java.lang.Exception -> L61
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.NOt.TFq.Zf.ZRu(android.util.JsonReader, com.bytedance.adsdk.NOt.Mm$ZRu):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void ZRu(android.util.JsonReader r10, com.bytedance.adsdk.NOt.Mm.mZ r11) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.NOt.TFq.Zf.ZRu(android.util.JsonReader, com.bytedance.adsdk.NOt.Mm$mZ):void");
    }

    private static void ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm, List<com.bytedance.adsdk.NOt.mZ.mZ.TFq> list, LongSparseArray<com.bytedance.adsdk.NOt.mZ.mZ.TFq> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.NOt.mZ.mZ.TFq tFqZRu = xY.ZRu(jsonReader, mm);
            tFqZRu.ZH();
            TFq.ZRu zRu = TFq.ZRu.IMAGE;
            list.add(tFqZRu);
            longSparseArray.put(tFqZRu.TFq(), tFqZRu);
        }
        jsonReader.endArray();
    }

    private static void ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm, Map<String, List<com.bytedance.adsdk.NOt.mZ.mZ.TFq>> map, Map<String, com.bytedance.adsdk.NOt.aT> map2) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            String strNextString4 = null;
            List<aT.ZRu> listMZ = null;
            String strNextString5 = null;
            int[][] iArr = null;
            int iNextInt = 0;
            int iNextInt2 = 0;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "layers":
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.NOt.mZ.mZ.TFq tFqZRu = xY.ZRu(jsonReader, mm);
                            longSparseArray.put(tFqZRu.TFq(), tFqZRu);
                            arrayList.add(tFqZRu);
                        }
                        jsonReader.endArray();
                        break;
                    case "h":
                        iNextInt2 = jsonReader.nextInt();
                        break;
                    case "p":
                        strNextString2 = jsonReader.nextString();
                        break;
                    case "u":
                        strNextString3 = jsonReader.nextString();
                        break;
                    case "w":
                        iNextInt = jsonReader.nextInt();
                        break;
                    case "el":
                        strNextString5 = jsonReader.nextString();
                        break;
                    case "id":
                        strNextString = jsonReader.nextString();
                        break;
                    case "tc":
                        jsonReader.beginArray();
                        listMZ = mZ(jsonReader);
                        jsonReader.endArray();
                        break;
                    case "rel":
                        strNextString4 = jsonReader.nextString();
                        break;
                    case "inel":
                        iArr = new int[][]{new int[]{-1, -1}};
                        jsonReader.beginArray();
                        if (jsonReader.hasNext()) {
                            jsonReader.beginArray();
                            for (int i10 = 0; i10 < 2; i10++) {
                                if (jsonReader.hasNext()) {
                                    iArr[0][i10] = jsonReader.nextInt();
                                }
                            }
                            jsonReader.endArray();
                        }
                        jsonReader.endArray();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (strNextString2 != null) {
                com.bytedance.adsdk.NOt.aT aTVar = new com.bytedance.adsdk.NOt.aT(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3, strNextString4, listMZ, strNextString5, iArr);
                map2.put(aTVar.Mm(), aTVar);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        jsonReader.endArray();
    }

    private static void ZRu(JsonReader jsonReader, Map<String, com.bytedance.adsdk.NOt.mZ.mZ> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.NOt.mZ.mZ mZVarZRu = edo.ZRu(jsonReader);
                    map.put(mZVarZRu.NOt(), mZVarZRu);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm, SparseArray<com.bytedance.adsdk.NOt.mZ.uR> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.NOt.mZ.uR uRVarZRu = sAl.ZRu(jsonReader, mm);
            sparseArray.put(uRVarZRu.hashCode(), uRVarZRu);
        }
        jsonReader.endArray();
    }

    private static void ZRu(JsonReader jsonReader, List<com.bytedance.adsdk.NOt.mZ.Ht> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float fNextDouble = 0.0f;
            String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "cm":
                        strNextString = jsonReader.nextString();
                        break;
                    case "dr":
                        fNextDouble2 = (float) jsonReader.nextDouble();
                        break;
                    case "tm":
                        fNextDouble = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.NOt.mZ.Ht(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.endArray();
    }
}
