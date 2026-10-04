package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.Mm;
import com.bytedance.sdk.openadsdk.component.Mm.ZRu;

/* JADX INFO: loaded from: classes3.dex */
public class TTC2Proxy {
    private TTC2Proxy() {
    }

    public static void a(Context context) {
        ZRu.ZRu(context);
    }

    public static void load(Context context, AdSlot adSlot, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener, int i10) {
        adSlot.setDurationSlotType(3);
        Mm.ZRu(context).ZRu(adSlot, pAGAppOpenAdLoadListener, i10);
    }
}
