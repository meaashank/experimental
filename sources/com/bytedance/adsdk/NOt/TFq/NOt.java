package com.bytedance.adsdk.NOt.TFq;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    private static com.bytedance.adsdk.NOt.mZ.ZRu.ZH NOt(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.NOt.mZ.ZRu.ZRu zRuMm = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.ZRu zRuMm2 = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOtZRu = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOtZRu2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "t":
                    nOtZRu2 = uR.ZRu(jsonReader, mm);
                    break;
                case "fc":
                    zRuMm = uR.Mm(jsonReader, mm);
                    break;
                case "sc":
                    zRuMm2 = uR.Mm(jsonReader, mm);
                    break;
                case "sw":
                    nOtZRu = uR.ZRu(jsonReader, mm);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.NOt.mZ.ZRu.ZH(zRuMm, zRuMm2, nOtZRu, nOtZRu2);
    }

    public static com.bytedance.adsdk.NOt.mZ.ZRu.ZH ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.NOt.mZ.ZRu.ZH zhNOt = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("a")) {
                zhNOt = NOt(jsonReader, mm);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return zhNOt == null ? new com.bytedance.adsdk.NOt.mZ.ZRu.ZH(null, null, null, null) : zhNOt;
    }
}
