package com.bytedance.sdk.openadsdk.om;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class NOt {
    private FA NOt;
    private ZRu TFq;
    private ScheduledExecutorService ZRu = null;
    private long mZ = 0;
    private int uR;

    public interface ZRu {
    }

    public NOt(FA fa2, int i10) {
        this.NOt = fa2;
        this.uR = i10;
    }

    public boolean NOt() {
        ScheduledExecutorService scheduledExecutorService = this.ZRu;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    public void ZRu(long j10) {
        this.mZ = j10;
    }

    public void ZRu(int i10) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.ZRu = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.om.NOt.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = NOt.this.mZ;
                if (System.currentTimeMillis() - NOt.this.mZ > NOt.this.uR) {
                    NOt.this.ZRu.shutdown();
                    if (NOt.this.NOt != null) {
                        NOt.this.NOt.NOt(0, "Automatic detection of stuck");
                    }
                    if (NOt.this.TFq != null) {
                        ZRu unused2 = NOt.this.TFq;
                    }
                }
            }
        }, 0L, i10, TimeUnit.MILLISECONDS);
    }

    public void ZRu() {
        ScheduledExecutorService scheduledExecutorService = this.ZRu;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
