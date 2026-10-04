package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: loaded from: classes3.dex */
class sAl implements TTClientBidding {
    private final Ht ZRu;

    public sAl(Context context, com.bytedance.sdk.openadsdk.core.model.ZRu zRu) {
        this.ZRu = new Ht(context, zRu);
    }

    public void NOt() {
        this.ZRu.ZRu();
    }

    public Ht ZRu() {
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

    public void ZRu(boolean z10) {
        this.ZRu.ZRu(z10);
    }
}
