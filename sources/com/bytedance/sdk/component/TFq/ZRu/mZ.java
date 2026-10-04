package com.bytedance.sdk.component.TFq.ZRu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class mZ {
    private static final TimeUnit ZRu = TimeUnit.SECONDS;

    public static ExecutorService ZRu() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 2, 30L, ZRu, new LinkedBlockingQueue(), new ZRu("default"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
