package com.bytedance.sdk.component.Ht.ZRu.mZ;

import com.bytedance.sdk.component.Ht.ZRu.FA;
import com.bytedance.sdk.component.Ht.ZRu.TFq;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public class NOt {
    public static void ZRu(AtomicLong atomicLong, int i10) {
        TFq tFqYBV = FA.Mm().yBV();
        if (tFqYBV == null || !tFqYBV.Mm() || atomicLong == null) {
            return;
        }
        atomicLong.getAndAdd(i10);
    }
}
