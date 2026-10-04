package com.bytedance.adsdk.NOt.TFq;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class qF implements Qg<Integer> {
    public static final qF ZRu = new qF();

    private qF() {
    }

    @Override // com.bytedance.adsdk.NOt.TFq.Qg
    /* JADX INFO: renamed from: ZRu, reason: merged with bridge method [inline-methods] */
    public Integer NOt(JsonReader jsonReader, float f10) throws IOException {
        return Integer.valueOf(Math.round(om.NOt(jsonReader) * f10));
    }
}
