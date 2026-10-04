package com.mbridge.msdk.dycreator.bus;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class PendingPost {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<PendingPost> f155719d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f155720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Subscription f155721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    PendingPost f155722c;

    private PendingPost(Object obj, Subscription subscription) {
        this.f155720a = obj;
        this.f155721b = subscription;
    }

    public static PendingPost a(Subscription subscription, Object obj) {
        List<PendingPost> list = f155719d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new PendingPost(obj, subscription);
                }
                PendingPost pendingPostRemove = list.remove(size - 1);
                pendingPostRemove.f155720a = obj;
                pendingPostRemove.f155721b = subscription;
                pendingPostRemove.f155722c = null;
                return pendingPostRemove;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(PendingPost pendingPost) {
        pendingPost.f155720a = null;
        pendingPost.f155721b = null;
        pendingPost.f155722c = null;
        List<PendingPost> list = f155719d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(pendingPost);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
