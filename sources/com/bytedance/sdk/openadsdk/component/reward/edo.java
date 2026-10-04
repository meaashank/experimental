package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: loaded from: classes3.dex */
class edo implements TTClientBidding {
    private final FA ZRu;

    public edo(Context context, com.bytedance.sdk.openadsdk.core.model.ZRu zRu, AdSlot adSlot) {
        this.ZRu = new FA(context, zRu, adSlot);
    }

    public void NOt() {
        this.ZRu.ZRu();
    }

    public FA ZRu() {
        return this.ZRu;
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d10, String str, String str2) {
        this.ZRu.loss(d10, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d10) {
        this.ZRu.win(d10);
    }
}
