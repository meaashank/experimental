package com.bytedance.adsdk.NOt.TFq;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class TFq {
    private static com.bytedance.adsdk.NOt.mZ.NOt.ZRu NOt(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.NOt.mZ.NOt.ZRu zRu = null;
        while (true) {
            boolean z10 = false;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("v")) {
                    if (z10) {
                        zRu = new com.bytedance.adsdk.NOt.mZ.NOt.ZRu(uR.ZRu(jsonReader, mm));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (!strNextName.equals("ty")) {
                    jsonReader.skipValue();
                } else if (jsonReader.nextInt() == 0) {
                    z10 = true;
                }
            }
            jsonReader.endObject();
            return zRu;
        }
    }

    public static com.bytedance.adsdk.NOt.mZ.NOt.ZRu ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        com.bytedance.adsdk.NOt.mZ.NOt.ZRu zRu = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.NOt.mZ.NOt.ZRu zRuNOt = NOt(jsonReader, mm);
                    if (zRuNOt != null) {
                        zRu = zRuNOt;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return zRu;
    }
}
