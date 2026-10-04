package com.bytedance.sdk.component.NOt.ZRu.ZRu.ZRu;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu extends com.bytedance.sdk.component.NOt.ZRu.uR {
    public static volatile Vor ZRu;
    private List<com.bytedance.sdk.component.NOt.ZRu.NOt> NOt = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.NOt.ZRu.NOt> mZ = new CopyOnWriteArrayList();
    private ExecutorService uR;

    public ZRu(ExecutorService executorService) {
        this.uR = executorService;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.uR
    public ExecutorService NOt() {
        ExecutorService executorServiceZRu = ZRu != null ? ZRu.ZRu() : null;
        return executorServiceZRu != null ? executorServiceZRu : this.uR;
    }

    public boolean TFq() {
        return (ZRu == null || ZRu.ZRu() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.uR
    public int ZRu() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.uR
    public List<com.bytedance.sdk.component.NOt.ZRu.NOt> mZ() {
        return this.NOt;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.uR
    public List<com.bytedance.sdk.component.NOt.ZRu.NOt> uR() {
        return this.mZ;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.uR
    public void ZRu(int i10) {
    }

    public static void ZRu(Vor vor) {
        ZRu = vor;
    }
}
