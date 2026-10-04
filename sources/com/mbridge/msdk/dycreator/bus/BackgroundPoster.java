package com.mbridge.msdk.dycreator.bus;

import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
final class BackgroundPoster implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f155692a = new PendingPostQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f155693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final EventBus f155694c;

    public BackgroundPoster(EventBus eventBus) {
        this.f155694c = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        PendingPost pendingPostA = PendingPost.a(subscription, obj);
        synchronized (this) {
            try {
                this.f155692a.a(pendingPostA);
                if (!this.f155693b) {
                    this.f155693b = true;
                    EventBus.f155695n.execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost pendingPostA;
        while (true) {
            try {
                try {
                    pendingPostA = this.f155692a.a(1000);
                } catch (InterruptedException e10) {
                    Log.w("Event", Thread.currentThread().getName() + " was interruppted", e10);
                    this.f155693b = false;
                    return;
                }
            } catch (Throwable th) {
                this.f155693b = false;
                throw th;
            }
            if (pendingPostA == null) {
                synchronized (this) {
                    pendingPostA = this.f155692a.a();
                    if (pendingPostA == null) {
                        this.f155693b = false;
                        this.f155693b = false;
                        return;
                    }
                    this.f155693b = false;
                    throw th;
                }
            }
            this.f155694c.a(pendingPostA);
        }
    }
}
