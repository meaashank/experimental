package com.inmobi.media;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.inmobi.media.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3578i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G9 f152996a;

    static {
        int i10 = G9.f151993a;
        f152996a = new G9(TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new V4("ClickManagerExecutor", true));
    }

    public static void a(Runnable runnable, F9 f92) {
        try {
            G9 g92 = f152996a;
            g92.getClass();
            kotlin.jvm.internal.G.m(f92);
            g92.execute(new C3634m2(runnable, f92));
        } catch (RejectedExecutionException unused) {
        }
    }
}
