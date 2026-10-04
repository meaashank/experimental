package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: classes5.dex */
class AsyncPoster implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f155690a = new PendingPostQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EventBus f155691b;

    public AsyncPoster(EventBus eventBus) {
        this.f155691b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.f155690a.a(PendingPost.a(subscription, obj));
        EventBus.f155695n.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost pendingPostA = this.f155690a.a();
        if (pendingPostA == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f155691b.a(pendingPostA);
    }
}
