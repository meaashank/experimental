package com.inmobi.media;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.inmobi.media.s6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3721s6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ScheduledExecutorService f153342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ExecutorService f153343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Semaphore f153344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f153345d;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(5, new V4("Log", true));
        kotlin.jvm.internal.G.o(scheduledExecutorServiceNewScheduledThreadPool, "newScheduledThreadPool(...)");
        f153342a = scheduledExecutorServiceNewScheduledThreadPool;
        f153343b = Executors.newSingleThreadExecutor(new V4("LogSingle", true));
        f153344c = new Semaphore(1);
        f153345d = new AtomicBoolean(false);
    }
}
