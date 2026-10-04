package com.bytedance.sdk.openadsdk.api;

import com.bytedance.sdk.openadsdk.common.Ht;
import e.I;

/* JADX INFO: loaded from: classes3.dex */
public interface PAGLoadListener<Ad> extends Ht {
    @I
    void onAdLoaded(Ad ad2);

    @Override // com.bytedance.sdk.openadsdk.common.Ht
    @I
    void onError(int i10, String str);
}
