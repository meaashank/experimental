package com.bytedance.adsdk.NOt.TFq;

import android.util.JsonReader;
import com.bytedance.adsdk.NOt.mZ.NOt.om;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class Vr {
    public static com.bytedance.adsdk.NOt.mZ.NOt.om ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        String strNextString = null;
        om.ZRu ZRu = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOtZRu = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOtZRu2 = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOtZRu3 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "e":
                    nOtZRu2 = uR.ZRu(jsonReader, mm, false);
                    break;
                case "m":
                    ZRu = om.ZRu.ZRu(jsonReader.nextInt());
                    break;
                case "o":
                    nOtZRu3 = uR.ZRu(jsonReader, mm, false);
                    break;
                case "s":
                    nOtZRu = uR.ZRu(jsonReader, mm, false);
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
        return new com.bytedance.adsdk.NOt.mZ.NOt.om(strNextString, ZRu, nOtZRu, nOtZRu2, nOtZRu3, zNextBoolean);
    }
}
