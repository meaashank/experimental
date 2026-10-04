package com.mbridge.msdk.config.component.common.util;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f154393a = new CountDownLatch(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference<T> f154394b = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f154395c = new AtomicBoolean(false);

    public T a(long j10) throws InterruptedException {
        if (this.f154393a.await(j10, TimeUnit.MILLISECONDS)) {
            return this.f154394b.get();
        }
        return null;
    }

    public boolean a(T t10) {
        if (!this.f154395c.compareAndSet(false, true)) {
            return false;
        }
        this.f154394b.set(t10);
        this.f154393a.countDown();
        return true;
    }
}
