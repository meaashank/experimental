package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: classes5.dex */
final class PendingPostQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private PendingPost f155723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PendingPost f155724b;

    public synchronized void a(PendingPost pendingPost) {
        try {
            if (pendingPost == null) {
                throw new NullPointerException("null cannot be enqueued");
            }
            PendingPost pendingPost2 = this.f155724b;
            if (pendingPost2 != null) {
                pendingPost2.f155722c = pendingPost;
                this.f155724b = pendingPost;
            } else {
                if (this.f155723a != null) {
                    throw new IllegalStateException("Head present, but no tail");
                }
                this.f155724b = pendingPost;
                this.f155723a = pendingPost;
            }
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized PendingPost a() {
        PendingPost pendingPost;
        pendingPost = this.f155723a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f155722c;
            this.f155723a = pendingPost2;
            if (pendingPost2 == null) {
                this.f155724b = null;
            }
        }
        return pendingPost;
    }

    public synchronized PendingPost a(int i10) throws InterruptedException {
        try {
            if (this.f155723a == null) {
                wait(i10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a();
    }
}
