package com.bytedance.adsdk.NOt.TFq;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.NOt.mZ.NOt.aT;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class VdW {
    public static com.bytedance.adsdk.NOt.mZ.NOt.aT ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm, int i10) throws IOException {
        boolean zNextBoolean = false;
        boolean z10 = i10 == 3;
        String strNextString = null;
        aT.ZRu ZRu = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOtZRu = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.sAl<PointF, PointF> salNOt = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOtZRu2 = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOtZRu3 = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOtZRu4 = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOtZRu5 = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOtZRu6 = null;
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
                case "r":
                    nOtZRu2 = uR.ZRu(jsonReader, mm, false);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ir":
                    nOtZRu3 = uR.ZRu(jsonReader, mm);
                    break;
                case "is":
                    nOtZRu5 = uR.ZRu(jsonReader, mm, false);
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                case "or":
                    nOtZRu4 = uR.ZRu(jsonReader, mm);
                    break;
                case "os":
                    nOtZRu6 = uR.ZRu(jsonReader, mm, false);
                    break;
                case "pt":
                    nOtZRu = uR.ZRu(jsonReader, mm, false);
                    break;
                case "sy":
                    ZRu = aT.ZRu.ZRu(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.NOt.mZ.NOt.aT(strNextString, ZRu, nOtZRu, salNOt, nOtZRu2, nOtZRu3, nOtZRu4, nOtZRu5, nOtZRu6, zNextBoolean, z10);
    }
}
