package com.bytedance.adsdk.NOt.TFq;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class WD {
    public static com.bytedance.adsdk.NOt.mZ.NOt.lp ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOtZRu = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOtZRu2 = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.lp lpVarZRu = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "c":
                    nOtZRu = uR.ZRu(jsonReader, mm, false);
                    break;
                case "o":
                    nOtZRu2 = uR.ZRu(jsonReader, mm, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "tr":
                    lpVarZRu = mZ.ZRu(jsonReader, mm);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.NOt.mZ.NOt.lp(strNextString, nOtZRu, nOtZRu2, lpVarZRu, zNextBoolean);
    }
}
