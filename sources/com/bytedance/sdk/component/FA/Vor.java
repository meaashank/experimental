package com.bytedance.sdk.component.FA;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class Vor implements ThreadFactory {
    public static final String THREAD_GROUP_NAME_PRE = "csj_g_";
    public static final String THREAD_NAME_PRE = "csj_";
    protected final String NOt;
    protected final ThreadGroup ZRu;
    protected int mZ;
    private final AtomicInteger uR;

    public Vor(String str) {
        this(5, str);
    }

    public Thread ZRu(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadZRu = ZRu(this.ZRu, runnable, this.NOt + this.uR.getAndIncrement());
        if (threadZRu.isDaemon()) {
            threadZRu.setDaemon(false);
        }
        int i10 = this.mZ;
        if (i10 > 10 || i10 <= 0) {
            this.mZ = 5;
        }
        threadZRu.setPriority(this.mZ);
        return threadZRu;
    }

    public Vor(int i10, String str) {
        this.uR = new AtomicInteger(1);
        this.mZ = i10;
        this.ZRu = new ThreadGroup(THREAD_GROUP_NAME_PRE.concat(String.valueOf(str)));
        this.NOt = THREAD_NAME_PRE.concat(String.valueOf(str));
    }
}
