package io.reactivex.rxjava3.internal.util;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes7.dex */
public final class c {
    public c() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(CountDownLatch latch, io.reactivex.rxjava3.disposables.d subscription) {
        if (latch.getCount() == 0) {
            return;
        }
        try {
            b();
            latch.await();
        } catch (InterruptedException e10) {
            subscription.dispose();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e10);
        }
    }

    public static void b() {
        if (Ic.a.f53048z) {
            if ((Thread.currentThread() instanceof io.reactivex.rxjava3.internal.schedulers.h) || Ic.a.W()) {
                throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
            }
        }
    }
}
