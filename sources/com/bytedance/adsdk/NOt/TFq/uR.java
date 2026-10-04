package com.bytedance.adsdk.NOt.TFq;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class uR {
    public static com.bytedance.adsdk.NOt.mZ.ZRu.aT Ht(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        return new com.bytedance.adsdk.NOt.mZ.ZRu.aT(ZRu(jsonReader, com.bytedance.adsdk.NOt.Ht.Ht.ZRu(), mm, Vor.ZRu));
    }

    public static com.bytedance.adsdk.NOt.mZ.ZRu.ZRu Mm(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        return new com.bytedance.adsdk.NOt.mZ.ZRu.ZRu(ZRu(jsonReader, mm, Mm.ZRu));
    }

    public static com.bytedance.adsdk.NOt.mZ.ZRu.uR NOt(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        return new com.bytedance.adsdk.NOt.mZ.ZRu.uR(ZRu(jsonReader, mm, qF.ZRu));
    }

    public static com.bytedance.adsdk.NOt.mZ.ZRu.FA TFq(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        return new com.bytedance.adsdk.NOt.mZ.ZRu.FA(ZRu(jsonReader, com.bytedance.adsdk.NOt.Ht.Ht.ZRu(), mm, Cox.ZRu));
    }

    public static com.bytedance.adsdk.NOt.mZ.ZRu.NOt ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        return ZRu(jsonReader, mm, true);
    }

    public static com.bytedance.adsdk.NOt.mZ.ZRu.Ht mZ(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        return new com.bytedance.adsdk.NOt.mZ.ZRu.Ht(to.ZRu(jsonReader, mm, com.bytedance.adsdk.NOt.Ht.Ht.ZRu(), Nb.ZRu, true));
    }

    public static com.bytedance.adsdk.NOt.mZ.ZRu.Mm uR(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm) throws IOException {
        return new com.bytedance.adsdk.NOt.mZ.ZRu.Mm(ZRu(jsonReader, mm, Yx.ZRu));
    }

    public static com.bytedance.adsdk.NOt.mZ.ZRu.NOt ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm, boolean z10) throws IOException {
        return new com.bytedance.adsdk.NOt.mZ.ZRu.NOt(ZRu(jsonReader, z10 ? com.bytedance.adsdk.NOt.Ht.Ht.ZRu() : 1.0f, mm, lp.ZRu));
    }

    public static com.bytedance.adsdk.NOt.mZ.ZRu.mZ ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm, int i10) throws IOException {
        return new com.bytedance.adsdk.NOt.mZ.ZRu.mZ(ZRu(jsonReader, mm, new oK(i10)));
    }

    private static <T> List<com.bytedance.adsdk.NOt.Mm.ZRu<T>> ZRu(JsonReader jsonReader, com.bytedance.adsdk.NOt.Mm mm, Qg<T> qg) throws IOException {
        return to.ZRu(jsonReader, mm, 1.0f, qg, false);
    }

    private static <T> List<com.bytedance.adsdk.NOt.Mm.ZRu<T>> ZRu(JsonReader jsonReader, float f10, com.bytedance.adsdk.NOt.Mm mm, Qg<T> qg) throws IOException {
        return to.ZRu(jsonReader, mm, f10, qg, false);
    }
}
