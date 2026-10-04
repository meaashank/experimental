package com.bytedance.adsdk.NOt.TFq;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
class yBV {
    public static com.bytedance.adsdk.NOt.mZ.NOt.TFq ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        int iNextInt;
        com.bytedance.adsdk.NOt.mZ.ZRu.uR uRVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strNextString = null;
        com.bytedance.adsdk.NOt.mZ.NOt.Mm mm2 = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.mZ mZVarZRu = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.Ht htMZ = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.Ht htMZ2 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            iNextInt = -1;
            switch (strNextName) {
                case "e":
                    htMZ2 = uR.mZ(jsonReader, mm);
                    break;
                case "g":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("k")) {
                            mZVarZRu = uR.ZRu(jsonReader, mm, iNextInt);
                        } else if (strNextName2.equals("p")) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "o":
                    uRVar = uR.NOt(jsonReader, mm);
                    break;
                case "r":
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case "s":
                    htMZ = uR.mZ(jsonReader, mm);
                    break;
                case "t":
                    mm2 = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.NOt.mZ.NOt.Mm.LINEAR : com.bytedance.adsdk.NOt.mZ.NOt.Mm.RADIAL;
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (uRVar == null) {
            uRVar = new com.bytedance.adsdk.NOt.mZ.ZRu.uR(Collections.singletonList(new com.bytedance.adsdk.NOt.Mm.ZRu(100)));
        }
        return new com.bytedance.adsdk.NOt.mZ.NOt.TFq(strNextString, mm2, fillType, mZVarZRu, uRVar, htMZ, htMZ2, null, null, zNextBoolean);
    }
}
