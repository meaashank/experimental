package com.bytedance.sdk.component.NOt.ZRu.ZRu.ZRu;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class TFq extends com.bytedance.sdk.component.NOt.ZRu.uR {
    private ExecutorService ZRu;
    private List<com.bytedance.sdk.component.NOt.ZRu.NOt> NOt = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.NOt.ZRu.NOt> mZ = new CopyOnWriteArrayList();
    private AtomicInteger uR = new AtomicInteger(64);

    public TFq() {
        if (this.ZRu == null) {
            this.ZRu = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.NOt.ZRu.ZRu.ZRu.TFq.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.uR
    public ExecutorService NOt() {
        return this.ZRu;
    }

    @Override // com.bytedance.sdk.component.NOt.ZRu.uR
    public void ZRu(int i10) {
        this.uR.set(i10);
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
    public int ZRu() {
        return this.uR.get();
    }
}
