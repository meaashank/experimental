package com.bytedance.adsdk.NOt.TFq;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class Cox implements Qg<com.bytedance.adsdk.NOt.mZ.NOt.edo> {
    public static final Cox ZRu = new Cox();

    private Cox() {
    }

    @Override // com.bytedance.adsdk.NOt.TFq.Qg
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.NOt.mZ.NOt.edo NOt(JsonReader jsonReader, float f10) throws IOException {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> listZRu = null;
        List<PointF> listZRu2 = null;
        List<PointF> listZRu3 = null;
        boolean zNextBoolean = false;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (jsonReader.peek() == JsonToken.END_ARRAY) {
                    jsonReader.endArray();
                }
                if (listZRu == null || listZRu2 == null || listZRu3 == null) {
                    throw new IllegalArgumentException("Shape data was missing information.");
                }
                if (listZRu.isEmpty()) {
                    return new com.bytedance.adsdk.NOt.mZ.NOt.edo(new PointF(), false, Collections.EMPTY_LIST);
                }
                int size = listZRu.size();
                PointF pointF = listZRu.get(0);
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 1; i10 < size; i10++) {
                    PointF pointF2 = listZRu.get(i10);
                    int i11 = i10 - 1;
                    arrayList.add(new com.bytedance.adsdk.NOt.mZ.ZRu(com.bytedance.adsdk.NOt.Ht.TFq.ZRu(listZRu.get(i11), listZRu3.get(i11)), com.bytedance.adsdk.NOt.Ht.TFq.ZRu(pointF2, listZRu2.get(i10)), pointF2));
                }
                if (zNextBoolean) {
                    PointF pointF3 = listZRu.get(0);
                    int i12 = size - 1;
                    arrayList.add(new com.bytedance.adsdk.NOt.mZ.ZRu(com.bytedance.adsdk.NOt.Ht.TFq.ZRu(listZRu.get(i12), listZRu3.get(i12)), com.bytedance.adsdk.NOt.Ht.TFq.ZRu(pointF3, listZRu2.get(0)), pointF3));
                }
                return new com.bytedance.adsdk.NOt.mZ.NOt.edo(pointF, zNextBoolean, arrayList);
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "c":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "i":
                    listZRu2 = om.ZRu(jsonReader, f10);
                    break;
                case "o":
                    listZRu3 = om.ZRu(jsonReader, f10);
                    break;
                case "v":
                    listZRu = om.ZRu(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }
}
