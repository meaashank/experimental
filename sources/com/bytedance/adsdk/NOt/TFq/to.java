package com.bytedance.adsdk.NOt.TFq;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class to {
    public static <T> List<com.bytedance.adsdk.NOt.Mm.ZRu<T>> ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm, float f10, Qg<T> qg, boolean z10) throws IOException {
        JsonReader jsonReader2;
        com.bytedance.adsdk.NOt.Mm mm2;
        float f11;
        Qg<T> qg2;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            mm.ZRu("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("k")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    com.bytedance.adsdk.NOt.Mm mm3 = mm;
                    float f12 = f10;
                    Qg<T> qg3 = qg;
                    boolean z12 = z10;
                    com.bytedance.adsdk.NOt.Mm.ZRu ZRu = OCA.ZRu(jsonReader3, mm3, f12, qg3, false, z12);
                    jsonReader2 = jsonReader3;
                    mm2 = mm3;
                    f11 = f12;
                    qg2 = qg3;
                    z11 = z12;
                    arrayList.add(ZRu);
                } else {
                    jsonReader2 = jsonReader;
                    mm2 = mm;
                    f11 = f10;
                    qg2 = qg;
                    z11 = z10;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(OCA.ZRu(jsonReader2, mm2, f11, qg2, true, z11));
                    }
                }
                jsonReader2.endArray();
                jsonReader = jsonReader2;
                mm = mm2;
                f10 = f11;
                qg = qg2;
                z10 = z11;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(OCA.ZRu(jsonReader4, mm, f10, qg, false, z10));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.endObject();
        ZRu(arrayList);
        return arrayList;
    }

    public static <T> void ZRu(List<? extends com.bytedance.adsdk.NOt.Mm.ZRu<T>> list) {
        int i10;
        T t10;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            com.bytedance.adsdk.NOt.Mm.ZRu<T> zRu = list.get(i11);
            i11++;
            com.bytedance.adsdk.NOt.Mm.ZRu<T> zRu2 = list.get(i11);
            zRu.Mm = Float.valueOf(zRu2.Ht);
            if (zRu.NOt == null && (t10 = zRu2.ZRu) != null) {
                zRu.NOt = t10;
                if (zRu instanceof com.bytedance.adsdk.NOt.ZRu.NOt.Vor) {
                    ((com.bytedance.adsdk.NOt.ZRu.NOt.Vor) zRu).ZRu();
                }
            }
        }
        com.bytedance.adsdk.NOt.Mm.ZRu<T> zRu3 = list.get(i10);
        if ((zRu3.ZRu == null || zRu3.NOt == null) && list.size() > 1) {
            list.remove(zRu3);
        }
    }
}
