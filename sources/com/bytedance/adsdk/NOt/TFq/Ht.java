package com.bytedance.adsdk.NOt.TFq;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class Ht {
    public static com.bytedance.adsdk.NOt.mZ.NOt.NOt ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm, int i10) throws IOException {
        boolean z10 = i10 == 3;
        boolean zNextBoolean = false;
        String strNextString = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.sAl<PointF, PointF> salNOt = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.Ht htMZ = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "d":
                    if (jsonReader.nextInt() != 3) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                    break;
                case "p":
                    salNOt = ZRu.NOt(jsonReader, mm);
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
        return new com.bytedance.adsdk.NOt.mZ.NOt.NOt(strNextString, salNOt, htMZ, z10, zNextBoolean);
    }
}
