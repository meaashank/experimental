package com.bytedance.adsdk.NOt.TFq;

import android.util.JsonReader;
import com.bytedance.adsdk.NOt.mZ.NOt.qF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
class AK {
    public static com.bytedance.adsdk.NOt.mZ.NOt.qF ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        int i10;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOtZRu;
        int i11;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        com.bytedance.adsdk.NOt.mZ.ZRu.uR uRVar = null;
        String strNextString = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOt = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.ZRu zRuMm = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOtZRu2 = null;
        qF.ZRu zRu = null;
        qF.NOt nOt2 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            i10 = 1;
            switch (strNextName) {
                case "c":
                    zRuMm = uR.Mm(jsonReader, mm);
                    continue;
                    break;
                case "d":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String strNextString2 = null;
                        nOtZRu = null;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals("n")) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                nOtZRu = uR.ZRu(jsonReader, mm);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        strNextString2.getClass();
                        switch (strNextString2) {
                            case "d":
                            case "g":
                                i11 = 1;
                                mm.ZRu(true);
                                arrayList.add(nOtZRu);
                                i10 = i11;
                                break;
                            case "o":
                                nOt = nOtZRu;
                                i10 = 1;
                                break;
                            default:
                                i11 = 1;
                                i10 = i11;
                                break;
                        }
                    }
                    int i12 = i10;
                    jsonReader.endArray();
                    if (arrayList.size() != i12) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                    break;
                case "o":
                    uRVar = uR.NOt(jsonReader, mm);
                    continue;
                    break;
                case "w":
                    nOtZRu2 = uR.ZRu(jsonReader, mm);
                    continue;
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    continue;
                    break;
                case "lc":
                    zRu = qF.ZRu.values()[jsonReader.nextInt() - 1];
                    continue;
                    break;
                case "lj":
                    nOt2 = qF.NOt.values()[jsonReader.nextInt() - 1];
                    continue;
                    break;
                case "ml":
                    fNextDouble = (float) jsonReader.nextDouble();
                    continue;
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    continue;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (uRVar == null) {
            uRVar = new com.bytedance.adsdk.NOt.mZ.ZRu.uR(Collections.singletonList(new com.bytedance.adsdk.NOt.Mm.ZRu(100)));
        }
        return new com.bytedance.adsdk.NOt.mZ.NOt.qF(strNextString, nOt, arrayList, zRuMm, uRVar, nOtZRu2, zRu, nOt2, fNextDouble, zNextBoolean);
    }
}
