package com.bytedance.adsdk.NOt.TFq;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class Yx implements Qg<com.bytedance.adsdk.NOt.Mm.mZ> {
    public static final Yx ZRu = new Yx();

    private Yx() {
    }

    @Override // com.bytedance.adsdk.NOt.TFq.Qg
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.NOt.Mm.mZ NOt(JsonReader jsonReader, float f10) throws IOException {
        boolean z10 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z10) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z10) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.NOt.Mm.mZ((fNextDouble / 100.0f) * f10, (fNextDouble2 / 100.0f) * f10);
    }
}
