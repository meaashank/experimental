package com.bytedance.adsdk.NOt.mZ;

import com.bytedance.adsdk.NOt.edo;
import com.bytedance.component.sdk.annotation.RestrictTo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class TFq {
    private static final TFq ZRu = new TFq();
    private final edo<String, com.bytedance.adsdk.NOt.Mm> NOt = new edo<>(20);

    public static TFq ZRu() {
        return ZRu;
    }

    public com.bytedance.adsdk.NOt.Mm ZRu(String str) {
        if (str == null) {
            return null;
        }
        return this.NOt.ZRu(str);
    }

    public void ZRu(String str, com.bytedance.adsdk.NOt.Mm mm) {
        if (str == null) {
            return;
        }
        this.NOt.ZRu(str, mm);
    }
}
