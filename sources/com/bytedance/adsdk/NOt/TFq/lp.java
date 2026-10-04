package com.bytedance.adsdk.NOt.TFq;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class lp implements Qg<Float> {
    public static final lp ZRu = new lp();

    private lp() {
    }

    @Override // com.bytedance.adsdk.NOt.TFq.Qg
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public Float NOt(JsonReader jsonReader, float f10) throws IOException {
        return Float.valueOf(om.NOt(jsonReader) * f10);
    }
}
