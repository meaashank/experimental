package com.inmobi.media;

import java.util.concurrent.Callable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class G9 extends ThreadPoolExecutor implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f151993a = 0;

    public G9(TimeUnit timeUnit, PriorityBlockingQueue priorityBlockingQueue, V4 v42) {
        super(1, 1, 0L, timeUnit, priorityBlockingQueue, v42);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        Q0.h.a(this);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        kotlin.jvm.internal.G.p(callable, "callable");
        return (RunnableFuture) callable;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        kotlin.jvm.internal.G.p(runnable, "runnable");
        return (RunnableFuture) runnable;
    }
}
