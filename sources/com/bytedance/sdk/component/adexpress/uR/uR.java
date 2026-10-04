package com.bytedance.sdk.component.adexpress.uR;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class uR {
    public static void NOt(com.bytedance.sdk.component.FA.FA fa2, int i10) {
        if (fa2 == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.ZRu.ZRu.mZ mZVarMZ = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ();
        ExecutorService executorServiceSAl = mZVarMZ != null ? mZVarMZ.sAl() : null;
        if (executorServiceSAl == null) {
            com.bytedance.sdk.component.FA.Ht.ZRu(fa2);
        } else {
            fa2.setPriority(i10);
            executorServiceSAl.execute(fa2);
        }
    }

    public static void ZRu(com.bytedance.sdk.component.FA.FA fa2, int i10) {
        if (fa2 == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.ZRu.ZRu.mZ mZVarMZ = com.bytedance.sdk.component.adexpress.ZRu.ZRu.ZRu.ZRu().mZ();
        ExecutorService executorServiceEdo = mZVarMZ != null ? mZVarMZ.edo() : null;
        if (executorServiceEdo == null) {
            com.bytedance.sdk.component.FA.Ht.ZRu(fa2, i10);
        } else {
            fa2.setPriority(i10);
            executorServiceEdo.execute(fa2);
        }
    }

    public static ScheduledFuture ZRu(Runnable runnable, long j10, TimeUnit timeUnit) {
        return com.bytedance.sdk.component.FA.Ht.Ht().schedule(runnable, j10, timeUnit);
    }
}
