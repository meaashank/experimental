package com.google.ads.mediation.inmobi.renderers;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes3.dex */
class InMobiReward implements RewardItem {
    private final int amount;
    private final String type;

    public InMobiReward(String str, int i10) {
        this.type = str;
        this.amount = i10;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return this.amount;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    @NonNull
    public String getType() {
        return this.type;
    }
}
