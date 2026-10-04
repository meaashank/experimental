package com.bytedance.sdk.component.FA.mZ;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class uR implements ThreadFactory {
    protected final String NOt;
    protected final ThreadGroup ZRu;
    private final AtomicInteger mZ = new AtomicInteger(1);

    public uR(String str) {
        this.ZRu = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.NOt = ZRu(str);
    }

    public Thread ZRu(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadZRu = ZRu(this.ZRu, runnable, this.NOt + "_" + this.mZ.getAndIncrement());
        if (threadZRu.isDaemon()) {
            threadZRu.setDaemon(false);
        }
        return threadZRu;
    }

    public static String ZRu(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
