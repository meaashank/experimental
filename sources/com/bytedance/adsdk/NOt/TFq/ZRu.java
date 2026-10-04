package com.bytedance.adsdk.NOt.TFq;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu {
    public static com.bytedance.adsdk.NOt.mZ.ZRu.sAl<PointF, PointF> NOt(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.NOt.mZ.ZRu.TFq tFqZRu = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOtZRu = null;
        com.bytedance.adsdk.NOt.mZ.ZRu.NOt nOtZRu2 = null;
        boolean z10 = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "k":
                    tFqZRu = ZRu(jsonReader, mm);
                    break;
                case "x":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        nOtZRu = uR.ZRu(jsonReader, mm);
                        break;
                    } else {
                        z10 = true;
                        jsonReader.skipValue();
                        break;
                    }
                    break;
                case "y":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        nOtZRu2 = uR.ZRu(jsonReader, mm);
                        break;
                    } else {
                        z10 = true;
                        jsonReader.skipValue();
                        break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z10) {
            mm.ZRu("Lottie doesn't support expressions.");
        }
        return tFqZRu != null ? tFqZRu : new com.bytedance.adsdk.NOt.mZ.ZRu.Vor(nOtZRu, nOtZRu2);
    }

    public static com.bytedance.adsdk.NOt.mZ.ZRu.TFq ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(MR.ZRu(jsonReader, mm));
            }
            jsonReader.endArray();
            to.ZRu(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.NOt.Mm.ZRu(om.NOt(jsonReader, com.bytedance.adsdk.NOt.Ht.Ht.ZRu())));
        }
        return new com.bytedance.adsdk.NOt.mZ.ZRu.TFq(arrayList);
    }
}
