package com.bytedance.sdk.component.TFq.ZRu;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class ZRu implements ThreadFactory {
    private final AtomicInteger NOt = new AtomicInteger(1);
    private final ThreadGroup ZRu;

    public ZRu(String str) {
        this.ZRu = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.ZRu, runnable, "tt_img_" + this.NOt.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
