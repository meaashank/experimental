package com.bytedance.adsdk.NOt.Ht;

import i.C4541d;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    private static float NOt(float f10) {
        return f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float ZRu(float f10) {
        return f10 <= 0.0031308f ? f10 * 12.92f : (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static int ZRu(float f10, int i10, int i11) {
        if (i10 == i11) {
            return i10;
        }
        float f11 = ((i10 >> 24) & 255) / 255.0f;
        float f12 = ((i11 >> 24) & 255) / 255.0f;
        float fNOt = NOt(((i10 >> 16) & 255) / 255.0f);
        float fNOt2 = NOt(((i10 >> 8) & 255) / 255.0f);
        float fNOt3 = NOt((i10 & 255) / 255.0f);
        float fNOt4 = NOt(((i11 >> 16) & 255) / 255.0f);
        float fNOt5 = NOt(((i11 >> 8) & 255) / 255.0f);
        float fNOt6 = NOt((i11 & 255) / 255.0f);
        float fA = C4541d.a(f12, f11, f10, f11);
        float fA2 = C4541d.a(fNOt4, fNOt, f10, fNOt);
        float fA3 = C4541d.a(fNOt5, fNOt2, f10, fNOt2);
        float fA4 = C4541d.a(fNOt6, fNOt3, f10, fNOt3);
        float fZRu = ZRu(fA2) * 255.0f;
        float fZRu2 = ZRu(fA3) * 255.0f;
        return Math.round(ZRu(fA4) * 255.0f) | (Math.round(fZRu) << 16) | (Math.round(fA * 255.0f) << 24) | (Math.round(fZRu2) << 8);
    }
}
