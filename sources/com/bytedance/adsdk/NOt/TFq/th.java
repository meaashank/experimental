package com.bytedance.adsdk.NOt.TFq;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class th {
    public static com.bytedance.adsdk.NOt.mZ.NOt.ZH ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.sAl<PointF, PointF> salNOt = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.Ht htMZ = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOtZRu = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "p":
                    salNOt = ZRu.NOt(jsonReader, mm);
                    break;
                case "r":
                    nOtZRu = uR.ZRu(jsonReader, mm);
                    break;
                case "s":
                    htMZ = uR.mZ(jsonReader, mm);
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
        return new com.bytedance.adsdk.NOt.mZ.NOt.ZH(strNextString, salNOt, htMZ, nOtZRu, zNextBoolean);
    }
}
