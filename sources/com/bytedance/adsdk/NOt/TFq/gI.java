package com.bytedance.adsdk.NOt.TFq;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
class gI {
    public static com.bytedance.adsdk.NOt.mZ.NOt.oK ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        com.bytedance.adsdk.NOt.mZ.ZRu.uR uRVar = null;
        String strNextString = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.ZRu zRuMm = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        int iNextInt = 1;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "fillEnabled":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "c":
                    zRuMm = uR.Mm(jsonReader, mm);
                    break;
                case "o":
                    uRVar = uR.NOt(jsonReader, mm);
                    break;
                case "r":
                    iNextInt = jsonReader.nextInt();
                    break;
                case "hd":
                    zNextBoolean2 = jsonReader.nextBoolean();
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
        return new com.bytedance.adsdk.NOt.mZ.NOt.oK(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, zRuMm, uRVar, zNextBoolean2);
    }
}
