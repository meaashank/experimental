package com.bytedance.sdk.openadsdk.api.reward;

/* JADX INFO: loaded from: classes3.dex */
public class PAGRewardItem {
    private final String NOt;
    private final int ZRu;

    public PAGRewardItem(int i10, String str) {
        this.ZRu = i10;
        this.NOt = str;
    }

    public int getRewardAmount() {
        return this.ZRu;
    }

    public String getRewardName() {
        return this.NOt;
    }
}
