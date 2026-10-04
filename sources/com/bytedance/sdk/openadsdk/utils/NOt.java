package com.bytedance.sdk.openadsdk.utils;

import java.lang.ref.SoftReference;

/* JADX INFO: loaded from: classes3.dex */
public class NOt {
    public static SoftReference<com.bytedance.sdk.openadsdk.core.model.qF> ZRu;

    public static com.bytedance.sdk.openadsdk.core.model.qF ZRu() {
        SoftReference<com.bytedance.sdk.openadsdk.core.model.qF> softReference = ZRu;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    public static void ZRu(com.bytedance.sdk.openadsdk.core.model.qF qFVar) {
        if (qFVar == null) {
            return;
        }
        ZRu = new SoftReference<>(qFVar);
    }
}
